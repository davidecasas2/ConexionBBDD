/**
 * 
 */
package conector;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author David
 *
 */
public class EjemploExcepciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num=Integer.MIN_VALUE;
		do {
			try {
				System.out.println("introduce un n�mero entero: ");
				num=entrada.nextInt();
			} catch(InputMismatchException ex) {
				System.out.println("EL n�mero introducido no es correcto");
				num=Integer.MIN_VALUE;
				entrada.nextLine();
			}
		}while (num==Integer.MIN_VALUE);
		
		
		

	}
	
	
	

}
