package br.dev.eloisasantos.cadastrodealunos;

/**
 * Define os dados para o objeto aluno
 * @author eloisa
 */
public class Aluno {
    int id;
    String nome;
    long telefone;
    int dia;
    int mes;
    int ano;

    public Aluno() {
        System.out.println("Passei pelo construtor");
    }

    public Aluno(int id, String nome, long telefone, int dia, int mes, int ano) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    
    
    public int calculaIdade() {
        
        int idade = 2026 - this.ano;
        return idade;
    }

    @Override
    public String toString() {
        return String.format("  %d     %s              %d       %d     %d     %d      %d\n",
      this.id,
      this.nome,
      this.telefone,
      this.dia,
      this.mes,
      this.ano,
      this.calculaIdade()  );
    }
    
     
    
}
