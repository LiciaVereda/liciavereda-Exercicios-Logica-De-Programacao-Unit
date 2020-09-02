package com.licia.cursojava.aulaaldo;

import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double custo, valorDoFrete, valorDoCusto, valorDeVenda;
		
		
		System.out.println("Qual o custo do produto?");
		custo = scan.nextDouble();
		System.out.println("Qual o valor do frete?");
		valorDoFrete = scan.nextDouble();
		System.out.println("Qual o valor do custo?");
		valorDoCusto = scan.nextDouble();
		
		valorDeVenda = custo + valorDoFrete + valorDoCusto;
		System.out.println("O valor de venda será: " +valorDeVenda);
		}
		
		
		
	}


