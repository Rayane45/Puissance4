/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance4;

/**
 *
 * @author rfougero
 */
public class Jeton {
    String Couleur;
    
    public Jeton (String uneCouleur){
        Couleur = uneCouleur;
    }
    
    public String lireCouleur(){
        return Couleur;
    }
    
    /*
    @Override
    public String toString(){
        if("rouge".equals(Couleur)){
            return "\u001B[31m 0 ";
        }
        return "\u001B[33m 0 ";
    }
    */
}
