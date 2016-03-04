import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/hi", (req, res) -> "Hi all");
    }
}
