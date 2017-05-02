
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe intrah09nu5 ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class intrah09nu5 {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        
 System.out.println(" /**");
  System.out.println("* paramètre numeroJourDeLaSemaine le numéro du jour de la semaine (1 = dimanche, 7 = samedi)");
  System.out.println("* paramètre decalage le nombre de jours de décalage à partir du jour de la semaine.");
  System.out.println("* Affiche le numéro correspondant au jour de la semaine en fonction de numeroJourDeLaSemaine et");
  System.out.println("* de decalage.");
  System.out.println("*/");
  
  int jour;
  int decalage=0;
  
  System.out.println("Entre le numéro du jour de la semaine : ");
  jour=Clavier.lireInt();
  while (jour<1 || jour >7){
      System.out.println("erreur");
      System.out.println("Entre le numéro de la semaine : ");
      jour=Clavier.lireInt();
    
    }//while
  
  System.out.println("Entre le déclage: ");
  decalage=Clavier.lireInt();

  int temp=1;
  if (decalage >=0){
     
      for(int i =1; i <=decalage;i++){
        
        if(jour < 7)
        {
            jour++;
        }else{
        jour=1;
        }
        
        }
      
    }else{
       
      for(int i =-1; i >=decalage;i--){
        
        if(jour > 1)
        {
            jour--;
        }else{
        jour=7;
        }
        
        }
         
    
    }
    System.out.println("le jour du décalage est : "+jour );  
    //fin si
        
      
    
    } // main
    
} // intrah09nu5
