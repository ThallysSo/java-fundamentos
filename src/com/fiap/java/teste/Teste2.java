package com.fiap.java.teste;

import com.fiap.java.banco.Conta;
import com.fiap.java.banco.ContaCorrente;

public class Teste2 {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente(123, "Conta corrente");

        System.out.println(cc);
    }
}
