/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoJava;

import static BancoJava.movConta.ler;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author laboratorio
 */
public class banco {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("***CONTAS***");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Movimentar");
            System.out.println("3 - Listar Contas");
            System.out.println("4 - Sair");
            opcao = Integer.parseInt(ler.nextLine());
            if (opcao == 1) {
                cadastrarConta();
            }
            if (opcao == 2) {
                movimenta();

            }
            if (opcao==3) {
                listar(conta.contas);
                
            }
        } while (opcao != 4);
    }

    public static void cadastrarConta() {
        conta nova = new conta();
        System.out.print("Digite o nome:");
        nova.setNome(ler.nextLine());
        int numConta = 0;
        Random numero = new Random();
        numConta = 1 + numero.nextInt(9999);
        nova.setNumero(numConta);
        System.out.print("O número da conta é: " + nova.getNumero());
        System.out.print("\nDigite o saldo inicial:");
        nova.setSaldo(Double.parseDouble(ler.nextLine()));
        System.out.println("CONTA CRIADA");
        System.out.println("Usuário: " + nova.getNome());
        System.out.println("Conta: " + nova.getNumero());
        System.out.println("Saldo: " + nova.getSaldo());
        conta.contas.add(nova);

    }

    public static void movimenta() {
        int num;
        double valor;
        System.out.println("\nMOVIMENTAÇÃO");
        System.out.print("Número da conta: ");

        num = Integer.parseInt(ler.nextLine());
        if (conta.contas.isEmpty()) {
            System.out.println("Sem contas cadastradas!");
        } else {

            for (conta checador : conta.contas) {
                if (checador.getNumero() == num) {
                    int opcao = 0;
                    System.out.println("Opções de movimentação");
                    System.out.println("1 - Sacar");
                    System.out.println("2 - Depositar");
                    System.out.println("3 - Saldo");
                    System.out.println("4 - Sair");
                    opcao = Integer.parseInt(ler.nextLine());
                    if (opcao == 1) {

                        System.out.println("SAQUE");
                        System.out.println("Digite valor a sacar: ");

                        valor = Double.parseDouble(ler.nextLine());
                        if (checador.saca(valor)) {
                            System.out.println("Saque autorizado");
                            System.out.println("Saldo atual: R$" + checador.getSaldo());
                        }
                    }
                    if (opcao == 2) {
                        System.out.println("DEPÓSITO");
                        System.out.println("Digite valor a depositar: ");
                        valor = Double.parseDouble(ler.nextLine());
                        if (checador.deposita(valor)) {
                            System.out.println("Depósito autorizado");
                            System.out.println("Saldo atual: R$" + checador.getSaldo());

                        }
                    }
                    if (opcao == 3) {
                        System.out.println("SALDO");
                        System.out.println("R$" + checador.getSaldo());

                    }
                    while(opcao!=4){
                        
                    }

                } else {
                    System.out.println("Número inválido");

                }

            }

        }

    }
    public static void listar(List<conta> contas){
        
    for (conta conta : contas){
        System.out.println(conta.toString());
    }
    }
   

}
