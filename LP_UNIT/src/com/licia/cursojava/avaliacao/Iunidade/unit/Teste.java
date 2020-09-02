package com.licia.cursojava.avaliacao.Iunidade.unit;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("a");
		a = scan.nextInt();
		System.out.println("b");
		b = scan.nextInt();
		
		if(a!=b && !(a>b)) {
			System.out.println("verdadeiro");
		}
		else {
			System.out.println("falso");
		}
		scan.close();

	}

}
