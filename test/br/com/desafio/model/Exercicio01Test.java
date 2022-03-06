package br.com.desafio.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eruzv
 */
public class Exercicio01Test {

    /**
     * Test of retornaMediana method, of class Exercicio01.
     */
    @Test
    public void testRetornaMedianaEx01() {
        System.out.println("testRetornaMedianaEx01");
        int[] arrayNumeros = {9,2,1,4,6};
        int expResult = 4; //[1,2,(4),6,9]
        int result = Exercicio01.retornaMediana(arrayNumeros);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornaMedianaEx02() {
        System.out.println("testRetornaMedianaEx02");
        int[] arrayNumeros = {9,2,1,4,6,3,7,5,8};
        int expResult = 5; //[1,2,3,4,(5),6,7,8,9]
        int result = Exercicio01.retornaMediana(arrayNumeros);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRetornaMedianaEx03() {
        System.out.println("testRetornaMedianaEx03");
        int[] arrayNumeros = {9,2,1};
        int expResult = 2; //[1,(2),9]
        int result = Exercicio01.retornaMediana(arrayNumeros);
        assertEquals(expResult, result);
    }  
    
}
