/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.util.MyArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Federico Barrios Meneses
 */
public class StatCalculatorTest extends TestCase {
    private MyArrayList<Double> testList;
    
    public StatCalculatorTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        testList = new MyArrayList<>();
        testList.add(1999.0);
        testList.add(169.0);
        testList.add(51.0);
        testList.add(124.404);
        testList.add(34.25);
        testList.add(810.7);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of mean method, of class StatCalculator.
     */
    public void testMean() {
        Double expResult = 531.3923333333333;
        Double result = StatCalculator.mean(testList);
        assertEquals(expResult, result);
    }

    /**
     * Test of standardDeviation method, of class StatCalculator.
     */
    public void testStandardDeviation() {
        Double expResult = 775.4714741579259;
        Double result = StatCalculator.standardDeviation(testList);
        assertEquals(expResult, result);
    }
    
}
