
/**
 * INF1255
 *
 * Decrivez votre classe testerAnimal ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class testerAnimal {

    // Autres methodes s'il y a lieu
    
    public static void main (String[] params) {
        
        //Animal [] d =new Amimal[5];
        Animal a=new Animal();
        Animal b=new Animal("nom",3,"23232","erew");
        a.setnom("Bouboule");
        a.setsorte(1);
       
        a.setrace("goutiere");
        a.setproprietaire("inconnue");
        
        a.afficher();
        b.afficher();
        System.out.print("\n\n*******");
        afficher(a);
    } // main
    public static void afficher (Animal animal){
    animal.afficher();
    }
    
} // testerAnimal
