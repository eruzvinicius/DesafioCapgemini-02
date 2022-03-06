package br.com.desafio.model;

/**
 *
 * @author eruzv
 */
public class Exercicio02 {
    
   /**
    * Calcula a quantidade de ocorrências de pares de elementos com diferença x entre si no vetor n
    * 
    * @param  n          vetor de inteiros
    * @param  x          diferença entre os pares de elementos
    * @return quantidade numero inteiro
    */   
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
        System.out.println(calculaDiferenca(array, 2));
    }
}
