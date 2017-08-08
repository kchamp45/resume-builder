import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Job> allJobs = Job.getAll();
            model.put("jobArray", allJobs);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/jobs/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String company = request.queryParams("company");
            String date = request.queryParams("date");
            String description = request.queryParams("description");
            Job newJob = new Job(name, company, date, description);
            return new ModelAndView(model, "sucess.hbs");
        }, new HandlebarsTemplateEngine());
    }


}

