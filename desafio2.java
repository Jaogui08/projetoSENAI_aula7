package Projetos_LPA.aula7;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe se é Masculino(M), ou Feminino(F): ");
		String letra = scanner.nextLine();
		
		if (letra.equals("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}
		
		scanner.close();

	}

}
