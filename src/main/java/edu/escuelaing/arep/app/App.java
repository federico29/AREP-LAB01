package edu.escuelaing.arep.app;
import edu.escuelaing.arep.util.MyArrayList;
import edu.escuelaing.arep.stat.StatCalculator;
import java.io.File;
import java.util.Scanner;


/**
 * Clase principal que ejecuta la aplicación.
 * @author Federico Barrios Meneses
 */
public class App {
    public static void main( String[] args ) throws Exception {
        StatCalculator calculator = new StatCalculator();
        MyArrayList<Double> array = new MyArrayList<Double>();
        File input = 
                new File("C:\\Users\\Usuario\\Desktop\\AREP\\miprimera-app\\input.txt");
        Scanner sc = new Scanner(input);
        while(sc.hasNextLine()){
            array.add(Double.parseDouble(sc.nextLine()));
        }
        System.out.println("MEAN: "+calculator.mean(array));
        System.out.println("STANDARD DEVIATION: "+calculator.standardDeviation(array));
        System.out.println("SIZE: "+array.size());
        System.out.println("LIST: "+array.toString());
    }
}
