/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa;

/**
 *
 * @author Robson
 */
public class IngressoVip extends Ingresso{
    
    public IngressoVip(String nome, String cpf, int tipo, Evento ev ){
        setNome(nome);
        setCpf(cpf);
        setTipo(tipo);
        this.ev = ev;
    }
    public void calcularValor(double valor){
        double total = valor * 1.30;
        setValorFinal(total);
    }    
    public void imprimirValor(){
        System.out.println();
        System.out.println("Valor do ingresso vip: " + getValorFinal());
        System.out.println();
    }    
}
