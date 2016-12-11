/**
 * Created by SiyuanZeng's on 12/11/2016.
 */
import static spark.Spark.get;


public class f {
    public static void main( String[] args) {
        get("/posts", (req, res) -> {
            return "Hello Sparkingly World!dfjadlfdlk";
        });
    }

}
