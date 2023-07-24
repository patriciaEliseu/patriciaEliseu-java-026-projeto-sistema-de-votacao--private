package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<String> pessoasCandidatas;
  private ArrayList<String> cpfsComputados;
  private ArrayList<String> pessoasEleitoras;

  public void cadastrarPessoaCandidata(String nome, int numero) {

  }

  public void cadastrarPessoaEleitora(String nome, String cpf) {

  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  public void mostrarResultado() {

  }
}
