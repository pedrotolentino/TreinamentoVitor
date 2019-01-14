package br.com.Atividades;

import java.util.Scanner;

/**
 * Pedro: (13/01) - Parabéns! O programa executa exatamente como solicitado! Continue assim!
 * */
public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano para saber se � bissexto?");
        ano = scan.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println("O de "+ano + " � bissexto!");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println("O de "+ano + " � bissexto!");
        } else{
            System.out.println("O de "+ano + " n�o � bissexto!");
        }
	}

}
