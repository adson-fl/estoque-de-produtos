package produto;

import java.util.Locale;
import java.util.Scanner;

import entidade.banco;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		banco produto = new banco();
		
		System.out.println("Enter product data:");
		System.out.print("nome:");
		produto.nome = sc.nextLine();
		System.out.print("preço :");
		produto.preço = sc.nextDouble();
		System.out.print("quantidade em estok:");
		produto.quantidade = sc.nextInt();
		
		System.out.println("");
		System.out.println("estok atual " + produto);
		
		System.out.println("");
		System.out.println("encira o quantidade de produtos que forão Acrescentados em estok:");
		int quantidade = sc.nextInt();
		produto.addproduto(quantidade);
		
		System.out.println("");
		System.out.println("estok atual " + produto);
		
		System.out.println("");
		System.out.println("informe quantos produtos forãm retirados do estok:");
		quantidade = sc.nextInt();
		produto.removerproduto(quantidade);
			
		System.out.println("");
		System.out.println("estok atual " + produto);
		
		sc.close();

	}

}
