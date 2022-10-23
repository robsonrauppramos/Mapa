/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robson
 */
public class Evento {
    
    private String nome;
    private String data;
    private int capacidade;
    private double valor;
    private int numIngressos;
    private int id;
    
    List<Ingresso> lista = new ArrayList<>();
    public Evento(){
        
    }
    public Evento(int id,String nome, String data, int capacidade, double valor){
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.capacidade = capacidade;
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public int getCapacidade(){
        return this.capacidade;
    }
    public void setNumIng(int numIngressos){
        this.numIngressos = numIngressos;
    }
    public int getNumIng(){
        return this.numIngressos;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void venderIngresso(Ingresso ingresso){
        lista.add(ingresso);
        numIngressos ++;    
    }
    public void mostrarQtdIngressos(){
        System.out.println();
        System.out.println("Evento: " + nome +  "\n" + numIngressos + " Ingressos vendidos");
        System.out.println();
    }
    public void mostrarEvento(){
        System.out.println();
        System.out.println("Id do evento: " + id + "\nNome do evento: " + nome + "\nData do evento: " + data + "\nCapacidade: " + capacidade + "\nIngressos vendidos: " + numIngressos);
        System.out.println();
    }
    public void mostrarListaIngressos(){
        System.out.println();
        System.out.println("Lista de ingressos do evento");
        System.out.println();
        for(Ingresso ing : lista){
            ing.mostarResumo();
            System.out.println();
        }
    }

}
