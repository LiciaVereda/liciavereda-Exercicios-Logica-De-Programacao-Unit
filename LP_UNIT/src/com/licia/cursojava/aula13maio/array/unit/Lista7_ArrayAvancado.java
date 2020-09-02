package com.licia.cursojava.aula13maio.array.unit;

public class Lista7_ArrayAvancado {

	public static void main(String[] args) {
		int [] numeros = {100, 852, 16, 72,  7800,1499, 72, 380, 16, 72};
		String [] numerosConvertidos = new String[10];
		int cont1=0;
		
		System.out.println("Questão 3.1 - Os números que começam com 1: ");
		
		
		for(int i = 0; i< numeros.length; i++) {
		 numerosConvertidos[i] = Integer.toString(numeros[i]);		
		}
		
		for(int i=0; i< numerosConvertidos.length; i++) {
			if(numerosConvertidos[i].substring(0, 1).equals("1")) {
				System.out.print(numerosConvertidos[i]+" ");
				
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Questão 3.2 - Números intercalados na ordem inversa:");
		int acumulador1=0, acumulador2=0, cont=0;
		
	
		for (int k = 0; k < numeros.length/2 ; k++) {
			
				System.out.print("- " + numeros[k] + " " + numeros[numeros.length-1-k] );
			
		}
		for (int k = 0; k < numeros.length/2 ; k++) {
			
				System.out.print("- " + numeros[numeros.length-1-k] + " " + numeros[k] );
			
		}
	
		
		System.out.println();
		System.out.println();
		
		System.out.println("Questão 3.3- Os 5 primeiros elementos, intercalados com o 5 útimos elementos: ");
		
		for (int k = 0, j=(numeros.length)/2 ; k < (numeros.length)/2 ; k++, j++) {
			System.out.print("- " + numeros[k] + " " + numeros[j]+ "-");	
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Questão 3.4 - Quantidade repetida de números:");
		
		for(int i=0; i<numerosConvertidos.length-1; i++) {
			if(!numerosConvertidos[i].equals("X")) {
				for (int j = i+1; j < numerosConvertidos.length; j++) {
					if(numerosConvertidos[j].equalsIgnoreCase(numerosConvertidos[i])) {
						cont1++;
						numerosConvertidos[j] = "X";
					}		
				}
				
			}
			if(cont1!=0) {
				System.out.println("-" + numeros[i] + " " + (cont1+1) + " vez(es)" );
			}
			
			cont1 =0;
		}
		
		System.out.println();
		System.out.println("QUESTÃO 3.5");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(i + "|");
			
			if(i == 0) {
				System.out.print("-> " + numeros[i+1]+ "\n");
				continue;
			}
			
			else if(i >0 && i < numeros.length-1) {
				System.out.println("" + numeros[i-1] + " | " + numeros[i+1]);
				continue;
			}
			else if (i == numeros.length-1) {
				System.out.println(numeros[i-1] + " " +  "<-");
			}
		}	
		
	}

}
