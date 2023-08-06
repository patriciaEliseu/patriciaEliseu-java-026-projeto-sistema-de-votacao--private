package com.betrybe.sistemadevotacao;

import java.util.*;
import java.lang.Math;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<String> cpfsComputados;
  private ArrayList<PessoaEleitora> pessoasEleitoras;

  /**
   * class GerenciamentoVotacao.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  public ArrayList<PessoaCandidata> getPessoasCandidatas() {
    return pessoasCandidatas;
  }

  public void setPessoasCandidatas(ArrayList<PessoaCandidata> pessoasCandidatas) {
    this.pessoasCandidatas = pessoasCandidatas;
  }

  public ArrayList<String> getCpfsComputados() {
    return cpfsComputados;
  }


  public ArrayList<PessoaEleitora> getPessoasEleitoras() {
    return pessoasEleitoras;
  }

  public void setPessoasEleitoras(ArrayList<PessoaEleitora> pessoasEleitoras) {
    this.pessoasEleitoras = pessoasEleitoras;
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata peploeCandidata : pessoasCandidatas) {
      if (peploeCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }

    }
    PessoaCandidata newCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(newCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora peploeEleitora : pessoasEleitoras) {
      if (peploeEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }

    }
    PessoaEleitora newEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(newEleitora);
  }


  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.equals(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
          pessoaCandidata.receberVoto();
        }
      }
    }
  }


  public void mostrarResultado() {
    int totalDeVotos = cpfsComputados.size();
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata resultadoCandidato : pessoasCandidatas) {
        int votosRecebidos = resultadoCandidato.getVotos();
        float percentualVotos = (votosRecebidos * 100) / totalDeVotos;
        System.out.println("Nome: " + resultadoCandidato.getNome() + "-"
            + votosRecebidos + "votos ( " + Math.round(percentualVotos) + "% )");
      }
      System.out.println("Total de votos: " + totalDeVotos);
      return;
    }
  }
}
