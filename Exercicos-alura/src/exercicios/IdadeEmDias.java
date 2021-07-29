package exercicios;

import java.util.*;

/*Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em considera��o o ano com 365 dias e o m�s com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(data);
		
		int diaAtual,mesAtual,anoAtual;
		
		diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		mesAtual = cal.get(Calendar.MONTH) + 1;
		anoAtual = cal.get(Calendar.YEAR);
		
		System.out.println("Data atual �:" + diaAtual+"/"+mesAtual+"/"+anoAtual);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que ano voc� nasceu?");
		int ano = sc.nextInt();
		
		System.out.println("Em que m�s voc� nasceu?(Digite o numero do m�s)");
		int mes = sc.nextInt();
		
		System.out.println("Em que dia voc� nasceu?");
		int dia = sc.nextInt();
		
		
		
		int calcDiasIdade = 0;
		
		int idade = anoAtual - ano;
		
		if(mes > mesAtual) {
			
			idade--;
			int calcMes = ((mesAtual-1) * 30) + diaAtual;
			calcDiasIdade = (idade * 365) + calcMes;
			
		}if(mes == mesAtual && dia < diaAtual){
			
			int diaIdade =  diaAtual - dia;
			calcDiasIdade = (idade * 365) + diaIdade;
			
		}if(mes < mesAtual){
			
			int calcMes = ((mesAtual - mes- 1)*30) + diaAtual;
			calcDiasIdade = (idade * 365) + calcMes;
			
		}
		
		
		//int calcMes = ((mesAtual-1) * 30) + diaAtual;
		
		System.out.println("\nVoc� tem "+idade+" anos de idade"
				+ "\ne viveu por aproximadamente " + calcDiasIdade + " dias");
		
		
		
		sc.close();
		
	}
	
}
