import java.util.HashMap;
import java.util.List;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public/");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      model.put("bands", Band.all());
      model.put("venues", Venue.all());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/add/band", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String inputName = request.queryParams("name");
      Band newBand = new Band(inputName);
      newBand.firstToUppercase();
      newBand.save();
      model.put("band", newBand);
      model.put("bands", Band.all());
      model.put("venues", Venue.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
