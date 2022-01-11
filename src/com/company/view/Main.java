package com.company.view;
import com.company.model.*;

public class Main {

    public static void main(String[] args) {

        //criar menus disponíveis
        MenuGlobal.criaMenu();
        MenuCadastro.criaMenu();
        MenuConsulta.criaMenu();
        MenuOperacao.criaMenu();
        MenuRelatorio.criaMenu();
        //chamar a escolha de opção do menu global para iniciar
        MenuGlobal.escolhaMenu();

    }
}
