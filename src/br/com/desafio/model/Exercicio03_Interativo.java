package br.com.desafio.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eruzv
 */
public class Exercicio03_Interativo {

    /**
     * Retira os espaços da String e mistura as letras
     * 
     * @param   s          String inicial
     * @return  msgTratada String tratada
     */
    private static String trataString(String s){
        List<String> letras;
        String msgTratada = "";
               
        //remove espaços da string
        s = s.replaceAll("\\s+",""); 
     
        //mistura string
        letras = Arrays.asList(s.split(""));
        Collections.shuffle(letras);
        
        for (String letra: letras){
            msgTratada += letra;
        }       
        
        return msgTratada;
    }
    
    /**
     * Divide a string em substrings e imprime de acordo com o valor de 'nColunas'
     * 
     * @param s         String tratada
     * @param nColunas  Número de caracteres por linha
     */
    private static void imprimePalavras(String s, int nColunas) {
        ArrayList<String> linhas = new ArrayList<>();

        //divide a String tratada em substrings de tamanho fixo
        for (int i = 0; i < s.length(); i += nColunas) {
            linhas.add(s.substring(i, Math.min(s.length(), i + nColunas)));           
        }
      
        //imprime cada substring em uma linha
        for (int i = 0; i < linhas.size(); i++) {
            System.out.println(linhas.get(i));
        }
    }
    
    /**
     * Usa o número de caracteres de uma String para calcular quantos caracteres serão exibidos por linha.
     * Também calcula o número de linhas que serão impressas nos casos em que a String cabe em grids menores
     * 
     * @param sInicial 
     */
    private static void geraMsgEncriptada(String s){
        int raizInferior;
        int raizSuperior;
        boolean ehQuadrado;   
        
        //calcula o tamanho do grid
        raizInferior = (int)Math.floor(Math.sqrt(s.length()));
        raizSuperior = (int)Math.ceil(Math.sqrt(s.length()));  
        ehQuadrado = (s.length() >= (raizInferior * raizSuperior)) ? true : false;
                        
        if (!ehQuadrado){
            System.out.println("Existem duas possibilidades de grid de mesma área.");   
            
            System.out.println("Possibilidade 1: Grid "+raizInferior+" x "+raizSuperior);
            imprimePalavras(s, raizSuperior);
                    
            System.out.println("\nPossibilidade 2: Grid "+raizSuperior+" x "+raizInferior);
            imprimePalavras(s, raizInferior);
                     
        }else{
            imprimePalavras(s, raizSuperior);        
        }      
    }
    
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma mensagem para ser criptografada: ");
        s = sc.nextLine();
     
        String sTratada;
        
        sTratada = trataString(s);
        geraMsgEncriptada(sTratada);
    }    
}
