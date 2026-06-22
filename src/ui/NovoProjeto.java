package ui;

import java.util.Scanner;

public class NovoProjeto {
	public static void exibir(Scanner sc) {
		System.out.println("\n=== Novo Projeto ===");
		System.out.println("1. Armário");
		System.out.println("2. Guarda-roupa");
		System.out.println("3. Gabinete");
		System.out.print("Selecione o móvel: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Configurando Armário...");
			break;
		case 2:
			System.out.println("Configurando Guarda-roupa...");
			break;
		case 3:
			System.out.println("Configurando Gabinete...");
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
}