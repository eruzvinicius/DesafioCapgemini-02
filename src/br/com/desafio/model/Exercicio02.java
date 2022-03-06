package br.com.desafio.model;

import java.util.Scanner;

/**
 *
 * @author eruzv
 */
public class Exercicio02 {
    
   
    public static int calculaDiferenca(int[] n, int x){
        int quantidade = 0;
        int diferenca;
        
        for (int i = 0; i < n.length; i++){
            for(int j = n.length - 1; j > i; j--){               
                diferenca = Math.abs(n[i]-n[j]);              
                if (diferenca == x){
                    quantidade++;
                }
            }          
        }        
        return quantidade;
    }
    
    public static void main(String[] args) {
        int[] array = {1,5,3,4,2};
       
//        int tamanho;
//        int diferenca;
//        Scanner sc = new Scanner(System.in);
//        
//        //solicita tamanho para o array;;
//
//        System.out.print("Insira um tamanho para o array: ");
//        tamanho = sc.nextInt();
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
//        //imprime o array na tela5
//        System.out.print("Array = {");
//        for (int i =0; i < tamanho; i++){
//            if(i == tamanho - 1){
//                System.out.print(array[i]);   
//            }else{
//                System.out.print(array[i]+",");       
//            }   
//        }
//        System.out.println("}");
//        
//        //solicita input para a diferença
//        System.out.print("Insira um valor para a diferença entre os pares de elementos: ");
//        diferenca = sc.nextInt(); 
//
//        System.out.println(calculaDiferenca(array, diferenca));
        
        System.out.println(calculaDiferenca(array, 2));
    }
}
