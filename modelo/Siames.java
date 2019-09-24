/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Siames extends Gato implements IDomestico{

    public Siames() {
    }

    public Siames(String raca, String comida, String habitat) {
        super(raca, comida, habitat);
    }
    
    @Override
    public void alimentar() {
        System.out.println("Alimentando o gato Siames com peixe");
    }
    
    
}
