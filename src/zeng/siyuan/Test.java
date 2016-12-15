package zeng.siyuan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    // it makes sense i will remember and i can find it later like a file name
    //it is all about me the good will that is me, i bought this coffee machine for you and you don't even appreciate it .
    //god give me everything and become everything and who give you that and take
    //who are you
// good will
//there is love there
    // it is lla bout me
    //
    // I am will
    // What jdid you find in the you nam e, you name come up everywehre
    private String[] i = new String[]{".git", "objects", "src", ".dea", ".idea", ".", "nonsenseworkds", "meanlesssworld"};
    private static final int THREAD_COUNT = 120;
    private static int taskDoneCount=0;
    private static int count=0;
//    public static void main(String[] args) throws Exception {
//        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
//        List<String> allFiles = new ArrayList<>();
//        String pathname = "C:\\Temp";
//        File dir = new File(pathname);
//        File[] files = dir.listFiles();
//        int length = files.length;
//        int onePart = length / THREAD_COUNT;
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < THREAD_COUNT; i++) {
//            int startIndex = i * onePart; // the start index of the file list
//            int endIndex = onePart * (i + 1);// the end index of the file list
//            if (i == THREAD_COUNT-1) {
//                endIndex = files.length;
//            }
//            System.out.println("Thread#"+(i+1)+" start index:"+startIndex+", end index:"+(endIndex-1));
//            executor.execute(new SearchFileThread(startIndex, endIndex, files, fileList -> {
//                synchronized (Test.class) {
//                    taskDoneCount++;
//                    allFiles.addAll(fileList);
//                    if (taskDoneCount == THREAD_COUNT) {// check if all tasks finished
//                        executor.shutdown(); // shutdown the thread pool
//                        System.out.println("allFiles = " + allFiles);
//                        System.out.println("allFiles.size() = " + allFiles.size());
//                        System.out.println("Time used: "+(System.currentTimeMillis()-startTime)+"ms");
//                    }
//                }
//            }));
//        }
//    }


public static void maind(String pathname, Properties p) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        List<String> allFiles = new ArrayList<>();
        File dir = new File(pathname);
        File[] files = dir.listFiles();
        int length = files.length;
        int onePart = length / THREAD_COUNT;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * onePart; // the start index of the file list
            int endIndex = onePart * (i + 1);// the end index of the file list
            if (i == THREAD_COUNT-1) {
                endIndex = files.length;
            }
            System.out.println("Thread#"+(i+1)+" start index:"+startIndex+", end index:"+(endIndex-1));
//            executor.execute(new SearchFileThread(startIndex, endIndex, files, p, fileList -> {
            executor.execute(new SearchFileThread(startIndex, endIndex, files, p, fileList -> {
                synchronized (Test.class) {
                    taskDoneCount++;
//                    allFiles.addAll(fileList);
                    if (taskDoneCount == THREAD_COUNT) {// check if all tasks finished
                        executor.shutdown(); // shutdown the thread pool
//                        System.out.println("allFiles = " + allFiles);
//                        System.out.println("allFiles.size() = " + allFiles.size());
//                        System.out.println("Time used: "+(System.currentTimeMillis()-startTime)+"ms");
                    }
                }
            }));
        }
    }

public static void l(String pathname, Properties p) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        List<String> allFiles = new ArrayList<>();
        File dir = new File(pathname);
        File[] files = dir.listFiles();
        int length = files.length;
        int onePart = length / THREAD_COUNT;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * onePart; // the start index of the file list
            int endIndex = onePart * (i + 1);// the end index of the file list
            if (i == THREAD_COUNT-1) {
                endIndex = files.length;
            }
            System.out.println("Thread#"+(i+1)+" start index:"+startIndex+", end index:"+(endIndex-1));
//            executor.execute(new SearchFileThread(startIndex, endIndex, files, p, fileList -> {
            executor.execute(new l(startIndex, endIndex, files, p, fileList -> {
                synchronized (Test.class) {
                    taskDoneCount++;
//                    allFiles.addAll(fileList);
                    if (taskDoneCount == THREAD_COUNT) {// check if all tasks finished
                        executor.shutdown(); // shutdown the thread pool
//                        System.out.println("allFiles = " + allFiles);
//                        System.out.println("allFiles.size() = " + allFiles.size());
//                        System.out.println("Time used: "+(System.currentTimeMillis()-startTime)+"ms");
                    }
                }
            }));
        }
    }
    public static void listFilesAndFilesSubDirectories(String directoryName, Properties p) {

        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        if (null != fList) {
            for (File file : fList) {
                if (file.isFile()) {
//                System.out.println(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println(count++);
                    System.out.println(file.getAbsolutePath());
                    listFilesAndFilesSubDirectories(file.getAbsolutePath(), p);
                    p.setProperty(file.getName() + " fld", file.getAbsolutePath());
                }
            }
    }
    }

    public static void ll(String directoryName, Properties p) {

        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        if (null != fList) {
            for (File file : fList) {
                if (file.isFile()) {
//                System.out.println(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println(count++);
                    System.out.println(file.getAbsolutePath());
//                    listFilesAndFilesSubDirectories(file.getAbsolutePath(), p);
                    p.setProperty(file.getName() + " fld", file.getAbsolutePath());
                }
            }
    }
    }

    static private class SearchFileThread implements Runnable {
        private int startIndex;
        private int endIndex;
        private File[] listFiles;
        private List<String> fileList = new ArrayList<>();
        private TaskFinishListener listener;
        private Properties p ;

//        public SearchFileThread(int startIndex, int endIndex, File[] listFiles, Properties p, TaskFinishListener listener) {
        public SearchFileThread(int startIndex, int endIndex, File[] listFiles, Properties p, TaskFinishListener listener) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.listFiles = listFiles;
//            this.listener = listener;
            this.p= p;
        }

        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
//                fileList.add(listFiles[i].getAbsolutePath());
                listFilesAndFilesSubDirectories(listFiles[i].getAbsolutePath(), p);
            }
//            listener.onFinish(fileList);
        }
    }

    static private class l implements Runnable {
        private int startIndex;
        private int endIndex;
        private File[] listFiles;
        private List<String> fileList = new ArrayList<>();
        private TaskFinishListener listener;
        private Properties p ;

//        public SearchFileThread(int startIndex, int endIndex, File[] listFiles, Properties p, TaskFinishListener listener) {
        public l(int startIndex, int endIndex, File[] listFiles, Properties p, TaskFinishListener listener) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.listFiles = listFiles;
//            this.listener = listener;
            this.p= p;
        }

        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
//                fileList.add(listFiles[i].getAbsolutePath());
                ll(listFiles[i].getAbsolutePath(), p);
            }
//            listener.onFinish(fileList);
        }
    }

    private interface TaskFinishListener {
        void onFinish(List<String> fileList);
    }
}