package edu.eci.arep;

import edu.eci.arep.util.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Statistics {

    public Double getMean(LinkedList<Double> data) {
        double sum = 0.0;
        int count = data.getSize();
        for (int i = 0; i < count; i++) {
            sum += data.get(i);
        }
        return sum / count;
    }

    public Double getStandardDeviation(LinkedList<Double> data) {
        double count = data.getSize();
        double mean = getMean(data);
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += Math.pow(data.get(i) - mean, 2);
        }
        return Math.sqrt(sum / (double) (count - 1));
    }

    public LinkedList<Double> getDataFromFile(String fileName) throws URISyntaxException, FileNotFoundException {
        LinkedList<Double> data = new LinkedList<>();
        ClassLoader classLoader = App.class.getClassLoader();
        URI uri = classLoader.getResource(fileName).toURI();
        File file = new File(uri.getPath());
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            data.addLast(Double.parseDouble(sc.nextLine()));
        }
        return data;
    }
}
