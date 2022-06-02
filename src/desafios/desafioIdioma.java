package desafios;

import java.util.Locale;

public class desafioIdioma {

	public static void main(String[] args) {
		Locale location = Locale.getDefault();
		System.out.print("O idioma do sistema é ");
		System.out.print(location.getDisplayLanguage() + ".");
		
	}

}
