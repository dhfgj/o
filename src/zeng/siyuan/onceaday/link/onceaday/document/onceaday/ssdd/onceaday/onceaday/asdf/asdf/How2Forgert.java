package zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf;

import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.onceaday.link.onceaday.DecendingTask;
import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

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
    public peoplequesiton m = new peoplequesiton();;
    public boolean isSearch;
    public int count=1;
    private CopyOnWriteArrayList<person_question> searchebbinghauses;
    private CopyOnWriteArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;
    private String[] df={"", "d", "dd", "ddd", "dddd"};
    //once
    //date time
    //repeat daily
    //repeat day
    // e something else
    //


    public void d() {
        Scanner in = null;
        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {

            // date and time, how many munites from now

            // repeart or once: hour, time, wk
            // set the time

            // content
            // link
            // document
            // advanced content
            // message
            // this one can be use the existing display task

            String textStr[] = textArea.getText().split("\\r\\n|\\n|\\r");

// code the function carelessly and then i will spend the about same abmoutn of time to debugging the code and that i sthe problem
            //i don't know twheth ethe pflow works as properly and whether it does work or not or it just deisappeart tand i never get what i get
            // i have to understand the results of the thing sna never come back again and that it hs the thoing
            // whey did i get mad, i can just let it go and identify it and let it go i don't have to huminilate others and make them come back to me
            // unless i want to die sna i wnat the love again do i want to the love
            // doi i give away love do i have to get the love again
            // ido i wan tto give love
            // do i wan tot give away love? this is the question when i try to do domething or chose to iagnoere the things
            person_question e=null;
            //sconrn
    // strip of
            //

            if (textStr[0].equalsIgnoreCase("x")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }

                e = new person_question(stringBuffer1.toString(), "i", r.j(textStr[0]));

                UUID s = null;

for(person_question ss : ebbinghauses) {
if(ss.getText().equalsIgnoreCase(stringBuffer1.toString().trim())){
    s=ss.getJavauid();
}

}
                UUID finalS = s;
                tasks.removeIf(task -> task.getJavauuid().toString().equalsIgnoreCase(finalS.toString().trim()));
                peoplequesiton.deleteTask(s);
textArea.setText("");


            } else


            if (textStr[0].length()==5){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "i", r.j(textStr[0]));
            } else


            if (textStr[0].equalsIgnoreCase("l")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "l", r.strifasld("30"));
            } else


            if (textStr[0].equalsIgnoreCase("ll")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "ll", r.strifasld("60"));
            } else
// love heals everythig love i shte best healing
            if (textStr[0].equalsIgnoreCase("c")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "c", r.strifasld("60"));
            } else




            if (textStr[0].equalsIgnoreCase("j")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "j", new Date());
            } else


            if (null != textStr[1] && textStr[1].equalsIgnoreCase("j")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
            } else



            if (textStr[0].equalsIgnoreCase("dd")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "dd", new Date());
            } else



            if (textStr[0].equalsIgnoreCase("d")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "d", new Date());
            } else




            if (null != textStr[1] && textStr[1].equalsIgnoreCase("dd")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "dd", r.d(textStr[0]));
            } else



            if (null != textStr[1] && textStr[1].equalsIgnoreCase("d")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "d", r.d(textStr[0]));
            } else



            if (textStr[0].equalsIgnoreCase("gh")){
                for (person_question n : ebbinghauses) {
                    if ((n.getType().equalsIgnoreCase("gh"))){
                        e=n;
                    }
                }
                if (null !=e){

                    e.setDate(r.m(new Date()));
                    e.setText("asdfljl");
                } else {
                    e = new person_question("asdfkj", "gh", r.m(new Date()));

                }
            } else




            if (null != r.d(textStr[0])){

                if (null != textStr[1] && textStr[1].equalsIgnoreCase("j")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
                }


                else if (null != textStr[1] && textStr[1].equalsIgnoreCase("dd")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "dd", new Date());
                }

                else if (null != textStr[1] && textStr[1].equalsIgnoreCase("d")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "d", new Date());
                }


                else if (null != textStr[1] && textStr[1].equalsIgnoreCase("d")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "d", new Date());
                }

                else {
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }

                    e = new person_question(stringBuffer1.toString(), "p", r.d(textStr[0]));
                }


            } else {


                Integer ij=null;
                try {
                    ij = Integer.parseInt(textStr[0]);
                } catch (Exception e12 ){
                    e12.getMessage();
                    ij=null;
                }
                if (null == ij) {

                    StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[0]);

                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "f", r.strifasld(new String (String.valueOf(6*60))));
                }

                else {

                    StringBuffer stringBuffer1 = new StringBuffer();
//                    stringBuffer1.append(textStr[0]);

                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }

                    e = new person_question(stringBuffer1.toString(), ij.toString(), r.strifasld(new String (String.valueOf(ij.toString()))));

                }



//                StringBuffer stringBuffer1 = new StringBuffer();
//                for (int i = 1; i < textStr.length; i++) {
//                    stringBuffer1.append(textStr[i]);
//                }
//                e = new person_question(stringBuffer1.toString(), "p", r.strifasld(textStr[0]));
            }
// ilost a lot of production data while working on the thing that it doesn even work and that is a lot of paiful
            // the problem is tho test all the component ans taht will work
            // that is good

            m.store(e);
            person_question finalE = e;
            Runnable a = ()-> sdfasd(finalE);
            a.run();
//            reloadTAskandrestartPopThread();


        }
    }

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
        this.c1comehere = c1comehere;
        this.textArea = textArea;
        this.frame = frame;
    }

    public void updatetask() {
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date();

        Calendar c = Calendar.getInstance();

        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm");

        System.out.println(format.format(c.getTime()));

        c.add(Calendar.HOUR_OF_DAY, 1);

        System.out.println(format.format(c.getTime()));

        // found!
        String textinput = textArea.getText().replace(" Dufgt ", "");
        Scanner in = null;

        if (!textinput.isEmpty()) {
            StringBuilder stringBuilder1 = new StringBuilder();
            in = new Scanner(textinput);
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains(" found!")) {
                } else {
                    stringBuilder.append(line);
                }
            }
            textinput=stringBuilder.toString();
        }


        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 0 && timeOfDay < 12) {
            stringBuilder.append("Good Morning C1 world, ");
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            stringBuilder.append("Good Afternoon C1 world, ");
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            stringBuilder.append("Good Evening C1 world, ");
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            stringBuilder.append("Good Night C1 world, ");
        }

        stringBuilder.append(format.format(c.getTime()));

        for (person_question e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                if (timeOfDay >= 0 && timeOfDay < 12) {
                    stringBuilder.append(" am");
                } else if (timeOfDay >= 12 && timeOfDay < 24) {
                    stringBuilder.append(" pm");
                }
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(textinput);
                stringBuilder.append(System.getProperty("line.separator"));

                e.text = stringBuilder.toString();

                m.store(e);
                System.out.println("updates");
                isSearch=false;
                break;
            }
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
public static int c =2;
    public void displayTask() {
        try {
            if(isSearch){
                displaysearchtasks();
            } else {
                for (Task t : tasks) {

                    currentTask=t;
                    if (c == 0) {
                        Thread.sleep(4 * 60000);
                        c = 2;
                    }


                    if (!t.getIsDone() && t.getDate().after(new Date())) {
                    c--;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(t.getDate());
                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                        Thread.sleep(diff);
                        while (!textArea.getText().trim().isEmpty()) {
                            Thread.sleep(10000);
                        }

//                        frame.repaint();
//                        frame.toFront();
                        currentTask = t;
//                        String inntuitive = "";

                        for (person_question e : ebbinghauses) {
                            boolean asdf = false;
                            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
//                                    for (Task ct : e.getTasks()) {
//                                        if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                asdf = true;


                                if (e.type.equalsIgnoreCase("l")) {
                                    currentTask.setIsDone(false);
//                                                r.open(e.getText());
                                    currentTask.setDate(r.strifasld("30"));
                                } else if (e.type.equalsIgnoreCase("ll")) {
                                    currentTask.setIsDone(false);
//                                                r.open(e.getText());
                                    currentTask.setDate(r.strifasld("60"));
                                } else if (e.type.equalsIgnoreCase("c")) {
                                    currentTask.setIsDone(false);
//                                                r.open(e.getText());
                                    currentTask.setDate(r.strifasld("60"));
                                    if (!textArea.getText().trim().equalsIgnoreCase("")) try {
                                        TimeUnit.SECONDS.sleep(5);
                                    } catch (InterruptedException e9) {
                                        e9.printStackTrace();
                                    }
                                    textArea.setText(e.getText());
                                    ;
//                                    frame.repaint();
//                                    frame.toFront();

                                    Robot r = new Robot();
                                    int D = KeyEvent.VK_CONTROL;
                                    int Da = KeyEvent.VK_ENTER;
//                                                int Da = KeyEvent.VK_SHIFT;
//                                                int Dc = KeyEvent.VK_F11;
                                    r.keyPress(D);
                                    r.keyPress(Da);
//                                                r.keyPress(Dc);

                                    r.keyRelease(D);
                                    r.keyRelease(Da);
//                                                r.keyRelease(Dc);


                                } else if (e.type.equalsIgnoreCase("j")) {
                                    currentTask.setIsDone(false);
                                    currentTask.setDate(r.h(currentTask.getDate()));
                                } else if (e.type.equalsIgnoreCase("dd")) {
                                    currentTask.setIsDone(false);
                                    currentTask.setDate(r.k(currentTask.getDate()));
                                } else if (e.type.equalsIgnoreCase("d")) {
                                    currentTask.setIsDone(false);
                                    currentTask.setDate(r.l(currentTask.getDate()));
                                } else if (isInteger(e.type)) {
                                    currentTask.setIsDone(false);
                                    currentTask.setDate(r.strifasld(e.type));
                                } else if (e.type.equalsIgnoreCase("f")) {
                                    currentTask.setIsDone(false);
                                    currentTask.setDate(r.strifasld(new String(String.valueOf(6 * 60))));
                                } else if (isInteger(e.type)) {
                                    currentTask.setIsDone(false);
                                    currentTask.setDate(r.strifasld(e.type));
                                } else {
                                    currentTask.setIsDone(true);
                                }
                            }

                            m.store(e);
                            if ((null != e.text && !e.text.isEmpty()) && (e.text.contains("http://") || e.text.contains("https://"))) {
                                try {
                                    r.open(e.text);
                                } catch (Exception f) {
                                    f.printStackTrace();
                                }
                            } else if ((e.text.contains("sd") && text.equals("sd")) || (e.text.contains("shutdown") && e.text.equals("shutdown"))) {
                                Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                                // what the fuck si the else mean?
                            } else if (null != e.text || !e.text.trim().isEmpty()) {
                                r.open(e.text.trim());
                            } else {
                            }
//                            inntuitive += e.text;
//                                        }
//                                        if(asdf)break;
                            if (asdf) break;
                        }
                    }
//                        inntuitive += System.getProperty("line.separator");
//                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
//                }
            else if (!t.getIsDone() && t.getDate().before(new Date())) {
                        c--;

//                        if (c == 0 ) {
//                            Thread.sleep(4 * 60000);
//                            c= 2;
//                        }
//                        c --;



                        /*
                        *
                        *
                        *
                        *
                        *
                        *
                        * 1 day
                        * 1  day
                        * 1 day
                        * 1 day
                        * 1 day
                        * 1 day
                        *
                        * 1 day
                        *
                        *
                        *
                        * */

                        boolean found = false;
                        for (person_question e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(t.getJavauuid().toString())) {
//                                for (Task ct : e.getTasks()) {
                                    if (!currentTask.isDone) {

                                        while (!textArea.getText().trim().isEmpty()) {
                                            Thread.sleep(10000);
                                        }
//                                        frame.repaint();
//                                        frame.toFront();
//                                        currentTask = t;
//                                        String inntuitive = "";

                                        if(e.type.equalsIgnoreCase("l")){
                                            currentTask.setIsDone(false);
//                                            r.open(e.getText());
                                            currentTask.setDate(r.strifasld("30"));
                                        } else

                                        if(e.type.equalsIgnoreCase("j")){
                                            currentTask.setIsDone(false);
                                            currentTask.setDate(r.h(currentTask.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")){
                                            currentTask.setIsDone(false);
                                            currentTask.setDate(r.k(currentTask.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("d")) {
                                            currentTask.setIsDone(false);
                                            currentTask.setDate(r.l(currentTask.getDate()));
                                        }

                                        else


                                        if(e.type.equalsIgnoreCase("f")) {
                                            currentTask.setIsDone(false);
                                            currentTask.setDate(r.strifasld(new String (String.valueOf(6*60))));
                                        }

                                        else if (isInteger(e.type)) {
                                            currentTask.setIsDone(false);
                                            currentTask.setDate(r.strifasld(e.type));
                                        }
                                        else {
                                            currentTask.setIsDone(true);
                                        }

                                        m.store(e);
                                        if ((null != e.text && !e.text.isEmpty()) && (e.text.contains("http://") || e.text.contains("https://"))) {
                                            try {
                                                r.open(e.text);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                        } else if ((e.text.contains("sd") && text.equals("sd")) || (e.text.contains("shutdown") && e.text.equals("shutdown"))) {
                                            Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                                            // what the fuck si the else mean?
                                        } else if (null != e.text || !e.text.trim().isEmpty()) {
                                            r.open(e.text.trim());
                                        } else {
                                        }
//                                        inntuitive += e.text;

//                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                        found = true;
                                    }
//                                    if (found) break;
//                                }// i have to search and find the thing i want everythime and it doesn't make sany sease at foirst

                            }
                            if (found) {
                                break;
                            }
                        }
                    }



                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            currentTaskSearch=t;

            for (person_question e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    String inntuitive = "";
                    inntuitive += "\n";
                    inntuitive += " Dufgt ";
                    inntuitive += "\n";

                    inntuitive += (" found! " + count + "/" +searchtasks.size() + " " +keywords);
                    inntuitive +="\n";
                    inntuitive+=e.text;
                    if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                    while (!textArea.getText().trim().equalsIgnoreCase("")) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                    count++;
                    isSearch=true;
                }
            }
        }
    }

    public void deltask() {
        for (person_question e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                m.deleteTask(e.getJavauid());
                System.out.println("delet the " + e.text);
                if(isSearch==false)reloadTAskandrestartPopThread();
                isSearch=false;
            }
        }
    }


    public void addWord(String word, String answer) {
        person_question pq = new person_question(word, answer,getdatelastday());
        m.store(pq);
        ebbinghauses.add(pq);
        textArea.setText("");
    }
//http://tutorials.jenkov.com/java-concurrency/volatile.html
    public void loadTask() {
        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (person_question e : ebbinghauses) {
            if (e.text.replace("Dufgt", "").trim().isEmpty()){
                m.deleteTask(e.getJavauid());
            } else {
                Set<Task> t = e.tasks;
                for (Task task : t) {
                    if (null !=task)if (null !=task) tasks.add(task);
                }
            }
        }
        if (null == tasks && tasks.size()>1) Collections.sort(tasks, new Task());
    }

    public void sdfasd(person_question E) {
//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
//        tasks = new CopyOnWriteArrayList<Task>();
//        for (person_question e : ebbinghauses) {
//            if (e.text.replace("Dufgt", "").trim().isEmpty()){
//                m.deleteTask(e.getJavauid());
//            } else {
                Set<Task> t = E.tasks;
                for (Task task : t) {
                    if (null !=task)
                    if (null !=task) tasks.add(task);
                }
//            }
//        }
        if (null == tasks && tasks.size()>1)Collections.sort(tasks, new Task());
    }


    public Date getdatelastday() {
        CopyOnWriteArrayList<person_question> ebbinghauses2 = (CopyOnWriteArrayList<person_question>) m.getlatest();
        CopyOnWriteArrayList<DecendingTask> taskstemp = new CopyOnWriteArrayList<DecendingTask>();
        for (person_question e : ebbinghauses2) {
            if (e.text.replace("Dufgt", "").trim().isEmpty()){
                m.deleteTask(e.getJavauid());
            } else {
                DecendingTask d = new DecendingTask(e.getDate());
                taskstemp.add(d);
            }
        }
        Collections.sort(taskstemp, new DecendingTask());
        if(null != taskstemp && taskstemp.size()>0) {
            return taskstemp.get(0).getDate();
        }
        return new Date();
    }

    public void searchehabins(String a) {
        textArea.setText("");
        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        searchtasks = new CopyOnWriteArrayList<Task>();
        searchebbinghauses=new CopyOnWriteArrayList<person_question>();

        keywords=a.trim();
        String[] sts=a.trim().split(" ");
        if(sts.length==0)return;
        for (person_question e : ebbinghauses) {
            boolean flag2=false;
            for (String s : sts){
                flag2 = e.text.contains(s);
                if(!flag2){
                    break;
                }
            }
            if(flag2) {
                for (Task ct : e.getTasks()) {
                    searchtasks.add(ct);
                    searchebbinghauses.add(e);
                    break;
                }
            }
        }
        count=1;
        isSearch = true;
        if (null != searchtasks ) {
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
        if(!isSearch){
            loadTask();
        }
        displayTask();
    }

    public void inster(String word, String answer) throws IOException {
        addWord(word, answer);
        isSearch=false;
    }

    private void reloadTAskandrestartPopThread() {
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

