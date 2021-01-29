package edu.eci.arep;

import edu.eci.arep.util.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * Clase estadística para calcular la media y la desviación estándar de un set de datos
 *
 * @author Daniel Rincón
 */
public class Statistics {

    /**
     * Calcula la media de un set de datos ubicados en una LinkedList de Doubles
     * @param data La linkedList con los datos que se van a procesar
     * @return La media de lo datos dados
     */
    public Double getMean(LinkedList<Double> data) {
        double sum = 0.0;
        int count = data.getSize();
        for (int i = 0; i < count; i++) {
            sum += data.get(i);
        }
        return sum / count;
    }

    /**
     * Calcula la desviación estándar de un set de datos ubicados en una LinkedList de Doubles
     * @param data La linkedList con los datos que se van a procesar
     * @return La desviación estándar de lo datos dados
     */
    public Double getStandardDeviation(LinkedList<Double> data) {
        double count = data.getSize();
        double mean = getMean(data);
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += Math.pow(data.get(i) - mean, 2);
        }
        return Math.sqrt(sum / (double) (count - 1));
    }

    /**
     * Lee un archivo de texto y retorna una LinkedList con los datos listados en el archivo
     * @param fileName El nombre del archivo ubicado en la carpeta resources
     * @return Una LinkedList llena de los datos leídos
     * @throws URISyntaxException
     * @throws FileNotFoundException
     */
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
