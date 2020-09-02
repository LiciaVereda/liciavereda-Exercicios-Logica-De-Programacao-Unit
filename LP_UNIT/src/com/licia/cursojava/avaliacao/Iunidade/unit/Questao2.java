package com.licia.cursojava.avaliacao.Iunidade.unit;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float valorItem, valorTotal=0, descontoAplicado;
		int qtdePecas=0, qtdeItem =0;
		String tipoItem = "", adicionarItens;
		final float descontoPeca = 0.1f;
		final float descontoServico = 0.2f;
		
		do {
			
			try {
			System.out.print("Digite o valor do item: ");
			valorItem = scan.nextFloat();
			}
			catch (Exception e) {
				System.out.println("Digite apenas números para o valor do Item");
				scan.next();
				continue;
			}
			
			System.out.println("Digite o tipo do item: ");
			tipoItem = scan.next();
			
			if(tipoItem.equalsIgnoreCase("P")) {
				descontoAplicado = descontoPeca;
				qtdePecas++;
			}
			else {
				descontoAplicado = descontoServico;
			}
			
			valorTotal+= valorItem * (1- descontoAplicado);
			
			if(valorTotal>1000) {
				System.out.println("Valor do Item ultrapassa o valor total permitido de 1000");
				valorTotal-= valorItem * (1- descontoAplicado);
				if(tipoItem.equalsIgnoreCase("p")) {
					qtdePecas--;	
				}
				if(qtdeItem<6) {
					System.out.println("Deseja continuar adicionando itens?");
					adicionarItens = scan.next();
					if(adicionarItens.equalsIgnoreCase("sim")) {
						continue;
					}
					else {
						break;
					}				
				
			  }
			}
			
			qtdeItem++;
			
		}
		while(valorTotal<=1000.00 && qtdeItem<=6);
		
		System.out.printf("A quantidade de peças é de %d unidade(s)\n", qtdePecas);
		System.out.printf("O valor total dos itens informados é de %.2f", valorTotal);
		scan.close();
		
	}	

}
