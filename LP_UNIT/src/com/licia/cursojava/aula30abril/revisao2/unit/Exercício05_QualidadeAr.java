package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exerc�cio05_QualidadeAr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int indiceQualidadeAr;
		String efeitosQualidadeAr="", classificacaoQualidade="";
		boolean erro=false;
		
		
		do {
		
			System.out.print("Digite o �ndice de qualidade do ar detectado na sua cidade: ");
			indiceQualidadeAr = scan.nextInt();
			if(indiceQualidadeAr <0 ) {
				System.out.println("�ndice inv�lido, digite �ndices maiores que 0.\n");
				erro = true;
			} 
		}
		while(erro==true);
		
		if(indiceQualidadeAr<=50) {
			classificacaoQualidade = "BOA";
			efeitosQualidadeAr = "AUS�NCIA DE SINTOMAS";
		}
		else if(indiceQualidadeAr>50 && indiceQualidadeAr<=100) {
			classificacaoQualidade = "REGULAR";
			efeitosQualidadeAr = "AUS�NCIA DE SINTOMAS";
		}
		else if(indiceQualidadeAr>101 && indiceQualidadeAr<=199) {
			classificacaoQualidade = "INADEQUADA";
			efeitosQualidadeAr = "LEVE AGRAVAMENTO DE PESSOAS SUSCET�VEIS";
		}else if(indiceQualidadeAr>200 && indiceQualidadeAr<=299) {
			classificacaoQualidade = "M�";
			efeitosQualidadeAr = "DECR�SCIMO DA RESIST�NCIA F�SICA E SIGNIFICATIVO AGRAVAMENTO";
		}else if(indiceQualidadeAr>300 && indiceQualidadeAr<=399) {
			classificacaoQualidade = "P�SSIMO";
			efeitosQualidadeAr = "APARECIMENTO PREMATURO DECERTAS DOEN�AS";
		}else if(indiceQualidadeAr>=300) {
			classificacaoQualidade = "CR�TICA";
			efeitosQualidadeAr = "MORTE PREMATURA DE PESSOAS DOENTES E IDOSAS";
		}
		
		System.out.printf("\nA qualidade do ar � classificada em: %s\n", classificacaoQualidade );
		System.out.printf("Os efeitos da qualidade do ar na sa�de foi de: %s", efeitosQualidadeAr );
		
		scan.close();
		
		

	}

}
