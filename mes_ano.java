package Projetos_LPA.aula7;

import java.util.Scanner;

public class mes_ano {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] opcoes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		System.out.print("Informe o número do mês em que estamos: ");
		int mes = scanner.nextInt() - 1;
		
		if (mes > 11 || mes < 0) {
			System.out.println("O número é inválido");
		} else {
			System.out.println("O mês em que estamos é: " + opcoes[mes]);
		}
		
		scanner.close();

	}

}
