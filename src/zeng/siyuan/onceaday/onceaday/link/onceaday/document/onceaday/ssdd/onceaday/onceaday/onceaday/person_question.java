package zeng.siyuan.onceaday.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.onceaday;

import com.datastax.driver.mapping.annotations.*;
import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


/**
 * Created by SiyuanZeng's on 8/8/2016.
 */


@Table(keyspace = "keyspace1", name = "h",
        readConsistency = "QUORUM",
        writeConsistency = "QUORUM",
        caseSensitiveKeyspace = false,
        caseSensitiveTable = false)

public class person_question implements Serializable{
    // column name does not match field name
//    @Column(name = "question")

    //    @Field
    @org.apache.solr.client.solrj.beans.Field
    @PartitionKey
    @Column(name = "id")
    public UUID javauid;
    //    @Field
    @org.apache.solr.client.solrj.beans.Field
    @Column(name = "txt")
    String question;
    //    @Field
    @org.apache.solr.client.solrj.beans.Field
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

    public person_question(String question, String answer) {
                EthernetAddress addr = EthernetAddress.fromInterface();         TimeBasedGenerator uuidGenerator = Generators.timeBasedGenerator(addr);         UUID uuid = uuidGenerator.generate();         this.javauid=uuid;

        tasks = new HashSet<Task>();

        this.question = question;

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


    public person_question(String question, HashSet<Task> tasks, Task first, Task second, Task third, Task fourth, Task fifth, Task sixth, Task seventh, UUID javauid) {
        this.question = question;
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


    public person_question(String question, UUID javauid, HashSet<Task> tasks, Task first, Task second, Task third, Task fourth, Task fifth, Task sixth, Task seventh) {
        this.question = question;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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
}
