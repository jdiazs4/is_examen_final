/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

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
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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
     * Test of build method, of class PascalTriangle.
     */
    @Test
    public void TestValorMenorCero() {
        System.out.println("TEST #1 - Valor menor a cero");
        PascalTriangle instance = new PascalTriangle();
        
        int levels = -1;
        
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Test #1 - Fallo",expResult, result);
    }
    
    @Test
    public void TestValorNumeroPositivo() {
        System.out.println("TEST #2 - Numero positivo");
        PascalTriangle instance = new PascalTriangle();
        
        int levels = 2;
        
        String expResult = "[1]\n[1, 1]\n";
        String result = instance.build(levels);
        assertEquals("Test #2 - Fallo",expResult, result);
    }
    
    @Test
    public void TestValorFloat() {
        System.out.println("TEST #3 - Numero casteado de flotante");
        PascalTriangle instance = new PascalTriangle();
        
        int levels = (int) 2.5;
        
        String expResult = "[1]\n[1, 1]\n";
        String result = instance.build(levels);
        assertEquals("Test #3 - Fallo",expResult, result);
    }
    
    @Test
    public void TestValorMaximo() {
        System.out.println("TEST #4 - Valor Maximo");
        PascalTriangle instance = new PascalTriangle();
        
        int levels = Integer.MAX_VALUE+1;
        
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Test #4 - Fallo",expResult, result);
    }
    
    @Test
    public void TestValorMinimo() {
        System.out.println("TEST #5 - Valor Minimo");
        PascalTriangle instance = new PascalTriangle();
        
        int levels = Integer.MIN_VALUE;
        
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Test #5 - Fallo",expResult, result);
    }
}
