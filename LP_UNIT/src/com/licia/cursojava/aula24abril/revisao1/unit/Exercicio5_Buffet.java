package com.licia.cursojava.aula24abril.revisao1.unit;


import java.util.Scanner;

public class Exercicio5_Buffet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final float TAXA_DESLOCAMENTO = 3.0f;
		float valorConvidado, valorEvento, qtdeConvidado, kmDeslocamento;
		
		System.out.print("Digite a quantidade de convidados: ");
		qtdeConvidado = scan.nextFloat();
		
		System.out.print("Digite o valor cobrado por convidado: ");
		valorConvidado = scan.nextFloat();
		
		System.out.print("Digite quantos KM são percorridos até o evento: ");
		kmDeslocamento = scan.nextFloat();
		
		valorEvento = (qtdeConvidado * valorConvidado) + (kmDeslocamento * TAXA_DESLOCAMENTO);
		
		System.out.printf("O buffet deve cobra %.2f para a realização do evento", valorEvento);
		scan.close();
		
	}

}
