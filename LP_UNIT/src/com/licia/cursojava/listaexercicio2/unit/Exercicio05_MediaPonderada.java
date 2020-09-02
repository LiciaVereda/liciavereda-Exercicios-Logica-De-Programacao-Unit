package com.licia.cursojava.listaexercicio2.unit;

import java.util.Scanner;

public class Exercicio05_MediaPonderada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float nota1, nota2, nota3,maiorNota=0, segundaMaiorNota=0, media;
		
		final int Peso1 = 4;
		final int Peso2 = 6;
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = scan.nextInt();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = scan.nextInt();
		
		System.out.println("Digite a terceira nota do aluni: ");
		nota3 = scan.nextInt();
		
		if(nota1>nota2 && nota2>nota3 ) {
			maiorNota = nota1;
			segundaMaiorNota = nota2;		
		}
		else if(nota1>nota2 && nota3 > nota2 && nota1> nota3) {
			maiorNota = nota1;
			segundaMaiorNota = nota3;
		}
		else if(nota2>nota1 && nota1>nota3) {
			maiorNota = nota2;
			segundaMaiorNota = nota1;
		}
		else if(nota2>nota3 && nota3>nota1 && nota2>nota3) {
			maiorNota = nota2;
			segundaMaiorNota = nota3;
		}
		else if(nota3>nota1 && nota3>nota2 && nota1>nota2) {
			maiorNota = nota3;
			segundaMaiorNota = nota1;
		}
		else if(nota3>nota2 && nota3>nota1 && nota2>nota1) {
			maiorNota = nota3;
			segundaMaiorNota = nota2;
		}
		
		media = ((maiorNota * Peso1) + (segundaMaiorNota * Peso2))/10;	
		System.out.printf("A média do aluno foi %.2f.",media);
		
		scan.close();
	}
	
}
