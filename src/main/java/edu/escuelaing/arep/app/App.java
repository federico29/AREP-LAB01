package edu.escuelaing.arep.app;
import edu.escuelaing.arep.util.MyArrayList;
import edu.escuelaing.arep.stat.StatCalculator;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        StatCalculator calculator = new StatCalculator();
        MyArrayList<Double> array = new MyArrayList<Double>();
        array.add(100.0);
        array.add(10.0);
        array.add(24.0);
        array.add(12.0);
        array.add(34.0);
        System.out.println("LISTA: "+array.toString());
        System.out.println("MEDIA: "+calculator.mean(array));
        System.out.println("DESVICION ESTANDAR: "+Math.round(calculator.standardDeviation(array)));
        System.out.println("SIZE: "+array.size());
        System.out.println("CABEZA: "+array.getHead().getValue());
        System.out.println("COLA: "+array.getTail().getValue());
    }
}
