
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe testintraq8 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class testintraq8 {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        
        
        int debut;
        int saut;
        int fin;
        int temp=0;
     
        int nbsaut=0;
        
        System.out.println("entrer début: ");
        debut=Clavier.lireInt();
        
        System.out.println("Entrer saut: ");
        saut=Clavier.lireInt();
        
        System.out.println("Entrer la limite: ");
        fin=Clavier.lireInt();
        
        
        temp=debut;
        if(fin>0){
        while(temp<=fin){
            temp=temp+saut;
            nbsaut=nbsaut+1;
        }//while
    }else{
     while(temp>=fin){
            temp=temp+saut;
            nbsaut=nbsaut+1;
        }
   
    }
        
        
        System.out.println("total: "+(temp-saut));
        System.out.println("nbsaut: "+(nbsaut-1));
    } // main
    
} // testintraq8
