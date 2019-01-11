package br.com.Atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o dia!");
		int dia = scan.nextInt();
		
		System.out.println("Entre com o mes!");
		int mes = scan.nextInt();
		
		System.out.println("Entre com o ano!");
		int ano = scan.nextInt();
		
//Abaixo if usado criando uma condição para cada mês onde entra na condição dos meses que terminam no dia 31
//e os meses que terminam no dia 30 e o unico mes que termina no dia 28		
		if(dia<=31 && mes==1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10 && mes==12 && ano<=2019) {
			System.out.println("A data é valida: "+dia+"/"+mes+"/"+ano);
			
		}else if(dia<=28 && mes==2 && ano<=2019) {
			System.out.println("A data é valida: "+dia+"/"+mes+"/"+ano);
		
		}else if(dia<=30 && mes==4 && mes==6 && mes==9 && mes==11 && ano<=2019) {
			System.out.println("A data é valida: "+dia+"/"+mes+"/"+ano);
		
		}else {
			System.out.println("Data invalida!");
		}
			
		
		
	}

}
