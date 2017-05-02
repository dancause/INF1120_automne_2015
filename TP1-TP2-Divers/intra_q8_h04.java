
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe intra_q8_h04 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class intra_q8_h04 {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
         
 String messageInvite =
 "Entrez un nombre entier entre -50 et 50 inc. (999 pour terminer) : ";
 String messageErreur =
 "*** Le nombre doit être entre -50 et 50 inclusivement.";
        final int sentinelle = 999;
 int somme = 0;
 int nbValeurs = 0;
 int valeurLue;
 double moyenne;
 boolean fini = false;
 boolean ilExisteValeurInferieureMoins40 = false;
 while (!(fini)) {
 System.out.print ( messageInvite );
 valeurLue = Clavier.lireInt();
 if ( valeurLue == sentinelle ) {
 fini = true;
 } else if ((valeurLue < -50) || (valeurLue > 50)) {
 System.out.println ( messageErreur );
 } else { // valeur valide
 ilExisteValeurInferieureMoins40 = ilExisteValeurInferieureMoins40 ||
 (valeurLue < -40);
 nbValeurs = nbValeurs + 1;
 somme = somme + valeurLue;
 }
 } // boucle de lecture des valeurs

 // calcul de la moyenne
 if (nbValeurs == 0) {
 moyenne = 0;
 } else {
 moyenne = (double) somme / nbValeurs;
 }
 System.out.println ();
 System.out.println ( "La moyenne est : " + moyenne );
 if (ilExisteValeurInferieureMoins40) {
 System.out.println ( "Il y a au moins une valeur strictement inférieure" +
 " à -40." );
 }
 } // main

    
} // intra_q8_h04
