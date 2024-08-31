package principal;

import java.util.Scanner;

import controllers.ProdutoController;

public class Principal {

	public static void main(String[] args) {
		
		var produtoController = new ProdutoController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nSISTEMA DE CONTROLE DE PRODUTOS:\n");
		
		System.out.println("(1) CADASTRAR PRODUTOS");
		System.out.println("(2) CONSULTAR PRODUTOS");
		System.out.println("(3) ATUALIZAR PRODUTOS");
		System.out.println("(4) EXCLUIR PRODUTOS");
		
		System.out.print("\nINFORME A OPÇÃO DESEJADA: ");
		var opcao = scanner.nextLine();
		
		switch(opcao) {
		case "1": produtoController.cadastrarProduto(); break;
		case "2": produtoController.consultarProdutos(); break;
		case "3": produtoController.atualizarProduto(); break;
		case "4": produtoController.excluirProduto(); break;
		}
		
		System.out.println("\nDESEJA CONTINUAR? (S,N): ");
		var continuar = scanner.nextLine();
		
		if(continuar.equalsIgnoreCase("S")) {
			main(args);
		}
		else {
			System.out.println("\nFIM DO PROGRAMA!");
		}

	}

}
