package com.licia.cursojava.listaexercicio2.unit;

import java.util.Scanner;

public class Exerc�cio02_SegundoTurno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int votosCand1, votosCand2, votosCand3;
		
	
		System.out.print("Digite os votos do primeiro canditado: ");
		votosCand1 = scan.nextInt();
		
		System.out.print("Digite os votos do segundo canditado: ");
		votosCand2 = scan.nextInt();
	
		System.out.print("Digite os votos do terceiro canditado: ");
		votosCand3 = scan.nextInt();
		

		if(votosCand1> votosCand2 + votosCand3) {
			System.out.println("N�o haver� segundo turno. Candidato 1 � o vencedor");
		}
		else if(votosCand2> votosCand1 + votosCand3) {
			System.out.println("N�o haver� segundo turno. Candidato 2 � o vencedor");
		}
		else if(votosCand3> votosCand1 + votosCand2) {
			System.out.println("N�o haver� segundo turno. Candidato 3 � o vencedor");
		}
		else {
			System.out.println("Haver� segundo turno!!");
		}
		
		scan.close();

	}

}
