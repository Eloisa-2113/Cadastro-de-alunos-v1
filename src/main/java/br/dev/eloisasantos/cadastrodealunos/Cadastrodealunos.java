package br.dev.eloisasantos.cadastrodealunos;

import java.util.Scanner;

/**
 *
 * @author sesi2dia
 */
public class Cadastrodealunos {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int n = 1;
       int [] id = new int [n];
       String [] nome = new String [n];
       long [] telefone = new long [n];
       int [] dia_nascimento = new int [n];
       int [] mes_nascimento = new int [n];
       int [] ano_nascimento = new int [n];
       int [] idade = new int [n];
       
       
       //entrada de dados
       
       
       for (int i = 0; i < id.length; i++) {
            
        
            System.out.printf("Insira seu numero de ID ",i);
           id[i]= teclado.nextInt();
           teclado.nextLine();
           
           
           System.out.printf("Insira seu nome " ,i);
           nome[i]= teclado.nextLine();
           
           
           System.out.printf("Insira seu telefone " ,i);
           telefone[i]= teclado.nextLong();
           
           System.out.printf("Insira o dia de seu nascimento" ,i);
           dia_nascimento[i]=teclado.nextInt();
           
           System.out.printf("Insira o mes de seu nascimento");
           mes_nascimento[i]=teclado.nextInt();
           
           System.out.printf("Insira o ano de seu nacimento");
           ano_nascimento[i]=teclado.nextInt();
           
           idade[i]= 2026 - ano_nascimento[i]; 
         
       }
       
       
       
       // saída dos dados
       
        System.out.printf("------------------------------------------------------------ \n");
        System.out.printf("id    | nome           |telefone     |dia | mes | ano   |idade   | \n") ;
        
        for (int i = 0; i < n; i++) {
           String dataNasc = dia_nascimento[i] + "/" + mes_nascimento[i] + "/" + ano_nascimento[i];
    System.out.printf("%-5d | %-15s | %-11d |%-10s       | %-5d\n", 
            id[i], nome[i], telefone[i], dataNasc, idade[i]);
}
System.out.println("------------------------------------------------------------");
       
  }
    }
