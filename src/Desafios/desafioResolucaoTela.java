package Desafios;

import java.awt.Dimension;
import java.awt.Toolkit;

public class desafioResolucaoTela {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		int width = dimension.width;
		int height = dimension.height;
		System.out.println("A resolu��o da sua tela � de:");
		System.out.println(width + " x " + height);

	}

}
