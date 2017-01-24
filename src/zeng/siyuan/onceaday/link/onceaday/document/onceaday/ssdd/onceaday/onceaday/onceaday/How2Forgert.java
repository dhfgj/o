package zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.onceaday;

import zeng.siyuan.C1comehere.Beep;
import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public transient JTextArea textArea;
    public transient static CopyOnWriteArrayList<person_question> ebbinghauses;
    public transient CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();
    public transient Task currentTask = new Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
    public static peoplequesiton m = new peoplequesiton();
    ;
    public boolean isSearch;
    public int count = 1;
    private CopyOnWriteArrayList<person_question> searchebbinghauses;
    private CopyOnWriteArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;
    public static transient Properties jk;
    /*


    starting today, false

    then true then next day  si should remove the true /false check

    then next day, where is this one





     */
public boolean f=true;
    public void fjlasdjfl() {
        Scanner in = null;

        String str = textArea.getText();
        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {

            String textStr[] = textArea.getText().split("\\r\\n|\\n|\\r");

            for(String s: textStr) {
                person_question e = new person_question(s, "Link");
                m.store(e);
            }
//Runnable l = ()-> DSF(e);
//l.run();
//                    textArea.setText("");
        }
//        reloadTAskandrestartPopThread();
    }

    public void fjlasdjfl(String KLAJDLFJASDFLJ) {
        Scanner in = null;

        String str = KLAJDLFJASDFLJ;
        if (null != KLAJDLFJASDFLJ && !("".equalsIgnoreCase(KLAJDLFJASDFLJ))) {

                    person_question e = new person_question(KLAJDLFJASDFLJ, "Link");
                    m.store(e);
//                    textArea.setText("");
            Runnable l = ()-> DSF(e);
            l.run();
        }
//        reloadTAskandrestartPopThread();
    }

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
        this.c1comehere = c1comehere;
        this.textArea = textArea;
        this.frame = frame;
    }

    public void updatetask() {
        String textinput = textArea.getText().trim();
        for (person_question e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
//                e.setText(textinput);
                m.store(e);
                System.out.println("updates");
                isSearch = false;
                break;
            }
        }
    }
// i don't have to remregber all the command but when i need i ti will go ahead and find it and put it all teogehter
    // lie ther ebuttons i don't even remember what hte heloo it is
    // everything time i will go sehad and find ait on my ow n
    // ther eis inot souch thing all instanct nooldle
    // it i snot healdy and you wil die of nonnutrituionts
    // that i sthe it
public static int c =0;
    public void displayTask() {
        try {
            if (isSearch) {
                displaysearchtasks();
            } else {
                for (Task t : tasks) {
                    if (t.getDate().after(new Date()) && !t.getIsDone()) {
                        if (c == 0 ) {
                            Thread.sleep(5 * 60000);
                            c= 2;
                        }
                        c --;


                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(t.getDate());//1474356339826
                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                        if (diff > 0) {
                            Thread.sleep(diff);
//                            frame.repaint();
//                            frame.toFront();

                            Beep.sound(2000, 150);
                            currentTask = t;
//                            String inntuitive = "";
                            for (person_question e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
//                                    inntuitive+=e.getQuestion();
                                    currentTask.setIsDone(true);
//                                    m.deleteTask(e.getJavauid());
//                                    person_question D = new person_question(e.getQuestion(), "Link");

                                    m.store(e);
//                                Desktop.getDesktop().open(new File(e.getQuestion()));
//                                    if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                    while (f) {
                                        Thread.sleep(10000);
                                    }

                                    r.open(e.getQuestion());
//                                    reloadTAskandrestartPopThread();
//duplicate
//                                    break;
// i have talk and streatch far and thin kand talk about the application from the origin and core and streatch all the things around
                                    // but the y have to have a connenct beiwent
                                }
                            }
                        }
                        /*else {
                            if (!t.getIsDone()) {
//                                frame.repaint();
//                                frame.toFront();
                                Beep.sound(2000, 150);

                                currentTask = t;
//                                String inntuitive = "";
                                for (person_question e : ebbinghauses) {
                                    if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
//                                        inntuitive += e.getQuestion();
                                        currentTask.setIsDone(true);
                                        m.deleteTask(e.getJavauid());
                                        person_question D = new person_question(e.getQuestion(), "Link");

                                        m.store(D);

//                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                        r.open(e.getQuestion());
//                                            if(r.isUrl(e.getQuestion())){
//                                        r.openUrlInBrowser(e.getQuestion());
//                                    } else {
//
//                                        Desktop.getDesktop().open(new File(e.getQuestion()));
//                                    }
//                                        reloadTAskandrestartPopThread();

                                        break;
                                    }
                                }
//                                Thread.sleep(10000);
                            }
                        }*/
                    } else if (t.getDate().before(new Date()) && !t.getIsDone()) {
//                        frame.repaint();
//                        frame.toFront();
                        if (c == 0 ) {
                            Thread.sleep(5 * 60000);
                            c= 2;
                        }
                        c --;
// love and hate there is  a  difference
                        // yes and not

                        // yes and no
                        // yes some
                        // no kills
                        currentTask = t;
                        Beep.sound(2000, 150);

                        String inntuitive = "";
                        for (person_question e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                inntuitive += e.getQuestion();
                                currentTask.setIsDone(true);
//                                m.deleteTask(e.getJavauid());
//                                person_question D = new person_question(e.getQuestion(), "Link");

//                                m.store(D);
                                m.store(e);

//                                if(r.isUrl(e.getQuestion())){
//                                    r.openUrlInBrowser(e.getQuestion());
//                                } else {
//
//                                    Desktop.getDesktop().open(new File(e.getQuestion()));
//                                }
//                                if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
while(f){
    Thread.sleep(1000);
}
                                r.open(e.getQuestion());
//                                reloadTAskandrestartPopThread();

//                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        //    }]]]]]]]]]]]]]]]]=

    private String getString() {
        String buttonSelected = "";
        for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                buttonSelected = button.getText();
            }
        }
        return buttonSelected;
    }

    private void displaysearchtasks() {

        for (Task t : searchtasks) {
            currentTaskSearch = t;
            for (person_question e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    String inntuitive = "";
                    inntuitive += e.question;
                    try {
                        Desktop.getDesktop().open(new File(e.getQuestion()));
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                    while (!textArea.getText().trim().equalsIgnoreCase("")) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                    count++;
                    isSearch = true;
                }
            }
        }
    }

    public void deltask() {
        for (person_question e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                m.deleteTask(e.getJavauid());
                System.out.println("delet the " + e.question);
                if (isSearch == false) reloadTAskandrestartPopThread();
                isSearch = false;
            }
        }
    }


    public void addWord(String word, String answer) {
        person_question pq = new person_question(word, answer);
        m.store(pq);
        ebbinghauses.add(pq);
        textArea.setText("");
    }


// version contrl and tag and comment massage bauese i will mess up something and want to go back to back in time
    // somethinge are athere because it is preventeive and no nessaecry functional
    public void c1ds() {
        jk = new Properties();
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\l\\src\\zeng\\siyuan\\onceaday\\link\\onceaday\\document\\onceaday\\ssdd\\onceaday\\onceaday\\l.properties");
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                jk.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

/*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }

// a lot of noise to process and visual junk
            int count =1;
            for (Map.Entry<Object, Object> e : p.entrySet()) {
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

    }


    public void d(String c1, String c1Path) {

        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream("C:\\l\\src\\zeng\\siyuan\\onceaday\\link\\onceaday\\document\\onceaday\\ssdd\\onceaday\\onceaday\\l.properties");
            // set the properties value
            jk.setProperty(c1, c1Path);

            // save properties to project root folder
            jk.store(output, null);


/*
            output_solr = new FileOutputStream("/Users/vn0xrjh/daniel/14_GUIcopymacosx/c1comehere/c1s.properties.solr");

            int count = 0;
            for (Map.Entry<Object, Object> e : p.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                output_solr.write(String.valueOf(count).getBytes());
                output_solr.write(',');
                output_solr.write(key.getBytes());
                output_solr.write(',');
                output_solr.write(v.getBytes());
                output_solr.write(System.getProperty("line.separator").getBytes());
                count++;
            }
*/

            c1ds();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void loadTask() {

        // loadfrom property
        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (person_question e : ebbinghauses) {
            if (e.question.replace("DuSDfLgt", "").trim().isEmpty()) {
                m.deleteTask(e.getJavauid());
            } else {
                Set<Task> t = e.tasks;
                for (Task task : t) {
                    if (null !=task) tasks.add(task);
                }
            }
        }
        if (null != tasks && tasks.size()>1)Collections.sort(tasks, new Task());
    }


    public void DSF(person_question k) {

        // loadfrom property
//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
//        tasks = new CopyOnWriteArrayList<Task>();
//        for (person_question e : ebbinghauses) {
//            if (e.question.replace("DuSDfLgt", "").trim().isEmpty()) {
//                m.deleteTask(e.getJavauid());
//            } else {
                Set<Task> t = k.tasks;
                for (Task task : t) {
                    if (null !=task) tasks.add(task);
                }
//            }
//        }
        if (null != tasks && tasks.size()>1)Collections.sort(tasks, new Task());
    }


    public Date getdatelastday() {
        CopyOnWriteArrayList<person_question> ebbinghauses2 = (CopyOnWriteArrayList<person_question>) m.getlatest();
        CopyOnWriteArrayList<DecendingTask> taskstemp = new CopyOnWriteArrayList<DecendingTask>();
        for (person_question e : ebbinghauses2) {
            if (e.question.replace("DuSDfLgt", "").trim().isEmpty()) {
                m.deleteTask(e.getJavauid());
            } else {
//                DecendingTask d = new DecendingTask(e.getFirst());
//                taskstemp.add(d);
            }
        }
        Collections.sort(taskstemp, new DecendingTask());
        if (null != taskstemp && taskstemp.size() > 0) {
            return taskstemp.get(0).getDate();
        }
        return new Date();
    }

    public void searchehabins(String a) {
        textArea.setText("");
        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        searchtasks = new CopyOnWriteArrayList<Task>();
        searchebbinghauses = new CopyOnWriteArrayList<person_question>();

        keywords = a.trim();
        String[] sts = a.trim().split(" ");
        if (sts.length == 0) return;
        for (person_question e : ebbinghauses) {
            boolean flag2 = false;
            for (String s : sts) {
                flag2 = e.question.contains(s);
                if (!flag2) {
                    break;
                }
            }
            if (flag2) {
                for (Task ct : e.getTasks()) {
                    searchtasks.add(ct);
                    searchebbinghauses.add(e);
                    break;
                }
            }
        }
        count = 1;
        isSearch = true;
        if (null != searchtasks) {
            textArea.setText("");
            Collections.sort(searchtasks, new Task());
            reloadandDiskplaypopup(isSearch);
        }
    }

    public void reloadandDiskplaypopup(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopup() {
        if (!isSearch) {
            loadTask();
        }
        displayTask();
    }

    public void inster(String word, String answer) throws IOException {
        addWord(word, answer);
        isSearch = false;
    }

    private void reloadTAskandrestartPopThread() {
        loadTask();

        textArea.setText("");
        if (null != reloadandDisplayThread || reloadandDisplayThread.isAlive()) {
            reloadandDisplayThread.interrupt();
        }
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }


    public void init() {
        loadTask();
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }
}

