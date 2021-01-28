package edu.eci.arep;

import edu.eci.arep.util.LinkedList;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final Statistics statistics = new Statistics();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void meanTest() throws FileNotFoundException, URISyntaxException {
        LinkedList<Double> dataset1 = statistics.getDataFromFile("dataset1.txt");
        LinkedList<Double> dataset2 = statistics.getDataFromFile("dataset2.txt");
        assertEquals(550.6d, statistics.getMean(dataset1), 0.1d);
        assertEquals(60.32d, statistics.getMean(dataset2), 0.1d);
    }

    @Test
    public void standardDeviationTest() throws FileNotFoundException, URISyntaxException {
        LinkedList<Double> dataset1 = statistics.getDataFromFile("dataset1.txt");
        LinkedList<Double> dataset2 = statistics.getDataFromFile("dataset2.txt");
        assertEquals(572.03d, statistics.getStandardDeviation(dataset1), 0.1d);
        assertEquals(62.26d, statistics.getStandardDeviation(dataset2), 0.1d);
    }
}
