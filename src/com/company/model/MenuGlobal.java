package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuGlobal extends Menu {

    private static ArrayList<MenuGlobal> listaMenuGlobal = new ArrayList<>();
    private static Scanner entradaUsuario = new Scanner(System.in);

    public MenuGlobal(int idOpcaoMenu, String descricaoOpcaoMenu) {
        super(idOpcaoMenu, descricaoOpcaoMenu);
    }

    public static void criaMenu(){

        MenuGlobal menuGlobal1 = new MenuGlobal(1, "Cadastros");
        MenuGlobal menuGlobal2 = new MenuGlobal(2, "Consultas");
        MenuGlobal menuGlobal3 = new MenuGlobal(3, "Operacoes");
        MenuGlobal menuGlobal4 = new MenuGlobal(4, "Relatorios");
        MenuGlobal menuGlobal5 = new MenuGlobal(5, "SAIR");

        listaMenuGlobal.add(menuGlobal1);
        listaMenuGlobal.add(menuGlobal2);
        listaMenuGlobal.add(menuGlobal3);
        listaMenuGlobal.add(menuGlobal4);
        listaMenuGlobal.add(menuGlobal5);

   }

    public static void apresentaMenu() {
        String entrada = null;
        System.out.println("\n----------------------------------------------------");
        System.out.println("Menu Inicial banco TechDive escolha a opção desejada\n");

        if (listaMenuGlobal.size() > 0) {
            for (int i = 0; i < listaMenuGlobal.size(); i++) {
                System.out.println(listaMenuGlobal.get(i));
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
                        System.out.println("Selecionou "+ listaMenuGlobal.get(opcao-1));
                        MenuCadastro.escolhaMenu();
                        entrada = listaMenuGlobal.get(opcao-1).getDescricaoOpcaoMenu();
                        apresentaMenu();
                        break;
                    case 2:
                        System.out.println("Selecionou "+ listaMenuGlobal.get(opcao-1));
                        MenuConsulta.escolhaMenu();
                        entrada = listaMenuGlobal.get(opcao-1).getDescricaoOpcaoMenu();
                        apresentaMenu();
                        break;
                    case 3:
                        System.out.println("Selecionou "+ listaMenuGlobal.get(opcao-1));
                        MenuOperacao.escolhaMenu();
                        entrada = listaMenuGlobal.get(opcao-1).getDescricaoOpcaoMenu();
                        apresentaMenu();
                        break;
                    case 4:
                        System.out.println("Selecionou "+ listaMenuGlobal.get(opcao-1));
                        MenuRelatorio.apresentaMenu();
                        entrada = listaMenuGlobal.get(opcao-1).getDescricaoOpcaoMenu();
                        apresentaMenu();
                        break;
                    case 5:
                        System.out.println("Selecionou "+ listaMenuGlobal.get(opcao-1));
                        entrada = listaMenuGlobal.get(opcao-1).getDescricaoOpcaoMenu();
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
