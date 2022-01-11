package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuOperacao extends Menu{

    private static ArrayList<MenuOperacao> listaMenuOperacao = new ArrayList<>();
    private static Scanner entradaUsuario = new Scanner(System.in);

    public MenuOperacao(int idOpcaoMenu, String descricaoOpcaoMenu) {
        super(idOpcaoMenu, descricaoOpcaoMenu);
    }

    public static void criaMenu(){

        MenuOperacao menuOperacao1 = new MenuOperacao(1, "Depósito");
        MenuOperacao menuOperacao2 = new MenuOperacao(2, "Saque");
        MenuOperacao menuOperacao3 = new MenuOperacao(3, "Transferência");
        MenuOperacao menuOperacao4 = new MenuOperacao(4, "SAIR");

        listaMenuOperacao.add(menuOperacao1);
        listaMenuOperacao.add(menuOperacao2);
        listaMenuOperacao.add(menuOperacao3);
        listaMenuOperacao.add(menuOperacao4);

    }

    public static void apresentaMenu() {
        String entrada = null;
        System.out.println("\n----------------------------------------------------");
        System.out.println("Menu Operacao escolha a opção desejada\n");

        if (listaMenuOperacao.size() > 0) {
            for (int i = 0; i < listaMenuOperacao.size(); i++) {
                System.out.println(listaMenuOperacao.get(i));
            }
        } else {
            System.out.println("Menu não disponível !");
            entrada = "SAIR";
        }

    }

    public static void escolhaMenu(){

        apresentaMenu();
        String entrada = entradaUsuario.nextLine();

        while (entrada!=null && !entrada.equals("SAIR")){

            try {
                int opcao = Integer.parseInt(entrada) ;
                switch (opcao){
                    case 1:
                        System.out.println("Selecionou "+ listaMenuOperacao.get(opcao-1));
                        entrada = listaMenuOperacao.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 2:
                        System.out.println("Selecionou "+ listaMenuOperacao.get(opcao-1));
                        entrada = listaMenuOperacao.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 3:
                        System.out.println("Selecionou "+ listaMenuOperacao.get(opcao-1));
                        entrada = listaMenuOperacao.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 4:
                        System.out.println("Selecionou "+ listaMenuOperacao.get(opcao-1));
                        entrada = listaMenuOperacao.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println(e);
                e.printStackTrace();
            }

            if ( !entrada.equals("SAIR") ){
                entrada = entradaUsuario.nextLine();
            }

        }

    }
}
