/**
 * 
 */
package conector;

/**
 * @author David
 *
 */
public class EjemploExcepciones3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int vector[]= {1, 4, 3, 2, 5};
		
		System.out.println("el numero en al posicion 2 es: " 
			       + getPosicion(vector,2)); 
		
		System.out.println("el numero en al posicion 8 es: " 
		       + getPosicion(vector,8)); 

	}
	
	public static int getPosicion(int vector[], int pos) {
		int res=-1;
		try {
			System.out.println("antes de la sentencia susceptible a error");
			res = vector[pos];
			System.out.println("despues de la sentencia susceptible a error");

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Dentro del catch");
		}
		System.out.println("Fuera del bloque try");
		return res;
	}

}
