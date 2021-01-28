package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.util.MyArrayList;

/**
 *
 * @author Federico Barrios Meneses
 */
public class StatCalculator {
    public StatCalculator(){
        
    }
    
    public static Double mean(MyArrayList<Double> array){
        Double sum = 0.0;
        for(Double n: array){
            sum = sum + n;
        }
        return sum/array.size();
    }
    
    public static Double standardDeviation(MyArrayList<Double> array){
        Double mean = mean(array);
        Double sum = 0.0;
        for(Double n: array){
            sum = sum + Math.pow(n - mean, 2);
        }
        return Math.sqrt(sum/(array.size()-1));
    }
}