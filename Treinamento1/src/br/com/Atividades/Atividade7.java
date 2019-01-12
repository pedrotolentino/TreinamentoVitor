package br.com.Atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano para saber se é bissexto?");
        ano = scan.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println("O de "+ano + " é bissexto!");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println("O de "+ano + " é bissexto!");
        } else{
            System.out.println("O de "+ano + " não é bissexto!");
        }
	}

}
