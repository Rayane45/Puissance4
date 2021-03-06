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
public class Grille {
    Cellule cellules [][] = new Cellule [6][7];
    
    public boolean ajouterJetonDansColonne(Jeton jetonCourant, int indColonne){ 
      if (colonneRemplie(indColonne)){
        return false;
      }
      else{
        int i=5;
        while(cellules[i][indColonne].jetonCourant != null){
            i--;
        }
        return true;   
      }
    } 
    
    
    public boolean etreRemplie(){
        boolean remp=true;
        for(int i=0; i<cellules.length; i++){
            if(cellules[0][i].jetonCourant != null){
                remp = true;
            }
        }
        return remp;
    }
    
    public void viderGrille(){ 
        for (int i=0; i<5; i++){
            for(int j=0; j<cellules.length; j++){
                if (cellules[i][j] != null){
                    cellules [i][j] = null;
                }
            }
        }
        
    }
    
    public void afficherGrilleSurConsole(){
        
    }
    
    public boolean celluleOccupee(int indLigne, int indColonne){
        boolean occup = true;
        if (cellules[indLigne][indColonne].jetonCourant != null){
            occup = true;
        } 
        return occup;
    }
    
    public String lireCouleurDuJeton(int indLigne, int indColonne){
        return cellules[indLigne][indColonne].jetonCourant.Couleur;
    }
    
    public boolean etreGagnantePourJoueur(Joueur joueurCourant){
        int indColonne;
        int indLigne;
        boolean result=true;
        for(int i=0; i<5; i++){
            for(int j=0; j<cellules.length; j++){
                if (cellules[i][j].jetonCourant!=null || cellules[i][indColonne].jetonCourant!=null || cellules[indLigne][j].jetonCourant!=null){
                    result = true;
                }
            }
        }
        return result;
    }
    
    public void  tasserGrille(int indLigne, int indColonne){
        if (cellules[indLigne][indColonne].jetonCourant == null){
            for(int i=5; i>0; i--){
                cellules[i][indColonne] = cellules[i--][indColonne];
            }
        } 
    }
    
    public boolean colonneRemplie(int indColonne){
        boolean rempli=true;
        if (cellules[0][indColonne].jetonCourant != null){
            rempli = true;
        } 
        return rempli;
    }
    
    public boolean placerDesintegrateur(int indLigne, int indColonne){
        boolean desint;
        if(cellules[indLigne][indColonne].desintegrateur==false){
            cellules[indLigne][indColonne].desintegrateur = true;
            desint = true;
        } else{ desint = false; }
        return desint;
    }
    
    public boolean placerTrouNoir(int indLigne, int indColonne){
        boolean tn;
        if(cellules[indLigne][indColonne].trouNoir==false){
            cellules[indLigne][indColonne].trouNoir = true;
            tn = true;
        } else{ tn = false; }
        return tn;
    }
    
    public boolean supprimerJeton(int indLigne, int indColonne){
        boolean supp;
        if(cellules[indLigne][indColonne].jetonCourant != null){
            cellules[indLigne][indColonne].jetonCourant = null;
            supp=true;
        } else{ supp =false; }
      return supp;
    }
    
    
    public Jeton recupererJeton(int indLigne, int indColonne){
        if(cellules[indLigne][indColonne].jetonCourant != null){
            cellules[indLigne][indColonne].jetonCourant = null;
        }
        return cellules[indLigne][indColonne].jetonCourant;
    }
}

