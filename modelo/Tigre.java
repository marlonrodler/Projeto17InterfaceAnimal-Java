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
public class Tigre extends Felino {
    
    private String cor;

    public Tigre() {
    }

    public Tigre(String cor, String comida, String habitat) {
        super(comida, habitat);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void makeNoise(){
        System.out.println("TIGRE: RUGE");
    }
    
    @Override
    public void movimentar(){
        System.out.println("TIGRE: CORRE");
    }
    
    
}