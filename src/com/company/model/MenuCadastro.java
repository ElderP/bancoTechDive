package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCadastro extends Menu{

    private static ArrayList<MenuCadastro> listaMenuCadastro = new ArrayList<>();
    private static Scanner entradaUsuario = new Scanner(System.in);

    public MenuCadastro(int idOpcaoMenu, String descricaoOpcaoMenu) {
        super(idOpcaoMenu, descricaoOpcaoMenu);
    }

    public static void criaMenu(){

        MenuCadastro menuCadastro1 = new MenuCadastro(1, "Conta Corrente");
        MenuCadastro menuCadastro2 = new MenuCadastro(2, "Conta Poupança");
        MenuCadastro menuCadastro3 = new MenuCadastro(3, "Conta Investimento");
        MenuCadastro menuCadastro4 = new MenuCadastro(4, "SAIR");

        listaMenuCadastro.add(menuCadastro1);
        listaMenuCadastro.add(menuCadastro2);
        listaMenuCadastro.add(menuCadastro3);
        listaMenuCadastro.add(menuCadastro4);

    }

    public static void apresentaMenu() {
        String entrada = null;
        System.out.println("\n----------------------------------------------------");
        System.out.println("Menu Cadastro escolha a opção desejada\n");

        if (listaMenuCadastro.size() > 0) {
            for (int i = 0; i < listaMenuCadastro.size(); i++) {
                System.out.println(listaMenuCadastro.get(i));
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
                        System.out.println("Selecionou "+ listaMenuCadastro.get(opcao-1));
                        entrada = listaMenuCadastro.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 2:
                        System.out.println("Selecionou "+ listaMenuCadastro.get(opcao-1));
                        entrada = listaMenuCadastro.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 3:
                        System.out.println("Selecionou "+ listaMenuCadastro.get(opcao-1));
                        entrada = listaMenuCadastro.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 4:
                        System.out.println("Selecionou "+ listaMenuCadastro.get(opcao-1));
                        entrada = listaMenuCadastro.get(opcao-1).getDescricaoOpcaoMenu();
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
