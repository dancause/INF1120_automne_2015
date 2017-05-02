
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe labo3 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
 import java.text.*;
   
public class labo3 {
   /* */
// Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
   
     DecimalFormat dec2;
    dec2=new DecimalFormat ("0.00");
        double montant;
        char reponse;
        double tps=0;
        double tvq=0;
        
        System.out.print("Montant d'argent ");
        montant = Clavier.lireInt();
        
        System.out.println("");
        System.out.print("est-ce que la TPS s'applique ");
        reponse = Character.toUpperCase(Clavier.lireCharLn());
       if (reponse == 'O'){
          tps=montant*.06; 
          System.out.println(" TPS: "+ dec2.format(tps));
        }
        
        System.out.print("est-ce que la TVQ s'applique ");
        reponse = Character.toUpperCase(Clavier.lireCharLn());
       if (reponse == 'O'){
          tvq=(tps+montant)*.075;
          System.out.println(" TVQ: "+dec2.format(tvq));
        }
        
        System.out.println(dec2.format(montant+tps+tvq));
        
    } // main
    
} // labo3
