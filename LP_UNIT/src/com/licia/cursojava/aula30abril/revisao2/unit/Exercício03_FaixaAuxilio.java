package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício03_FaixaAuxilio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salario, faixaSalarial;
		
		System.out.println("Digite o seu salário R$:");
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
			System.out.printf("Você tem direito a um auxílio emergencia no valor de %.2f", faixaSalarial);
		}
		else {
			System.out.println("Você não tem direito ao auxílio emergencial");
		}
		
		
		scan.close();

	}

}
