package zeng.siyuan.C1comehere;

import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;

public class Q {

    public static void main(String[] args) throws IOException, InterruptedException {

        Process p = null;

        try {
            p = Runtime.getRuntime().exec("C:/Developer/apache-maven-3.0.5/bin/mvn.bat mvn test");
        } catch (IOException e) {
            System.err.println("Error on exec() method");
            e.printStackTrace();
        }

        copy(p.getInputStream(), System.out);
        p.waitFor();

    }

    static void copy(InputStream in, OutputStream out) throws IOException {
        while (true) {
            int c = in.read();
            if (c == -1)
                break;
            out.write((char) c);
        }
    }
}