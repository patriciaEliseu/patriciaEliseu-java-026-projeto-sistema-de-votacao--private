package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  public String nome;
  public int numero;
  public int votos;

  @Override
  public String getNome() {
    return nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  int receberVoto() {
    votos += 1;
    return 0;
  }
}
