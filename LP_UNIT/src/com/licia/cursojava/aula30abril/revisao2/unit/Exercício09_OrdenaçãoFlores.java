package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício09_OrdenaçãoFlores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String flor1, flor2, flor3, ordemFlores="";
		
		System.out.println("Digite o nome da flor 1");
		flor1 = scan.next();
		
		System.out.println("Digite o nome da flor 2");
		flor2 = scan.next();
		
		System.out.println("Digite o nome da flor3");
		flor3 = scan.next();
		
		if(flor1.compareTo(flor2)<0 && flor1.compareTo(flor3)<0 && flor2.compareTo(flor3)<0) {
			ordemFlores = flor1 + " " + flor2 +" "+ flor3;		
		}else if(flor1.compareTo(flor2)<0 && flor1.compareTo(flor3)<0 && flor3.compareTo(flor2)<0) {
			ordemFlores = flor1 + " " + flor3 +" "+ flor2;	
		}
		
		else if(flor2.compareTo(flor1)<0 && flor2.compareTo(flor3)<0 && flor1.compareTo(flor3)<0) {
			ordemFlores = flor2 + " "+ flor1 + " " + flor3;
		}
		else if(flor2.compareTo(flor1)<0 && flor2.compareTo(flor3)<0 && flor3.compareTo(flor1)<0) {
			ordemFlores = flor2 + " "+ flor3 + " " + flor1;
		}
		else if(flor3.compareTo(flor1)<0 && flor3.compareTo(flor2)<0 && flor2.compareTo(flor1)<0) {
			ordemFlores = flor3 + " "+ flor2 + " " +  flor1;
			
		}
		else if(flor3.compareTo(flor1)<0 && flor3.compareTo(flor2)<0 && flor1.compareTo(flor2)<0)
			ordemFlores = flor3 + " "+ flor1 + " " +  flor2;
		
		System.out.println("A ordem é: " +ordemFlores);
		scan.close();
		

	}

}
