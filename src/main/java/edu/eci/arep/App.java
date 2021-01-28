package edu.eci.arep;

import edu.eci.arep.util.LinkedList;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {

        Statistics statistics = new Statistics();
        LinkedList<Double> data = statistics.getDataFromFile("dataset2.txt");
        System.out.println(statistics.getMean(data));
        System.out.println(statistics.getStandardDeviation(data));

    }
}
