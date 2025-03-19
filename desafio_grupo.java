package Projetos_LPA.aula7;

import java.util.Scanner;

public class desafio_grupo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe uma letra: ");
		String letra = scanner.nextLine();
		
		if (letra.equals("F")) {
			System.out.println("Feminino");
		} else if (letra.equals("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Inválido");
		}
		
		scanner.close();
		

	}

}
