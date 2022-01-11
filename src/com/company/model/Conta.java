package com.company.model;

public abstract class Conta {

    private int idConta;
    private String nomeCorrentista;
    private String cpfCorrentista;
    private double rendaCorrentista;
    private double saldoAtual;

    public Conta(int idConta, String nomeCorrentista, String cpfCorrentista, double rendaCorrentista) {
        this.idConta = idConta;
        this.nomeCorrentista = nomeCorrentista;
        this.cpfCorrentista = cpfCorrentista;
        this.rendaCorrentista = rendaCorrentista;
    }

    public int getIdConta() {
        return idConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public void setCpfCorrentista(String cpfCorrentista) {
        this.cpfCorrentista = cpfCorrentista;
    }

    public double getRendaCorrentista() {
        return rendaCorrentista;
    }

    public void setRendaCorrentista(double rendaCorrentista) {
        this.rendaCorrentista = rendaCorrentista;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
