/*
 * Classe qui contient les m�thodes de base afin de cr�er de "cercles". Il est � noter que ces cercles
 * ne sont pas repr�sent�s graphiquement. Cette classe ne sert qu'� d�finir les attributs de bas
 * niveau d'un cercle i.e. les coordonn�es x et y ainsi que le rayon.
 * 
 * 
 * Version : Mars 2009
 * 
 * 
 */


public class Cercle {

    //----------   P a r t i e   p u b l i q u e   ----------//

    // Constructeurs
   
    public Cercle () {
        x = 0;
        y = 0;
        rayon = 0;
        // ou bien : this(0, 0, 0);
    } // Constructeur de Cercle
    
    public Cercle ( int x, int y, int r ) {
        this.x = x;
        this.y = y;
        rayon = r;
    } // Constructeur de Cercle
    
    // Observateurs (getters)
    
    public int getX () {
        return x;
    } // getX

    public int getY () {
        return y;
    } // getY
    
    //public int getRayon () {
    public int rayon () {
        return rayon;
    } // rayon
    
    // Modificateurs (setters)
    
    public void setX (int coorx) {
        x = coorx;
    } // setX

    public void setY (int coory) {
        y = coory;
    } // setY

    public void setRayon (int rayon) {
        this.rayon = rayon;
        // ici, this est obligatoire car rayon designe le parametre et non la variable d'instance rayon
    } // setRayon

    public void setXY (int coorx, int coory) {
        setX ( coorx ); // ou x = coorx
        setY ( coory ); // ou y = coory
    } // setXY
    
    public void setXYrayon (int coorx, int coory, int r) {
        setXY ( coorx, coory );
        setRayon ( r );
    } // setXYrayon
    
    // autres m�thodes utilitaires
    public double circonference () {
        return 2 * Math.PI * rayon;
    } // circonference
    
    public double surface () {
        return Math.PI * rayon * rayon;
    } // surface
    
    public double sphere(){
        return 4 * Math.PI * ( rayon * rayon );
    }

    
    public static void ajouterDeuxCercles (Cercle c)
    {
        c.setX(c.getX()+2);
        c.setY(c.getY()+2);
        c.setRayon(c.rayon()+2);
    }

    public static void ajouterDeuxCercles2( Cercle[] tabC ){
   
        if(tabC!= null){
            for(int i =0 ; i < tabC.length;i++){
                    if(tabC[i]!=null){
                        /*tabC[i].setX(tab[i.getX+2]);
            			tabC[i].setY(tab[i.getY+2]);
            			tabC[i].setRayon(tab[i.rayon+2]);*/
            			
            			ajouterDeuxCercles(tabC[i]);

                        }           
                    }
            }
        
    }
    
        //----------   P a r t i e   p r i v e e   ----------//
    
    // variables d'instance
    
    private int x;     // coordonnee x du centre du cercle
    private int y;     // coordonnee y du centre du cercle
    private int rayon; // rayon du cercle
    
} // Cercle