package br.com.desafio.model;

import java.util.Arrays;
import java.util.Scanner;

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

        posicaoMediana = (int) Math.ceil(tamanhoArray/2);        
        mediana = arrayNumeros[posicaoMediana];
        
        return mediana;
    }
     
    public static void main(String[] args) {       
        int[] array = {9,2,1,4,6};
        
//        int tamanho;             
//        Scanner sc = new Scanner(System.in);       
//        //solicita tamanho para o array;;
//        do{
//          System.out.print("Insira um tamanho ímpar para o array: ");
//          tamanho = sc.nextInt();
//        }while(tamanho % 2 == 0 );
// 
//        //cria o array com o tamanho especificado
//        int[] array = new int[tamanho];
//              
//        //solicita input para o array
//        System.out.println("Preencha o array com números inteiros: ");
//        for (int i =0; i < tamanho; i++){
//           System.out.print("array[" + i + "] = "); 
//           array[i] = sc.nextInt();         
//        }
//
//        //imprime o array na tela
//        System.out.print("Array = {");
//        for (int i =0; i < tamanho; i++){
//            if(i == tamanho - 1){
//                System.out.print(array[i]);   
//            }else{
//                System.out.print(array[i]+",");       
//            }   
//        }
//        System.out.println("}");
       
        //imprime a mediana
        System.out.println(retornaMediana(array));   
    }    
}
