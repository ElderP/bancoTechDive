package com.company.model;

public abstract class Menu {

    private int idOpcaoMenu;
    private String descricaoOpcaoMenu;

    public Menu(int idOpcaoMenu, String descricaoOpcaoMenu) {
        this.idOpcaoMenu = idOpcaoMenu;
        this.descricaoOpcaoMenu = descricaoOpcaoMenu;
    }

    public Menu() {

    }

    public int getIdOpcaoMenu() {
        return idOpcaoMenu;
    }

    public void setIdOpcaoMenu(int idOpcaoMenu) {
        this.idOpcaoMenu = idOpcaoMenu;
    }

    public String getDescricaoOpcaoMenu() {
        return descricaoOpcaoMenu;
    }

    public void setDescricaoOpcaoMenu(String descricaoOpcaoMenu) {
        this.descricaoOpcaoMenu = descricaoOpcaoMenu;
    }

    @Override
    public String toString() {
        return "Opção => " + this.getIdOpcaoMenu() + " - " + this.getDescricaoOpcaoMenu() ;
    }
}
