package br.com.Atividades;

/**
 * Pedro: (13/01) - O programa ainda mostra a soma enquanto esta é menor que 100, mas o loop ainda é executado.
 *                  Procure uma maneira de terminar o loop quando o valor pedido para a soma for atingido.
 * */
public class Atividade8 {

	public static void main(String[] args) {

		int soma = 0;
		
		for (int num=0; num <=99;) {
			num++;
			
			soma+=num;
			
			if (soma <=100) {
				System.out.println("numero � "+soma);
				
			}
			
			System.out.println("numero :"+num);
			
		}
		
	}

}





///Exerc�cio do dia: Fa�a um programa que, come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j�
//impressos for menor que 100
