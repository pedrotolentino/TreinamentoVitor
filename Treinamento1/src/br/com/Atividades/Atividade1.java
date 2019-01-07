package br.com.Atividades;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 	System.out.println("Digite a primeira nota!");
			double nota1 =scan.nextDouble();
			System.out.println("Digite a segunda nota!");
			double nota2 = scan.nextDouble();
			System.out.println("Digite a terceira nota!");
			double nota3 = scan.nextDouble();
			
			int peso1 = 3;
			int peso2 = 2;
			int peso3 = 5;	
			
			double par1 = nota1 * peso1 ;
			double par2 = nota2 * peso2 ;
			double par3 = nota3 * peso3 ;
			
			double media = (par1+par2+par3)/(peso1+peso2+peso3);
			
			System.out.println("Media Total é : "+media);

		}

	}


