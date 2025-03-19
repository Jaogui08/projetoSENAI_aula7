package Projetos_LPA.aula7;

import java.util.Scanner;

public class desafio_numeros2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Informe um numero: ");
		num1 = scanner.nextInt();
		
		System.out.print("Informe um numero diferente: ");
		num2 = scanner.nextInt();
		
		System.out.print("Informe outro numero diferente: ");
		num3 = scanner.nextInt();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("\nO numero " + num1 + " é o maior");
		} else if (num1 < num2 && num2 > num3) {
			System.out.println("\nO numero " + num2 + " é o maior");
		} else {
			System.out.println("\nO numero " + num3 + " é o maior");
		}
		
		if (num1 < num2 && num1 < num3) {
            System.out.println("O numero " + num1 + " é o menor");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O numero " + num2 + " é o menor");
        } else {
            System.out.println("O numero " + num3 + " é o menor");
        }
		
		scanner.close();

	}

}
