package zeng.siyuan.onceaday.onceaday.onceaday.a.onceaday;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.testng.annotations.Test;
import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.C1comehere.Search;
import zeng.siyuan.onceaday.onceaday.onceaday.a.onceaday.link.onceaday.DecendingTask;
import zeng.siyuan.onceaday.onceaday.onceaday.a.onceaday.link.onceaday.MongoDbHelper;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.test.param.dao.SolrDataDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

//import static zeng.siyuan.onceaday.onceaday.peoplequesiton.mapper;

//Created by Real
public class How2Forgert implements Serializable {



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
try {
    for (person_question e : ebbinghauses) {
//            dj = e;
//            boolean asdf = false;
        if (e.getText().equalsIgnoreCase(s)) {
            e.getS().add(dk);
            String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

            // Convert object to JSON string and pretty print
            j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
            DBObject p = (DBObject) JSON
                    .parse(j);


            MongoDbHelper k = MongoDbHelper.getInstance();
            k.insertDocument("p", p);
            System.out.println("hello");
        }
    }
} catch(Exception e ) {

}

        // wherey is everything so important and wny something are not ? what is the improantce of order and place and other things and exctce
// reveiw in time


        // what is the imporant tos syntaxt?





// then there a re a serious of code and i don't abstract ti then have i have to fighting with the details and try to know what i sthe rit here





    }

    public transient C1comehere c1comehere;
    public static transient JTextArea textArea;
    public transient static CopyOnWriteArrayList<person_question> ebbinghauses = new CopyOnWriteArrayList<person_question> ();
    public transient CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();
    public transient Task AJKDSLJFLKJQWOIRULJDFLKJL = new Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
//    public peoplequesiton m = new peoplequesiton();;
    public boolean isSearch;
    public int count=1;
    private CopyOnWriteArrayList<person_question> searchebbinghauses;
    private CopyOnWriteArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;
    static ObjectMapper mapper = new ObjectMapper();


    public person_question d(String s) throws JsonProcessingException, UnknownHostException {dl =false;
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
// i remember thsi because i copies and put it here and dstore it here
            // there may be other constant and like database connection
            // the input and out reput are so didfernt

            person_question e=null;


            if (textStr[0].length()==5){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "i", r.j(textStr[0]));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else


            if (textStr[0].equalsIgnoreCase("l")){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "l", r.strifasld("30"));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else
// actions and actions action after action to pipe to the diesire destination
            // piple line to the end
// i kost you forever, you connec tto me and that is it we are connectded, you find me and you have some good wrods for me that is like the blessing from the heaven or even the curse from the hell and you know that is for me you are speadking frot me to me for me only
            // because i you need my response and i have to take it in and that is a it i can't take it in i iwll remember and that is ti si i don't forevert and that feeling and everything is cfazy
            // all the meory will just come to me and that is crazy all the meory will coem to me
            // amd we are not together
            // i just wnat to be alone
            // leave me alone
            //
            if (textStr[0].equalsIgnoreCase("ll")){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "ll", r.strifasld("60"));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else

            if (textStr[0].equalsIgnoreCase("c")){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "c", r.strifasld("60"));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else




            if (textStr[0].equalsIgnoreCase("j")){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "j", new Date());
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else


            if (textStr.length>1&&textStr[1].equalsIgnoreCase("j")){
                for (int i = 2; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else



            if (textStr[0].equalsIgnoreCase("dd")){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "dd", new Date());
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();
                }
            } else



            if (textStr[0].equalsIgnoreCase("d")){
                for (int i = 1; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "d", new Date());
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
            } else




            if (textStr.length>1&&textStr[1].equalsIgnoreCase("dd")){
                for (int i = 2; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "dd", r.d(textStr[0]));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();
                }
            } else



            if (textStr.length>1&&textStr[1].equalsIgnoreCase("d")){
                for (int i = 2; i < textStr.length; i++) {
                StringBuffer stringBuffer1 = new StringBuffer();
                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "d", r.d(textStr[0]));
                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();

                }
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
                    e = new person_question("asdfkj", "gh", r.m(new Date()));                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();


                }
            } else




            if (null != r.d(textStr[0])){

                if (textStr[1].equalsIgnoreCase("j")){
                    for (int i = 2; i < textStr.length; i++) {
                    StringBuffer stringBuffer1 = new StringBuffer();
                        stringBuffer1.append(textStr[i]);
                    e = new person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
                        // Convert object to JSON string
                        String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                        // Convert object to JSON string and pretty print
                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                        DBObject p = (DBObject) JSON
                                .parse(j);


                        MongoDbHelper k = MongoDbHelper.getInstance();
                        k.insertDocument("p", p);
                        person_question finalE1 = e;
                        Runnable ks = () -> LKJ(finalE1);
                        ks.run();

                    }
                }

                if (textStr.length>1&&textStr[1].equalsIgnoreCase("dd")){
                    for (int i = 2; i < textStr.length; i++) {
                    StringBuffer stringBuffer1 = new StringBuffer();
                        stringBuffer1.append(textStr[i]);
                    e = new person_question(stringBuffer1.toString(), "dd", new Date());                    // Convert object to JSON string
                        String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                        // Convert object to JSON string and pretty print
                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                        DBObject p = (DBObject) JSON
                                .parse(j);


                        MongoDbHelper k = MongoDbHelper.getInstance();
                        k.insertDocument("p", p);
                        person_question finalE1 = e;
                        Runnable ks = () -> LKJ(finalE1);
                        ks.run();

                    }
                }

                if (textStr.length>1&&textStr[1].equalsIgnoreCase("d")){
                    for (int i = 2; i < textStr.length; i++) {
                    StringBuffer stringBuffer1 = new StringBuffer();
                        stringBuffer1.append(textStr[i]);
                    e = new person_question(stringBuffer1.toString(), "d", new Date());                    // Convert object to JSON string
                        String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                        // Convert object to JSON string and pretty print
                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                        DBObject p = (DBObject) JSON
                                .parse(j);


                        MongoDbHelper k = MongoDbHelper.getInstance();
                        k.insertDocument("p", p);
                        person_question finalE1 = e;
                        Runnable ks = () -> LKJ(finalE1);
                        ks.run();

                    }
                }

                else {
                    for (int i = 1; i < textStr.length; i++) {
                    StringBuffer stringBuffer1 = new StringBuffer();
                        stringBuffer1.append(textStr[i]);
                    e = new person_question(stringBuffer1.toString(), "p", r.d(textStr[0]));
//                    StringBuffer stringBuffer1 = new StringBuffer();
//                    stringBuffer1.append(textStr[i]);
//
//                    e = new person_question(stringBuffer1.toString(), "p", r.strifasld(new String (String.valueOf(ij.toString()))));

                        // Convert object to JSON string
                        String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                        // Convert object to JSON string and pretty print
                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                        DBObject p = (DBObject) JSON
                                .parse(j);


                        MongoDbHelper k = MongoDbHelper.getInstance();
                        k.insertDocument("p", p);
                        person_question finalE = e;
                        Runnable ks = () -> LKJ(finalE);
                        ks.run();
//                    reloadTAskandrestartPopThread();
                        textArea.setText("");

                    }


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

//                    stringBuffer1.append(textStr[0]);

                for (int i = 1; i < textStr.length; i++) {
                    StringBuffer stringBuffer1 = new StringBuffer();

                    stringBuffer1.append(textStr[i]);
                e = new person_question(stringBuffer1.toString(), "p", r.strifasld(new String (String.valueOf(10))));

//                    StringBuffer stringBuffer1 = new StringBuffer();
//                    stringBuffer1.append(textStr[i]);

//                    e = new person_question(stringBuffer1.toString(), "p", r.strifasld(new String (String.valueOf(ij.toString()))));

                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("p", p);
                    person_question finalE1 = e;
                    Runnable ks = () -> LKJ(finalE1);
                    ks.run();
//                    reloadTAskandrestartPopThread();
                    textArea.setText("");



                }
                }

                else {

//                    stringBuffer1.append(textStr[0]);

                    for (int i = 1; i < textStr.length; i++) {
                    StringBuffer stringBuffer1 = new StringBuffer();
                        stringBuffer1.append(textStr[i]);

                        e = new person_question(stringBuffer1.toString(), "p", r.strifasld(new String (String.valueOf(ij.toString()))));

                        // Convert object to JSON string
                        String j = mapper.writeValueAsString(e);
//                    System.out.println(j);

                        // Convert object to JSON string and pretty print
                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                    System.out.println(j);
                        DBObject p = (DBObject) JSON
                                .parse(j);


                        MongoDbHelper k = MongoDbHelper.getInstance();
                        k.insertDocument("p", p);
                        person_question finalE2 = e;
                        Runnable ks = () -> LKJ(finalE2);
                        ks.run();
//                    reloadTAskandrestartPopThread();
                        textArea.setText("");


                    }


                }
            }


            return  e;

        }
        return null;
    }

//    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
//        this.c1comehere = c1comehere;
//        this.textArea = textArea;
//        this.frame = frame;
//    }

//    /*
    public void updatetask() {dl =false;
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
            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
                if (timeOfDay >= 0 && timeOfDay < 12) {
                    stringBuilder.append(" am");
                } else if (timeOfDay >= 12 && timeOfDay < 24) {
                    stringBuilder.append(" pm");
                }
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(textinput);
                stringBuilder.append(System.getProperty("line.separator"));

                e.text = stringBuilder.toString();

//                m.deleteTask(e.getJavauid());m.store(e);
                System.out.println("updates");
                isSearch=false;
                break;
            }
        }
    }
//*/





    public void displayTaskFGADSHFJKASHFDKJLKJLKJ() {
        try {
            if(isSearch){
//                System.out.println("SJDFLKAJS;LDFJALS;KJFLASKJFDLASDJF;LJALSDJFLASJFLASDJFLKJHKJGFJHAGSDHJFQWOIREYIWEHRKJSDBFK");
//                displaysearchtasks();
            } else {
                for (Task t : tasks) {



                    if (!t.getIsDone() && t.getDate().after(new Date())) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(t.getDate());
                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                        Thread.sleep(diff);
                        while (!textArea.getText().trim().isEmpty()) {
                            Thread.sleep(10000);
                        }

                        frame.repaint();
                        frame.toFront();
                        AJKDSLJFLKJQWOIRULJDFLKJL = t;
                        String inntuitive ="";

                        for (person_question e : ebbinghauses) {
                            boolean asdf= false;
                            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
                                for (Task ct : e.getTasks()) {
                                    if (null != ct && ct.getDate().getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
                                        asdf = true;


                                        if(e.type.equalsIgnoreCase("l")){
                                            ct.setIsDone(false);
//                                                r.open(e.getText());
                                            ct.setDate(r.strifasld("30"));
                                        } else

                                        if(e.type.equalsIgnoreCase("ll")){
                                            ct.setIsDone(false);
//                                                r.open(e.getText());
                                            ct.setDate(r.strifasld("60"));
                                        } else

                                        if(e.type.equalsIgnoreCase("c")){
                                            ct.setIsDone(false);
//                                                r.open(e.getText());
                                            ct.setDate(r.strifasld("60"));
                                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(e.getText());;
                                            frame.repaint();
                                            frame.toFront();

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



                                        } else

                                        if(e.type.equalsIgnoreCase("j")){
                                            ct.setIsDone(false);
                                            ct.setDate(r.h(ct.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")){
                                            ct.setIsDone(false);
                                            ct.setDate(r.k(ct.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("d")) {
                                            ct.setIsDone(false);
                                            ct.setDate(r.l(ct.getDate()));
                                        }


                                        else {
                                            ct.setIsDone(true);
                                        }
                                    }

                                    String j = mapper.writeValueAsString(e);
                                    System.out.println(j);
                                    inntuitive=j;
//                                    logDictionary(
//                                            null, null, inntuitive
//                                    );
                                    // Convert object to JSON string and pretty print
                                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                    System.out.println(j);
                                    DBObject p = (DBObject) JSON
                                            .parse(j);


                                    MongoDbHelper k= MongoDbHelper.getInstance();

//                                    k.insertDocument("p", p);

//                                    BasicDBObject searchQuery = new BasicDBObject().append("javauid", e.getJavauid());
//
//
//                                    k.updateDocument("p", searchQuery, p);
k.removeDocument("p", p);

                                    if ((null != e.text && !e.text.isEmpty()) && (e.text.contains("http://") || e.text.contains("https://"))) {
                                        try {
                                            while (f){
                                                Thread.sleep(10000);
                                            }

                                            r.open(e.text);
                                        } catch (Exception f) {
                                            f.printStackTrace();
                                        }
                                    } else if ((e.text.contains("sd") && text.equals("sd")) || (e.text.contains("shutdown") && e.text.equals("shutdown"))) {
                                        Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                                        // what the fuck si the else mean?
                                    } else if (null != e.text || !e.text.trim().isEmpty()) {
                                        while (f){
                                            Thread.sleep(10000);
                                        }
                                        r.open(e.text.trim());
                                    } else {
                                    }
                                    inntuitive += e.text;
                                }
                                if(asdf)break;
                            }
                            if(asdf)break;
                        }
                        inntuitive += System.getProperty("line.separator");
                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                    } else if (!t.getIsDone() && t.getDate().before(new Date())) {
                        boolean found = false;
                        for (person_question e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(t.getJavauuid().toString())) {
                                for (Task ct : e.getTasks()) {
                                    if (!ct.isDone) {

                                        while (!textArea.getText().trim().isEmpty()) {
                                            Thread.sleep(10000);
                                        }
                                        frame.repaint();
                                        frame.toFront();
                                        AJKDSLJFLKJQWOIRULJDFLKJL = t;
                                        String inntuitive = "";

                                        if(e.type.equalsIgnoreCase("l")){
                                            ct.setIsDone(false);
//                                            r.open(e.getText());
                                            ct.setDate(r.strifasld("30"));
                                        } else

                                        if(e.type.equalsIgnoreCase("j")){
                                            ct.setIsDone(false);
                                            ct.setDate(r.h(ct.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")){
                                            ct.setIsDone(false);
                                            ct.setDate(r.k(ct.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("d")) {
                                            ct.setIsDone(false);
                                            ct.setDate(r.l(ct.getDate()));
                                        }


                                        else {
                                            ct.setIsDone(true);
                                        }

                                        String j = mapper.writeValueAsString(e);
                                        System.out.println(j);
                                        inntuitive=j;
//                                        logDictionary(
//                                                null, null, inntuitive
//                                        );
                                        // Convert object to JSON string and pretty print
                                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                        System.out.println(j);
                                        DBObject p = (DBObject) JSON
                                                .parse(j);


                                        MongoDbHelper k= MongoDbHelper.getInstance();
//                                        k.insertDocument("p", p);
// asscemble things together at somet point of time and do the dediting work there tat would be better.

                                        BasicDBObject searchQuery = new BasicDBObject().append("javauid", e.getJavauid());


//                                        k.updateDocument("p", searchQuery, p);
k.removeDocument("p", p);

                                        if ((null != e.text && !e.text.isEmpty()) && (e.text.contains("http://") || e.text.contains("https://"))) {
                                            try {                                            while (f){
                                                Thread.sleep(10000);
                                            }

                                                r.open(e.text);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                        } else if ((e.text.contains("sd") && text.equals("sd")) || (e.text.contains("shutdown") && e.text.equals("shutdown"))) {
                                            Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                                            // what the fuck si the else mean?
                                        } else if (null != e.text || !e.text.trim().isEmpty()) {                                            while (f){
                                            Thread.sleep(10000);
                                        }

                                            r.open(e.text.trim());
                                        } else {
                                        }
                                        inntuitive += e.text;

                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                        found = true;
                                    }
                                    if (found) break;
                                }
                            }
                            if (found) break;
                        }
                    }



                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


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


            output_solr = new FileOutputStream(new File("d.properties").getAbsolutePath());

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

    public void j() {
        List<DBObject> k = null ;
        try {
            k = MongoDbHelper.getInstance().findAll("p").toArray();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (DBObject e : k) {

            String jsonInString = k.get(0).toString();
            person_question stasdfhalksfdjlkasdjflkaff1 = null;
            try {
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), person_question.class);
                ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }

//        for (int js = 1; js <= textArea.getText().split("\\r\\n|\\n|\\r").length-1; js++) {
        // i kind of realize that what i t means to be fun when programming becaues ti tis fun and i really enjoy it .
        // i have nothing to do thi si what the fucking peole describes focus because ti is there is nothing in the life that can distract me from programming
// how to get the current thigs that associate iwth the this thing if i use the elastic search then i think it would be easier becaus ether ei s be better scripting experience now i have to write the code to track it which is anooying
//            j.dh(textArea.getText().split("\\r\\n|\\n|\\r")[js], textArea.getText().split("\\r\\n|\\n|\\r")[textArea.getText().split("\\r\\n|\\n|\\r").length-1]);
// no mater what htere is always a high level overiveoiw
// all the folder tare there there is no distinction the only way to navigatote itis to know the path and you will know

        for (person_question e : ebbinghauses) {
//            dj = e;
            boolean asdf = false;
            Set<String> set = e.getS();
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
//                m.deleteTask(e.getJavauid());
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

// it is all mess the file will be loast everything teverytime you use
        // there is con consisitentce and there is no heirstoyr
        // it is sjust choaos.
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();










    }

    public boolean f =true;
    public boolean dl =false;
    public void load() throws UnknownHostException {dl =false;
        Scanner in = null;

//        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {
//
//            in = new Scanner(textArea.getText());
//            while (in.hasNext()) {
//                String line = in.nextLine();
//                    if (line.contains("?") && line.endsWith("?")) {
//                person_question e = new person_question(line, "p", getdatelastday());
//                        m.deleteTask(e.getJavauid());m.store(e);
//                ObjectMapper mapper = new ObjectMapper();

//                            person_question staff = person_question();

                try {
                    // Convert object to JSON string and save into a file directly
//                                mapper.writeValue(new File("D:\\staff.json"), staff);
                    String textStr[] = textArea.getText().split("\\r\\n|\\n|\\r");
//angu
                    for(String s : textStr) {
                        person_question e = d(s);
                    }
                } catch (JsonGenerationException p) {
                    p.printStackTrace();
                } catch (JsonMappingException ee) {
                    ee.printStackTrace();
                } catch (IOException d) {
                    d.printStackTrace();
                }

//                    } else {
//                    }
            }

// how to handle a lot of event s and all those shiets

// programming iks hard you have to do it one step by one step
    // it is just tedious and stupid that is it

            @Test
            public void HSLAKJFLKSJF ( ){
                How2Forgert AJLKSDJFALSJFALSDJFLASDJF = new How2Forgert();
// wehre is no knowledge there is only lies
// people lie to gett everything and that is all things are requireda nd htat is all
                // there is not knowledge and facts and no helpful
                // it is all fuckting lies excetpt hat hose that are useful
                // i am tierd of doing the same shit sagain and agan because i know anyway i can do it wihout a doubt, so why bother
                // because i need it and i care about it and that i shte solution to everythings
                // useuless information are not interesting
                // that is whay i don't know aht to do
                // knowledge is the only facts and that is the reliable

                AJLKSDJFALSJFALSDJFLASDJF.textArea = new JTextArea();
                AJLKSDJFALSJFALSDJFLASDJF.textArea.setText("l"
                        + System.getProperty("line.separator")
                        + "adfkjlasdjfJLKAJSDLF;KJASDLKFHLAKSJFDL");
                try {
                    AJLKSDJFALSJFALSDJFLASDJF.load();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }

            }


//            }
//        }
//    }


    public How2Forgert() {


    }

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {dl =false;
        this.c1comehere = c1comehere;
        this.textArea = textArea;
        this.frame = frame;
    }

//    public void updatetask() throws UnknownHostException {
//        StringBuilder stringBuilder = new StringBuilder();
//        Date date = new Date();
//
//        Calendar c = Calendar.getInstance();
//
//        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM dd, yyyy 'at' hh:mm");
//
//        System.out.println(format.format(c.getTime()));
//
//        c.add(Calendar.HOUR_OF_DAY, 1);
//
//        System.out.println(format.format(c.getTime()));
//
//         found!
//        String textinput = textArea.getText().replace(" Dufgt ", "");
//        Scanner in = null;
//
//        if (!textinput.isEmpty()) {
//            StringBuilder stringBuilder1 = new StringBuilder();
//            in = new Scanner(textinput);
//            while (in.hasNext()) {
//                String line = in.nextLine();
//                if (line.contains(" found!")) {
//                } else {
//                    stringBuilder.append(line);
//                }
//            }
//            textinput=stringBuilder.toString();
//        }
//
//
//        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
//
//        if (timeOfDay >= 0 && timeOfDay < 12) {
//            stringBuilder.append(System.getProperty("line.separator"));
//            stringBuilder.append("Good Morning C1 world, ");
//        } else if (timeOfDay >= 12 && timeOfDay < 16) {
//            stringBuilder.append(System.getProperty("line.separator"));
//            stringBuilder.append("Good Afternoon C1 world, ");
//        } else if (timeOfDay >= 16 && timeOfDay < 21) {
//            stringBuilder.append(System.getProperty("line.separator"));
//            stringBuilder.append("Good Evening C1 world, ");
//        } else if (timeOfDay >= 21 && timeOfDay < 24) {
//            stringBuilder.append(System.getProperty("line.separator"));
//            stringBuilder.append("Good Night C1 world, ");
//        }

//        stringBuilder.append(format.format(c.getTime()));
//
//        for (person_question e : ebbinghauses) {
//            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
//                if (timeOfDay >= 0 && timeOfDay < 12) {
//                    stringBuilder.append(" am");
//                } else if (timeOfDay >= 12 && timeOfDay < 24) {
//                    stringBuilder.append(" pm");
//                }
//                stringBuilder.append(System.getProperty("line.separator"));
//                stringBuilder.append(textinput);
//                stringBuilder.append(System.getProperty("line.separator"));
//
//                e.text = stringBuilder.toString();
//
//                m.deleteTask(e.getJavauid());m.store(e);
//
//                String j = null;
//                try {
//                    j = mapper.writeValueAsString(e);
//                } catch (JsonProcessingException e1) {
//                    e1.printStackTrace();
//                }
//                System.out.println(j);
//
                // Convert object to JSON string and pretty print
/*
                try {
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                } catch (JsonProcessingException e1) {
                    e1.printStackTrace();
                }
                System.out.println(j);
                DBObject p = (DBObject) JSON
                        .parse(j);


                MongoDbHelper k= MongoDbHelper.getInstance();
                k.insertDocument("p", p);

// the dabase will be containminate i have to restorey it i s just so har dd to do so
//ihave to have hard copy that won't beet ecomplate and that is all ihave to so dos i have i hw to os dfo dfa sdfi manually that is ait lasdkflasdfj;sdfkjasljfsdfjdsjfsdlkjflasdjflksdjflksjfddsjflkdalfajslfjlsjflasjlfj

                System.out.println("updates");
                isSearch=false;
                break;
            }
        }
    }
*/
// regardingc onsatnt dleement like time is same as utility and caom reuse like count wait for 5 seconds
    //

    public static int c= 2;
    public void displayTask() {
        try {
            if (isSearch) {
                displaysearchtasks();
            } else {
                for (int l=0; l<tasks.size(); l++) {
                    if (c == 0) {
                        Thread.sleep(6 * 60000);
                        c = 2;
                    }

                    Task t = tasks.get(l);

//                    SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
//                    if (!t.getIsDone() && (new Date()).compareTo(t.getDate()) > 0) {
                    if ( null != t && !t.getIsDone() && t.getDate().after(new Date())) {
                        c--;
//                        Calendar calendar = Calendar.getInstance();
//                        calendar.setTime(t.getDate());

//                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
//                            Thread.sleep(diff);
//                            while (!textArea.getText().trim().isEmpty()) {
//                                Thread.sleep(10000);
//                            }

//                            frame.repaint();
//                            frame.toFront();
                        AJKDSLJFLKJQWOIRULJDFLKJL = t;
//                            String inntuitive = System.getProperty("line.separator");
                        String inntuitive = "";

//                        boolean asdf = false;
//                            inntuitive += (" Dufgt ");
//                            inntuitive += System.getProperty("line.separator");
                        for (int d =0; d<ebbinghauses.size(); d++) {
                            person_question e = ebbinghauses.get(d);
                            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
//                                    for (Task ct : e.getTasks()) {
//                                        if (ct.getDate().getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
//                                            ct.setIsDone(true);

                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(t.getDate());
// databse has effictient because ther ei smapping existing and decicde whehte rot put them in the same tpalbe or oto babaract them and pmap
                                // abstraction vs mapping
                                long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                                try {
                                    Thread.sleep(diff);
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                                AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(true);
//                            while (!textArea.getText().trim().isEmpty()) {
//                                Thread.sleep(10000);
//                            }


                                inntuitive += e.text;
//                                            m.deleteTask(e.getJavauid());m.store(e);
//                                Date asdadfKJAHSLKFHASKJDHFKL= new Date();
//                                if (asdadfKJAHSLKFHASKJDHFKL.getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
//                                    asdf = true;

/*
                                        if(e.type.equalsIgnoreCase("l")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
//                                                r.open(e.getText());
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.strifasld("30"));
                                        } else

                                        if(e.type.equalsIgnoreCase("ll")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
//                                                r.open(e.getText());
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.strifasld("60"));
                                        } else

                                        if(e.type.equalsIgnoreCase("c")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
//                                                r.open(e.getText());
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.strifasld("60"));
                                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(e.getText());;
                                            frame.repaint();
                                            frame.toFront();

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



                                        } else

                                        if(e.type.equalsIgnoreCase("j")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.h(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.k(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")) {
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.l(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        }


                                        else {*/
//                                    AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(true);
//                                        }
//                                    }

                                String j = null;
                                try {
                                    j = mapper.writeValueAsString(e);
                                } catch (JsonProcessingException e1) {
                                    e1.printStackTrace();
                                }
//                                System.out.println(j);
//                                    inntuitive = j;
//                                    logDictionary(
//                                            null, null, inntuitive
//                                    );
                                    // Convert object to JSON string and pretty print
                                try {
                                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                } catch (JsonProcessingException e1) {
                                    e1.printStackTrace();
                                }
//                                System.out.println(j);
                                    DBObject p = (DBObject) JSON
                                            .parse(j);


                                MongoDbHelper k = null;
                                try {
                                    k = MongoDbHelper.getInstance();
                                } catch (UnknownHostException e1) {
                                    e1.printStackTrace();
                                }

                                BasicDBObject searchQuery = new BasicDBObject().append("javauid", e.getJavauid());


//                                k.updateDocument("p", searchQuery, p);

//                                k.insertDocument("p", p);
k.removeDocument("p", p);
ebbinghauses.remove(d);
tasks.remove(l);
                                ///*
// the bad thigs it hat you have to verfidy feveyrthing
                                    // you can't not count on the knowlwdage of existing code that is the woresdt case

                                    // you can count on me
                                    // you can count on my knowledge and don't waorry about ti
                                    // hwere is the knowlweeg
                                    // the knowlwedge is that you knowe le ther eproblem
                                    // the problem i shte love
                                    // the problem is the love
                                    // no problem
                                    // no love

//                                    if (inntuitive.length() > 3 && c1comehere.searchEngines.containsKey(inntuitive.substring(0, 3))) {
//                                    if (inntuitive.length() > 3 && c1comehere.searchEngines.containsKey(inntuitive.substring(0, 3))) {
                                        String text = inntuitive.trim();

                                        if (!r.isUrl(inntuitive) &&  !inntuitive.contains("c:/")) {
                                            Scanner in = new Scanner(text);
//                                            while (in.hasNext()) {
//                                                String line = in.nextLine();
//                                                if (line.length() > 4) {
                                                    Search search = c1comehere.searchEngines.get("sg ");
//                                                    String searchTrs = line.substring(3);
                                                    search.setURI(e.getText());
                                            while (f){
                                                Thread.sleep(10000);
                                            }

                                                    r.o(search.getURIString());
//                                                } else {
//                                                }
//                                            }
                                        }
//                                    }


                                    else if (r.isUrl(inntuitive) || inntuitive.contains("c:/")){                                            while (f){
                                            Thread.sleep(10000);
                                        }

                                            r.open(inntuitive);
                                    }

                                    else {
                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(e.getText());;
                                        frame.repaint();
                                        frame.toFront();

                                    }

//*/


//                                        }
//                                    }
                                }
//                            }
//                            inntuitive += System.getProperty("line.separator");
//                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                        }


//                    else if (!t.getIsDone() && t.getDate().before(new Date())) {
//                        boolean found = false;
//                        for (person_question e : ebbinghauses) {
//                            if (e.getJavauid().toString().equalsIgnoreCase(t.getJavauuid().toString())) {
//                                for (Task ct : e.getTasks()) {
//                                    if (!ct.isDone) {
//
//                                        while (!textArea.getText().trim().isEmpty()) {
//                                            Thread.sleep(10000);
//                                        }
//                                        frame.repaint();
//                                        frame.toFront();
//                                        AJKDSLJFLKJQWOIRULJDFLKJL = t;
//                                        String inntuitive = System.getProperty("line.separator");
//                                        inntuitive += (" Dufgt ");
//                                        inntuitive += System.getProperty("line.separator");
//                                        inntuitive += System.getProperty("line.separator");
//
//                                        ct.setIsDone(true);
//                                        inntuitive += e.text;
//
//                                        m.deleteTask(e.getJavauid());m.store(e);
//
//                                        String j = mapper.writeValueAsString(e);
//                                        System.out.println(j);
//
//                                         Convert object to JSON string and pretty print
//                                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                                        System.out.println(j);
//                                        DBObject p = (DBObject) JSON
//                                                .parse(j);
//
//                                        inntuitive=j;
//                                        logDictionary(
//                                                null, null, j
//                                        );
//                                        MongoDbHelper k= MongoDbHelper.getInstance();
//                                        k.insertDocument("p", p);
//
// i am fujian the enviroment can shape people te enviroment is people
//                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
//                                        found = true;
//                                    }
//                                    if (found) break;
//                                }
//                            }
//                            if (found) break;
//                        }
//                    }
                    }
                    else if (!t.getIsDone() && t.getDate().before(new Date())) {
                        c--;
//
//
//     {
//                        Calendar calendar = Calendar.getInstance();
//                        calendar.setTime(t.getDate());

//                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
//                            Thread.sleep(diff);
//                            while (!textArea.getText().trim().isEmpty()) {
//                                Thread.sleep(10000);
//                            }

//                            frame.repaint();
//                            frame.toFront();
                            AJKDSLJFLKJQWOIRULJDFLKJL = t;
//                            String inntuitive = System.getProperty("line.separator");
                            String inntuitive = "";

                            boolean asdf = false;
//                            inntuitive += (" Dufgt ");
//                            inntuitive += System.getProperty("line.separator");
                            for (int d =0 ; d< ebbinghauses.size(); d++) {
                                person_question e = ebbinghauses.get(d);
                                if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
                                    AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(true);

                                    //                                    for (Task ct : e.getTasks()) {
//                                        if (ct.getDate().getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
//                                            ct.setIsDone(true);

//                                    Calendar calendar = Calendar.getInstance();
//                                    calendar.setTime(t.getDate());

//                                    long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
//                                    Thread.sleep(diff);
//                            while (!textArea.getText().trim().isEmpty()) {
//                                Thread.sleep(10000);
//                            }


                                    inntuitive += e.text;
//                                            m.deleteTask(e.getJavauid());m.store(e);
//                                    Date asdadfKJAHSLKFHASKJDHFKL= new Date();
//                                    if (asdadfKJAHSLKFHASKJDHFKL.getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
//                                        asdf = true;

/*
                                        if(e.type.equalsIgnoreCase("l")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
//                                                r.open(e.getText());
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.strifasld("30"));
                                        } else

                                        if(e.type.equalsIgnoreCase("ll")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
//                                                r.open(e.getText());
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.strifasld("60"));
                                        } else

                                        if(e.type.equalsIgnoreCase("c")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
//                                                r.open(e.getText());
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.strifasld("60"));
                                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(e.getText());;
                                            frame.repaint();
                                            frame.toFront();

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



                                        } else

                                        if(e.type.equalsIgnoreCase("j")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.h(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")){
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.k(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        } else


                                        if(e.type.equalsIgnoreCase("dd")) {
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.l(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        }


                                        else {*/
//                                        }
//                                        AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(true);
//                                    }


                                    String j = null;
                                    try {
                                        j = mapper.writeValueAsString(e);
                                    } catch (JsonProcessingException e1) {
                                        e1.printStackTrace();
                                    }
//                                        System.out.println(j);
//                                    inntuitive = j;
//                                    logDictionary(
//                                            null, null, inntuitive
//                                    );
                                        // Convert object to JSON string and pretty print
                                    try {
                                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                    } catch (JsonProcessingException e1) {
                                        e1.printStackTrace();
                                    }
//                                        System.out.println(j);
                                        DBObject p = (DBObject) JSON
                                                .parse(j);


                                    MongoDbHelper k = null;
                                    try {
                                        k = MongoDbHelper.getInstance();
                                    } catch (UnknownHostException e1) {
                                        e1.printStackTrace();
                                    }
                                    // i mess up the database againa nd agan and that is the case that will contaiminate all the datea base
                                    // how to back up the dabatavAE SO THAT the production data won't be containminated
//                                    k.insertDocument("p", p);
//                                    k.removeDocument("p", p);

                                    BasicDBObject searchQuery = new BasicDBObject().append("javauid", e.getJavauid());


//                                    k.updateDocument("p", searchQuery, p);
k.removeDocument("p", p);

if (ebbinghauses.size()>0) {
    ebbinghauses.remove(d);
}
if(tasks.size()>0) {
    tasks.remove(l);                                    ///*
}
// the bad thigs it hat you have to verfidy feveyrthing
                                        // you can't not count on the knowlwdage of existing code that is the woresdt case

                                        // you can count on me
                                        // you can count on my knowledge and don't waorry about ti
                                        // hwere is the knowlweeg
                                        // the knowlwedge is that you knowe le ther eproblem
                                        // the problem i shte love
                                        // the problem is the love
                                        // no problem
                                        // no love

//                                    if (inntuitive.length() > 3 && c1comehere.searchEngines.containsKey(inntuitive.substring(0, 3))) {
//                                    if (inntuitive.length() > 3 && c1comehere.searchEngines.containsKey(inntuitive.substring(0, 3))) {
                                        String text = inntuitive.trim();

                                        if (!r.isUrl(inntuitive) &&  !inntuitive.contains("c:/")) {
                                            Scanner in = new Scanner(text);
//                                            while (in.hasNext()) {
//                                                String line = in.nextLine();
//                                                if (line.length() > 4) {
                                            Search search = c1comehere.searchEngines.get("sg ");
//                                                    String searchTrs = line.substring(3);
                                            search.setURI(e.getText());
                                            while (f){
                                                Thread.sleep(10000);
                                            }

                                            r.o(search.getURIString());
//                                                } else {
//                                                }
//                                            }
                                        }
//                                    }


                                        else if (r.isUrl(inntuitive) || inntuitive.contains("c:/")){

                                            while (f){
                                                Thread.sleep(10000);
                                            }

                                            r.open(inntuitive);
                                        }

                                        else {
                                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(e.getText());;
                                            frame.repaint();
                                            frame.toFront();

                                        }

//*/


//                                        }
//                                    }
                                    }
                                }
//                            inntuitive += System.getProperty("line.separator");
//                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                            }


//                    else if (!t.getIsDone() && t.getDate().before(new Date())) {
//                        boolean found = false;
//                        for (person_question e : ebbinghauses) {
//                            if (e.getJavauid().toString().equalsIgnoreCase(t.getJavauuid().toString())) {
//                                for (Task ct : e.getTasks()) {
//                                    if (!ct.isDone) {
//
//                                        while (!textArea.getText().trim().isEmpty()) {
//                                            Thread.sleep(10000);
//                                        }
//                                        frame.repaint();
//                                        frame.toFront();
//                                        AJKDSLJFLKJQWOIRULJDFLKJL = t;
//                                        String inntuitive = System.getProperty("line.separator");
//                                        inntuitive += (" Dufgt ");
//                                        inntuitive += System.getProperty("line.separator");
//                                        inntuitive += System.getProperty("line.separator");
//
//                                        ct.setIsDone(true);
//                                        inntuitive += e.text;
//
//                                        m.deleteTask(e.getJavauid());m.store(e);
//
//                                        String j = mapper.writeValueAsString(e);
//                                        System.out.println(j);
//
//                                         Convert object to JSON string and pretty print
//                                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
//                                        System.out.println(j);
//                                        DBObject p = (DBObject) JSON
//                                                .parse(j);
// nothing makes sense what makes sense is because ther ei s dictionary or dependsen ont he things it holds it it hold a soli then it is olil thank
                    // it is water then it is water tank , thwat ether estdoes matters
                    // what maepter is what it hold
                    // algorithm and datastreatuc thtat caction on the datea
//                                        inntuitive=j;
//                                        logDictionary(
//                                                null, null, j
//                                        );
//                                        MongoDbHelper k= MongoDbHelper.getInstance();
//                                        k.insertDocument("p", p);
//

//                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
//                                        found = true;
//                                    }
//                                    if (found) break;
//                                }
//                            }
//                            if (found) break;
//                        }
//                    }
                        }
//                    }
//                }
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        }

// it is hard to trigger the function and test it whether it works or not in terms of my assupmertion

/*
    public static void logDictionary(String search, String word, String uri) throws IOException, ParseException {

//        String PATH = String.format("c:/c1/c1comehere/" + search + "/");
//        File directory = new File(String.valueOf(PATH));
//        if (!directory.exists()) {
//            directory.mkdir();
//        }

//        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date today = new Date();
//        Date todayWithZeroTime = formatter.parse(formatter.format(today));

        RandomAccessFile r = new RandomAccessFile(new File("C:\\Users\\SiyuanZeng's\\Downloads\\mean-board-master\\routes\\s.txt"), "rw");
        RandomAccessFile rtemp = new RandomAccessFile(new File("C:\\Users\\SiyuanZeng's\\Downloads\\mean-board-master\\routes\\s.txt" + "~"), "rw");
        long fileSize = r.length();
        FileChannel sourceChannel = r.getChannel();
        FileChannel targetChannel = rtemp.getChannel();
        sourceChannel.transferTo(0, (fileSize - 0), targetChannel);
//        sourceChannel.truncate(0);
        r.seek(0);
//        r.writeBytes(System.getProperty("line.separator"));
//        r.writeBytes(new Date().toString());
//        r.writeBytes(System.getProperty("line.separator"));
//        r.writeBytes(search + ": " + word);
//        r.writeBytes(System.getProperty("line.separator"));
        r.writeBytes(uri);
//        r.writeBytes(System.getProperty("line.separator"));
        long newOffset = r.getFilePointer();
        targetChannel.position(0L);
        sourceChannel.transferFrom(targetChannel, newOffset, (fileSize - 0));
        sourceChannel.close();
        targetChannel.close();
        System.out.println("Done");
    }
*/
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

//    public void deltask() {
//        for (person_question e : ebbinghauses) {
//            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
//                m.deleteTask(e.getJavauid());
//                System.out.println("delet the " + e.text);
//                if(isSearch==false)reloadTAskandrestartPopThread();
//                isSearch=false;
//            }
//        }
//    }


//    public void addWord(String word, String answer) {
//        person_question pq = new person_question(word, answer,getdatelastday());
//        m.store(pq);
//        ebbinghauses.add(pq);
//        textArea.setText("");
//    }

    public void loadTask() {dl =false;
        List<DBObject> k = null ;
        try {
            k = MongoDbHelper.getInstance().findAll("p").toArray();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (DBObject e : k) {

            String jsonInString = k.get(0).toString();
            person_question stasdfhalksfdjlkasdjflkaff1 = null;
            try {
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), person_question.class);
            ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

//        }
            if (null != stasdfhalksfdjlkasdjflkaff1) {
                if (stasdfhalksfdjlkasdjflkaff1.text.replace("Dufgt", "").trim().isEmpty()) {
//                m.deleteTask(e.getJavauid());
                } else {
                    Set<Task> t = stasdfhalksfdjlkasdjflkaff1.getTasks();
                    for (Task task : t) {
                        if (null !=task) tasks.add(task);
                    }
                }
            }
        }
        if (null != tasks && tasks.size()>1)Collections.sort(tasks, new Task());
        Runnable r = () -> {

            for (person_question w:ebbinghauses){
                c1come2melater(w.getText(), w.getText());

            }


        };


        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(r);



    }

    public void LKJ(person_question K) {
//        List<DBObject> k = null ;
//        try {
//            k = MongoDbHelper.getInstance().findAll("p").toArray();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//
//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
//        tasks = new CopyOnWriteArrayList<Task>();
//        for (DBObject e : k) {
//
//            String jsonInString = k.get(0).toString();
//            person_question stasdfhalksfdjlkasdjflkaff1 = null;
//            try {
//                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
//
//                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), person_question.class);
//            ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//
//        }
//            if (null != stasdfhalksfdjlkasdjflkaff1) {
//                if (stasdfhalksfdjlkasdjflkaff1.text.replace("Dufgt", "").trim().isEmpty()) {
//                m.deleteTask(e.getJavauid());
//                } else {
                    Set<Task> t = K.getTasks();
                    for (Task task : t) {
                        if (null !=task) tasks.add(task);
                    }
//                }
//            }
//        }
        if (null != tasks && tasks.size()>1)Collections.sort(tasks, new Task());
    }


    public Date getdatelastday() throws UnknownHostException {dl =false;
//        CopyOnWriteArrayList<person_question> ebbinghauses2 = (CopyOnWriteArrayList<person_question>) m.getlatest();
        CopyOnWriteArrayList<DecendingTask> taskstemp = new CopyOnWriteArrayList<DecendingTask>();

        taskstemp = new CopyOnWriteArrayList<DecendingTask>();
        List<DBObject> k = MongoDbHelper.getInstance().findAll("p").toArray();
//        List<DBObject> k = MongoDbHelper.getInstance().findAll("p").sort(new BasicDBObject("date",1)).limit(1).toArray();


///nothing means everything it is just symbole and tell you where it is and find it where is there it is just symbole and the name are the variable and buET THE others are just struxtuer
        // like juava the varaible are just the connector and connect you to areally something ther rest are just to represent the connection
        // the connection doesn every matter it just teall you go to the first aone then then go to the second one
        // it is the procesess that matter
        // the process
        // the input and the poutput
        // the rest doesn't even matter
        // what you said and whhow peole process it and process it and outlawe you
        // that matter s
        // what you said matters
        // people will judge you and make you are thing
        // you talk and you gleave and lgo


        for (DBObject e : k) {

            String jsonInString = k.get(0).toString();
            person_question stasdfhalksfdjlkasdjflkaff1 = null;
            try {
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), person_question.class);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            System.out.println(stasdfhalksfdjlkasdjflkaff1);
            if (null != stasdfhalksfdjlkasdjflkaff1){
                if (stasdfhalksfdjlkasdjflkaff1.text.replace("Dufgt", "").trim().isEmpty()) {

//                m.deleteTask(e.getJavauid());


                } else {
                    Date D= null;
                    if (null ==stasdfhalksfdjlkasdjflkaff1.getDate()){
                        D = new Date();
                    } else {
                        D=stasdfhalksfdjlkasdjflkaff1.getDate();
                    }
                    DecendingTask d = new DecendingTask(D);
                    taskstemp.add(d);
                }
            }
        }


        if(null != taskstemp && taskstemp.size()>1) {
            Collections.sort(taskstemp, new DecendingTask());
            return taskstemp.get(0).getDate();
        }
        return new Date();
    }

//    public void searchehabins(String a) {
//        textArea.setText("");
//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
//        searchtasks = new CopyOnWriteArrayList<Task>();
//        searchebbinghauses=new CopyOnWriteArrayList<person_question>();
//
//        keywords=a.trim();
//        String[] sts=a.trim().split(" ");
//        if(sts.length==0)return;
//        for (person_question e : ebbinghauses) {
//            boolean flag2=false;
//            for (String s : sts){
//                flag2 = e.text.contains(s);
//                if(!flag2){
//                    break;
//                }
//            }
//            if(flag2) {
//                for (Task ct : e.getTasks()) {
//                    searchtasks.add(ct);
//                    searchebbinghauses.add(e);
//                    break;
//                }
//            }
//        }
//        count=1;
//        isSearch = true;
//        if (null != searchtasks ) {
//            textArea.setText("");
//            Collections.sort(searchtasks, new Task());
//            reloadandDiskplaypopup(isSearch);
//        }
//    }
    public void reloadandDiskplaypopup(boolean is) {dl =false;
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopup() {
        if(!dl){
            loadTask();
        }
        displayTask();
//        displayTaskFGADSHFJKASHFDKJLKJLKJ();
    }
//http://www.mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/
    //https://www.tutorialspoint.com/ruby-on-rails/rails-routes.htm
    //http://www.vogella.com/tutorials/JavaCollections/article.html
    public void inster(String word, String answer) throws IOException {
//        addWord(word, answer);
        isSearch=false;
    }
// if i don't things in structure then it will be very hard to tract and it would be so hard to understand either
    // it is full of bugs and it is wo hard to understand
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

