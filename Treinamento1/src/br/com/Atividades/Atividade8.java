package br.com.Atividades;

public class Atividade8 {

	public static void main(String[] args) {

		int soma = 0;
		
		for (int num=0; num <=99;) {
			num++;
			
			soma+=num;
			
			if (soma <=100) {
				System.out.println("numero é "+soma);
				
			}
			
			System.out.println("numero :"+num);
			
		}
		
	}

}





///Exercício do dia: Faça um programa que, começando em 0, imprima os números seguintes, enquanto a soma dos números já
//impressos for menor que 100
