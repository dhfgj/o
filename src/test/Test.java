package test;

import java.io.IOException;
import java.util.*;

/**
 * Created by SiyuanZeng's on 12/5/2016.
 */
//public class Test implements Comparator{
public class Test {

    Integer i ;

    public Test(int d) {
        i = d;
    }

    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                '}';
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
/*

    @Override
    public int compare(Object o1, Object o2) {
        return ((Test)(o1)).getI() - ((Test)(o2)).getI() ;
    }

*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        return i != null ? i.equals(test.i) : test.i == null;
    }

    @Override
    public int hashCode() {
        return i != null ? i.hashCode() : 0;
    }

    public static void main(String[] args) throws IOException {

/*
        Set s = new TreeSet();

        Test test = new Test(2);
        Test test2 = new Test(2);
        s.add(test);
        s.add(test2);
        System.out.println(s.size());

        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        test.check();
*/



        Map s = new HashMap<>();

        Test test = new Test(2);
        Test test2 = new Test(2);
        s.put(test, 1);
        s.put(test2, 1);
        System.out.println(s.size());

        Set d= s.keySet();

        Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        test.check();



//        PrintStream file = new PrintStream(new FileOutputStream("File"));
//        out = file;
//        out.println("df");
    }

    void check() {

    }
}
