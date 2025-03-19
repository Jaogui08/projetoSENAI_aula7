package Projetos_LPA.aula7;

import java.util.Scanner;

public class dados_informados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String usuario = "jaoguisenai";
		String senha = "123456";
		
		System.out.print("Informe seu usuário: ");
		String userdigitado = scanner.nextLine();
		
		System.out.print("Informe sua senha: ");
		String senhadigitada = scanner.nextLine();
		
		if (!userdigitado.equals(usuario) || !senhadigitada.equals(senha)) {
			System.out.print("\nUsuário ou senha incorretos");
		} else {
			System.out.print("\nBem-vindo ao sistema senai");
		}
		
		scanner.close();
		
	}

}
