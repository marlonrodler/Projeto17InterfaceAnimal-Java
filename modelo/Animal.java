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

//Classes abstratas são usadas para impedir que
//um objeto seja instanciado dessa classe

public abstract class Animal {
    
    protected String comida;
    protected String habitat;

    public Animal() {
    }

    public Animal(String comida, String habitat) {
        this.comida = comida;
        this.habitat = habitat;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
    /*Metodo makeNoise() passe a ser um metodo abstrato e portsanto não tem mais 
    implementação (corpo) do metodo*/
    /*Todo metodo abstrato obrigatoriamente deve ser 
    implementado nas classes filhos (Concretas)*/
    /*Para definir um metodo Abstrato deveremos colocar a palavra reservada 'abstract'
    e colocar o ";" no lugar do corpo do metodo*/
    public abstract void makeNoise();
    
    public abstract void movimentar();
      
    
    
}