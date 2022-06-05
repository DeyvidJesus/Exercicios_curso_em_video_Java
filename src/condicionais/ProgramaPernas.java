package condicionais;

import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Quantas pernas:");
		int pernas = t.nextInt();
		System.out.print("Isso é um(a) ");
		String tipo;
		
		switch (pernas) {
		case 1: 
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 3: 
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 6, 8:
			tipo = "Aranha";
			break;
		default: 
			tipo = "ET";
			break;
		}
		
		System.out.print(tipo);
		
		t.close();
	}

}
