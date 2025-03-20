package Projetos_LPA.aula7;

import java.util.Scanner;

public class exemplo_decisao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println("\nVocê é um adulto com " + idade + " anos 👍");
		} else if (idade < 0) {
			System.out.println("Idade inválida");
		} else {
			System.out.println("\nVocê é menor de idade com " + idade + " anos ");
		}
		
		scanner.close();

	}

}
