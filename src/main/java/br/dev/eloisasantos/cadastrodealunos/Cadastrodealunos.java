package br.dev.eloisasantos.cadastrodealunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sesi2dia
 */
public class Cadastrodealunos {

    
    public static final int MAX = 1;
    
    public static void main2(String[] args) {
      Aluno a1 = new Aluno();
      a1.id = 100;
      a1.nome = "Elo";
      a1.telefone = 129123412;
      a1.dia = 21;
      a1.mes = 01;
      a1.ano = 2010;
      
        System.out.printf(a1.toString());
        
        Aluno a2 = new Aluno (110, "Felipe", 123,30,12, 1998 );
        System.out.println(a2.toString());
      }
 
    
    
    public static void main(String[] args) {
        
         //Aluno[] lista aluno = new Aluno{MAX];
        
        //Aluno[] listaAluno = new Aluno[MAX];
        
       
        List<Aluno> listaAluno = new ArrayList<>();
        
        
       Scanner teclado = new Scanner (System.in);
       
       
       //entrada de dados
       
       
       do{
           
           
           Aluno novoaluno = new Aluno();
           
            
        
            System.out.printf("Insira seu numero de ID ");
           novoaluno.id= teclado.nextInt();
           teclado.nextLine();
           
           if(novoaluno.id == 0){
               break;
           }
           
           
           System.out.printf("Insira seu nome " );
           novoaluno.nome= teclado.nextLine();
           
           
           System.out.printf("Insira seu telefone ");
           novoaluno.telefone= teclado.nextLong();
           
           System.out.printf("Insira o dia de seu nascimento" );
           novoaluno.dia=teclado.nextInt();
           
           System.out.printf("Insira o mes de seu nascimento");
           novoaluno.mes=teclado.nextInt();
           
           System.out.printf("Insira o ano de seu nacimento");
           novoaluno.ano=teclado.nextInt();
           
           listaAluno.add(novoaluno);
           
         
       } while (true);
       
       
       
       // saída dos dados
       
        System.out.printf("+-----------------------------------------------------------------+\n");
        System.out.printf("|id    | nome           |telefone     |dia | mes | ano   |idade   |\n") ;
        System.out.printf("+-----------------------------------------------------------------+\n");
        for (Aluno meuAluno : listaAluno) {
            System.out.println(meuAluno.toString());
           
}

       
  }
    }
