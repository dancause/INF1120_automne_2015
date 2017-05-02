
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe lettre ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class lettre {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        char valeur;
        do{
        System.out.print("entré une valeur lettre ou chiffre: ");
        valeur=Clavier.lireCharln();
        System.out.print(valeur);
    }while (valeur==0);
    } // main
    
} // lettre
