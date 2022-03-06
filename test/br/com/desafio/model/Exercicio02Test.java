package br.com.desafio.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eruzv
 */
public class Exercicio02Test {
    
    /**
     * Test of calculaDiferenca method, of class Exercicio02.
     */
    @Test
    public void testCalculaDiferencaEx01() {
        System.out.println("calculaDiferencaEx01");
        int[] n = {1,5,3,4,2};
        int x = 2;
        int expResult = 3; //[1,3],[5,3],[4,2]
        int result = Exercicio02.calculaDiferenca(n, x);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculaDiferencaEx02() {
        System.out.println("calculaDiferencaEx02");
        int[] n = {1,5,3,4,2};
        int x = 1;
        int expResult = 4; //[1,2],[5,4],[3,4],[3,2]
        int result = Exercicio02.calculaDiferenca(n, x);
        assertEquals(expResult, result);
    } 
    
    @Test
    public void testCalculaDiferencaEx03() {
        System.out.println("calculaDiferencaEx03");
        int[] n = {1,5,3,4,2};
        int x = 3;
        int expResult = 2; //[1,4],[5,2]
        int result = Exercicio02.calculaDiferenca(n, x);
        assertEquals(expResult, result);
    }     
}
