package zeng.siyuan.C1comehere;

import org.apache.commons.io.FileUtils;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.test.param.dao.SolrDataDAO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Contains some methods to list files and folders from a directory
 *
 * @author Loiane Groner
 * http://loiane.com (Portuguese)
 * http://loianegroner.com (English)
 */
public class ListFilesUtil {
    public static int count =1;
    /**
     * List all the files and folders from a directory
     * @param directoryName to be listed
     */
    public void listFilesAndFolders(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            System.out.println(file.getName());
        }
    }
    /**
     * List all the files under a directory
     * @param directoryName to be listed
     */
    public void listFiles(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }

    public static int randInt(int min, int max) {

        // NOTE: This will (intentionally) not run as written so that folks
        // copy-pasting have to think about how to initialize their
        // Random instance.  Initialization of the Random instance is outside
        // the main scope of the question, but some decent options are to have
        // a field that is initialized once and then re-used as needed or to
        // use ThreadLocalRandom (if using at least Java 1.7).
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public void listFilesf(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        int anInt = randInt(0, fList.length-1);
        File f = fList[anInt];
        System.out.println(f.getName());

        r.open(directoryName + "/" + f.getName());
    }
    /**
     * List all the folder under a directory
     * @param directoryName to be listed
     */
    public void listFolders(String directoryName, Properties prop){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isDirectory()){
                System.out.println(file.getName());
                prop.put(file.getName(), file.getAbsolutePath());
            }
        }
    }
    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     */
    public void listFilesAndFilesSubDirectories(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()){
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }

    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     */
    public static void listFilesAndFilesSubDirectories(String directoryName, Properties prop){

        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
//                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()){
                listFilesAndFilesSubDirectories(file.getAbsolutePath(), null);
                p.setProperty(file.getName()+" fld", file.getAbsolutePath());
            }
        }


///*

//*/



    }

    public static void asdfhfkjasdhkjfah(String directoryName, Properties prop){

        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
//                System.out.println(file.getAbsolutePath());
                p.setProperty(file.getName()+"", file.getAbsolutePath());
                c1come2melater(file.getName()+"", file.getAbsolutePath());
            } else if (file.isDirectory()){
//                listFilesAndFilesSubDirectories(file.getAbsolutePath(), null);
                p.setProperty(file.getName()+" fld", file.getAbsolutePath());
                c1come2melater(file.getName()+" fld", file.getAbsolutePath());
            }
        }


///*

//*/



    }



    public static void c(String c1, String c1Path) {

        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\p.properties");
//            c1 = c1.replace(" ", "%20");
//             set the properties value
//            p.setProperty(c1, c1Path);

            // save properties to project root folder
            p.store(output, null);


            output_solr = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\psolr.properties");
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

    public static Properties p= new Properties();

    public static void c1() {
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\p.properties");
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                p.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

//            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\main\\resources\\c1s.properties");
            // fjlasdjfl a properties file
//            temprop = new Properties();
//            temprop.load(input);
//
//
//            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
//                String key = ((String) e.getKey()).replace("%20", " ");
//                String v = (String) e.getValue();
//                p.put(key, v);
//            }
//            System.out.println("Done Propertiesy loading");

/*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
            count =1 + solrBaseDAO.kp(1, null, null);

            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
            }
            System.out.println("stop");

*/



        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    public static void main (String[] args){


//        String fol[] = new String[]{
//                "C:/Users/SiyuanZeng's/Documents/OneNote Notebooks",
//                "C:/Users/SiyuanZeng's/Documents/OneNote 笔记本",
//                "C:/Users/SiyuanZeng's/Videos",
//                "C:/SoftwareInstallation",
//                "C:/Development_Base"
//                "C:/"
//        };


        try
        {
            Process p=Runtime.getRuntime().exec("cmd /c C:\\solr-6.2.0\\bin\\solr start");
            p.waitFor();
            BufferedReader reader=new BufferedReader(
                    new InputStreamReader(p.getInputStream())
            );
            String line;
            while((line = reader.readLine()) != null && line.trim()!="")
            {
                System.out.println(line);
            }

        }
        catch(IOException e1) {}
        catch(InterruptedException e2) {}
//        finally {
//
//        }


//c1ss(p);
        c1s();
//        int count =p.size();


        SolrDataDAO solrBaseDAO = null;
        try {
            solrBaseDAO = new SolrDataDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            countasdfasfasdf= 1 + solrBaseDAO.kp(1, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // structured code can be reemmbered, the unstructured will be forget or erembereed because it doesn't follow the flow
        // using static may cause complexity because it is not in the same location


        asdfhfkjasdhkjfah("c:/", p);
//        p = new Properties();
//        for(String l: fol) {
//            listFilesAndFilesSubDirectories(l, null);
//            try {
//                Test.maind(l, p);
//                Test.l(l, p);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


//        for (Map.Entry<Object, Object> e : p.entrySet()) {
//            String key = ((String) e.getKey()).replace("%20", " ");
//            String v = (String) e.getValue();
//            c(null, null);
//        }




//        SolrDataDAO solrBaseDAO = null;
//        try {
//            solrBaseDAO = new SolrDataDAO();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//            int count =1;
//        for (Map.Entry<Object, Object> e : p.entrySet()) {
//            System.out.println(count);
//            String key = ((String) e.getKey()).replace("%20", " ");
//            String v = (String) e.getValue();
//            try {
//                solrBaseDAO.l(count, key,v);
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//            System.out.println(count);
//            count++;
//        }
//        System.out.println("stop");


        System.exit(-1);




/*




        ListFilesUtil listFilesUtil = new ListFilesUtil();
//        final String directoryLinuxMac ="/Users/loiane/test";
        //Windows directory example
        final String directoryWindows ="C:\\Users\\SiyuanZeng's\\Videos\\Friends\\Best Clips";
        listFilesUtil.listFiles(directoryWindows);
        listFilesUtil.listFilesf(directoryWindows);
*/

    }



    public static void p(String k) {
        try {
            Files.walk(Paths.get(k))
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println)
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List ps(String k) {
        try {
            List s  = Files.walk(Paths.get(k))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());

    return s;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List pss(String k) {
        try {


            File dir = new File(k);

            String[] extensions = new String[] {
                    "3G2",
                    "3GP",
                    "ASF",
                    "AVI",
                    "FLV",
                    "M4V",
                    "MOV",
                    "MP4",
                    "MPG",
                    "RM",
                    "SRT",
                    "SWF",
                    "VOB",
                    "WMV"

            };

            System.out.println("Getting all .txt and .jsp files in " + dir.getCanonicalPath() + " including those in subdirectories");
            List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);


            int a = Integer.parseInt(c1s());
            a++;
            File d = files.get(a);
            r.o(d.getAbsolutePath());
            c1come2melater("1", String.valueOf(a));

            //            for (File file : files) {
//                System.out.println("file: " + file.getAbsolutePath());
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static int countasdfasfasdf = 1;

    public static void c1come2melater(String c1, String c1Path) {

        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\s.properties");
            c1 = c1.replace(" ", "%20");
            System.out.println("c1come2melater();");
            // set the properties value
            prop.setProperty(c1, c1Path);

            // save properties to project root folder
            prop.store(output, null);


//			output_solr = new FileOutputStream("/Users/vn0xrjh/daniel/14_GUIcopymacosx/c1comehere/c1s.properties.solr");

//			int count = 0;
//			for (Map.Entry<Object, Object> e : prop.entrySet()) {
//				String key = ((String) e.getKey()).replace("%20", " ");
//				String v = (String) e.getValue();
//				output_solr.write(String.valueOf(count).getBytes());
//				output_solr.write(',');
//				output_solr.write(key.getBytes());
//				output_solr.write(',');
//				output_solr.write(v.getBytes());
//				output_solr.write(System.getProperty("line.separator").getBytes());
//				count++;
//			}


            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }



//            countasdfasfasdf= 1 + solrBaseDAO.kp(1, null, null);

            try {
                solrBaseDAO.addData(countasdfasfasdf, c1, c1Path);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            countasdfasfasdf++;
            System.out.println(countasdfasfasdf);
//
//            c1s();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
//                try {
//                    output.close();
//                    output_solr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            }
        }
    }


    public static String c1s() {
        prop = new Properties();
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\s.properties");
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

            return (String) prop.get("1");
/*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
            }
            System.out.println("stop");

*/



        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }
    public static transient Properties prop;


}