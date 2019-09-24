/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USER
 */
public class Cao extends Canino implements IDomestico{
    
    private double tamanho;

    public Cao() {
    }

    public Cao(double tamanho, String comida, String habitat) {
        super(comida, habitat);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public void makeNoise(){
        System.out.println("CAO: LATE");
    }
    
    @Override
    public void movimentar(){
        System.out.println("CAO: CORRE");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentantando cão com ração");
    }
    
}