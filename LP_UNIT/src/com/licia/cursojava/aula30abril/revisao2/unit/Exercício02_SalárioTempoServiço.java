package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exerc�cio02_Sal�rioTempoServi�o {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salario;
		int tempoServico;
		
		System.out.println("Digite o seu sal�rio R$:");
		salario = scan.nextFloat();
		
		System.out.println("Digite o seu tempo de servi�o:");
		tempoServico = scan.nextInt();
		
		if((salario>1200) || (tempoServico<3)) {
			System.out.println("Voc� n�o tem direito ao Aux�lio Emergencial");
		} else {
			System.out.println("Voc� tem direito ao Aux�lio Emergencial");
		}
		scan.close();

	}

}
