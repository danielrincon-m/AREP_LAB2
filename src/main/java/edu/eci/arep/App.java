package edu.eci.arep;

import edu.eci.arep.util.LinkedList;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Aplicación con la que se puede calcular la media y la desviación estándar de un set de datos que se lee desde
 * un archivo de texto.
 * Los archivos de prueba se llaman "dataset1.txt" y "dataset2.txt". En AppTest se colocaron los casos de prueba dados.
 *
 * @author Daniel Rincón
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {

        String fileName = "dataset2.txt";

        Statistics statistics = new Statistics();
        LinkedList<Double> data = statistics.getDataFromFile(fileName);
        System.out.println(statistics.getMean(data));
        System.out.println(statistics.getStandardDeviation(data));

    }
}
