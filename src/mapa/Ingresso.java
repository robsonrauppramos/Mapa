/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa;

/**
 *
 * @author Robson
 */
public class Ingresso {
    private String nome;
    private String cpf;
    private int tipo; //1 = pista, 2 = vip, 3 = camarote
    private double valorFinal;

    Evento ev = new Evento();
    
    public Ingresso(){
        
    }
    public Ingresso(String nome, String cpf){
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return this.tipo;
    }
    public void setValorFinal(double valorFinal){
        this.valorFinal = valorFinal;
    }
    public double getValorFinal(){
        return this.valorFinal;
    }
    public void mostarResumo(){
        switch(tipo){
            case 1:
                System.out.println("Nome: " + nome + "\nCpf: " + cpf + "\nEvento: " + ev.getNome() + "\nData do evento: " +ev.getData() + "\nSetor: Pista");
            break;
            case 2:
                System.out.println("Nome: " + nome + "\nCpf: " + cpf + "\nEvento: " + ev.getNome() + "\nData do evento: " +ev.getData() + "\nSetor: Vip");
            break;
            case 3:
                System.out.println("Nome: " + nome + "\nCpf: " + cpf + "\nEvento: " + ev.getNome() + "\nData do evento: " +ev.getData() + "\nSetor: Camarote");
            break;    
        }
        
    }
    
}
