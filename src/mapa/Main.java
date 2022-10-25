/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Robson
 */
public class Main {

    /**
     * @param args the command line arguments
     */

        
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        int idEvento;
        
        Scanner sc = new Scanner(System.in);
        List<Evento> listaEv = new ArrayList<>();
        
        do{
        System.out.println();
        System.out.println("Escolha uma opção \n1 Cadastrar Eventos \n2 Exibir Eventos \n3 Comprar ingressos \n4 Exibir lista de ingressos do evento \n5 Mostrar a quantidade de ingressos vendidos de um evento \n0 Sair");
        opcao = sc.nextInt(); 
            switch(opcao){
                case 1:
                    idEvento = listaEv.size();
                    sc.nextLine();
                    System.out.print("Digite o nome do evento: ");
                    String nome = sc.nextLine();
                    System.out.print("\nDigite a capacidade do evento: ");
                    int capacidade = sc.nextInt();
                    System.out.print("\nDigite a data do evento: ");
                    sc.nextLine();
                    String data = sc.nextLine();
                    System.out.print("\nDigite o valor do evento: ");
                    double valor = sc.nextDouble();
                    Evento ev = new Evento(idEvento, nome, data, capacidade, valor);
                    listaEv.add(ev);
                    System.out.println();
                    System.out.println("Evento Cadastrado!");
                    System.out.println();
                break;
                case 2:
                    for(Evento evento : listaEv){
                        System.out.println();
                        evento.mostrarEvento();
                        System.out.println();
                    }
                break;
                case 3:
                    System.out.println("Digite o id do evento: ");
                    idEvento = sc.nextInt();
                    try{
                        validarId(idEvento, listaEv);
                        if(listaEv.get(idEvento).getCapacidade()> listaEv.get(idEvento).getNumIng()){
                            System.out.print("\nDigite o nome do comprador do ingresso: ");
                            sc.nextLine();
                            String nomeing = sc.nextLine();
                            System.out.print("\nDigite o cpf do comprador do ingresso: ");
                            String cpf = sc.nextLine();
                            System.out.println("\nEscolha o setor do ingresso: \n1 = Ingresso pista \n2 = Ingresso VIP \n3 = Ingresso camarote");
                            int tipo = sc.nextInt();
                            System.out.println();
                            switch(tipo){
                                case 1:
                                    IngressoPista ingpista = new IngressoPista(nomeing, cpf, tipo, listaEv.get(idEvento));
                                    listaEv.get(idEvento).venderIngresso(ingpista);
                                    ingpista.calcularValor(listaEv.get(idEvento).getValor());
                                    ingpista.imprimirValor();
                                    ingpista.mostarResumo();                                   
                                break;
                                case 2:
                                    IngressoVip ingvip = new IngressoVip(nomeing, cpf, tipo, listaEv.get(idEvento));
                                    listaEv.get(idEvento).venderIngresso(ingvip);
                                    ingvip.calcularValor(listaEv.get(idEvento).getValor());
                                    ingvip.imprimirValor();
                                    ingvip.mostarResumo();
                                break;
                                case 3:
                                    IngressoCamarote ingcamarote = new IngressoCamarote(nomeing, cpf, tipo, listaEv.get(idEvento));
                                    listaEv.get(idEvento).venderIngresso(ingcamarote);
                                    ingcamarote.calcularValor(listaEv.get(idEvento).getValor());
                                    ingcamarote.imprimirValor();
                                    ingcamarote.mostarResumo();
                                break;
                                default:
                                    System.out.println("Valor incorreto voltando ao menu principal");
                                break;
                            }
                        }else{
                        System.out.println("Evento lotado!!");
                        }    
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                break;
                case 4:
                    System.out.println("Digite o id do evento: ");
                    idEvento = sc.nextInt();
                    try{
                        validarId(idEvento, listaEv);
                        listaEv.get(idEvento).mostrarListaIngressos();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                break;
                case 5:
                    System.out.println("Digite o id do evento: ");
                    idEvento = sc.nextInt();
                    try{
                        validarId(idEvento, listaEv);
                        listaEv.get(idEvento).mostrarQtdIngressos();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                break;
                case 0:
                    System.out.println("Saindo do programa!");
                break;
                default:
                    System.out.println("Opção invalida");
                break;    
            }
        }while(opcao !=0);    
        sc.close();
    }
    
    private static void validarId(int idEvento, List listaEv) throws IllegalArgumentException{
        if (idEvento < 0 || idEvento >= listaEv.size() ) {
            throw new IllegalArgumentException("\nEsse evento não existe!!! \n");
        }
    }    
    
}
