
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe laboquestion1 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class laboquestion1 {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        int annee=1;
        boolean bissex=false;
        while(annee!=9999){
        System.out.println("entré une année: ");
        annee=Clavier.lireInt();
        while(annee<0)
        {
            System.out.println("plus grand que zéro: ");
            annee=Clavier.lireInt();
        }
     bissex=(annee%4==0 && annee%100!=0)||annee%400==0;
        
     
        if(bissex==true)
        {System.out.println(" bissextile ");
        }else{
        System.out.println(" non bissextile");
        }
        bissex=false;
    }
    } // main
    
} // laboquestion1
