package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício01_Salario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salario;
		
		System.out.println("Digite o seu salário R$:");
		salario = scan.nextFloat();
		
		if(salario>1200) {
			System.out.println("Você não tem direito ao Auxílio Emergencial");
		} else {
			System.out.println("Você tem direito ao Auxílio Emergencial");
		}
		scan.close();

	}

}
