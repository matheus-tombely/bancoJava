/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoJava;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author laboratorio
 */
public class conta {

    private String nome;
    private int numero;
    private double saldo;
    private double limite;
    public static List <conta> contas = new ArrayList();

    public conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public conta() {
    }

    public boolean saca(double valor) {
        if (valor > 1000){ 
            System.out.println("Limite diário excedido");
            return false;
        }
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return false;

        }
        
        
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
        

    }
    public boolean deposita (double valor) {
       
            this.saldo = this.saldo + valor;
            return true;
        

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "conta{" + "nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + '}';
    }
    

}
