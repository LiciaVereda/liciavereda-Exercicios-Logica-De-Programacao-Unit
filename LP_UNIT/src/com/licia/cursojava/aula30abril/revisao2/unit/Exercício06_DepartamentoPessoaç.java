package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício06_DepartamentoPessoaç {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int qtdeFilho=1, contadorFilho=1, idadeFilho, temporariaFilho=0;
		String possuiFilho="";
		float ajudaCusto=0f;
		boolean repetido=false;
		
		System.out.println("O colaborador possui filhos? Responda SIM/NÃO");
		possuiFilho = scan.next();
		
		if(possuiFilho.equalsIgnoreCase("SIM")) {
			System.out.println("Digite quantos filhos o colaborar tem: ");
			qtdeFilho = scan.nextInt();
			
		}
		
		while(contadorFilho<=qtdeFilho){
			
			System.out.printf("Digite a idade do %d em ordem crescente", contadorFilho);
			idadeFilho = scan.nextInt();
			
			
			if(idadeFilho<temporariaFilho) {
				System.out.println("\nDigite as idades em ordem crescente");
				continue;
			}
			
			if(idadeFilho<13) {
				ajudaCusto+=100;
				
				if(idadeFilho== temporariaFilho) {
					if(repetido) {
						ajudaCusto+=20;				
					}
					else {
						
						repetido=true;
						ajudaCusto+=40;
					}
						
				}
				else {
					repetido=false;
				}
			}
			temporariaFilho = idadeFilho;
			contadorFilho++;
			}
	
			
		System.out.printf("\nO colaborador terá direito a uma juda de custo de %.2f", ajudaCusto);
		scan.close();

	}

}
