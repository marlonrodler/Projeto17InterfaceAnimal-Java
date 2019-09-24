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
public class Gato extends Felino implements IDomestico{
    private String raca;

    public Gato() {
    }

    public Gato(String raca,String comida,String habitat) {
        super(comida, habitat);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void makeNoise(){
        System.out.println("GATO: MIA");
    }
    
    @Override
    public void movimentar(){
        System.out.println("GATO: CORRE");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando gato com peixe");
    }
    
}