package edu.eci.arep.statistics;

import edu.eci.arep.util.LinkedList;
import edu.eci.arep.util.Path;
import edu.eci.arep.util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Clase encargada de renderizar las páginas correspondientes a la calculadora estadística y de enviarles
 * los datos que estas necesitan para su correcto funcionamiento
 *
 * @author Daniel Rincón
 */
public class StatisticsHandler {

    /**
     * Renderiza la página principal básica sin haber realizado ningún cálculo aún
     */
    public static Route main = (Request req, Response res) -> {
        HashMap<String, Object> model = new HashMap<>();
        return ViewUtil.render(req, model, Path.Template.INDEX);
    };

    /**
     * Renderiza la página luego de un submit, le envía los datos de la media y la desviación estándar si están disponibles
     * o un mensaje de error si algo salió mal.
     */
    public static Route computeNumbers = (Request req, Response res) -> {
        HashMap<String, Object> model = new HashMap<>();
        String numbers = req.queryParams("numbers");

        if (!numbers.equals("")) {
            try {
                LinkedList<Double> data = new LinkedList<Double>(Arrays.stream(numbers.split(","))
                        .map(Double::valueOf)
                        .toArray(Double[]::new));
                model.put("mean", String.format("%.2f", Statistics.getMean(data)));
                model.put("std", String.format("%.2f", Statistics.getStandardDeviation(data)));
            } catch (NumberFormatException e) {
                model.put("msg", "Se ha presentado un error, asegúrate que todos los caracteres insertados son números.");
            }
        }
        return ViewUtil.render(req, model, Path.Template.INDEX);
    };

}
