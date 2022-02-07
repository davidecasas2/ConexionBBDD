/**
 * 
 */
package conector;

/**
 * @author David
 *
 */
public class EjemploExcepciones2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int vector[]= {1, 4, 3, 2, 5};
		
		try {
			System.out.println("el numero en al posicion 2 es: " 
				       + getPosicion(vector,2)); 
			
			System.out.println("el numero en al posicion 8 es: " 
			       + getPosicion(vector,8)); 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("se ha producido un error al acceder al vector");
		}
		

	}
	
	public static int getPosicion(int vector[], int pos) {
		int res=-1;
		System.out.println("antes de la sentencia susceptible a error");
		res = vector[pos];
		System.out.println("despues de la sentencia susceptible a error");
		return res;
	}

}
