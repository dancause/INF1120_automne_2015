
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe calculerfraction ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class calculerfraction {

    // Autres m�thodes s'il y a lieu
    
    public static void main ( String[] params ) {

 System.out.println ( "Evaluation d'une fraction." );

 try {
 saisirEtCalculerFraction();
 } catch ( ArithmeticException e ) {
 System.out.println ( "ArithmeticException" );
 } catch ( ErrDenom e ) {
 System.out.println ( "Le denominateur est nul, la fraction ne peut être calculée." );
 } 
    
} // calculerfraction


 public static void saisirEtCalculerFraction () throws ErrDenom {

 int num;
 int denom;
 double reponse = 0;

 System.out.print ( "Entrez le numerateur : " );
 num = Clavier.lireInt();
 System.out.print ( "Entrez le denominateur : " );
 denom = Clavier.lireInt();

 if ( denom == 0 ) {
 //Lever l’exception ErrDenom qui est définie dans la classe à la page 4
 //Il est à noter qu’on peut aussi lever des exceptions standards (voir
 // page 1) et que nous ne sommes donc pas obligés de définir de nouvelles
 // exceptions.
 throw new ErrDenom ();
 } else {
 reponse = (double) num / denom;
 System.out.println ( num + " / " + denom + " = " + reponse );
 }
 
 
 
 
 
 } // saisirEtCalculerFraction 

}