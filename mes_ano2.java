package Projetos_LPA.aula7;

import java.util.Scanner;

public class mes_ano2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número do mês em que estamos: ");
		int mes = scanner.nextInt();
		
		if (mes == 1) {
			System.out.println("Estamos no mês de Janeiro");
		} else if (mes == 2) {
			System.out.println("Estamos no mês de Fevereiro");
		} else if (mes == 3) {
			System.out.println("Estamos no mês de Março");
		} else if (mes == 4) {
			System.out.println("Estamos no mês de Abril");
		} else if (mes == 5) {
			System.out.println("Estamos no mês de Maio");
		} else if (mes == 6) {
			System.out.println("Estamos no mês de Junho");
		} else if (mes == 7) {
			System.out.println("Estamos no mês de Julho");
		} else if (mes == 8) {
			System.out.println("Estamos no mês de Agosto");
		} else if (mes == 9) {
			System.out.println("Estamos no mês de Setembro");
		} else if (mes == 10) {
			System.out.println("Estamos no mês de Outubro");
		} else if (mes == 11) {
			System.out.println("Estamos no mês de Novembro");
		} else if (mes == 12) {
			System.out.println("Estamos no mês de Dezembro");
		} else {
			System.out.println("O número selecionado é inválido");
		}
		
		scanner.close();

	}

}
