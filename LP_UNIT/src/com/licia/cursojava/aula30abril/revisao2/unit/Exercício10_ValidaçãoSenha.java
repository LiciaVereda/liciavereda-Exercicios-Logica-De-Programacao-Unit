package com.licia.cursojava.aula30abril.revisao2.unit;

import java.util.Scanner;

public class Exercício10_ValidaçãoSenha {

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in);
		String senhaAtual="", novaSenha="", confirmacaoSenha="";
		boolean senhaCorreta =false;
		char  caractererNovaSenha, caracterTemporario='\u0000';
		int caracterNovaSenha1, valor1, valor2 ,valor3;
		
		
	
		
		System.out.println("Digite a senha atual: ");
		senhaAtual = scan.next();
		
		do {
			
			senhaCorreta=false;
			System.out.println("Digite a nova senha: ");
			novaSenha = scan.next();
			
			if(novaSenha.equals(senhaAtual)) {
				System.out.println("Senha já foi utilizada!!! Redigite");	
				
				continue;
			}
			
			System.out.println("Confirme a nova senha:");
			confirmacaoSenha= scan.next();
			
			if(novaSenha.length()<8 && confirmacaoSenha.length()<8) {
				System.out.println("Digite uma senha com no mínimo 8 caracteres");
				senhaCorreta=true;		
				continue;
			}
			
			if(novaSenha.compareTo(confirmacaoSenha)<0 || novaSenha.compareTo(confirmacaoSenha)>0 ) {
				System.out.println("Confirmação de senha incorreta. Redigite");	
				senhaCorreta=true;
				continue;
			}
			
			
			for (int i = 0; i < novaSenha.length(); i++) {
				
				
				caractererNovaSenha= novaSenha.charAt(i);
				caracterNovaSenha1= caractererNovaSenha; 
				valor1 = novaSenha.charAt(i);
				valor2 = novaSenha.charAt(i+1);
				valor3 = novaSenha.charAt(i+2);
			
			
				if((caracterNovaSenha1<65 || caracterNovaSenha1>90) && (caracterNovaSenha1<97 || caracterNovaSenha1>122) &&
						(caracterNovaSenha1<48 || caracterNovaSenha1>58)) {
					System.out.println("A senha deve ter apenas letras e números");
					senhaCorreta =true;
					break;
					
				}
				
				else if(caracterTemporario == caractererNovaSenha) {
					System.out.println("Não pode ter sequência de caracteres");
					senhaCorreta = true;
					break;
				}
				
			
				if(valor1 == valor2-1 && valor2 == valor3-1 ) {
					System.out.println("Não pode ter caracteres do mesmo tipo em SEQUENCIA");
					senhaCorreta = true;
					break;
						
					}
					
				
				
				caracterTemporario = caractererNovaSenha;			
				continue;
							
				
				}
							
		}while(senhaCorreta);
		
		if(senhaCorreta==false) {
			System.out.println("Senha Alterada com Sucesso");
		}
		scan.close();
					
	}
}

