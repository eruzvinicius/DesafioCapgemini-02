package br.com.desafio.model;

import java.util.Arrays;

/**
 *
 * @author eruzv
 */
public class Exercicio01 {
    
    /**
     * 
     * @param arrayNumeros array de inteiros desordenados
     * @return mediana     elemento central do array ordenado  
     */
    public static int retornaMediana(int [] arrayNumeros){
        
        int tamanhoArray;
        int posicaoMediana;
        int mediana;
        
        Arrays.sort(arrayNumeros);
        tamanhoArray = arrayNumeros.length;

        posicaoMediana = (int) Math.ceil(tamanhoArray/2.0);
        mediana = arrayNumeros[posicaoMediana-1];
        
        return mediana;
    }
     
    public static void main(String[] args) {       
        int[] array = {9,2,1,4,6};
        
        //imprime a mediana
        System.out.println(retornaMediana(array));   
    }    
}
