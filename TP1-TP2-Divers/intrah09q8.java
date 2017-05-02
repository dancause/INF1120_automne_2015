
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe intrah09q8 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class intrah09q8 {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
   final String messInviteDepart =
 "Veuillez entrer la valeur de depart :";
 final String messInvitePas =
 "Veuillez entrer la valeur de pas :";
 final String messInviteLimite =
 "Veuillez entrer la valeur de limite :";
 final String messErreurPas =
 "*** Le pas doit être non nul.";
 final String messErreurLimiteSup =
 "*** La valeur limite doit être supérieure à la valeur de départ.";
 final String messErreurLimiteInf =
 "*** La valeur limite doit être inférieure à la valeur de départ.";
 // à compléter (veuillez utiliser les six constantes String précédentes)
 int depart;
 int pas;
 int limite;
 int somme;
 int nbPas;
 boolean pasEstPositif;

 // Saisies et validations

 System.out.print ( messInviteDepart );
 depart = Clavier.lireInt();

 System.out.print ( messInvitePas );
 pas = Clavier.lireInt();
 while ( pas == 0 ) {
 System.out.println ( messErreurPas );
 System.out.print ( messInvitePas );
 pas = Clavier.lireInt();
 }

 pasEstPositif = pas > 0;

 System.out.print ( messInviteLimite );
 limite = Clavier.lireInt();
 while ( ( pasEstPositif && limite <= depart ) ||
 ( !pasEstPositif && limite >= depart) ) {
 if ( pasEstPositif ) {
 System.out.println ( messErreurLimiteSup );
 } else {
 System.out.println ( messErreurLimiteInf );
 }
 System.out.print ( messInviteLimite );
 limite = Clavier.lireInt();
 }
 // Calculs

 somme = depart;
 nbPas = -1;
 while ( pasEstPositif && somme <= limite ||
 !pasEstPositif && somme >= limite ) {
 somme = somme + pas;
 nbPas++;
 }
 somme = somme - pas;

 // Affichage des resultats

 System.out.println ( "La somme est " + somme
 + " et le nombre de pas est " + nbPas );


 } // main
  
    
} // intrah09q8
