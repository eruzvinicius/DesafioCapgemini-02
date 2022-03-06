package br.com.desafio.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eruzv
 */
public class Exercicio01Test {
    
    public Exercicio01Test() {
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
     * Test of retornaMediana method, of class Exercicio01.
     */
    @Test
    public void testRetornaMedianaEx01() {
        System.out.println("testRetornaMedianaEx01");
        int[] arrayNumeros = {9,2,1,4,6};
        int expResult = 4;
        int result = Exercicio01.retornaMediana(arrayNumeros);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornaMedianaEx02() {
        System.out.println("testRetornaMedianaEx02");
        int[] arrayNumeros = {9,2,1,4,6,3,7,5,8};
        int expResult = 5;
        int result = Exercicio01.retornaMediana(arrayNumeros);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornaMedianaEx03() {
        System.out.println("testRetornaMedianaEx03");
        int[] arrayNumeros = {9,2,1};
        int expResult = 2;
        int result = Exercicio01.retornaMediana(arrayNumeros);
        assertEquals(expResult, result);
    }  
    
}
