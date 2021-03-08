import java.util.Scanner;

public class stock {
	
	/***
	 * Saber si la contrassenya és correcte
	 * @param Contrassenya introduïda
	 * @return
	 */
	public static boolean accesMan(String pass) {
		
		if (pass == contra) {
			return true;
		}
		
		return false;
	}
	
	/***
	 * Reemplenar stock a 12 productes
	 * @param stock
	 */
	public static void rellenarStock(int[][] stock) {
		for (int i=0; i < stock.length; i++) {
            for (int j=0; j < stock.length; j++) {
            	stock [i][j] = 12;
            } 
		}
	}
	/***
	 * Revisem si hi ha stock amb les coordenades introduïdes per l'usuari
	 * @param fil
	 * @param col
	 * @return
	 */
	public static boolean tenimstock(int[][] stock, int fil, int col) {
		if (stock[fil][col]>=1) {
		    return true;

		}
		else {
		   return false;
		}
	}
	
	public static void main(String[] args) {
		String contra = "pass1234";
		System.out.println(); pass = sc.nextLine();

		Scanner sc = new Scanner(System.in);
		
		System.out.println(accesMan(pass));
	}

}