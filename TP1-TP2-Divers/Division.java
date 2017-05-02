/*  -------------
 *  Division.java
 *  -------------
 *
 * Calcule le quotient et le reste de la division de deux nombres entiers.
 * L�agotithe sur lequel est bas� le programme peut ne pas donner de bons 
 * resultats dans le cas ou l'un des deux ombres ou les deux sont n�gatifs.  
 * Pour cette raison, le pogramme valide au pr�alable les informations
 * entr�es par l�utilisateur afin de refuser les nombres n�gatifs. 
 * De plus, le programme s'assure qu'il n'y aura pas de division par z�ro en
 * n'acceptant pas de diviseur nul.
 *
 * Auteur       Louise Laforest
 * Date         2004-08-30
 * Modifi� par  C�line Descheneaux
 * Date         2006-09-12
 */

public class Division {

	public static void main ( String [] args ) {

	    // D�claration des variables

	    int a;         // premier nombre saisi, dividende
	    int b;         // deuxi�me nombre saisi, diviseur
	    int quotient;  // quotient de la division de a par b
	    int reste;     // reste de la division de a par b

	    // Saisir a (toute valeur enti�re positive ou nulle est accept�e)

	    System.out.print ( "Entrez le dividende a : " );
	    a = Clavier.lireInt();

            while ( a < 0 ) {
	        System.out.println ( "  ** la valeur de a doit etre positive ou nulle." );
	        System.out.print ( "Entrez le dividende a : " );
	        a = Clavier.lireInt();
	    } // while ( a < 0 )

	    // Saisir b (toute valeur enti�re sup�rieure � 0 est accept�e)

	    System.out.print ( "Entrez le diviseur b : " );
	    b = Clavier.lireInt();

	    while ( b <= 0 ) {
	        System.out.println ( "  ** la valeur de b doit etre non nulle." );
	        System.out.print ( "Entrez le diviseur b : " );
	        b = Clavier.lireInt();
	    } // while ( b <= 0 )

	    // Effectuer la division

	    quotient = 0;
	    reste = a;
	    while ( reste >= b ) {
	        reste = reste - b;        // effectuer la soustraction
	        quotient = quotient + 1;  // compter le nombre de soustractions effectu�es
	    } // while ( reste >= b )

	    // Afficher les r�sultats

	    System.out.println ( );
	    System.out.println ( "Le quotient de la division de " + a + " par " + b + " est : " + quotient );
	    System.out.println ( "Le reste de la division de " + a + " par " + b + " est : " + reste );
	    System.out.println ( );
	    System.out.println ( "F i n   n o r m a l e   d u   p r o g r a m m e ." );

	} // main

} // Division