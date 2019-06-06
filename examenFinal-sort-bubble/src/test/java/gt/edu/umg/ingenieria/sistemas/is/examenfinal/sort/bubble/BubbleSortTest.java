/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joan
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sortBasic method, of class BubbleSort.
     */
    @Test
    public void TestNulo() {
        System.out.println("TEST #1 - Nulo");
        
        int[] numbers = null;
        int[] expResult = null;
        
        int[] result = BubbleSort.sortBasic(numbers);
        
        assertArrayEquals("Test #1 - Fallo",expResult, result);
    }
    
    @Test
    public void TestCadenaCorta() {
        System.out.println("TEST #2 - Cadena Corta");
        
        int[] numbers = {5,4,7};
        int[] expResult = {4,5,7};
        
        int[] result = BubbleSort.sortBasic(numbers);
        
        assertArrayEquals("Test #2 - Fallo",expResult, result);
    }
    
    @Test
    public void TestCadenaUnitaria(){
        System.out.println("TEST #3 - Cadena unitaria");
        
        int[] numbers = {0};
        int[] expResult = {0};
        
        int[] result = BubbleSort.sortBasic(numbers);
        
        assertArrayEquals("Test #3 - Fallo",expResult, result);
    }
    
    @Test
    public void TestCadenaVacia(){
        System.out.println("TEST #4 - Cadena vacia");
        
        int[] numbers = {};
        int[] expResult = {};
        
        int[] result = BubbleSort.sortBasic(numbers);
        
        assertArrayEquals("Test #4 - Fallo",expResult, result);
    }
    
    @Test
    public void TestCaracteresGrandes() {
        System.out.println("TEST #5 - Caracteres grandes");
        
        int[] numbers =   {20000,88545,85457,15426457,202534555};
        int[] expResult = {20000,85457,88545,15426457,202534555};
        
        int[] result = BubbleSort.sortBasic(numbers);
        
        assertArrayEquals("Test #5 - Fallo",expResult, result);
    }
}
