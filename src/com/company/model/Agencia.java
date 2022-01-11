package com.company.model;

public enum Agencia implements StringValueEnum{

    AGENCIA001("001", "FLORIANOPOLIS"),
    AGENCIA002("002", "SAO JOSE");

    private String idAgencia;
    private String nomeAgencia;

    Agencia(String idAgencia, String nomeAgencia) {
        this.idAgencia = idAgencia;
        this.nomeAgencia = idAgencia + " - " + nomeAgencia;
    }


    @Override
    public String getValue() {
        return this.idAgencia;
    }

    @Override
    public String getDisplayName() {
        return this.nomeAgencia;
    }
}
