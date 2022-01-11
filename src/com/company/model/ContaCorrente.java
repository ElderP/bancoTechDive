package com.company.model;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(int idConta, String nomeCorrentista, String cpfCorrentista, double rendaCorrentista, double limite) {
        super(idConta, nomeCorrentista, cpfCorrentista, rendaCorrentista);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = this.getRendaCorrentista()*0.2;
        //definido limite de 20% sob renda atual
    }
}
