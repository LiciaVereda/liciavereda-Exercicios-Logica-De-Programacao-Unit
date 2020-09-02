package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício04_RH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomeCandidato;
		char sexoCandidato, sexoCandidatoAlterado;
		int idadeCandidato;
		 //sexoCandidato;
		
		System.out.print("Digite o nome do candidato:");
		nomeCandidato = scan.next();
		
		System.out.print("Digite a idade do candidato:");
		idadeCandidato= scan.nextInt();
		
		System.out.print("Digite o sexo do candidato:");
		sexoCandidato = scan.next().charAt(0);
		
		
		
		if((idadeCandidato >=60 || idadeCandidato <7) && Character.toUpperCase(sexoCandidato) == 'F') {
			System.out.printf("Candidata: %s\n",nomeCandidato);
			System.out.println("Selecionado para teste");			
		}
		else {
			System.out.printf("Candidato(a): %s\n", nomeCandidato);
			System.out.println("Não tem papel disponível no momento");
		}
		scan.close();
		
		
		
	}

}
