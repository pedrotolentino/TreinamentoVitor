package br.com.Atividades;

import java.util.Scanner;

public class Atividade4 {

public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);
 
 System.out.println("Entre com o primeiro numero");
 int num =scan.nextInt();
 
 System.out.println("Entre com o segundo numero");
 int num2 = scan.nextInt();

 while(num<num2) {
  if(num % 2==0 ) {
   System.out.println("Este numero é par"+num);
   

  }
  num++;
 }
 
}

}


