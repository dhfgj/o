    package zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.onceaday;

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


@Table(keyspace = "keyspace1", name = "h1",
        readConsistency = "QUORUM",
        writeConsistency = "QUORUM",
        caseSensitiveKeyspace = false,
        caseSensitiveTable = false)
// we don't know anything but we know waht it it is right
// what i si right you don't wahink about it you know what the hell it is
// i know wsomething and i know wha tit i s you are fucking fwroeng and rwroin g
// i know something and then i hav esto know everything and tell you everything ahsda ti sel fis kind lab labor and you kwno wti t
// black and whit ei sthe basidca nda never wroingabecause it thi you and others
// /we are kthat it is that black and whit eand laways rightnad and correnct and never wrong and teyfringi si just jti its is
// we don't remember everything nothing anyehting , we leanr and we foutog tabut we know wheter ato and the path to difnd t he caryz and gdstudsff
//
public class person_question implements Serializable{
    // column name does not match field name
//    @Column(name = "question")
// love is working
    // love is working
    // it is so unfortunating that it is working
    // i don't have think about some prplbem bes and because there are ethere already
    // you knwo athqt it is
    // it is fun to doi it because it if so so mfunny and you kwno athat it shoulbe that
    // there are so much funcing thing tos o
    // love i s reliefing and think that fually everything is owrking and it doesn't have to make sneythign to tod oit do it
    // love is smothing and working and not working
    // love forfer me everything and all i need and want to and requriement
    // it needs something
    // the internet need i neeed to wo download the elastric search
    // i5Y
    // PEOPEL ARE trying everythin gguard all the thing they and have so that they don't have to make things that will be possible you konw
    // we took everyitni gfo rgrandtyed and now we thingk wa need omsething else but se we don't need that that i sa a problem and you know what aot
    // i used to think that eveyrthing usas has tsaepaidsiclay the interernatcpaeced is comman dand everytheing but wehne i come back ohome now i underatndthat everything is the smae se s the thing sat ahta tw e have in theweuse  and tub thte espededa is oso sleoww oso hi vhae thing k ithating oaub ti ti a
    // there is no color an i klike thiit htis way abd thinthig tha tyou know and unsderand will be sdundereand and you knwo about it

    // am i dead
    // i am not dead
    // deam i am
    // dead am i
    // an't i dead
    // how ocan i tell that i am not dead?



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

    @Column(name = "o")
    Set<String> o;
// i have create so much thing fs for you should be happy~~~~~

    // i have prepare everything for you so that you can survice and happy
    public Set<String> getO() {
        if(null ==o)return o=new HashSet<String>();
        return o;
    }

    public void setO(Set<String> o) {
        this.o = o;
    }

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
                    EthernetAddress addr = EthernetAddress.fromInterface();         TimeBasedGenerator uuidGenerator = Generators.timeBasedGenerator(addr);         UUID uuid = uuidGenerator.generate();         this.javauid=uuid;;
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
//        this.javauid = java.util.UUID.randomUUID();
        EthernetAddress addr = EthernetAddress.fromInterface();
        TimeBasedGenerator uuidGenerator = Generators.timeBasedGenerator(addr);
        UUID uuid = uuidGenerator.generate();
        this.javauid=uuid;
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
