package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício02_SalárioTempoServiço {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salario;
		int tempoServico;
		
		System.out.println("Digite o seu salário R$:");
		salario = scan.nextFloat();
		
		System.out.println("Digite o seu tempo de serviço:");
		tempoServico = scan.nextInt();
		
		if((salario>1200) || (tempoServico<3)) {
			System.out.println("Você não tem direito ao Auxílio Emergencial");
		} else {
			System.out.println("Você tem direito ao Auxílio Emergencial");
		}
		scan.close();

	}

}
