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
public class Partie {
    Joueur ListeJoueurs [] = new Joueur [2];
    Grille grilleJeu = new Grille();
    Joueur joueurCourant;
    
    public void initialiserPartie(){
      grilleJeu.viderGrille();
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Pseudo joueur1 : ");
      Joueur joueur1 = new Joueur(sc.nextLine());
      System.out.println("Pseudo joueur2 : ");
      Joueur joueur2 = new Joueur(sc.nextLine());
      ListeJoueurs[0] = joueur1;
      ListeJoueurs[1] = joueur2;
      
      attribuerCouleursAuxJoueurs();
      System.out.println(joueur1.Nom + " a la couleur "+joueur1.Couleur);
      System.out.println(joueur2.Nom + " a la couleur "+joueur2.Couleur);
    }
    
    public void debuterPartie(){
        
    }
    
    public void attribuerCouleursAuxJoueurs(){
            ListeJoueurs[0].Couleur = "Rouge";
            ListeJoueurs[1].Couleur = "Jaune";
    }
}
