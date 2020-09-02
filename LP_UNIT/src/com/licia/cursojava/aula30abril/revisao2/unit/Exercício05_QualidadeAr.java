package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício05_QualidadeAr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int indiceQualidadeAr;
		String efeitosQualidadeAr="", classificacaoQualidade="";
		boolean erro=false;
		
		
		do {
		
			System.out.print("Digite o índice de qualidade do ar detectado na sua cidade: ");
			indiceQualidadeAr = scan.nextInt();
			if(indiceQualidadeAr <0 ) {
				System.out.println("Índice inválido, digite índices maiores que 0.\n");
				erro = true;
			} 
		}
		while(erro==true);
		
		if(indiceQualidadeAr<=50) {
			classificacaoQualidade = "BOA";
			efeitosQualidadeAr = "AUSÊNCIA DE SINTOMAS";
		}
		else if(indiceQualidadeAr>50 && indiceQualidadeAr<=100) {
			classificacaoQualidade = "REGULAR";
			efeitosQualidadeAr = "AUSÊNCIA DE SINTOMAS";
		}
		else if(indiceQualidadeAr>101 && indiceQualidadeAr<=199) {
			classificacaoQualidade = "INADEQUADA";
			efeitosQualidadeAr = "LEVE AGRAVAMENTO DE PESSOAS SUSCETÍVEIS";
		}else if(indiceQualidadeAr>200 && indiceQualidadeAr<=299) {
			classificacaoQualidade = "MÁ";
			efeitosQualidadeAr = "DECRÉSCIMO DA RESISTÊNCIA FÍSICA E SIGNIFICATIVO AGRAVAMENTO";
		}else if(indiceQualidadeAr>300 && indiceQualidadeAr<=399) {
			classificacaoQualidade = "PÉSSIMO";
			efeitosQualidadeAr = "APARECIMENTO PREMATURO DECERTAS DOENÇAS";
		}else if(indiceQualidadeAr>=300) {
			classificacaoQualidade = "CRÍTICA";
			efeitosQualidadeAr = "MORTE PREMATURA DE PESSOAS DOENTES E IDOSAS";
		}
		
		System.out.printf("\nA qualidade do ar é classificada em: %s\n", classificacaoQualidade );
		System.out.printf("Os efeitos da qualidade do ar na saúde foi de: %s", efeitosQualidadeAr );
		
		scan.close();
		
		

	}

}
