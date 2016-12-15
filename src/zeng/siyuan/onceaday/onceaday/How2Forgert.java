package zeng.siyuan.onceaday.onceaday;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.onceaday.onceaday.link.onceaday.DecendingTask;
import zeng.siyuan.onceaday.onceaday.link.onceaday.MongoDbHelper;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//import static zeng.siyuan.onceaday.onceaday.peoplequesiton.mapper;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public transient JTextArea textArea;
    public transient static ArrayList<person_question> ebbinghauses;
    public transient ArrayList<Task> tasks = new ArrayList<Task>();
    public transient Task currentTask = new Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
//    public peoplequesiton m = new peoplequesiton();;
    public boolean isSearch;
    public int count=1;
    private ArrayList<person_question> searchebbinghauses;
    private ArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;
    ObjectMapper mapper = new ObjectMapper();

    public void load() throws UnknownHostException {
        Scanner in = null;

        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {

            in = new Scanner(textArea.getText());
            while (in.hasNext()) {
                String line = in.nextLine();
//                    if (line.contains("?") && line.endsWith("?")) {
                person_question e = new person_question(line, "p", getdatelastday());
//                        m.store(e);
                ObjectMapper mapper = new ObjectMapper();

//                            person_question staff = person_question();

                try {
                    // Convert object to JSON string and save into a file directly
//                                mapper.writeValue(new File("D:\\staff.json"), staff);

                    // Convert object to JSON string
                    String j = mapper.writeValueAsString(e);
                    System.out.println(j);

                    // Convert object to JSON string and pretty print
                    j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                    System.out.println(j);
                    DBObject p = (DBObject) JSON
                            .parse(j);


                    MongoDbHelper k = MongoDbHelper.getInstance();
                    k.insertDocument("asfhkjashfkjashfl", p);


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
//            }
        }
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
//            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
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
                k.insertDocument("asfhkjashfkjashfl", p);



                System.out.println("updates");
                isSearch=false;
                break;
            }
        }
    }
*/

    public void displayTask() {
        try {
            if(isSearch){
                displaysearchtasks();
            } else {
                for (Task t : tasks) {
                    SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
                    if ( fmt.format(new Date()).equals(fmt.format(t.getDate()))) {
//                    if (!t.getIsDone() && t.getDate().after(new Date())) {
//                        Calendar calendar = Calendar.getInstance();
//                        calendar.setTime(t.getDate());
//
//                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
//                            Thread.sleep(diff);
//                            while (!textArea.getText().trim().isEmpty()) {
//                                Thread.sleep(10000);
//                            }

//                            frame.repaint();
//                            frame.toFront();
                            currentTask = t;
//                            String inntuitive = System.getProperty("line.separator");
                            String inntuitive = "";

//                            inntuitive += (" Dufgt ");
//                            inntuitive += System.getProperty("line.separator");
                            for (person_question e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
//                                    for (Task ct : e.getTasks()) {
//                                        if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
//                                            ct.setIsDone(true);
                                            inntuitive += e.text;
//                                            m.store(e);


                                            String j = mapper.writeValueAsString(e);
                                            System.out.println(j);
inntuitive=j;
logDictionary(
        null, null, inntuitive
);
                                            // Convert object to JSON string and pretty print
                                            j = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
                                            System.out.println(j);
                                            DBObject p = (DBObject) JSON
                                                    .parse(j);


                                            MongoDbHelper k= MongoDbHelper.getInstance();
                                            k.insertDocument("asfhkjashfkjashfl", p);



//                                        }
//                                    }
                                }
                            }
//                            inntuitive += System.getProperty("line.separator");
//                            textArea.setText(inntuitive);
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
//                                        currentTask = t;
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
//                                        k.insertDocument("asfhkjashfkjashfl", p);
//

//                                        textArea.setText(inntuitive);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
        sourceChannel.truncate(0);
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
                    textArea.setText(inntuitive);
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
//            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
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
            k = MongoDbHelper.getInstance().findAll("asfhkjashfkjashfl").toArray();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//        ebbinghauses = (ArrayList<person_question>) m.getlatest();
        tasks = new ArrayList<Task>();
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

//        }
            if (null != stasdfhalksfdjlkasdjflkaff1) {
                if (stasdfhalksfdjlkasdjflkaff1.text.replace("Dufgt", "").trim().isEmpty()) {
//                m.deleteTask(e.getJavauid());
                } else {
                    Set<Task> t = stasdfhalksfdjlkasdjflkaff1.tasks;
                    for (Task task : t) {
                        tasks.add(task);
                    }
                }
            }
        }
        Collections.sort(tasks, new Task());
    }


    public Date getdatelastday() throws UnknownHostException {
//        ArrayList<person_question> ebbinghauses2 = (ArrayList<person_question>) m.getlatest();
        ArrayList<DecendingTask> taskstemp = new ArrayList<DecendingTask>();

        taskstemp = new ArrayList<DecendingTask>();
        List<DBObject> k = MongoDbHelper.getInstance().findAll("asfhkjashfkjashfl").toArray();
//        List<DBObject> k = MongoDbHelper.getInstance().findAll("asfhkjashfkjashfl").sort(new BasicDBObject("date",1)).limit(1).toArray();


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
//        searchtasks = new ArrayList<Task>();
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

