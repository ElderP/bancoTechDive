package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsulta extends Menu{

    private static ArrayList<MenuConsulta> listaMenuConsulta = new ArrayList<>();
    private static Scanner entradaUsuario = new Scanner(System.in);

    public MenuConsulta(int idOpcaoMenu, String descricaoOpcaoMenu) {
        super(idOpcaoMenu, descricaoOpcaoMenu);
    }

    public static void criaMenu(){

        MenuConsulta menuConsulta1 = new MenuConsulta(1, "Saldo");
        MenuConsulta menuConsulta2 = new MenuConsulta(2, "Extrato");
        MenuConsulta menuConsulta3 = new MenuConsulta(3, "Total Investido");
        MenuConsulta menuConsulta4 = new MenuConsulta(4, "SAIR");

        listaMenuConsulta.add(menuConsulta1);
        listaMenuConsulta.add(menuConsulta2);
        listaMenuConsulta.add(menuConsulta3);
        listaMenuConsulta.add(menuConsulta4);

    }

    public static void apresentaMenu() {
        String entrada = null;
        System.out.println("\n----------------------------------------------------");
        System.out.println("Menu Consulta escolha a opção desejada\n");

        if (listaMenuConsulta.size() > 0) {
            for (int i = 0; i < listaMenuConsulta.size(); i++) {
                System.out.println(listaMenuConsulta.get(i));
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
                        System.out.println("Selecionou "+ listaMenuConsulta.get(opcao-1));
                        entrada = listaMenuConsulta.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 2:
                        System.out.println("Selecionou "+ listaMenuConsulta.get(opcao-1));
                        entrada = listaMenuConsulta.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 3:
                        System.out.println("Selecionou "+ listaMenuConsulta.get(opcao-1));
                        entrada = listaMenuConsulta.get(opcao-1).getDescricaoOpcaoMenu();
                        break;
                    case 4:
                        System.out.println("Selecionou "+ listaMenuConsulta.get(opcao-1));
                        entrada = listaMenuConsulta.get(opcao-1).getDescricaoOpcaoMenu();
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
