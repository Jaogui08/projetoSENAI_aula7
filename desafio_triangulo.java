package Projetos_LPA.aula7;

import java.util.Scanner;

public class desafio_triangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.print("Informe o primeiro lado do seu triangulo: ");
		lado1 = scanner.nextInt();
		
		System.out.print("Informe o segundo lado do seu triangulo: ");
		lado2 = scanner.nextInt();
		
		System.out.print("Informe o terceiro lado do seu triangulo: ");
		lado3 = scanner.nextInt();
				
		if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("Seu triangulo é equilatero");
		} else if (lado1 == lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Seu triangulo é isosceles");
		} else {
			System.out.println("Seu triangulo é escaleno");
		}
		
		scanner.close();

	}

}
