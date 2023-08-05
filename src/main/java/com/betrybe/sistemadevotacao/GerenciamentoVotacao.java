package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<String> cpfsComputados;
  private ArrayList<PessoaEleitora> pessoasEleitoras;

  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pCandidata : pessoasCandidatas) {
      if (pCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }

    }
    PessoaCandidata newCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(newCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pEleitora : pessoasEleitoras) {
      if (pEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }

    }
    PessoaEleitora newEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(newEleitora);
  }


  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }


  public void mostrarResultado() {

  }
}
