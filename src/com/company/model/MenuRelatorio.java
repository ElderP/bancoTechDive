package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRelatorio extends Menu{

    private static ArrayList<MenuRelatorio> listaMenuRelatorio = new ArrayList<>();
    private static Scanner entradaUsuario = new Scanner(System.in);

    public MenuRelatorio(int idOpcaoMenu, String descricaoOpcaoMenu) {
        super(idOpcaoMenu, descricaoOpcaoMenu);
    }

    public static void criaMenu(){

        MenuRelatorio menuRelatorio1 = new MenuRelatorio(1, "Contas com saldo negativo");
        MenuRelatorio menuRelatorio2 = new MenuRelatorio(2, "Total de investimento");
        MenuRelatorio menuRelatorio3 = new MenuRelatorio(3, "Operacões");
        MenuRelatorio menuRelatorio4 = new MenuRelatorio(4, "SAIR");

        listaMenuRelatorio.add(menuRelatorio1);
        listaMenuRelatorio.add(menuRelatorio2);
        listaMenuRelatorio.add(menuRelatorio3);
        listaMenuRelatorio.add(menuRelatorio4);

    }

    public static void apresentaMenu() {
        String entrada = null;
        System.out.println("\n----------------------------------------------------");
        System.out.println("Menu Relatório escolha a opção desejada\n");

        if (listaMenuRelatorio.size() > 0) {
            for (int i = 0; i < listaMenuRelatorio.size(); i++) {
                System.out.println(listaMenuRelatorio.get(i));
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
                        System.out.println("Selecionou "+ listaMenuRelatorio.get(opcao-1));
                        entrada = listaMenuRelatorio.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 2:
                        System.out.println("Selecionou "+ listaMenuRelatorio.get(opcao-1));
                        entrada = listaMenuRelatorio.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 3:
                        System.out.println("Selecionou "+ listaMenuRelatorio.get(opcao-1));
                        entrada = listaMenuRelatorio.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 4:
                        System.out.println("Selecionou "+ listaMenuRelatorio.get(opcao-1));
                        entrada = listaMenuRelatorio.get(opcao-1).getDescricaoOpcaoMenu();
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
