package com.licia.cursojava.avaliacaoIIunidade.unit;



		public class Questao1_ModeloB {

			public static void main(String[] args) {
				
				float[] fatura = {150350.50f, 170980.30f, 140341.90f, 158480.50f, 
		                		  167120.10f, 181380.60f, 173875.20f, 153987.50f, 
		                		  175680.80f, 180360.10f, 162450.80f, 157650.40f}; 
				
				float faturamentoPrimeiroTrimestre = 0, faturamentoSegundoTrimestre=0,faturamentoTerceiroTrimestre=0, 
					  faturamentoQuartoTrimestre = 0, faturamentoMedioPrimeiroMesTrimestre = 0,faturamentoMedioSegundoMesTrimestre = 0,
					  faturamentoMedioTerceiroMesTrimestre = 0, maiorFaturamento = -999f,
					  somaPrimeiroMesTrimestre =0, somaSegundoMesTrimestre=0, somaTerceiroMesTrimestre=0;
				
				float [] faturamento = new float[4];
			
				final int NUMERO_MESES_TRIMESTRE = 4;
				
				int maiorFaturamentoTrimeste =0;
				
				
				for (int i = 0; i < fatura.length /4 ; i++) {
					faturamentoPrimeiroTrimestre+= fatura[i];	
				}
				faturamento[0] = faturamentoPrimeiroTrimestre;
				
				for (int i = (fatura.length / 4); i < (fatura.length / 2); i++) {
					faturamentoSegundoTrimestre+= fatura[i];	
				}
				faturamento[1] = faturamentoSegundoTrimestre;
				for (int i = (fatura.length / 2); i < (fatura.length / 2) + 3; i++) {
					faturamentoTerceiroTrimestre+= fatura[i];	
				}
				faturamento[2] = faturamentoTerceiroTrimestre;
				for (int i = (fatura.length / 2) + 3; i < (fatura.length / 2) + 6; i++) {
					faturamentoQuartoTrimestre+= fatura[i];	
				}
				faturamento[3] = faturamentoQuartoTrimestre;
				
				//Encontrando maior faturamento
				
				for (int i = 0; i < faturamento.length; i++) {
					if(faturamento[i] > maiorFaturamento) {
						maiorFaturamento = faturamento[i];
					}	
				}
				for (int i = 0; i < faturamento.length; i++) {
					if(maiorFaturamento == faturamento [i]) {
						maiorFaturamentoTrimeste = i;
					}
					
				}
				switch (maiorFaturamentoTrimeste) {
					case 0:
						System.out.println("Maior faturamento ocorreu no 1º trimestre\n");
						break;
					case 1:
						System.out.println("Maior faturamento ocorreu no 2º trimestre\n");
						break;
					case 2:
						System.out.println("Maior faturamento ocorreu no 3º trimestre\n");
						break;	
					case 3:
						System.out.println("Maior faturamento ocorreu no 4º trimestre\n");
						break;
				}
				
				
				//Encontrando faturamento médio
				
				for (int i = 0; i < fatura.length/4; i++) {
					if(i==0) {
						somaPrimeiroMesTrimestre = fatura[i] +fatura[i+3] +fatura [i+6] +fatura[i+9];
					}
					else if (i==1) {
						somaSegundoMesTrimestre = fatura[i] +fatura[i+3] +fatura [i+6] +fatura[i+9];
					}
					else if(i==2) {
						somaTerceiroMesTrimestre = fatura[i] +fatura[i+3] +fatura [i+6] +fatura[i+9];
					}
					
				}
				
				faturamentoMedioPrimeiroMesTrimestre = somaPrimeiroMesTrimestre / NUMERO_MESES_TRIMESTRE;
				faturamentoMedioSegundoMesTrimestre = somaSegundoMesTrimestre / NUMERO_MESES_TRIMESTRE;
				faturamentoMedioTerceiroMesTrimestre = somaTerceiroMesTrimestre /NUMERO_MESES_TRIMESTRE;
				
				
				System.out.printf("O faturamento do 1º semestre: %.2f\n", faturamentoPrimeiroTrimestre);
				System.out.printf("O faturamento do 2º semestre: %.2f\n",faturamentoSegundoTrimestre);
				System.out.printf("O faturamento do 3º semestre: %.2f\n",faturamentoTerceiroTrimestre);
				System.out.printf("O faturamento do 4º semestre: %.2f\n",faturamentoQuartoTrimestre);
				
			
				System.out.printf("\nO faturamento médio do 1º mês semestre foi: %.3f\n", faturamentoMedioPrimeiroMesTrimestre);
				System.out.printf("O faturamento médio do 2º mês semestre foi: %.3f\n", faturamentoMedioSegundoMesTrimestre);
				System.out.printf("O faturamento médio do 3º mês semestre foi: %.3f\n", faturamentoMedioTerceiroMesTrimestre);
				
			
			
			
			}

}


