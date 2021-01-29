package edu.escuelaing.arep.app;
import edu.escuelaing.arep.util.MyArrayList;
import edu.escuelaing.arep.stat.StatCalculator;
import java.io.File;
import static java.lang.Math.round;
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
                new File("input.txt");
        Scanner sc = new Scanner(input);
        while(sc.hasNextLine()){
            array.add(Double.parseDouble(sc.nextLine()));
        }
        System.out.println("MEAN: "+calculator.mean(array));
        System.out.println(
                "STANDARD DEVIATION: "+Math.round(calculator.standardDeviation(array)*1000000.0)/1000000.0);
        System.out.println("SIZE: "+array.size());
        System.out.println("LIST: "+array.toString());
    }
}
 