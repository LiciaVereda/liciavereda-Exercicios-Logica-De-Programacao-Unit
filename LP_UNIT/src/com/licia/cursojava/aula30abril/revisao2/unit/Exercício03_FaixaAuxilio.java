package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exerc�cio03_FaixaAuxilio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salario, faixaSalarial;
		
		System.out.println("Digite o seu sal�rio R$:");
		salario = scan.nextFloat();
		
		
			
		if(salario <= 1200) {
			faixaSalarial = 1200.00f; 
		} else if(salario > 1200 && salario <= 2000){
			faixaSalarial = 1500.00f;
		} else if(salario >2000 && salario <= 3000) {
			faixaSalarial = 2000.00f;
		}else {
			faixaSalarial = 0f;
		}
		
		if(faixaSalarial!=0) {
			System.out.printf("Voc� tem direito a um aux�lio emergencia no valor de %.2f", faixaSalarial);
		}
		else {
			System.out.println("Voc� n�o tem direito ao aux�lio emergencial");
		}
		
		
		scan.close();

	}

}
