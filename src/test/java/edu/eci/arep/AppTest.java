package edu.eci.arep;

import edu.eci.arep.statistics.Statistics;
import edu.eci.arep.util.LinkedList;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

/**
 * Pruebas de la aplicación estadística
 *
 * @author Daniel Rincón
 */
public class AppTest {

    /**
     * Prueba del cálculo de la media de un set de datos
     */
    @Test
    public void meanTest() throws FileNotFoundException, URISyntaxException {
        LinkedList<Double> dataset1 = Statistics.getDataFromFile("dataset1.txt");
        LinkedList<Double> dataset2 = Statistics.getDataFromFile("dataset2.txt");
        assertEquals(550.6d, Statistics.getMean(dataset1), 0.1d);
        assertEquals(60.32d, Statistics.getMean(dataset2), 0.1d);
    }

    /**
     * Prueba del cálculo de la desviación estándar de un set de datos
     */
    @Test
    public void standardDeviationTest() throws FileNotFoundException, URISyntaxException {
        LinkedList<Double> dataset1 = Statistics.getDataFromFile("dataset1.txt");
        LinkedList<Double> dataset2 = Statistics.getDataFromFile("dataset2.txt");
        assertEquals(572.03d, Statistics.getStandardDeviation(dataset1), 0.1d);
        assertEquals(62.26d, Statistics.getStandardDeviation(dataset2), 0.1d);
    }
}
