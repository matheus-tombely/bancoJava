/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoJava;


import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class movConta {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("***CONTAS***");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Movimentar");
            System.out.println("3 - Sair");
            opcao = Integer.parseInt(ler.nextLine());
            if (opcao == 1) {
                cadastrarConta();
            }
            if (opcao == 2) {
                int num;
                double valor;
                System.out.println("\nMOVIMENTAÇÃO");
                System.out.println("Número da conta: ");
                num = Integer.parseInt(ler.nextLine());
                if (conta.contas.isEmpty()) {
                    System.out.println("Sem contas cadastradas!");
                } else {

                    for (conta checador : conta.contas) {
                        if (checador.getNumero() == num) {
                            System.out.println("Digite valor a sacar: ");
                            valor = Double.parseDouble(ler.nextLine());
                            if (checador.saca(valor)) {
                                System.out.println("Saque autorizado");
                                System.out.println("Saldo atual: R$" + checador.getSaldo());
                            } else {
                                System.out.println("Saldo insuficiente");
                            }
                        }
                    }

                }

            }
        } while (opcao != 3);
    }

    public static void cadastrarConta() {
        conta nova = new conta();
        System.out.println("Digite o nome:");
        nova.setNome(ler.nextLine());
        System.out.println("Digite o número:");
        nova.setNumero(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o saldo:");
        nova.setSaldo(Double.parseDouble(ler.nextLine()));
        System.out.println("Conta criada!");
        conta.contas.add(nova);
    }

}
