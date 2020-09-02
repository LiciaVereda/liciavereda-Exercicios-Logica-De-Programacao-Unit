package com.licia.cursojava.aula15abril.array.unit;

import java.util.Scanner;

public class Exercício10_Compras {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String [] pagamentoCompra = {"E","D","C","E","D","C","C","C","D","E","D","C","D","C","D","E","D","C","D","C"};
		float [] valorVenda = {1500f,300f,175f,273f,985f,50f,17f,45f,74f,3.75f,4.50f,48f,55f,63f,83f,44f,36f,99f,31f,91f};
		int [] parcelaPagamento= {0,0,2,0,0,3,0,1,0,0,0,0,0,6,0,0,0,0,0,10};
		float [] posicaoPagamentoCredito= {0.03f,0.06f,0.09f,0.12f,0.15f,0.18f,0.21f,0.24f,0.27f,0.30f};
		float acumuladorPagamentoEspecie=0, acumuladorPagamentoCredito=0,valorLiquidoDebito=0, valorLiquidoCreditoSemAntecipacao=0, valorLiquidoCreditoComAntecipacao=0, acumuladorTotalAntecipacao=0;
		float descontoTaxaAdministrativaParcelado=0, valorParaCalculoAntecipacao=0, calculoTaxaAntecipacao, acumuladorPagamentoDebito=0, acumuladorTotalDinheiro=0, acumuladorValorLiquidoComAntecipcao=0, acumuladorValorLiquidoSemAntecipcao=0;
		final float taxaAdministrativa = 0.03f;
		
		for (int i = 0; i < pagamentoCompra.length; i++) {
			
			if(pagamentoCompra[i].equalsIgnoreCase("E")  ) {
				acumuladorPagamentoEspecie+= valorVenda[i];
				
			}
			else if((pagamentoCompra[i].equalsIgnoreCase("D"))) {
		
				acumuladorPagamentoDebito+=valorVenda[i];
				
				valorLiquidoDebito+=(valorVenda[i]-valorVenda[i]*taxaAdministrativa);
			}
				
			else{
				
				acumuladorPagamentoCredito+=valorVenda[i];
				valorLiquidoCreditoSemAntecipacao= (valorVenda[i]-(valorVenda[i]*taxaAdministrativa));
				acumuladorValorLiquidoSemAntecipcao+=valorLiquidoCreditoSemAntecipacao;
			}	
			
			if((pagamentoCompra[i].equalsIgnoreCase("C"))) {
				descontoTaxaAdministrativaParcelado=( valorVenda[i]*(1-taxaAdministrativa));
				valorParaCalculoAntecipacao = descontoTaxaAdministrativaParcelado / parcelaPagamento[i];
				
				for (int j = 1; j <= parcelaPagamento[i]; j++) {
					valorLiquidoCreditoComAntecipacao = valorParaCalculoAntecipacao * (1- posicaoPagamentoCredito[j-1]);
					acumuladorValorLiquidoComAntecipcao+=valorLiquidoCreditoComAntecipacao;	
				}
				acumuladorTotalAntecipacao+=acumuladorValorLiquidoComAntecipcao;
								
			}
	}
	
	acumuladorTotalDinheiro = acumuladorPagamentoDebito + acumuladorPagamentoEspecie;
	System.out.printf("O valor das compras feitas em espécie ou a débito foram de %.2f\n ", acumuladorTotalDinheiro);
	System.out.printf("O valor das compras feitas a crédito foram de %.2f\n ", acumuladorPagamentoCredito);
	System.out.println("\nDESAFIO:");
	System.out.printf("O valor líquido do débito %.2f\n",valorLiquidoDebito);
	System.out.printf("O valor líquido do crédito sem antecipação %.2f\n", acumuladorValorLiquidoSemAntecipcao);
	System.out.printf("O valor líquido do crédito com antecipação %.2f ", acumuladorValorLiquidoComAntecipcao);
	scan.close();
}

}

	
