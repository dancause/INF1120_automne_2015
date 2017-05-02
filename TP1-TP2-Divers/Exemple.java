public class Exemple {

public static void main ( String[] params ) {

 int x;
 int diviseur;

 // Bloc 1

 System.out.println ( "Debut bloc 1" );
 System.out.print ( " Entrez un nombre entier : " );
 x = Clavier.lireInt();
 System.out.println ( "Fin bloc 1" );

 try {

 // Bloc 2

 System.out.println ( "Debut bloc 2" );
 System.out.print ( " Entrez un diviseur entier : " );
 diviseur = Clavier.lireInt();
 System.out.println ( " La division entière de " + x + " par " +
 diviseur + " = " + x / diviseur );
 System.out.println ( "Fin bloc 2" );

 } catch ( ArithmeticException e ) {

 // Bloc 3

 System.out.println ( "Debut bloc 3" );
 System.out.println ( " Division par 0, " + e.getMessage() );
 System.out.println ( "Fin bloc 3" );

 } finally {

 // Bloc 4

 System.out.println ( "Debut bloc 4" );
 System.out.println ( " Dans finally" );
 System.out.println ( "Fin bloc 4" );

 }

 // Bloc 5

 System.out.println ( "Debut bloc 5" );
 System.out.println ( " Fin normale du programme" );
 System.out.println ( "Fin bloc 5" );

 } // main
} // Exemple
