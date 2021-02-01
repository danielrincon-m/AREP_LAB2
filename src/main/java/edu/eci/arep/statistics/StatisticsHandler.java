package edu.eci.arep.statistics;

import edu.eci.arep.util.LinkedList;
import edu.eci.arep.util.Path;
import edu.eci.arep.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.Arrays;
import java.util.HashMap;

public class StatisticsHandler {

    public static Route main = (Request req, Response res) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(req, model, Path.Template.INDEX);
    };

    public static Route computeNumbers = (Request req, Response res) -> {
        HashMap<String, Object> model = new HashMap<>();
        String numbers = req.queryParams("numbers");

        if (numbers.equals("")) {
            model.put("msg", "Escribe números separados por coma en la casilla y presiona el botón");
        } else {
            try {
                LinkedList<Double> data = new LinkedList<Double>(Arrays.stream(numbers.split(","))
                        .map(Double::valueOf)
                        .toArray(Double[]::new));
                model.put("mean", Statistics.getMean(data));
                model.put("std", Statistics.getStandardDeviation(data));
            } catch (NumberFormatException e) {
                model.put("msg", "Errorsh");
            }
        }
        return ViewUtil.render(req, model, Path.Template.INDEX);
    };

}
