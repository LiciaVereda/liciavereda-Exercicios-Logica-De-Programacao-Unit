package com.licia.cursojava.aula15abril.array.unit;

import java.util.Scanner;

/*
 * Escreva um programa que armazene 6 nomes de pessoas em um array.

•Informar o tamanho do maior nome
•Quantos nomes tem a mesma quantidade de letras do maior nome
•Quais os nomes que tem a mesa quantidade de letras do maior nome
VETOR: MARIA JOSE DAVI MARTA ZELIA IVO

 */

public class Exercício7_ArrayNomes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String [] nome = {"MARIA", "JOSE", "DAVI", "MARTA", "ZELIA"," IVO"};
		String maiorNome ="";
		int tamanhoMaiorNome=0, contadorNome=0;
		String acumuladorNome="";
		
		for (int i = 0; i < nome.length; i++) {
			if(nome[i].length()>tamanhoMaiorNome) {
				tamanhoMaiorNome = nome[i].length();
				maiorNome=nome[i];
			}
		}
		
		for (int i = 1; i < nome.length; i++) {
			if(nome[i].length()==tamanhoMaiorNome) {
				contadorNome++;
				acumuladorNome+= " " +  nome[i]  ;
			}		
		}
		
		System.out.printf("O tamanho do maior nome é: %d \n",tamanhoMaiorNome);
		System.out.printf("A quantidade de nomes com a mesma quantidade de letras do maior nome: %d\n",contadorNome);
		System.out.printf("Os nomes com o mesmo número de caracteres do maior nome são: %s", acumuladorNome);
		scan.close();
		
	}

}
