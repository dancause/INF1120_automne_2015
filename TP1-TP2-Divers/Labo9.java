
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe preplaboreponse ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class Labo9 {

    public static void main (String[] params) {
        char tmpChar;
        String tmpString;
        System.out.print("entré une lettre: ");
        tmpChar=Clavier.lireCharLn();
        System.out.print(estUneVoyelle(tmpChar));
        
        System.out.print("\n");
        System.out.print(" entré un mot ou une phrase: ");
        tmpString=Clavier.lireString();
        System.out.println("nombre de voyelle: "+ nbVoyelles(tmpString));
        
        
        
        

    }//main
    
    public static boolean estUneVoyelle(char carac){
        carac=Character.toUpperCase(carac);
        return ( carac =='A'||carac =='E'||carac =='I'||carac =='O'||carac =='U');
    }

    public static int nbVoyelles(String chaine){
            int nbVoyelles=0;
        if(chaine.length()!=0){
            for(int i = 0; i < chaine.length(); i++ ){
                if(estUneVoyelle(chaine.charAt(i))){
                    nbVoyelles++;
                }
            }
        }
        return nbVoyelles;
    }
    
    
} // Labo9
