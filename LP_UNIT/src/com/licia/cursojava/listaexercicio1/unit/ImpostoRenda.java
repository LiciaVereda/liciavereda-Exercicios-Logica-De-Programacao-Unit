package com.licia.cursojava.listaexercicio1.unit;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		float impostoRenda, impostoPagar;
		int numeroDependentes;	
		final int valorDescontoDependente = 1000;
		
		System.out.println("Digite o imposto de renda bruto do contribuinte: ");
		impostoRenda = scan.nextFloat();	
		System.out.println("Digite o número de dependentes do contribuinte: ");
		numeroDependentes = scan.nextInt();
		
		impostoPagar = impostoRenda - (numeroDependentes * valorDescontoDependente);
		
		if(impostoPagar<0) {
			impostoPagar=0;		
		}
		
		System.out.print("O imposto a pagar é R$: ");
		System.out.println(String.format("%.1f", impostoPagar));
				

		scan.close();
		
		

	}

}
