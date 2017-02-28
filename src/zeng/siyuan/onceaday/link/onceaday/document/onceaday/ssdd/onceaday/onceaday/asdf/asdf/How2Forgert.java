package zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf;

import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.onceaday.link.onceaday.DecendingTask;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.test.param.dao.SolrDataDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public transient JTextArea textArea;
    public transient static CopyOnWriteArrayList<person_question> ebbinghauses;
    public transient CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();
    public transient Task currentTask = new Task();
    public transient person_question dj= new person_question();
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
static Properties prop;


    public void c1s() {
        prop = new Properties();
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(new File("d.properties").getAbsolutePath());
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

            input = new FileInputStream(new File("d.properties").getAbsolutePath());
            // fjlasdjfl a properties file
            temprop = new Properties();
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

            input = new FileInputStream(new File("d.properties").getAbsolutePath());
            // fjlasdjfl a properties file
            temprop = new Properties();
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

/*

            Runnable r = () -> {

                SolrDataDAO solrBaseDAO = null;
                try {
                    solrBaseDAO = new SolrDataDAO();
                } catch (Exception e) {
                    e.printStackTrace();
                }


                int count = 1;
                for (Map.Entry<Object, Object> e : prop.entrySet()) {
                    System.out.println(count);
                    String key = ((String) e.getKey()).replace("%20", " ");
                    String v = (String) e.getValue();
                    try {
                        solrBaseDAO.addData(count, key, v);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    count++;
                }
                System.out.println("stop");

            };


            ExecutorService executor = Executors.newFixedThreadPool(1);

            executor.submit(r);
*/


        } catch(IOException ex){
            ex.printStackTrace();
        } finally{
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


    public void c1come2melater(String c1, String c1Path) {
c1s();
        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream(new File("d.properties").getAbsolutePath());
            c1Path = c1Path.replace(" ", "%20");
            // set the properties value
            prop.setProperty(c1Path, c1Path);

            // save properties to project root folder
            prop.store(output, null);


            output_solr = new FileOutputStream(new File("d.properties.solr").getAbsolutePath());

            int count = 0;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
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



            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


//            count =1 + solrBaseDAO.addData(1, c1Path, c1Path);
//            for (Map.Entry<Object, Object> e : p.entrySet()) {
//                System.out.println(count);
//                String key = ((String) e.getKey()).replace("%20", " ");
//                String v = (String) e.getValue();
            try {
                solrBaseDAO.addData(count, c1Path,c1Path);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            count++;
//            }
            System.out.println("stop");

//            c1s();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
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


    // for a funactinality it may seems so easy but very hat d to impomeentated what kind is that
    // what have you been implementated to search
    // ihave to index the feelinadn and do it again to index the things
    // it maybe beetter to use the solr ato impmentat the search but not all of thme
    // for the search i beter use elastic search becaseut it bis beter to use


    // i need to fliter the all the tihings

    // hwo to filter them but still keep the same thing
    // i can fillter at any p;lacee ce ther
    // everything park has the filtering functionarlity and but other s don't

    // you don't know / you know they are all the same
    // they are all the same

    //




public boolean f=true;
    public void dh(String dk, String s) {
        dl=false;
// you coame and go and nobody notice you nobody acare about you what does it mean i don't even realize what you feeling is ho do you feel
        // i aleways try to feel soemthing
        // i alreaus to ry to synpathyzie other s
        // i lways try to do something
        // people sit naext to me and then they lef t with out anything
        // a lot of people siting menset to me and means nothing to me what do you think
        // pepople are thating my food and i hafe nothing to eat
        // i have nothing but only have the food to get me over and won't die
        // i am jsut surviving that i sall i ahve tagoto


        // i can seave it but i alwao want o to indext it , how can do ca n i do the same at the samt itme ?

        for (person_question e : ebbinghauses) {
//            dj = e;
//            boolean asdf = false;
            if (e.getText().equalsIgnoreCase(s)) {
                e.getI().add(dk);
                m.store(e);
                System.out.println("hello");
            }
        }

        // wherey is everything so important and wny something are not ? what is the improantce of order and place and other things and exctce
// reveiw in time


        // what is the imporant tos syntaxt?





// then there a re a serious of code and i don't abstract ti then have i have to fighting with the details and try to know what i sthe rit here





    }
    public void d() {
        dl=false;
        Scanner in = null;
        c1come2melater("", textArea.getText());
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
//textArea.setText("");


            } else


            if (textStr[0].length()==5){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "i", r.j(textStr[0]));
                m.deleteTask(e.getJavauid());m.store(e);

            } else


            if (textStr[0].equalsIgnoreCase("l")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "l", r.strifasld("30"));
                m.deleteTask(e.getJavauid());m.store(e);

            } else


            if (textStr[0].equalsIgnoreCase("ll")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "ll", r.strifasld("60"));
                m.deleteTask(e.getJavauid());m.store(e);

            } else
// love heals everythig love i shte best healing
            if (textStr[0].equalsIgnoreCase("c")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "c", r.strifasld("60"));
                m.deleteTask(e.getJavauid());m.store(e);

            } else




            if (textStr[0].equalsIgnoreCase("j")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "j", new Date());
                m.deleteTask(e.getJavauid());m.store(e);

            } else


            if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("j")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
                m.deleteTask(e.getJavauid());m.store(e);

            } else



            if (textStr[0].equalsIgnoreCase("dd")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "dd", new Date());
                m.deleteTask(e.getJavauid());m.store(e);

            } else



            if (textStr[0].equalsIgnoreCase("d")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "d", new Date());
                m.deleteTask(e.getJavauid());m.store(e);

            } else




            if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("dd")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "dd", r.d(textStr[0]));
                m.deleteTask(e.getJavauid());m.store(e);

            } else



            if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("d")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new person_question(stringBuffer1.toString(), "d", r.d(textStr[0]));
                m.deleteTask(e.getJavauid());m.store(e);

            } else



            if (textStr[0].equalsIgnoreCase("gh")){
                for (person_question n : ebbinghauses) {
                    if ((n.getType().equalsIgnoreCase("gh"))){
                        e=n;
                    }
                }
                if (null !=e){

                    e.setDate(r.m(new Date()));
//                    e.setText("asdfljl");
                } else {
                    e = new person_question("asdfkj", "gh", r.m(new Date()));
                    m.deleteTask(e.getJavauid());m.store(e);

                }
            } else




            if (null != r.d(textStr[0])){

                if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("j")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
                    m.deleteTask(e.getJavauid());m.store(e);

                }


                else if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("dd")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "dd", new Date());
                    m.deleteTask(e.getJavauid());m.store(e);

                }

                else if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("d")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "d", new Date());
                    m.deleteTask(e.getJavauid());m.store(e);

                }


                else if (textStr.length > 1 && null != textStr[1] && textStr[1].equalsIgnoreCase("d")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new person_question(stringBuffer1.toString(), "d", new Date());
                    m.deleteTask(e.getJavauid());m.store(e);

                }

                else {
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }

                    e = new person_question(stringBuffer1.toString(), "p", r.d(textStr[0]));
                    m.deleteTask(e.getJavauid());m.store(e);
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


                    for (int i = 0; i < textStr.length; i++) {

                        StringBuffer stringBuffer1 = new StringBuffer();
//                        stringBuffer1.append(textStr[0]);
                        stringBuffer1.append(textStr[i]);
                        e = new person_question(stringBuffer1.toString(), "f", r.strifasld(new String (String.valueOf(30))));
                        m.deleteTask(e.getJavauid());m.store(e);
                    }
                }

                else {

//                    stringBuffer1.append(textStr[0]);

                    for (int i = 1; i < textStr.length; i++) {

                        StringBuffer stringBuffer1 = new StringBuffer();
                        stringBuffer1.append(textStr[i]);

                        e = new person_question(stringBuffer1.toString(), ij.toString(), r.strifasld(new String (String.valueOf(ij.toString()))));
                        m.deleteTask(e.getJavauid());m.store(e);
//                        person_question finalE = e;
//                        Runnable a = ()-> sdfasd(finalE);
//                        a.run();

                    }

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

        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM dd, yyyy 'at' hh:mm");

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

                m.deleteTask(e.getJavauid());m.store(e);
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
                for (Task t : tasks) {// when things increase and go unmanageable
                    // love untold

                    // love is connected
                    // connection i sthe thing
//                    we are onnect
//we are connecteda nd you know 
                    currentTask=t;
                    if (c == 0) {
                        Thread.sleep(6 * 60000);
                        c = 2;
                    }
// ther eis no body and there is always somebody and you should know about ti t


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
                            dj = e;
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
                            }// all kind so fnoise and everything jstu so distracting me and make me feel uncomfiratable

                            m.deleteTask(e.getJavauid());m.store(e);
                            if ((null != e.text && !e.text.isEmpty()) && (e.text.contains("http://") || e.text.contains("https://"))) {
                                try {
                                    while (f) {
                                        Thread.sleep(10000);
                                    }

                                            while (null != e.text && !e.text.isEmpty()) {
                                                Thread.sleep(10000);
                                            }
                                            textArea.setText(e.text);

                                    r.open(e.text);

                                } catch (Exception f) {
                                    f.printStackTrace();
                                }
                            } else if ((e.text.contains("sd") && text.equals("sd")) || (e.text.contains("shutdown") && e.text.equals("shutdown"))) {
                                Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                                // what the fuck si the else mean?
                            } else if (null != e.text || !e.text.trim().isEmpty()) {
                                while (f) {
                                    Thread.sleep(10000);
                                }
                                while (null != e.text && !e.text.isEmpty()) {
                                    Thread.sleep(10000);
                                }
                                textArea.setText(e.text);

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
//                            Thread.sleep(6 * 60000);
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

                                        m.deleteTask(e.getJavauid());m.store(e);
                                        if ((null != e.text && !e.text.isEmpty()) && (e.text.contains("http://") || e.text.contains("https://"))) {
                                            try {
                                                while (f) {
                                                    Thread.sleep(10000);
                                                }
                                                while (null != e.text && !e.text.isEmpty()) {
                                                    Thread.sleep(10000);
                                                }
                                                textArea.setText(e.text);

                                                r.open(e.text);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                        } else if ((e.text.contains("sd") && text.equals("sd")) || (e.text.contains("shutdown") && e.text.equals("shutdown"))) {
                                            Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                                            // what the fuck si the else mean?
                                        } else if (null != e.text || !e.text.trim().isEmpty()) {
                                            while (f) {
                                                Thread.sleep(10000);
                                            }
                                            while (null != e.text && !e.text.isEmpty()) {
                                                Thread.sleep(10000);
                                            }
                                            textArea.setText(e.text);

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
            if (e.text.replace("Dufgt", "").trim().isEmpty()) {
                m.deleteTask(e.getJavauid());
            } else {
                Set<Task> t = e.tasks;
                for (Task task : t) {
                    if (null != task) if (null != task) tasks.add(task);
                }
            }
        }
        if (null != tasks && tasks.size() > 1) Collections.sort(tasks, new Task());

        Runnable r = () -> {


        for (person_question e : ebbinghauses) {

            c1come2melater("", e.getText());
        }



    };


        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(r);



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
        if (null != tasks && tasks.size()>1)Collections.sort(tasks, new Task());
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
        dl=false;
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

    public boolean dl= false;
    public void reloadandDiskplaypopup() {
        if(!isSearch && !dl ){
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
//        c1s();
        dl=false;
        loadTask();
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }

    public void j() {

            ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();

//        for (int js = 1; js <= textArea.getText().split("\\r\\n|\\n|\\r").length-1; js++) {
            // i kind of realize that what i t means to be fun when programming becaues ti tis fun and i really enjoy it .
            // i have nothing to do thi si what the fucking peole describes focus because ti is there is nothing in the life that can distract me from programming
// how to get the current thigs that associate iwth the this thing if i use the elastic search then i think it would be easier becaus ether ei s be better scripting experience now i have to write the code to track it which is anooying
//            j.dh(textArea.getText().split("\\r\\n|\\n|\\r")[js], textArea.getText().split("\\r\\n|\\n|\\r")[textArea.getText().split("\\r\\n|\\n|\\r").length-1]);
// no mater what htere is always a high level overiveoiw


            for (person_question e : ebbinghauses) {
                dj = e;
                boolean asdf = false;
                Set<String> set = e.getI();
                boolean foudn = false;
                if (set.size() !=0) {
                    for (int jss = 1; jss <= textArea.getText().split("\\r\\n|\\n|\\r").length - 1; jss++) {
                        if (set.contains(textArea.getText().split("\\r\\n|\\n|\\r")[jss])) {
                            foudn = true;
                        }

                    }
                }


                if (!foudn) {
                    ebbinghauses.remove(e);
                }
            }


            tasks = new CopyOnWriteArrayList<Task>();
            for (person_question e : ebbinghauses) {
                if (e.text.replace("Dufgt", "").trim().isEmpty()) {
                    m.deleteTask(e.getJavauid());
                } else {
                    Set<Task> t = e.tasks;
                    for (Task task : t) {
                        if (null != task) if (null != task) tasks.add(task);
                    }
                }
            }
            if (null != tasks && tasks.size() > 1) Collections.sort(tasks, new Task());

            Runnable r = () -> {


                for (person_question e : ebbinghauses) {

                    c1come2melater("", e.getText());
                }



            };

dl=true;
            ExecutorService executor = Executors.newFixedThreadPool(1);

            executor.submit(r);


            d = new Display(this);
            reloadandDisplayThread = new Thread(d);
            reloadandDisplayThread.start();










        }


            // no matter waht
            // ho can you mess the code no matter how you mess you code

// i don't have money to eat, all i have to it is eat
            // all i have is food
            // all i want is food
            // jpe yp make this applicaiton  getter and easier to use
            // ther ei s no amchine ther ei no mpersonal cut touch there is not


        }
//    }

