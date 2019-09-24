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
public class Leao extends Felino {
    private String origem;

    public Leao() {
    }

    public Leao(String origem, String comida, String habitat) {
        super(comida, habitat);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    @Override
    public void makeNoise(){
        System.out.println("LEAO: RUGE");
    }
    
    @Override
    public void movimentar(){
        System.out.println("LEAO: CORRE");
    }
}