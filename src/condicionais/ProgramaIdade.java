package condicionais;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Em que ano você nasceu? ");
		int anoNasc = t.nextInt();
		int idade = 2022-anoNasc;
		System.out.println("Sua idade é " + idade);
		if (idade>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade"
					+ "");
		}

		t.close();
	}

}
