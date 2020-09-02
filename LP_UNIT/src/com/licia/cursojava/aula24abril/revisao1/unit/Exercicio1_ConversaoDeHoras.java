package com.licia.cursojava.aula24abril.revisao1.unit;

import java.util.Scanner;

public class Exercicio1_ConversaoDeHoras {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		
		int hora, horaMinutos, horaSegundo;
		
		System.out.println("Digite uma hora:");
		hora = scan.nextInt();
		final int CONVERSAO_MINUTOS = 60;
		final int CONVERSAO_SEGUNDOS = 3600;
		
		horaMinutos = hora * CONVERSAO_MINUTOS;
		horaSegundo = hora * CONVERSAO_SEGUNDOS;
		
		System.out.printf("A hora em minutos é %d\n",horaMinutos);
		System.out.printf("A hora em minutos é %d",horaSegundo);
	}
}
