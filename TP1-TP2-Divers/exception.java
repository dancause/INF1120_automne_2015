
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe exception ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class exception {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
             /*   int x;
               
                System.out.print("Entrer un entier: ");
                try{
                x=Clavier.lireInt();
                System.out.print("39/x: " + 39 / x );
            }catch(NumberFormatException e){
              System.out.print("Entrée non numérique");   
            }catch(ArithmeticException e){
              System.out.print("division par zéro");  
            }
            
             System.out.print("\n" );
            int y;
            
                System.out.print("Entrer un entier: ");
                y=Clavier.lireInt();
                try{
                
                System.out.print("39/x: " + 39 / y );
            }catch(NumberFormatException e){
              System.out.print("Entrée non numérique");   
            }catch(ArithmeticException e){
              System.out.print("division par zéro");  
            }
             
            System.out.print("\n" );
            */
            boolean ok =false;
            int entierlu;
            do{
                 System.out.print("Entrer un entier: ");
                 try{
                 entierlu=Clavier.lireInt();
                 ok=true;
                 }catch(NumberFormatException e){
                 System.out.print("erreur Entrée non numérique\n"); 
                }
            }while(!ok);
            
            
            entierlu=SaisirEntier("3Entrer un entier: ");
            
            int mois;
            mois=SaisirEntier("3Entrer un mois entre 1 et 12: ");
            while(mois <1 || mois >12)
            {
             System.out.print("Erreur\n" ); 
             mois=SaisirEntier("3Entrer un mois entre 1 et 12: ");
            }
    } // main
    
    public static int SaisirEntier(String msg){
          boolean ok =false;
        int x=0;
        do{
             System.out.print(msg);
             try{
             x=Clavier.lireInt();
             ok=true;
             }catch(NumberFormatException e){
              System.out.print("\n"+e.getMessage() );     
            }
        }while(!ok);
        return x;
    }
} // exception


//NumbreFormatException
//ArithmeticException
