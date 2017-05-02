
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe carre ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class carre {

    // Autres m�thodes s'il y a lieu
    //afficher un certain nombre de fois un certain caractère
    
    public static void main (String[] params) {
    
        int hauteur;
        int largeur;
        char carac='*';
       char c = 65;
        //ilExisteValeurInferieureMoins40 = ilExisteValeurInferieureMoins40 || (valeurLue < -40);
      
        
                System.out.print("entrer une hauteur: ");
                hauteur=Clavier.lireInt();
              
                while (hauteur<=0){
                    System.out.print("\nerreur: ");
                  System.out.print("entrer une hauteur: ");
                  hauteur=Clavier.lireInt();
                }
                
                
                System.out.print("\nentrer une largeur: ");
                largeur=Clavier.lireInt();
                while (largeur<=0){
                    System.out.print("\nErreur");
                    System.out.print("\nentrer une largeur: ");
                    largeur=Clavier.lireInt();
                }
                
           
                
                dessinerLigne(largeur,carac);
                if (hauteur>1){
                for(int i=1;i<=hauteur-2;i++)
                {
                    System.out.println();
                    dessinerLigne(1,carac);
                    dessinerLigne(largeur-2,' ');
                    dessinerLigne(1,carac);
                    
                }
                System.out.println();
                dessinerLigne(largeur,carac);
            }//fin if
        
        
    } // main
    public static void dessinerLigne(int nFois, char car){
        for(int i=1; i <=nFois;i++)
        {
            System.out.print(car+" ");
        }
       
    }
    
} // carre
