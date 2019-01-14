package br.com.Atividades;

import java.util.Scanner;

/**
 * Pedro: (09/01) - A lógica para o cálculo do número par está correta, muito bem!
 *                  Entretanto, o programa não funciona quando o número maior é digitado primeiro.
 *                  Os números pares do intervalo precisam aparecer independentemente da ordem que as entradas sejam recebidas.
 *                  Preste atenção com as mensagens de saída, que estão misturadas com o número do resultado.
 *                  Além disso, a identação do código não está boa
 *        (13/01) - O programa não foi modificado.
 * */
public class Atividade4 {

public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);
 
 System.out.println("Entre com o primeiro numero");
 int num =scan.nextInt();
 
 System.out.println("Entre com o segundo numero");
 int num2 = scan.nextInt();

 while(num<num2) {
  if(num % 2==0 ) {
   System.out.println("Este numero � par"+num);
   
  }
  num++;
 }
 
}

}


