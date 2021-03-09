import java.util.*;

public class Diners {
	
	private static final Scanner usuari = new Scanner(System.in);

	public static void main(String[] args) {
		final int PREU = 155; //El producte
		int monedes; //Convertir els centims, ens sortirΰ en decimal
		int centims; //200=2, 100=1, 50=0.50, 20=0.20, 10=0.10, 5=0.05, 2=0.02, 1=0.01
		int canvi = 155;
		
		do {
			System.out.println("Aquesta mΰquina accepta Monedes de 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02 i 0.01 ");
			System.out.println("Introdueixi les monedes: ");
			centims = usuari.nextInt();
			if(centims<PREU) {
				System.out.print("Quantitat insuficient");
			}
		} while (centims<PREU);
	
		if(centims==PREU) {
			System.out.println("Quantitat exacta, gracies per la compra!");
		} else {
			centims-=PREU;
			System.out.println("Progressant canvi");
			System.out.println(CanviEnMonedes(canvi));
		}
		System.out.println("Gracies per la compra!");
	}
	
	public void CanviEnMonedes (double canvi) {
        int tornar = (int) (canvi * 100);

        System.out.println("Para devolver " + canvi + " debes dar");
        // para cada moneda
        if (tornar >= 200) {
            System.out.println("Monedes de 2: " + tornar/200);
            tornar %= 200;
        }
        if (tornar >= 100) {
            System.out.println("Monedes de 1: " + tornar/100);
            tornar %= 100;
        }
        if (tornar >= 50) {
            System.out.println("Monedes de 0.50: " + tornar/50);
            tornar %= 50;
        }
        if (tornar >= 20) {
            System.out.println("Monedes de 0.20 " + tornar/20);
            tornar %= 20;
        }
        if (tornar >= 10) {
            System.out.println("Monedes de 0.10: " + tornar/10);
            tornar %= 10;
        }
        if (tornar >= 5) {
            System.out.println("Monedes de 0.05: " + tornar/5);
            tornar %= 5;
        }
        if (tornar >= 2) {
            System.out.println("Monedes de 0.02: " + tornar/2);
            tornar %= 2;
        }
        if (tornar >= 1) {
            System.out.println("Monedes de 0.01: " + tornar);
            tornar = 0;
        }
    }
	
	public void TotalDeDiners () {
		
	}
	
	public void RecargarDiners () {
		
	}
	
	public void NoHiHaProducte () {
		
	}
	
}
