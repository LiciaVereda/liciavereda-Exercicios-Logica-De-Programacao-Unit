package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exerc�cio01_Salario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salario;
		
		System.out.println("Digite o seu sal�rio R$:");
		salario = scan.nextFloat();
		
		if(salario>1200) {
			System.out.println("Voc� n�o tem direito ao Aux�lio Emergencial");
		} else {
			System.out.println("Voc� tem direito ao Aux�lio Emergencial");
		}
		scan.close();

	}

}
