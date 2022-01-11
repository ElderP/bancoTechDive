package com.company.model;

public class ContaPoupanca extends Conta{

    private double rendimento;

    public ContaPoupanca(int idConta, String nomeCorrentista, String cpfCorrentista, double rendaCorrentista, double rendimento) {
        super(idConta, nomeCorrentista, cpfCorrentista, rendaCorrentista);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

}
