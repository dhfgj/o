package zeng.siyuan.iamhere.what;

import org.apache.solr.common.SolrInputDocument;
import org.unix4j.Unix4j;
import org.unix4j.builder.Unix4jCommandBuilder;
import zeng.siyuan.solr.test.param.dao.SolrDataDAO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class d {
    // yes i am big and bad and everything ahnd that it is all
    // everything is giveing you something, somethign give you nightmare and somethign give you sepepelkd like excueetieroservivewe
    // i have eto compe up somethiing that will kil somebosyd
    private static final File POISONPILL = new File("");


    private static class RunnableDirSearch implements Runnable {
        private final BlockingQueue<File> dirQueue;
        private final BlockingQueue<File> fileQueue;
        private final AtomicLong count;
        private final int num;
        private static Properties p;

        public RunnableDirSearch(BlockingQueue<File> dirQueue, BlockingQueue<File> fileQueue, AtomicLong count, int concurrency, Properties p, List<SolrInputDocument> a) {
            this.dirQueue = dirQueue;
            this.fileQueue = fileQueue;
            this.count = count;
            this.num = concurrency;
            this.p = p;
            this.a = a;
        }

        private String[] i = new String[]{".git", "objects", "src", ".dea", ".idea",
                ".",
                "classes",
                "build",
                "css",
                "js",
                "target",
                "META-INF",
                "nonsenseworkds",

        };
        public static List<SolrInputDocument> a;


        @Override
        public void run() {
            try {
                File dir = dirQueue.take();
                while (dir != POISONPILL) {
                    final File[] fi = dir.listFiles();
                    if (fi != null) {
                        for (final File element : fi) {
                            if (element.isDirectory()) {
                                count.incrementAndGet();
                                dirQueue.put(element);
                            } else {

                                Boolean matches = false;
//                                for(String key:i) {
//                                    if(element.getAbsolutePath().indexOf(key)>-1) {
//                                        matches = true;
//                                        break;
//                                    }
//                                }
                                if (!matches) {

                                    SolrInputDocument doc = new SolrInputDocument();
                                    doc.addField("id", p.size());
                                    doc.addField("name", element.getName() + " fld");
                                    doc.addField("path", element.getAbsolutePath());
                                    a.add(doc);
                                    System.out.println(p.size() + " " + element.getAbsolutePath());
//                                    fileQueue.put(element);
                                    p.put(element.getName() + " fld", element.getAbsolutePath());
                                }
                                }
                        }
                    }
                    final long c = count.decrementAndGet();
                    if (c == 0) {
                        end();
                    }
                    dir = dirQueue.take();
                }
            } catch (final InterruptedException ie) {
                // file found or error
            }
        }

        private final void end() {
            try {
                fileQueue.put(POISONPILL);
            } catch (final InterruptedException e) {
                // empty
            }
            for (int i = 0; i < num; i++) {
                try {
                    dirQueue.put(POISONPILL);
                } catch (final InterruptedException e) {
                    // empty
                }
            }
        }
    }

    private static class CallableFileSearch implements Runnable {
        private final BlockingQueue<File> dirQueue;
        private final BlockingQueue<File> fileQueue;
        private final String name;
        private final int num;
        private static int count = 0;
        List<SolrInputDocument> a;
        public CallableFileSearch(final BlockingQueue<File> dirQueue, final BlockingQueue<File> fileQueue, final String name, final int num, List<SolrInputDocument> a) {
            this.dirQueue = dirQueue;
            this.fileQueue = fileQueue;
            this.name = name;
            this.num = num;
            this.a=a;
        }

        @Override
        public void run() {
            File file = null;
            try {
                file = fileQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            while (file != POISONPILL) {
                final String filename = file.getName().toLowerCase();
                final String lf = name.toLowerCase();
//                if (filename.equalsIgnoreCase(name) || filename.startsWith(lf) || filename.endsWith(lf) || filename.contains(lf)) {
//                    System.out.println(filename);
//                    end();
//                    return file;

                SolrDataDAO solrBaseDAO = null;
                try {
                    solrBaseDAO = new SolrDataDAO();
                } catch (Exception e) {
                    e.printStackTrace();
                }


//            int count =1;
//        for (Map.Entry<Object, Object> e : p.entrySet()) {
//            System.out.println(count);
//            String key = ((String) e.getKey()).replace("%20", " ");
//            String v = (String) e.getValue();


//            int try3times = 3;
//                Boolean fIA=true;
//            while (try3times > 0 && fIA)
                System.out.println("solr commit");

                try {
                    solrBaseDAO.g(count, filename + " fld", file.getAbsolutePath(), a);
//                    fIA=false;
                } catch (Exception e1) {
//                fIA=true;
                    e1.printStackTrace();
                }
//                try3times--;

//            }

                count++;
                System.out.println(count);
                System.out.println("stop");


//                System.exit(-1);


                try {
                    file = fileQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // familarity
        // i don't want to hear that
        // i don't want
        // i hate it
        // i refuse to accept her influence.


        private final void end() {
            for (int i = 0; i < num; i++) {
                try {
                    dirQueue.put(POISONPILL);
                } catch (final InterruptedException e) {
                    // empty
                }
            }
        }
    }

    private final String filename;
    private final File baseDir;
    private final int concurrency;
    private final AtomicLong count;
    private Properties p;

    public d(final String filename, final File baseDir, final int concurrency, Properties p) {
        this.filename = filename;
        this.baseDir = baseDir;
        this.concurrency = concurrency;
        this.p = p;
        count = new AtomicLong(0);
    }

    public File find() {
        final ExecutorService ex = Executors.newFixedThreadPool(concurrency + 1);
        final BlockingQueue<File> dirQueue = new LinkedBlockingQueue<File>();
        final BlockingQueue<File> fileQueue = new LinkedBlockingQueue<File>(1000000);
        List<SolrInputDocument> a = new CopyOnWriteArrayList<>();

        Properties p = new Properties();
        for (int i = 0; i < concurrency; i++) {
            ex.submit(new RunnableDirSearch(dirQueue, fileQueue, count, concurrency, p, a));
        }

        // file --> properties --> solr


        count.incrementAndGet();
        dirQueue.add(baseDir);
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
//        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
        ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency, a));
//
        try {
            try {
                ex.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            } catch (InterruptedException e) {
            }//            final File f = c.get();
//            return f;
        } catch (final Exception e) {
//            return null;
        } finally {
            ex.shutdownNow();
        }
        return null;
    }

    public static void main(final String[] args) {

        Properties p = new Properties();
        final String filename = "friends";
        final File baseDir = new File("C:\\Users\\SiyuanZeng's\\Videos");
        final d ff = new d(filename, baseDir, 12, p);
        final long ini = System.currentTimeMillis();
        final File f = ff.find();
        final long end = System.currentTimeMillis();
        System.out.println(f + " " + (end - ini) + " ms");


        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream(new File("src\\zeng\\siyuan\\C1comehere\\p.properties").getAbsolutePath());
//            c1 = c1.replace(" ", "%20");
//             set the properties value
//            p.setProperty(c1, c1Path);

            // save properties to project root folder
            p.store(output, null);


            output_solr = new FileOutputStream(new File("src\\zeng\\siyuan\\C1comehere\\psolr.properties").getAbsolutePath());
            p.store(output_solr, null);
//            int count = 0;
//            for (Map.Entry<Object, Object> e : p.entrySet()) {
//                String key = ((String) e.getKey()).replace("%20", " ");
//                String v = (String) e.getValue();
//                output_solr.write(String.valueOf(count).getBytes());
//                output_solr.write(',');
//                output_solr.write(key.getBytes());
//                output_solr.write(',');
//                output_solr.write(v.getBytes());
//                output_solr.write(System.getProperty("line.separator").getBytes());
//                count++;
//            }

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                    output_solr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


//    Unix4jCommandBuilder unix4j = Unix4j.builder();
//        List<String> testClasses = unix4j.find("C:/Users/SiyuanZeng's/Videos/Friends", "*Friends*").toStringList();
//        for(String path: testClasses){
//            System.out.println(path);
//        }
//}

    public static void mains(String a, String b) {
//        final String filename = "friends";
//        final File baseDir = new File("C:\\Users\\SiyuanZeng's\\Videos\\Friends\\Best Clips");
//        final dk ff = new dk(filename, baseDir, 6);
//        final long ini = System.currentTimeMillis();
//        final File f = ff.find();
//        final long end = System.currentTimeMillis();
//        System.out.println(f + " " + (end - ini) + " ms");
        Unix4jCommandBuilder unix4j = Unix4j.builder();
        List<String> testClasses = unix4j.find(b, a).toStringList();
        for(String path: testClasses){
            System.out.println(path);
        }
    }

//    publicic static void main() {
//
//    }

}