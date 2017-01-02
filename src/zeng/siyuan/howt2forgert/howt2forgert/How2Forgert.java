package zeng.siyuan.howt2forgert.howt2forgert;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.mappingmanager.mappingmanager;
import zeng.siyuan.onceaday.onceaday.onceaday.link.onceaday.MongoDbHelper;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.solr;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public transient JTextArea textArea;
    public transient static Set<Ebbinghaus> ebbinghauses;
    public transient CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();
    public transient Task currentTask = new Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
    public mappingmanager m;
    public boolean isSearch;
    public boolean isSearchCombine;
    public int count=1;
    private CopyOnWriteArrayList<Ebbinghaus> searchebbinghauses;
    private CopyOnWriteArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;
    static ObjectMapper mapper = new ObjectMapper();

    public void load(){
        Scanner in = null;
        Scanner i = null;

        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {

            in = new Scanner(textArea.getText());
            i = new Scanner(textArea.getText());
            Ebbinghaus e=null;
                    String line1 = "";
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains("?") && line.endsWith("?")) {
                    if (null != e && null != e.question && !e.question.trim().equalsIgnoreCase("")) {
                        e.setLKJ(line1);
                        // Convert object to JSON string
                        String j = null;
                        try {
                            j = mapper.writeValueAsString(e);
                        } catch (JsonProcessingException e1) {
                            e1.printStackTrace();
                        }
//                    System.out.println(j);
// somebody want need derresire something then you will give me i want ginger
                        // i don't remember but people keep remongd ,e tjhat

                        // Convert object to JSON string and pretty print
                        try {
                            j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                        } catch (JsonProcessingException e1) {
                            e1.printStackTrace();
                        }
//                    System.out.println(j);
                        DBObject p = (DBObject) JSON
                                .parse(j);


                        MongoDbHelper k = null;
                        try {
                            k = MongoDbHelper.getInstance();
                        } catch (UnknownHostException e1) {
                            e1.printStackTrace();
                        }
                        k.insertDocument("u", p);
                        Runnable ks = () -> LKJ(e);
                        ks.run();

                    }
                    e = new Ebbinghaus(line, "");
                    line1 = "";
//                    reloadTAskandrestartPopThread();
                    textArea.setText("");
                } else {// crazy i sgap is crazy is leardin g crazy is nonsense but sense crazy is there
                    line1 += line;
//                        if (null!=e && null !=e.LKJ && !e.LKJ.equalsIgnoreCase("")) {

//                            e.setLKJ(line1);
//                        }
// dont take it the wrong whay what is it
                    // the emotion
                    // the relationpshio
                    // react respond differentlyu so differently
// all of sucdden you lose it all
                    // you lose it all in a sex


                }

                if (null != e && null != e.question && !e.question.trim().equalsIgnoreCase("")) {
                    e.setLKJ(line1);
                    // Convert object to JSON string
                    String j = null;
                    try {
                        j = mapper.writeValueAsString(e);
                    } catch (JsonProcessingException e1) {
                        e1.printStackTrace();
                    }
//                    System.out.println(j);
// somebody want need derresire something then you will give me i want ginger
                    // i don't remember but people keep remongd ,e tjhat

                    // Convert object to JSON string and pretty print
                    try {
                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                    } catch (JsonProcessingException e1) {
                        e1.printStackTrace();
                    }
//                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = null;
                    try {
                        k = MongoDbHelper.getInstance();
                    } catch (UnknownHostException e1) {
                        e1.printStackTrace();
                    }
                    k.insertDocument("u", p);
                    Runnable ks = () -> LKJ(e);
                    ks.run();

                }
                e = new Ebbinghaus(line, "");
                line1 = "";
//                    reloadTAskandrestartPopThread();
                textArea.setText("");

            }


            }
            }
        }

    public void LKJ(Ebbinghaus K) {
//        List<DBObject> k = null ;
//        try {
//            k = MongoDbHelper.getInstance().findAll("JAKSHFDLKHASKJFHAKSLHFKALSJF").toArray();
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
        Collections.sort(tasks, new Task());
    }

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
        this.c1comehere = c1comehere;
        this.textArea = textArea;
        this.frame = frame;
//        m = new mappingmanager();
//        ebbinghauses = m.get();
    }

    public void updatetask() throws JsonProcessingException, UnknownHostException {
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm");
        c.add(Calendar.HOUR_OF_DAY, 1);

        // found!
        String[] s =         textArea.getText().split("ufgt");

// thanks means that don't talke it personally it is my job to help
        // that is why
// you are the best prole you do the right thigns, you even fire me

        String textinput = System.getProperty("line.separator");
        textinput +=         s[0];
        textinput += System.getProperty("line.separator");
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
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Morning C1 world, ");
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Afternoon C1 world, ");
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Evening C1 world, ");
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Night C1 world, ");
        }

        stringBuilder.append(format.format(c.getTime()));

        for (Ebbinghaus e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                if (timeOfDay >= 0 && timeOfDay < 12) {
                    stringBuilder.append(" am");                stringBuilder.append(System.getProperty("line.separator"));
                } else if (timeOfDay >= 12 && timeOfDay < 24) {
                    stringBuilder.append(" pm");                stringBuilder.append(System.getProperty("line.separator"));
                }
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(textinput);
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(System.getProperty("line.separator"));
                e.ASDFJ = stringBuilder.toString();
//                Ebbinghaus e1 = new Ebbinghaus(e.question, "");
//                m.deleteTask(e.getJavauid());
//                m.store(e);

                String j = null;
                j = mapper.writeValueAsString(e);
                //                    System.out.println(j);

                // Convert object to JSON string and pretty print
                j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                //                    System.out.println(j);
                DBObject p = (DBObject) JSON
                        .parse(j);


                MongoDbHelper k = null;
                k = MongoDbHelper.getInstance();
                k.insertDocument("u", p);
//                Runnable ks = ()->LKJ(e);
//                ks.run();



                System.out.println("updates");
                isSearch=false;
                isSearchCombine=false;
                Runnable a = () -> reloadTAskandrestartPopThread();
                a.run();
                break;
            }
        }
    }

    public void displayTask() {
        try {
            if(isSearch){
                displaysearchtasks();
            } else if(isSearchCombine){
                displaysearchtaskscombine();
                isSearchCombine=false;
                isSearch=false;
            } else {
                for (Task t : tasks) {
                    if (!t.getIsDone() && t.getDate().after(new Date())) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(t.getDate());
                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                        if (diff > 0) {
                            Thread.sleep(diff);


                            String buttonSelected = getString();
                            boolean isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                            while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                Thread.sleep(10000);
                                for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                    AbstractButton button = buttons.nextElement();

                                    if (button.isSelected()) {
                                        buttonSelected = button.getText();
                                    }
                                }
                                isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                            }
                            frame.repaint();
                            frame.toFront();
                            currentTask = t;
                            String inntuitive = System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");

                            inntuitive += (" ufgt ");
                            inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");
                            for (Ebbinghaus e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                    for (Task ct : e.getTasks()) {
                                        if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                            ct.setIsDone(true);
                                            inntuitive += e.question;
//                                            m.deleteTask(e.getJavauid());
//                                            m.store(e);

                                            String j = null;
                                            j = mapper.writeValueAsString(e);
                                            //                    System.out.println(j);

                                            // Convert object to JSON string and pretty print
                                            j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                            //                    System.out.println(j);
                                            DBObject p = (DBObject) JSON
                                                    .parse(j);


                                            MongoDbHelper k = null;
                                            k = MongoDbHelper.getInstance();
                                            k.insertDocument("u", p);
//                Runnable ks = ()->LKJ(e);
//                ks.run();


                                        }
                                    }
                                }
                            }
                            inntuitive += System.getProperty("line.separator");
                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                        } else {


                            String buttonSelected = getString();
                            boolean isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                            while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                Thread.sleep(10000);

                                for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                    AbstractButton button = buttons.nextElement();

                                    if (button.isSelected()) {
                                        buttonSelected = button.getText();
                                    }
                                }
                                isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");

                            }
                            frame.repaint();
                            frame.toFront();
                            currentTask = t;
                            String inntuitive = System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");
                            inntuitive += (" ufgt ");                                        inntuitive += System.getProperty("line.separator");
                            inntuitive += System.getProperty("line.separator");
                            for (Ebbinghaus e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                    for (Task ct : e.getTasks()) {
                                        if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                            ct.setIsDone(true);
                                            inntuitive += e.question;
//                                            m.deleteTask(e.getJavauid());
//                                            m.store(e);
                                            String j = null;
                                            j = mapper.writeValueAsString(e);
                                            //                    System.out.println(j);

                                            // Convert object to JSON string and pretty print
                                            j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                            //                    System.out.println(j);
                                            DBObject p = (DBObject) JSON
                                                    .parse(j);


                                            MongoDbHelper k = null;
                                            k = MongoDbHelper.getInstance();
                                            k.insertDocument("u", p);
//                Runnable ks = ()->LKJ(e);
//                ks.run();


                                        }
                                    }
                                }
                            }                                        inntuitive += System.getProperty("line.separator");
                            inntuitive += System.getProperty("line.separator");
                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                            Thread.sleep(10000);
                        }
                    } else if (!t.getIsDone() && t.getDate().before(new Date())) {

                        String buttonSelected = getString();
                        boolean isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                        frame.repaint();
                        frame.toFront();
                        currentTask = t;

                        for (Ebbinghaus e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                for (Task ct : e.getTasks()) {
                                    if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                        ct.setIsDone(false);
                                        ct.setDate(r.ls(ct.getDate()));
                                        String inntuitive = System.getProperty("line.separator");
                                        inntuitive += (" ufgt ");
                                        inntuitive += System.getProperty("line.separator");
                                        inntuitive += System.getProperty("line.separator");
                                        inntuitive += e.question;                                        inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");
//                                        m.deleteTask(e.getJavauid());
//                                        m.store(e);

                                        String j = null;
                                        j = mapper.writeValueAsString(e);
                                        //                    System.out.println(j);

                                        // Convert object to JSON string and pretty print
                                        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                        //                    System.out.println(j);
                                        DBObject p = (DBObject) JSON
                                                .parse(j);


                                        MongoDbHelper k = null;
                                        k = MongoDbHelper.getInstance();
                                        k.insertDocument("u", p);
//                Runnable ks = ()->LKJ(e);
//                ks.run();


                                        while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                            try {
                                                Thread.sleep(10000);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                            for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                                AbstractButton button = buttons.nextElement();

                                                if (button.isSelected()) {
                                                    buttonSelected = button.getText();
                                                }
                                            }
                                            isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");
                                        }
                                        inntuitive += System.getProperty("line.separator");
                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                        inntuitive += System.getProperty("line.separator");
                                        while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                            try {
                                                Thread.sleep(10000);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                            for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                                AbstractButton button = buttons.nextElement();

                                                if (button.isSelected()) {
                                                    buttonSelected = button.getText();
                                                }
                                            }
                                            isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");
                                        }
//                                        reloadTAskandrestartPopThread();
                                    }
                                }
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

            for (Ebbinghaus e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    String inntuitive = "";
                    inntuitive += "\n";
                    inntuitive += " ufgt ";
                    inntuitive += "\n";

                    inntuitive += (" found! " + count + "/" +searchtasks.size() + " " +keywords);
                    inntuitive +="\n";
                    inntuitive +="\n";
                    inntuitive+=e.question;
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
                    isSearchCombine=false;

                }
            }
        }
        count =0;
    }

    private void displaysearchtaskscombine() {

        String inntuitive = "";
        for (Task t : searchtasks) {
            currentTaskSearch=t;
            for (Ebbinghaus e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    inntuitive += "\n";
                    inntuitive += " ufgtalls ";
                    inntuitive += "\n";

                    inntuitive += (" found! " + count + "/" +searchtasks.size() + " " +keywords);
                    inntuitive +="\n";
                    inntuitive +="\n";
                    inntuitive+=e.question;
                    count++;
                    isSearchCombine=true;
                    isSearch=false;
                }
            }
        }
        while (!textArea.getText().trim().equalsIgnoreCase("")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
    }

    public void deltask() {
        for (Ebbinghaus e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                m.deleteTask(e.getJavauid());
                System.out.println("delet the " + e.getQuestion());
                if(isSearch==false)reloadTAskandrestartPopThread();
                isSearch=false;
                isSearchCombine=false;
            }
        }
    }


    private static class MyCustomExclusionStrategy implements ExclusionStrategy {

        public boolean shouldSkipClass(Class<?> arg0) {
            return false;
        }

        public boolean shouldSkipField(FieldAttributes f) {
            return (f.getDeclaringClass() == Ebbinghaus.class && f.getName().equals("changes"));
        }

    }

    public static void serialize() {
        Gson gson = new Gson();
        try {
            String str = gson.toJson(ebbinghauses);

            FileWriter writer = new FileWriter("C:\\c1\\c1comehere\\ebbinghauses.txt");
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addWord(String word, String answer) throws JsonProcessingException, UnknownHostException {
        Ebbinghaus ebbinghaus = new Ebbinghaus(word, answer);
        mappingmanager mappingmanager = new mappingmanager();
//        mappingmanager.store(ebbinghaus);

        String j = null;
        j = mapper.writeValueAsString(ebbinghaus);
        //                    System.out.println(j);

        // Convert object to JSON string and pretty print
        j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ebbinghaus);
        //                    System.out.println(j);
        DBObject p = (DBObject) JSON
                .parse(j);


        MongoDbHelper k = null;
        k = MongoDbHelper.getInstance();
        k.insertDocument("u", p);
//                Runnable ks = ()->LKJ(e);
//                ks.run();




        ebbinghauses.add(ebbinghaus);
        textArea.setText("");
    }

    zeng.siyuan.howt2forgert.howt2forgert.loadolr loadolr;

// they give me uselfss things to cheat on me and make me learn a lot fo things
    // they ask me to do things
    // a person can save the world and he has the same power fto ruin the world

    public void loadTask() {

        solr solr = new solr();
        ebbinghauses = new HashSet<>();

        try {
// i lie to myself
            // i don't see
            // i don't see
            // i am dead
            // i talk to myself
            List<DBObject> k = null;
            try {
                k = MongoDbHelper.getInstance().findAll("u").toArray();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }

//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
            tasks = new CopyOnWriteArrayList<Task>();
            for (DBObject e : k) {

                String jsonInString = k.get(0).toString();
                Ebbinghaus stasdfhalksfdjlkasdjflkaff1 = null;
                try {
                    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                    mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

                    stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), Ebbinghaus.class);
                    ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

//            for(Ebbinghaus s : ebbinghau) {
//                ebbinghauses.add(s);
//            }

                searchebbinghauses = new CopyOnWriteArrayList<Ebbinghaus>();

                tasks = new CopyOnWriteArrayList<Task>();

                keywords = "what ? come everything nothing something ".trim();
                String[] sts = "what ? come everything nothing something ".trim().split(" ");
                if (sts.length == 0) return;
                for (Ebbinghaus e2 : How2Forgert.ebbinghauses) {
                    if (e2.getQuestion().replace("ufgt", "").trim().isEmpty()) {
                        m.deleteTask(e2.getJavauid());
                        continue;
                    }

                    boolean flag2 = false;
                    for (String s : sts) {
                        flag2 = e2.getQuestion().indexOf(s) != -1;
                        if (flag2) {
                            break;
                        }
                    }
                    if (flag2) {
                        for (Task ct : e2.getTasks()) {
                            tasks.add(ct);
                            searchebbinghauses.add(e2);
                            break;
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

//        if (null == loadolr) {
//            loadolr = new loadolr(ebbinghauses);
//        } else {
//        }
//        if (!loadolr .isAlive()&&loadolr .open())
//            loadolr .start();



        //solr
/*

        SolrDataDAO solrDataDAO = null;
        try {
            solrDataDAO = new SolrDataDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            solrDataDAO.addData(e.javauid,e.getQuestion());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
*/



        Collections.sort(tasks, new Task());
    }

    public void searchehabins(String a) {
        textArea.setText("");
//        ebbinghauses = m.get();


        List<DBObject> k = null;
        try {
            k = MongoDbHelper.getInstance().findAll("u").toArray();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (DBObject e : k) {

            String jsonInString = k.get(0).toString();
            Ebbinghaus stasdfhalksfdjlkasdjflkaff1 = null;
            try {
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), Ebbinghaus.class);
                ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }


            searchtasks = new CopyOnWriteArrayList<Task>();
            searchebbinghauses = new CopyOnWriteArrayList<Ebbinghaus>();

            keywords = a.trim();
            String[] sts = a.trim().split(" ");
            if (sts.length == 0) return;
            for (Ebbinghaus se : ebbinghauses) {
                boolean flag2 = false;
                for (String s : sts) {
                    flag2 = se.getQuestion().contains(s);
                    if (!flag2) {
                        break;
                    }
                }
                if (flag2) {
                    for (Task ct : se.getTasks()) {
                        searchtasks.add(ct);
                        searchebbinghauses.add(se);
                        break;
                    }
                }
            }
            count = 1;
            isSearch = true;
            isSearchCombine = false;
            if (null != searchtasks) {
                textArea.setText("");
                Collections.sort(searchtasks, new Task());
                reloadandDiskplaypopup(isSearch);
            }
        }

    }
    public void searchehabinsCombined(String a) {
        textArea.setText("");
//        ebbinghauses = m.get();

        List<DBObject> k = null;
        try {
            k = MongoDbHelper.getInstance().findAll("u").toArray();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (DBObject e : k) {

            String jsonInString = k.get(0).toString();
            Ebbinghaus stasdfhalksfdjlkasdjflkaff1 = null;
            try {
                mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

                stasdfhalksfdjlkasdjflkaff1 = mapper.readValue(e.toString(), Ebbinghaus.class);
                ebbinghauses.add(stasdfhalksfdjlkasdjflkaff1);
            } catch (IOException e1) {
                e1.printStackTrace();
            }


            searchtasks = new CopyOnWriteArrayList<Task>();
            searchebbinghauses = new CopyOnWriteArrayList<Ebbinghaus>();

            keywords = a.trim();
            String[] sts = a.trim().split(" ");
            if (sts.length == 0) return;
            for (Ebbinghaus d : ebbinghauses) {
                boolean flag2 = false;
                for (String s : sts) {
                    flag2 = d.getQuestion().contains(s);
                    if (!flag2) {
                        break;
                    }
                }
                if (flag2) {
                    for (Task ct : d.getTasks()) {
                        searchtasks.add(ct);
                        searchebbinghauses.add(d);
                        break;
                    }
                }
            }
            count = 1;
            isSearch = false;
            isSearchCombine = true;
            if (null != searchtasks) {
                textArea.setText("");
                Collections.sort(searchtasks, new Task());
                reloadandDiskplaypopupcinbome(isSearchCombine);
            }

            // there is people there si love
            // there is somethign

        }
    }


    public void reloadandDiskplaypopup(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopupcinbome(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopup(){
        if(!isSearch){
            loadTask();
        }
        displayTask();
    }

    public void inster(String word, String answer) throws IOException {
        addWord(word, answer);
        isSearch=false;
        isSearchCombine=false;
    }
// you don't have to show to o much or they will attach to you that i sall you have to do
// people will constant ly ask why that is the problem and you should stop doing that never do it again and that is the case you should know
// people who don't becatalk bcuase they hav eto do something thehy don't like me becasue i force them to talk and that is not polite i guess

// poeple like you people who give you love and good wordsa nd make you feel good and know somthing expenand your horizon ane d tell you the truth enlighten you and mkae you come out of darkness

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

// oti smy first paplication and it mesasns so much to me and evertyhigi tiwll actually make me so sucessful that we know it will bbe great
    // it is not like that i want to fuck every women it just like something iw is so disgutinand i wdon't want ot see them again
    // there is no rotorrow all the other is not now is not real it is just halucination and namekt it work and understnadable
    // something i learn withthe price grfeat price and that isa all we knwo
// let the bypast be bypast
// we larn we grow we understand things
    public void init() throws Exception {
        loadTask();
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }
}

