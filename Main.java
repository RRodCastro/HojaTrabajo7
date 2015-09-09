

//
/**
 * Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Algoritmos y Estructuras de Datos
 * 
 * Clase : Main
 * Pide ingreso de datos y muestra en pantalla el resultado de la frecuencia y el codigo huffman
 * de cada caracter.
 *
 */

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	
    	Huffman objetoHuff = new Huffman(); // Se crea objeto de la clase Huffman
    	
    	// Se ingresan los caracteres para frecuencia
    	System.out.println(" Ingrese una cadena de letras ");
    	String cadena = entrada.nextLine();
    	
    	
    	 
    	objetoHuff.CantidadFrecuencia(cadena);
       
    	 HuffmanArbol arbol = objetoHuff.Crear();
 
        // Impresion
        System.out.println("Caracter-----Frecuencia Car-------Codigo-----:");
        
        objetoHuff.Codigo(arbol, new StringBuffer());
        
        
  
    }

}
