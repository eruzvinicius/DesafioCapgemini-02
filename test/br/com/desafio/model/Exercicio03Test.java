package br.com.desafio.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eruzv
 */
public class Exercicio03Test {
    
    /**
     * Test of trataString method, of class Exercicio03.
     */ 
    @Test
    public void trataString(){
        System.out.println("trataString");
        String s = "tenha um bom dia"; //
        Boolean result;
        result = false;
        
        //verifica tamanho da String
        assertEquals(16, s.length());
        s = s.replaceAll("\\s+",""); 
 
        // verifica se a String tratada possui espaços vazios       
        for (int i = 0; i < s.length()-1; i++) {
              if ((s.charAt(i) == ' ')) {
                result = true;
           }
        }       
        assertEquals(false, result);
               
        //verifica tamanho da String sem espaços
        assertEquals(13, s.length());
               
        List<String> letras;
        String msgTratada = "";
               
        letras = Arrays.asList(s.split(""));
        Collections.shuffle(letras);
        
        for (String letra: letras){
            msgTratada += letra;
        } 
       
        //verifica se o tamanho da String embaralhada permaneceu o mesmo
        assertEquals(13, msgTratada.length());  
    }

   
    /**
     * Test of geraMsgEncriptada method, of class Exercicio03.
     */ 
    @Test
    public void geraMsgEncriptada(){
        System.out.println("geraMsgEncriptada");
        int tamanhoString = 13; 
        int raizInferior;
        int raizSuperior;
        boolean ehQuadrado;   
        
        //calcula o tamanho do grid
        raizInferior = (int)Math.floor(Math.sqrt(tamanhoString));
        raizSuperior = (int)Math.ceil(Math.sqrt(tamanhoString));  
        ehQuadrado = (tamanhoString >= (raizInferior * raizSuperior)) ? true : false;

        assertEquals(4, raizSuperior);       
        assertEquals(3, raizInferior);        
        assertEquals(true, ehQuadrado);
        
    }
    
}
