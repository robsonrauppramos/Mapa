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
        
        Scanner sc = new Scanner(System.in);
        List<Evento> listaev = new ArrayList<>();
        
        do{
        System.out.println();
        System.out.println("Escolha uma opção \n1 Comprar Ingresso \n2 Exibir Evento \n3 Exibir lista de Ingressos do evento \n4 Mostrar a quantidade de ingressos vendidos do evento \n5 Cadastrar Evento\n0 Sair");
        opcao = sc.nextInt(); 
            switch(opcao){
                case 1:
                    System.out.println("Digite o id do evento: ");
                    int id3 = sc.nextInt();
                    if(listaev.get(id3).getCapacidade()> listaev.get(id3).getNumIng()){
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
                                    IngressoPista ingpista = new IngressoPista(nomeing, cpf, tipo, listaev.get(id3));
                                    listaev.get(id3).venderIngresso(ingpista);
                                    ingpista.calcularValor(listaev.get(id3).getValor());
                                    ingpista.imprimirValor();
                                    ingpista.mostarResumo();                                   
                                break;
                                case 2:
                                    IngressoVip ingvip = new IngressoVip(nomeing, cpf, tipo, listaev.get(id3));
                                    listaev.get(id3).venderIngresso(ingvip);
                                    ingvip.calcularValor(listaev.get(id3).getValor());
                                    ingvip.imprimirValor();
                                    ingvip.mostarResumo();
                                break;
                                case 3:
                                    IngressoCamarote ingcamarote = new IngressoCamarote(nomeing, cpf, tipo, listaev.get(id3));
                                    listaev.get(id3).venderIngresso(ingcamarote);
                                    ingcamarote.calcularValor(listaev.get(id3).getValor());
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
                break;
                case 2:
                    System.out.println("Digite o id do evento: ");
                    int id = sc.nextInt();
                    listaev.get(id).mostrarEvento();
                break;
                case 3:
                    System.out.println("Digite o id do evento: ");
                    int id1 = sc.nextInt();
                    listaev.get(id1).mostrarListaIngressos();
                break;
                case 4:
                    System.out.println("Digite o id do evento: ");
                    int id2 = sc.nextInt();
                    listaev.get(id2).mostrarQtdIngressos();
                break;
                case 5:
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
                    Evento ev = new Evento(nome, data, capacidade, valor);
                    listaev.add(ev);
                    System.out.println();
                    System.out.println("Evento Cadastrado!");
                    System.out.println();
                break;
                case 6:
                    System.out.println(listaev.get(0).lista.get(0).getNome());
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

    
}
