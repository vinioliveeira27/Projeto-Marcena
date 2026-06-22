package main;

import java.util.Scanner;

import ui.Menu;
import ui.NovoProjeto;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 3) {
			Menu.exibir();
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				NovoProjeto.exibir(sc);
				break;
			case 2:
				break;
			case 3:
				System.out.println("Encerrando...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}

		sc.close();
	}
}