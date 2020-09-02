package com.licia.cursojava.aula29abril.switchcase.unit;

import java.util.Scanner;

public class Exercício5_SwitchData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String data, parteDia, parteMes, parteAno, nomeMes="";
		boolean mesErrado = true;
		
		
		
		do {
			
			System.out.println("Digite uma data no formato DD/MM/AAAA");
			data = scan.next();
			
			parteDia = data.substring(0, 2);
			parteMes = data.substring(3, 5);
			parteAno = data.substring(6, 10);
			
			if(data.length()!=10 ) //|| !data.equals("01") || !data.equals("02") || !data.equals("03") || !data.equals("04") || !data.equals("05") ||
					//!data.equals("06") || !data.equals("07") || !data.equals("08") || !data.equals("09") || !data.equals("10") || !data.equals("11") || !data.equals("12"));
			 {
				System.out.println("DATA INVÁLIDA");
				continue;
			}			
		} while(data.length()!=10); //!data.equals("01") || !data.equals("02") || !data.equals("03") || !data.equals("04") || !data.equals("05") ||
				//!data.equals("06") || !data.equals("07") || !data.equals("08") || !data.equals("09") || !data.equals("10") || !data.equals("11") || !data.equals("12"));
		
		
		
		switch( parteMes ) {
        
	        case "01": nomeMes = "JANEIRO";  
	        break;
	        case "02": nomeMes = "FEVEREIRO"; 
	        break;
	        case "03": nomeMes = "MARÇO";  
	        break;
	        case "04": nomeMes = "ABRIL"; 
	        break;
	        case "05": nomeMes = "MAIO";
	        break;
	        case "06": nomeMes = "JUNHO";
	        break;
	        case "07": nomeMes = "JULHO";
	        break;
	        case "08": nomeMes = "AGOSTO";
	        break;
	        case "09": nomeMes = "SETEMBRO";
	        break;
	        case "10": nomeMes = "OUTUBRO";
	        break;
	        case "11": nomeMes = "NOVEMBRO";
	        break;
	        case "12": nomeMes = "DEZEMBRO";
	        break;
	        default:
	        	mesErrado=false;
	        	System.out.println("MÊS INVÁLIDO");     
    }
		
	if(mesErrado) {
		System.out.printf("A data digitada foi: %s de %s de %s.", parteDia, nomeMes, parteAno );
	}
		
    scan.close();

	}

}
