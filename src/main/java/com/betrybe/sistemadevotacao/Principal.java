package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {
  /**
   * class Principal.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanMenu = new Scanner(System.in);
    short optionMenu = 0;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      optionMenu = scanMenu.nextShort();

      if (optionMenu == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomePessoaCandidata = scanMenu.next();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numeroPessoaCandidata = scanMenu.nextInt();

        gerenciamentoVotacao.cadastrarPessoaCandidata(nomePessoaCandidata, numeroPessoaCandidata);
      }
    } while (optionMenu != 2);

    short optionEleitor = 0;
    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      optionEleitor = scanMenu.nextShort();

      if (optionEleitor == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomePessoaEleitora = scanMenu.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitora = scanMenu.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nomePessoaEleitora, cpfPessoaEleitora);
      }
    } while (optionEleitor != 2);

    short optionVotar = 0;
    do {
      System.out.println("Cadastrar voto?");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      optionVotar = scanMenu.nextShort();

      if (optionVotar == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfPessoaEleitora = scanMenu.next();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numeroPessoaCandidata = scanMenu.nextInt();

        gerenciamentoVotacao.votar(cpfPessoaEleitora, numeroPessoaCandidata);
      }
      if (optionVotar == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (optionVotar == 3) {
        gerenciamentoVotacao.mostrarResultado();

      }
    } while (optionVotar != 3);
    scanMenu.close();
  }
}