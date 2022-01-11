package com.company.model;

public class ContaInvestimento extends Conta{

    private double saldoInvestimento;


    public ContaInvestimento(int idConta, String nomeCorrentista, String cpfCorrentista, double rendaCorrentista) {
        super(idConta, nomeCorrentista, cpfCorrentista, rendaCorrentista);
    }

    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(double saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }
}
