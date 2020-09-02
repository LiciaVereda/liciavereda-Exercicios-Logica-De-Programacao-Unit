package com.licia.cursojava.listaexercicio2.unit;

import java.util.Scanner;

public class Exercicio04_MediaPonderada1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		final int Peso1 = 4;
		final int Peso2 = 6;
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = scan.nextInt();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = scan.nextInt();
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = scan.nextInt();
		
		if(nota1>nota2 && nota2>nota3 ) {
			media = ((nota1 * Peso1)+(nota2 * Peso2))/10;	
		}
		else if(nota1>nota2 && nota3 > nota2 ) {
			media = ((nota1 * Peso1)+(nota3 * Peso2))/10;
		
		}
		else {
			media = ((nota2 * Peso1)+(nota3 * Peso2))/10;
			
		}
		System.out.printf("A média do aluno é %.2f..", media);
		scan.close();
	}

}
