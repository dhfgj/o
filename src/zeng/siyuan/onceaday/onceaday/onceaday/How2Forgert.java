package zeng.siyuan.onceaday.onceaday.onceaday;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.testng.annotations.Test;
import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.C1comehere.Search;
import zeng.siyuan.onceaday.onceaday.onceaday.link.onceaday.DecendingTask;
import zeng.siyuan.onceaday.onceaday.onceaday.link.onceaday.MongoDbHelper;
import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

//import static zeng.siyuan.onceaday.onceaday.peoplequesiton.mapper;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public static transient JTextArea textArea;
    public transient static ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question> ebbinghauses = new ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question> ();
    public transient ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task> tasks = new ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task>();
    public transient zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task AJKDSLJFLKJQWOIRULJDFLKJL = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
//    public peoplequesiton m = new peoplequesiton();;
    public boolean isSearch;
    public int count=1;
    private ArrayList<person_question> searchebbinghauses;
    private ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task> searchtasks;
    private zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task currentTaskSearch;
    private String keywords;
    static ObjectMapper mapper = new ObjectMapper();


    public static zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question d() {
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

            zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question e=null;


            if (textStr[0].length()==5){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "i", r.j(textStr[0]));
            } else


            if (textStr[0].equalsIgnoreCase("l")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "l", r.strifasld("30"));
            } else
// actions and actions action after action to pipe to the diesire destination
            // piple line to the end

            if (textStr[0].equalsIgnoreCase("ll")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "ll", r.strifasld("60"));
            } else

            if (textStr[0].equalsIgnoreCase("c")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "c", r.strifasld("60"));
            } else




            if (textStr[0].equalsIgnoreCase("j")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "j", new Date());
            } else


            if (textStr.length>1&&textStr[1].equalsIgnoreCase("j")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
            } else



            if (textStr[0].equalsIgnoreCase("dd")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "dd", new Date());
            } else



            if (textStr[0].equalsIgnoreCase("d")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "d", new Date());
            } else




            if (textStr.length>1&&textStr[1].equalsIgnoreCase("dd")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "dd", r.d(textStr[0]));
            } else



            if (textStr.length>1&&textStr[1].equalsIgnoreCase("d")){
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 2; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "d", r.d(textStr[0]));
            } else



            if (textStr[0].equalsIgnoreCase("gh")){
                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question n : ebbinghauses) {
                    if ((n.getType().equalsIgnoreCase("gh"))){
                        e=n;
                    }
                }
                if (null !=e){

                    e.setDate(r.m(new Date()));
                    e.setText("asdfljl");
                } else {
                    e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question("asdfkj", "gh", r.m(new Date()));

                }
            } else




            if (null != r.d(textStr[0])){

                if (textStr[1].equalsIgnoreCase("j")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "j", r.d(textStr[0]));
                }

                if (textStr.length>1&&textStr[1].equalsIgnoreCase("dd")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "dd", new Date());
                }

                if (textStr.length>1&&textStr[1].equalsIgnoreCase("d")){
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 2; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "d", new Date());
                }

                else {
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }

                    e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "p", r.d(textStr[0]));
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
                for (int i = 1; i < textStr.length; i++) {
                    stringBuffer1.append(textStr[i]);
                }
                e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "p", r.strifasld(new String (String.valueOf(6*60))));
                }

                else {

                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    e = new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question(stringBuffer1.toString(), "p", r.strifasld(new String (String.valueOf(ij.toString()))));

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

        for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question e : ebbinghauses) {
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

//                m.store(e);
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
                System.out.println("SJDFLKAJS;LDFJALS;KJFLASKJFDLASDJF;LJALSDJFLASJFLASDJFLKJHKJGFJHAGSDHJFQWOIREYIWEHRKJSDBFK");
//                displaysearchtasks();
            } else {
                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task t : tasks) {



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

                        for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question e : ebbinghauses) {
                            boolean asdf= false;
                            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
                                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task ct : e.getTasks()) {
                                    if (ct.getDate().getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
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
                                    k.insertDocument("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK", p);


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
                        for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(t.getJavauuid().toString())) {
                                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task ct : e.getTasks()) {
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
                                        k.insertDocument("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK", p);
// asscemble things together at somet point of time and do the dediting work there tat would be better.

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



    public void load() throws UnknownHostException {
        Scanner in = null;

//        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {
//
//            in = new Scanner(textArea.getText());
//            while (in.hasNext()) {
//                String line = in.nextLine();
//                    if (line.contains("?") && line.endsWith("?")) {
//                person_question e = new person_question(line, "p", getdatelastday());
//                        m.store(e);
//                ObjectMapper mapper = new ObjectMapper();

//                            person_question staff = person_question();

                try {
                    // Convert object to JSON string and save into a file directly
//                                mapper.writeValue(new File("D:\\staff.json"), staff);

                    zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question e = d();

                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK", p);
                    reloadTAskandrestartPopThread();

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



            @Test
            public void HSLAKJFLKSJF ( ){
                How2Forgert AJLKSDJFALSJFALSDJFLASDJF = new How2Forgert();
// wehre is no knowledge there is only lies
// people lie to gett everything and that is all things are requireda nd htat is all
                // there is not knowledge and facts and no helpful
                // it is all fuckting lies excetpt hat hose that are useful
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

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
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
//        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm");
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
//                m.store(e);
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
                k.insertDocument("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK", p);



                System.out.println("updates");
                isSearch=false;
                break;
            }
        }
    }
*/

    public void displayTask() {
        try {
            if (isSearch) {
                displaysearchtasks();
            } else {
                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task t : tasks) {
                    SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
//                    if (!t.getIsDone() && (new Date()).compareTo(t.getDate()) > 0) {
                    if (!t.getIsDone() && t.getDate().after(new Date())) {
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
                        for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(AJKDSLJFLKJQWOIRULJDFLKJL.getJavauuid().toString())) {
//                                    for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task ct : e.getTasks()) {
//                                        if (ct.getDate().getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
//                                            ct.setIsDone(true);

                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(t.getDate());

                                long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                                Thread.sleep(diff);
//                            while (!textArea.getText().trim().isEmpty()) {
//                                Thread.sleep(10000);
//                            }


                                inntuitive += e.text;
//                                            m.store(e);
                                Date asdadfKJAHSLKFHASKJDHFKL= new Date();
                                if (asdadfKJAHSLKFHASKJDHFKL.getTime() == AJKDSLJFLKJQWOIRULJDFLKJL.getDate().getTime()) {
                                    asdf = true;

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


                                        if(e.type.equalsIgnoreCase("d")) {
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(false);
                                            AJKDSLJFLKJQWOIRULJDFLKJL.setDate(r.l(AJKDSLJFLKJQWOIRULJDFLKJL.getDate()));
                                        }


                                        else {*/
                                    AJKDSLJFLKJQWOIRULJDFLKJL.setIsDone(true);
//                                        }
//                                    }


                                    String j = mapper.writeValueAsString(e);
                                    System.out.println(j);
//                                    inntuitive = j;
//                                    logDictionary(
//                                            null, null, inntuitive
//                                    );
                                    // Convert object to JSON string and pretty print
                                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                    System.out.println(j);
                                    DBObject p = (DBObject) JSON
                                            .parse(j);


                                    MongoDbHelper k = MongoDbHelper.getInstance();
                                    k.insertDocument("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK", p);
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
                                                    search.setURI(text);

                                                    r.o(search.getURIString());
//                                                } else {
//                                                }
//                                            }
                                        }
//                                    }


                                    else if (r.isUrl(inntuitive) || inntuitive.contains("c:/")){
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
//                                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task ct : e.getTasks()) {
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
//                                        m.store(e);
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
//                                        k.insertDocument("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK", p);
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
                }
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

        for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task t : searchtasks) {
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

    public void loadTask() {
        List<DBObject> k = null ;
        try {
            k = MongoDbHelper.getInstance().findAll("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK").toArray();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//        ebbinghauses = (ArrayList<person_question>) m.getlatest();
        tasks = new ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task>();
        for (DBObject e : k) {

            String jsonInString = k.get(0).toString();
            zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question stasdfhalksfdjlkasdjflkaff1 = null;
            try {
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.person_question.class);
            ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

//        }
            if (null != stasdfhalksfdjlkasdjflkaff1) {
                if (stasdfhalksfdjlkasdjflkaff1.text.replace("Dufgt", "").trim().isEmpty()) {
//                m.deleteTask(e.getJavauid());
                } else {
                    Set<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task> t = stasdfhalksfdjlkasdjflkaff1.getTasks();
                    for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task task : t) {
                        if (null !=task) tasks.add(task);
                    }
                }
            }
        }
        Collections.sort(tasks, new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task());
    }


    public Date getdatelastday() throws UnknownHostException {
//        ArrayList<person_question> ebbinghauses2 = (ArrayList<person_question>) m.getlatest();
        ArrayList<DecendingTask> taskstemp = new ArrayList<DecendingTask>();

        taskstemp = new ArrayList<DecendingTask>();
        List<DBObject> k = MongoDbHelper.getInstance().findAll("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK").toArray();
//        List<DBObject> k = MongoDbHelper.getInstance().findAll("asfhkjashfkjashflAHSDLKJFALKDSJFQWERTYUIOPASDFGHJK").sort(new BasicDBObject("date",1)).limit(1).toArray();


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
//        ebbinghauses = (ArrayList<person_question>) m.getlatest();
//        searchtasks = new ArrayList<zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task>();
//        searchebbinghauses=new ArrayList<person_question>();
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
//                for (zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task ct : e.getTasks()) {
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
//            Collections.sort(searchtasks, new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.Task());
//            reloadandDiskplaypopup(isSearch);
//        }
//    }
    public void reloadandDiskplaypopup(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopup() {
//        if(!isSearch){
            loadTask();
//        }
        displayTask();
//        displayTaskFGADSHFJKASHFDKJLKJLKJ();
    }

    public void inster(String word, String answer) throws IOException {
//        addWord(word, answer);
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

