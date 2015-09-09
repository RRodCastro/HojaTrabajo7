import java.util.*;
/**
 * Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Algoritmos y Estructuras de Datos
 * 
 * Clase : Huffman
 * Esta estructuado el algoritmo de Huffman, se tomo como referencia el ejemplo subido en clase
 * y el algortimo de esta pagina: http://rosettacode.org/wiki/Huffman_coding#Java
 *
 */
public class Huffman {

	private int [] Frecuencias = new int[256]; //Cantidad de caracteres
	
	public void CantidadFrecuencia(String cadena){
		for (char a: cadena.toCharArray()){
			Frecuencias[a]++;
		}
		
	}
	
	public HuffmanArbol Crear(){
		
        PriorityQueue<HuffmanArbol> arbol = new PriorityQueue<HuffmanArbol>();
        
        for (int i=0; i<Frecuencias.length; i++ ){
        	if (Frecuencias[i] >0 )
        		arbol.offer(new HijosHuffman(Frecuencias[i], (char)i));
        		
        	
        }
        
        
        while(arbol.size() >1){
        	HuffmanArbol a = arbol.poll();
        	HuffmanArbol b = arbol.poll();

        	arbol.offer(new NodoHuffman(a,b));
        	
        }
        return arbol.poll();
        	
        }
		
	
	public void Codigo(HuffmanArbol arbol, StringBuffer buffer ){
		if (arbol instanceof HijosHuffman){
			HijosHuffman hijos =( HijosHuffman) arbol;
			
			System.out.println( hijos.getCaracter() + "          " + hijos.getFrec() + "           "  + buffer);
			
			
		}else if (arbol instanceof NodoHuffman){
			NodoHuffman nodo = (NodoHuffman) arbol;
			
		
		
		buffer.append('0');
        Codigo(nodo.getLeft(), buffer);
        buffer.deleteCharAt(buffer.length()-1);
        
        buffer.append('1');
        Codigo(nodo.getRight(), buffer);
        buffer.deleteCharAt(buffer.length()-1);
	}
	}
}


