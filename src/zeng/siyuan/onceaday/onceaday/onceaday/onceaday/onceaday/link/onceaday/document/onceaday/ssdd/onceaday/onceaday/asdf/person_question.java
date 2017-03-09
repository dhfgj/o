package zeng.siyuan.onceaday.onceaday.onceaday.onceaday.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.FrozenValue;
import com.datastax.driver.mapping.annotations.Table;
import com.datastax.driver.mapping.annotations.Transient;
import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by SiyuanZeng's on 8/8/2016.
 */


@Table(keyspace = "keyspace1", name = "j",
        readConsistency = "QUORUM",
        writeConsistency = "QUORUM",
        caseSensitiveKeyspace = false,
        caseSensitiveTable = false)
public class person_question implements Serializable{
    // column name does not match field name
//    @Column(name = "text")

    @Column(name = "id")
    public UUID javauid;

    @Column(name = "txt")
    String text;

    @Column(name = "type")
    String type;

    @Column(name="target_date")
    Date date;

    @FrozenValue
    @Column(name = "tasks")
    Set<Task> tasks;

    //        20 minutes
    @Transient
    public Task first;// 20 munites
    //        1 hour
    @Transient
    public Task second; // 1 hour
    //        9 hours
    @Transient
    public Task third;
    //        1 day
    @Transient
    public Task fourth;
    //        2 sdays
    @Transient
    public Task fifth;
    //        6 days
    @Transient
    public Task sixth;
    //        31 days
    @Transient
    public Task seventh;


    public person_question() {
    }

    public void setUUID() {
        if (null == javauid) {
                    EthernetAddress addr = EthernetAddress.fromInterface();         TimeBasedGenerator uuidGenerator = Generators.timeBasedGenerator(addr);         UUID uuid = uuidGenerator.generate();         this.javauid=uuid;
            first.Javauuid = javauid;
            second.Javauuid = javauid;
            third.Javauuid = javauid;
            fourth.Javauuid = javauid;
            fifth.Javauuid = javauid;
            sixth.Javauuid = javauid;
            seventh.Javauuid = javauid;
        }
    }

    public person_question(String text, String TYPE, Date date1) {
        this.type=TYPE;

                EthernetAddress addr = EthernetAddress.fromInterface();         TimeBasedGenerator uuidGenerator = Generators.timeBasedGenerator(addr);         UUID uuid = uuidGenerator.generate();         this.javauid=uuid;


        tasks = new HashSet<Task>();

        StringBuilder stringBuilder = new StringBuilder();

        Calendar c = Calendar.getInstance();

        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM dd, yyyy 'at' hh:mm");

        System.out.println(format.format(c.getTime()));

        c.add(Calendar.HOUR_OF_DAY, 1);

        Calendar d = Calendar.getInstance();
        d.setTime(date1);
        d.add(Calendar.DATE, 1);
        date= new Date(d.getTimeInMillis());

        System.out.println(format.format(c.getTime()));


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

        if (timeOfDay >= 0 && timeOfDay < 12) {
            stringBuilder.append(" am");
            stringBuilder.append(System.getProperty("line.separator"));
            stringBuilder.append(text);
        } else if (timeOfDay >= 12 && timeOfDay < 24) {
            stringBuilder.append(" pm");
            stringBuilder.append(System.getProperty("line.separator"));
            stringBuilder.append(text);
        }

        this.text = stringBuilder.toString();

        final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs

        long curTimeInMs = new Date().getTime();
        first = new Task(new Date(curTimeInMs + (20 * ONE_MINUTE_IN_MILLIS)), javauid);
        second = new Task(new Date(curTimeInMs + (60 * ONE_MINUTE_IN_MILLIS)), javauid);
        third = new Task(new Date(curTimeInMs + (540 * ONE_MINUTE_IN_MILLIS)), javauid);
        fourth = new Task(new Date(curTimeInMs + (24 * 60 * ONE_MINUTE_IN_MILLIS)), javauid);
        fifth = new Task(new Date(curTimeInMs + (2 * 24 * 60 * ONE_MINUTE_IN_MILLIS)), javauid);
        sixth = new Task(new Date(curTimeInMs + (6 * 24 * 60 * ONE_MINUTE_IN_MILLIS)), javauid);
        seventh = new Task(new Date(curTimeInMs + (31 * 24 * 60 * ONE_MINUTE_IN_MILLIS)), javauid);


        tasks.add(first);
        tasks.add(second);
        tasks.add(third);
        tasks.add(fourth);
        tasks.add(fifth);
        tasks.add(sixth);
        tasks.add(seventh);


    }


    public person_question(String text, HashSet<Task> tasks, Task first, Task second, Task third, Task fourth, Task fifth, Task sixth, Task seventh, UUID javauid) {
        this.text = text;
        this.tasks = tasks;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.javauid = javauid;
    }


    public person_question(String text, UUID javauid, HashSet<Task> tasks, Task first, Task second, Task third, Task fourth, Task fifth, Task sixth, Task seventh) {
        this.text = text;
        this.javauid = javauid;
        this.tasks = tasks;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UUID getJavauid() {
        return javauid;
    }

    public void setJavauid(UUID javauid) {
        this.javauid = javauid;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Task getFirst() {
        return first;
    }

    public void setFirst(Task first) {
        this.first = first;
    }

    public Task getSecond() {
        return second;
    }

    public void setSecond(Task second) {
        this.second = second;
    }

    public Task getThird() {
        return third;
    }

    public void setThird(Task third) {
        this.third = third;
    }

    public Task getFourth() {
        return fourth;
    }

    public void setFourth(Task fourth) {
        this.fourth = fourth;
    }

    public Task getFifth() {
        return fifth;
    }

    public void setFifth(Task fifth) {
        this.fifth = fifth;
    }

    public Task getSixth() {
        return sixth;
    }

    public void setSixth(Task sixth) {
        this.sixth = sixth;
    }

    public Task getSeventh() {
        return seventh;
    }

    public void setSeventh(Task seventh) {
        this.seventh = seventh;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUUID(UUID uuid) {
        this.javauid=uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "person_question{" +
                "javauid=" + javauid +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", tasks=" + tasks +
                ", first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                ", seventh=" + seventh +
                '}';
    }
}
