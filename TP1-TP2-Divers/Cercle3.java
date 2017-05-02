/*
 * Classe qui contient les m�thodes de base afin de cr�er de "cercles". Il est � noter que ces cercles
 * ne sont pas repr�sent�s graphiquement. Cette classe ne sert qu'� d�finir les attributs de bas
 * niveau d'un cercle i.e. les coordonn�es x et y ainsi que le rayon.
 * 
 * 
 * Version : Mars 2011
 * 
 * 
 */


public class Cercle3 {

    //----------   P a r t i e   p u b l i q u e   ----------//

    // Constructeurs
   
    //Cr�� un Cercle3 de rayon 1 aux coordonn�es (0,0)
    public Cercle3 () {
        //Appel du constructeur � 3 param�tres
        this(0, 0, 1);
    } // Constructeur de Cercle
    
    //Cr�� un Cercle3 de rayon r aux coordonn�es (x,y). Si r est n�gatif, le rayon sera 0.
    public Cercle3 ( int x, int y, int r ) {
        this.x = x;
        this.y = y;        
        setRayon(r);
    } // Constructeur de Cercle
    
    // Observateurs/Accesseurs (getters)
    
    public int getX () {
        return x;
    } 

    public int getY () {
        return y;
    } 
    
    public int getRayon () {    
        return rayon;
    } 
    
    // Modificateurs (setters)
    
    public void setX (int coorx) {
        x = coorx;
    } 
    
    public void setY (int coory) {
        y = coory;
    }

    //modifie la valeur du rayon UNIQUEMENT si la valeur re�ue en param�tre
    //est positive.
    public void setRayon (int rayon) {
        if(estPositif(rayon)){
            this.rayon = rayon; // ici, this est obligatoire car rayon designe le parametre et non la variable d'instance rayon
        }
    } 

    public void setXY (int coorx, int coory) {
        setX( coorx ); // ou x = coorx
        setY( coory ); // ou y = coory
    } 
    
    public void setXYrayon (int coorx, int coory, int r) {
        setXY( coorx, coory );
        setRayon( r );
    } 
    
    // autres m�thodes utilitaires
    public double circonference () {
        return 2 * Math.PI * rayon;
    } 
    
    public double surface () {
        return Math.PI * rayon * rayon;
    } 
    
    //Retourne un nouveau Celcle3 ayant les m�me caract�ristiques
    //que l'instance courante
    public Cercle3 cloner () {
        
        return new Cercle3(x, y, rayon);
        
    }

   public String toString(){
        return "X = " + x + "\nY = " + y + "\nRayon = " + rayon;
    }

    //----------   P a r t i e   p r i v e e   ----------//
    
    
    // ------- M�thodes priv�es servant au fonctionnement INTERNE 
    //---------de la classe et/ou de ses instances
    private static boolean estPositif(int r){
        return r == Math.abs(r);
    }
    
    // variables d'instance
    
    private int x;     // coordonnee x du centre du cercle
    private int y;     // coordonnee y du centre du cercle
    private int rayon; // rayon du cercle
    
} // Cercle3