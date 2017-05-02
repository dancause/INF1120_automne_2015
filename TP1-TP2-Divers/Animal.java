
/**
 * I N F 1 2 5 5
 *
 * Decrivez votre classe Animal ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */

public class Animal {
  private String nom; //(une chaîne de caractères),
  private int sorte; //(un entier : 1 pour chat, 2 pour chien, 0 pour inconnu ou autre),
  private  String race; //(une chaîne de caractères),
  private  String proprietaire;// (une chaîne de caractères).
 // Animal
 
 public void afficher() {
    System.out.print("\n"+nom);
    System.out.print("\n"+sorte);
    System.out.print("\n"+race);
    System.out.print("\n"+proprietaire);
    }
 public Animal(String nom,int sorte,String race,String proprietaire){
       this.nom=nom; //(une chaîne de caractères),
       this.sorte=sorte; //(un entier : 1 pour chat, 2 pour chien, 0 pour inconnu ou autre),
       this.race=race; //(une chaîne de caractères),
       this.proprietaire=proprietaire;// (une chaîne de caractères).
    }
 public Animal(){
     nom=""; //(une chaîne de caractères),
     sorte=0; //(un entier : 1 pour chat, 2 pour chien, 0 pour inconnu ou autre),
     race=""; //(une chaîne de caractères),
     proprietaire="";// (une chaîne de caractères).
    }
    
    /**Setter**/
 public void setnom(String nom){
    this.nom=nom;
    }
 public void setsorte(int sorte){
    this.sorte=sorte;
    }
  public void setrace(String race){
    this.race=race;
    }
  public void setproprietaire(String proprietaire){
    this.proprietaire=proprietaire;
  }
  /**Getter**/
  public String getnom(){
    return nom;
    }
 public int getsorte(){
   return sorte;
    }
  public String getrace(){
   return race;
    }
  public String getproprietaire(){
   return proprietaire;
  }
}