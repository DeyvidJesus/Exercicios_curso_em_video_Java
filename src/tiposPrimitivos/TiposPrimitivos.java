package tiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.print("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		// System.out.println("Sua nota ? " + nota);
		
		System.out.format("Sua nota ? %.2f", nota, nome);
		teclado.close();
	}

}
