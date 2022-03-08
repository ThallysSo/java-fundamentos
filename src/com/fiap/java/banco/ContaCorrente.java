package com.fiap.java.banco;

public class ContaCorrente extends Conta{

    private String tipo;
    private double chequeEspecial;

    public ContaCorrente(int numero, String tipo) {
        super(numero);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial + getSaldo();
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void retirar(double valor) {
        valor += 10;
        super.retirar(valor);
    }
}
