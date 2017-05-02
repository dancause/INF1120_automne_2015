
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe intra_04_q5 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class intra_04_q5 {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        
     /*   
Écrivez une méthode qui prend en paramètre un caractère et qui retourne :
1 si le caractère est une lettre minuscule,
2 s'il s'agit de l'un des deux caractères de ponctuation suivants : '?' ou '!', et
3 s'il s'agit de tout autre caractère.
*/

char test;
int rep;

System.out.println("entré un caractère: ");
rep=testCarac(Clavier.lireCharLn());

    
    } // main
    public static int testCarac(char c){
        int t;
        if(c >='a'&& c <= 'z'){
        System.out.println(" Minuscule ");
        t=1;
        }else if(c >='?'|| c <= '!'){
        System.out.println(" ? ! ");
        t=2;
        }else{
        System.out.println(" Autre ");
        t=3;
        }
        return t;
    }
    
} // intra_04_q5
