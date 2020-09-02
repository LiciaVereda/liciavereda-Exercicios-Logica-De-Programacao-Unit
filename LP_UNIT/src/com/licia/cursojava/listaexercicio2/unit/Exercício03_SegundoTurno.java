package com.licia.cursojava.listaexercicio2.unit;

import java.util.Scanner;

public class Exercício03_SegundoTurno {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String candidato1, candidato2, candidato3;
		int votosCand1, votosCand2, votosCand3;
		
		
		System.out.print("Digite o nome do primeiro candidato: ");
		candidato1 = scan.next();
		
		System.out.print("Digite os votos do primeiro canditado: ");
		votosCand1 = scan.nextInt();
		
		System.out.print("Digite o nome do segundo candidato: ");
		candidato2 = scan.next();
		
		System.out.print("Digite os votos do segundo canditado: ");
		votosCand2 = scan.nextInt();
		
		System.out.print("Digite o nome do terceiro candidato: ");
		candidato3 = scan.next();
		
		System.out.print("Digite os votos do terceiro canditado: ");
		votosCand3 = scan.nextInt();
		
		if(votosCand1> votosCand3 && votosCand1<(votosCand2 +votosCand3) && votosCand2>votosCand3 &&
								votosCand2<(votosCand1 + votosCand3)) {
			System.out.printf("Haverá segundo turno. Entre os candidados %s e %s ", candidato1,candidato2);
		}
		else if(votosCand1>votosCand2  && votosCand1<(votosCand2 +votosCand3) && votosCand3>votosCand2 &&
				votosCand3<(votosCand1 + votosCand2)) {
			System.out.printf("Haverá segundo turno. Entre os candidados %s e %s", candidato1,candidato3);
		}
		else if(votosCand2>votosCand1 && votosCand2<(votosCand1 +votosCand3) && votosCand3>votosCand1 &&
				votosCand3<(votosCand1 + votosCand2)) {
			System.out.printf("Haverá segundo turno. Entre os candidados %s e %s", candidato2,candidato3);
		}
		
		scan.close();
		

	}

}
