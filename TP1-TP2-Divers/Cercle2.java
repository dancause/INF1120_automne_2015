
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe Cercle2 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class Cercle2 {

    // Autres m�thodes s'il y a lieu
    
    public Cercle2() {
        x=0;
        y=0;
        rayon=10;
        nbCercles=nbCercles+1;
    
    } // partie public
    // cest comme si on avait 
    
    public Cercle2(int x, int y) {
        this.x=x;
        this.y=y;
        this.rayon=rayon;
        nbCercles=nbCercles+1;
    } 
    
    //getter
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getRayon(){
        return rayon;
    }
    
    public int getNbCercles(){
        return nbCercles;
    }
    
    //setter
    public void setx(int x){
        this.x=x;
    }
     public void sety(int y){
         this.y=y;
    }
     public void setRayon(int rayon){
         this.rayon=rayon;
    }
    
    public void afficher(){
        System.out.println("afficher");
        System.out.println(x);
        System.out.println(y);
        System.out.println( rayon);
        System.out.println(nbCercles);
    }
    
    //partie privée
    
    private int x;
    private int y;
    private int rayon=2;
    private int nbCercles;
    
} // Cercle2
