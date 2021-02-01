package edu.eci.arep;

import edu.eci.arep.statistics.StatisticsHandler;
import edu.eci.arep.util.Path;
import spark.Request;
import spark.Response;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static spark.Spark.*;

/**
 * Aplicación con la que se puede calcular la media y la desviación estándar de un set de datos que se lee desde
 * un archivo de texto.
 * Los archivos de prueba se llaman "dataset1.txt" y "dataset2.txt". En AppTest se colocaron los casos de prueba dados.
 *
 * @author Daniel Rincón
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        port(getPort());
        staticFiles.location("/public"); // Static files

        get(Path.Web.INDEX, StatisticsHandler.main);
        post(Path.Web.INDEX, StatisticsHandler.computeNumbers);

        get("*", (Request req, Response res) -> {
            res.redirect(Path.Web.INDEX);
            return null;
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
}
