import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "GoCD");
        get("/hello", (rq, rs) -> new ModelAndView(map, "hello"), new ThymeleafTemplateEngine());
    }
}
