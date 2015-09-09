

//
/**
 * Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Algoritmos y Estructuras de Datos
 * 
 * Clase : HuffmanArbol
 * Fungira como la clase padre para poder implementar los sets y gets de la frecuencia con la cual se ingresen
 * los caracteres. También verifica si dos frecuencias son iguales
 */
public class HuffmanArbol implements Comparable<HuffmanArbol>{

	// Atributo para la frecuencia de cada caracter
	private int frec;
	
	public HuffmanArbol( int frecuencia){
		frec = frecuencia;
	}
	//SETERS $ GETTERS

	public int getFrec() {
		return frec;
	}

	public void setFrec(int frec) {
		this.frec = frec;
	}
	//Se hace un override del comparte to, para poder llevar la cuenta
	// de ela frecuencia presente al momento de construir el arbol
	public int compareTo(HuffmanArbol arbolHuffman) { 
        return frec - arbolHuffman.frec;
	}
	
}
