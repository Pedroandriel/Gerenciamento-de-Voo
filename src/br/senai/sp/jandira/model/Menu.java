package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
     Scanner scanner = new Scanner(System.in);
    List<Voo> listarVoos =  new ArrayList<>();
    public void executarMenu(){

        VooGol vooGol1 = new VooGol("PE-21310","São Palo", "Minas", "2023-10-20", 600);
        VooGol vooGol2 = new VooGol("PE-02131","Pernanbuco", "Petroina", "2023-01-20", 400);
        VooGol vooGol3 = new VooGol("PE-5440","BH", "Boituva", "2023-07-10", 800);

        VooAzul voo1 = new VooAzul("BP-0033", "São Paulo", "Estads Unidos ","2024-12-05",100);
        VooAzul voo2 = new VooAzul("BP-0034", "São Paulo", "México","2025-10-01",500);
        VooAzul voo3 = new VooAzul("BP-0035", "São Paulo", "Estads Unidos ","2024-12-05",700);

        VooCvc vooCvc1 = new VooCvc("CV-1063","Morumbi", "Colonbia","2026-01-12",200);
        VooCvc vooCvc2 = new VooCvc("CV-1064","São Sebastião", "Grécia","2026-10-12",600);
        VooCvc vooCvc3 = new VooCvc("CV-1065","Morumbi", "Chile","2026-05-01",800);

        listarVoos.add(vooGol1);
        listarVoos.add(vooGol2);
        listarVoos.add(vooGol3);

        listarVoos.add(voo1);
        listarVoos.add(voo2);
        listarVoos.add(voo3);

        listarVoos.add(vooCvc1);
        listarVoos.add(vooCvc2);
        listarVoos.add(vooCvc3);

        boolean continuar =  true;
        while (continuar){
            System.out.println(" Bem Vindo ");
            System.out.println("1- Listar Voo");
            System.out.println("2- Pesquisar Voo");
            System.out.println("3- Sair");
            System.out.println("-------------------");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    listarVoos();
                    break;

                case 2:
                    System.out.println("Informe o Numero do Voo:  ");
                    String numero = scanner.nextLine();
                    pesquisarVoo(numero);
                    break;

                case 3:
                    continuar = false;
                    break;


            }

        }

    }
    public void listarVoos(){
        for (Voo voo : listarVoos){
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getDestino());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDataPartida());
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+");
        }
    }

    public void pesquisarVoo (String numeroVoo){
        for (Voo voo : listarVoos){
            String vooReal = voo.getNumeroVoo();
            if (vooReal.equalsIgnoreCase(numeroVoo)){
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+");
                System.out.println(voo.getNumeroVoo());
                System.out.println(voo.getDestino());
                System.out.println(voo.getOrigem());
                System.out.println(voo.getDataPartida());
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+");

            }
        }
        System.out.println("Voo não encontrado ...:(");
    }
}