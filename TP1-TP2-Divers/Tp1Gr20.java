
/**
 * I N F x 1 2 0
 *
 * INF1120-20.
 * 
 * @author Janin Dancause
 * @version 03 octobre 2015
 *
 * DANJ17087507
 * dancause.janin@courrier.uqam.ca
 */

  import java.text.*;
public class Tp1Gr20 {

    // Autres m�thodes s'il y a lieu
       /*************Valeurs Static*************************************************/
        //Serins prix
      static final double  prixSerins = 21.99;
            //Perruches prix
      static final double  prixAlbino = 32.49;
      static final double  prixOndulee = 27.99;
      static final double  prixLutino =  35.99;
            //Tortues Prix
      static  final double  prixTortuePetite = 12.99;
      static  final double  prixTortueMoyenne =  23.99;
      static final double  prixTortueGrosse =  39.49;
    
    public static void main (String[] params) {
        DecimalFormat dec2;
        dec2 = new DecimalFormat ("0.00");
        
     
    
        /*************valeur temporaire pour la production facture*********************/
        double tempMontantFacture=0.00;
    
        /**************valeur entrés au clavier***************************************/
        int nbAnimaux=0;
        char reponse; // pour toutes les entrées faites aux claviers
        
        /***************Info pour fermeture de la caisses ****************************/
        int numeroFactures=1;
        int totalNbFactures=0;
        double montantTotalFactures=0.00;
        int totalTortues=0;
        int totalPerruches=0;
        int totalSerins=0;
        int totalFactures=0;
        
        
        System.out.println("L’animalerie « Pit-Wouf-Miaou »");
        System.out.println("Voulez-vous continuer 'c' ou mettre fin au programme 'f' ");
        System.out.print("choix: ");
        reponse = Character.toUpperCase(Clavier.lireCharLn());
    
    
            while(reponse != 'C' && reponse != 'F'){ 
            System.out.println("erreur entré invalide");
            System.out.println("Voulez-vous continuer 'c' ou mettre fin au programme 'f' ");
            System.out.print("choix: ");
            reponse = Character.toUpperCase(Clavier.lireCharLn());
        }
    
        while(reponse=='C'){
        
            char tempResp='O';
            int tempNB=0;
            double tempFact=0;
            while(tempResp=='O'){
            
                 System.out.println("Catégories d'Animal");
                 System.out.println("");
                 System.out.println("Serins 's', Perruches 'p', Tortues 't' ");
                 System.out.print("choix: ");
                 reponse = Character.toUpperCase(Clavier.lireCharLn());
                            
                  while(reponse != 'S' && reponse != 'T' && reponse != 'P'){ 
                   System.out.println("erreur entré invalide");
                   System.out.println("Serins 's', Perruches 'p', Tortues 't' ");
                   System.out.print("choix: ");
                   reponse = Character.toUpperCase(Clavier.lireCharLn());
                        }
    
                switch(reponse){
                
                    case 'S':/**********************************************************/
                            System.out.println("Quantité de serins demandé " + prixSerins+"$");
                            System.out.print("QTY: ");
                            nbAnimaux = Clavier.lireInt();
                            while(nbAnimaux < 0){ 
                            System.out.println("erreur entré invalide");
                            System.out.println("Quantité de serins demandé");
                            System.out.print("QTY: ");
                            nbAnimaux = Clavier.lireInt();
                        }
                        
                        tempMontantFacture=(double)nbAnimaux*prixSerins;
                        tempNB=tempNB+nbAnimaux;
                        tempFact=tempFact+tempMontantFacture;
                        totalSerins=totalSerins+nbAnimaux;
                        montantTotalFactures=montantTotalFactures+tempMontantFacture;
                        
                             System.out.println("Prix unitaire : "+ prixSerins+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
                        
                        break;//fin Serins
                    
                    case 'T': /**********************************************************/
                            System.out.println("Grandeur de tortue disponible");
                            System.out.println("petit 'P' "+prixTortuePetite+"$"+" moyenne 'm' "+prixTortueMoyenne+"$"+" grosse 'g' "+prixTortueGrosse+"$" );
                            System.out.print("choix: ");
                            reponse = Character.toUpperCase(Clavier.lireCharLn());
                            
                            while(reponse != 'P' && reponse != 'M' && reponse != 'G'){ 
                            System.out.println("erreur entré invalide");
                            System.out.println("petit 'P' "+prixTortuePetite+"$"+" moyenne 'm' "+prixTortueMoyenne+"$"+" grosse 'g' "+prixTortueGrosse+"$" );
                            System.out.print("choix: ");
                            reponse = Character.toUpperCase(Clavier.lireCharLn());
                        }
                        
                            System.out.println("Quantité de tortues demandé");
                            System.out.print("QTY: ");
                            nbAnimaux = Clavier.lireInt();
                                          
                            while(nbAnimaux < 0){ 
                            System.out.println("erreur entré invalide");
                             System.out.println("quantité de tortue demandé");
                            System.out.print("QTY: ");
                            nbAnimaux = Clavier.lireInt();
                        }
                    
                         switch (reponse)//calcule du prix en fonction de la catégorie
                         {
                             case 'P': tempMontantFacture=(double)nbAnimaux*prixTortuePetite; 
                             System.out.println("Prix unitaire : "+ prixTortuePetite+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
                             break;
                             case 'M': tempMontantFacture=(double)nbAnimaux*prixTortueMoyenne;
                             System.out.println("Prix unitaire : "+ prixTortueMoyenne+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
                             break;
                             case 'G': tempMontantFacture=(double)nbAnimaux*prixTortueGrosse; 
                             System.out.println("Prix unitaire : "+ prixTortueGrosse+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
                             break;
                         }
                         totalTortues=totalTortues+nbAnimaux;
                         montantTotalFactures=montantTotalFactures+tempMontantFacture;
                         tempNB=tempNB+nbAnimaux;
                         tempFact=tempFact+tempMontantFacture;
                         break;// fin tortues
        
                     case 'P':/*****************************************************/
                        System.out.println("");
                        System.out.println("Albino ‘a’ "+prixAlbino+"$"+" Ondulée ‘o’ "+prixOndulee+"$"+" Lutino ‘l’ "+prixLutino+"$" );
                        System.out.print("choix: ");
                        reponse = Character.toUpperCase(Clavier.lireCharLn());
                        
                            while(reponse != 'A' && reponse != 'O' && reponse != 'L'){ 
                            System.out.println("erreur entré invalide");
                            System.out.println(" Albino ‘a’ "+prixAlbino+"$"+" Ondulée ‘o’ "+prixOndulee+"$"+" Lutino ‘l’"+prixLutino+"$" );
                            System.out.print("choix: ");
                            reponse = Character.toUpperCase(Clavier.lireCharLn());
                        }
                        System.out.println("");
                        System.out.println("Entré la quantité de perruches acheté");
                        System.out.print("QTY: ");
                        nbAnimaux = Clavier.lireInt();
                      
                            while(nbAnimaux < 0){
                            System.out.println("");
                            System.out.println("erreur entré invalide");
                            System.out.println("Entré la quantité de perruches acheté");
                            System.out.print("QTY: ");
                            nbAnimaux = Clavier.lireInt();
                        }
                    
                         switch (reponse)//calcule du prix en fonction de la catégorie
                         {
                             case 'A': tempMontantFacture=(double)nbAnimaux* prixAlbino;
                             System.out.println("Prix unitaire : "+ prixAlbino+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
 
                             break;
                             case 'O': tempMontantFacture=(double)nbAnimaux* prixOndulee;
                             System.out.println("Prix unitaire : "+ prixOndulee+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
                           
                             break;
                             case 'L': tempMontantFacture=(double)nbAnimaux* prixLutino;
                             System.out.println("Prix unitaire : "+ prixLutino+"$");
                             System.out.println("Quantité : "+nbAnimaux);
                             System.out.println("Prix total : "+dec2.format(tempMontantFacture)+"$");
                             break;
                         }
                        totalPerruches=totalPerruches+nbAnimaux;
                        tempNB=tempNB+nbAnimaux;
                        tempFact=tempFact+tempMontantFacture;
                        montantTotalFactures=montantTotalFactures+tempMontantFacture;
                         break;// fin Perruches
                     
                        }//switch pour des catégories d'animal
                        
                         System.out.println();
                         System.out.println("Voulez-Vous ajouter un article a cette facture");
                         System.out.println("Oui'O', Non 'N'");
                         System.out.print("choix: ");
                         tempResp = Character.toUpperCase(Clavier.lireCharLn());
                         System.out.println(" ce qui est entré au clavier : "+tempResp);
                            
                 while(tempResp != 'N' && tempResp != 'O' ){
                     System.out.println();
                     System.out.println("Entré Invalide");
                     System.out.println("Oui'O', Non 'N'");
                     System.out.print("choix: ");
                     tempResp = Character.toUpperCase(Clavier.lireCharLn());
                       }
    
                }//while pour ajouter un nouvel animal à la facture
                
             if ((int)tempFact!=0){
              System.out.println();
              System.out.println( "Numéro de facture: "+numeroFactures+" total partiel "+ dec2.format(tempFact) +"$"+ " quantité(s): "+ tempNB );
              totalNbFactures++;
                } else{
               System.out.println();
               System.out.println( "Numéro de facture: "+numeroFactures+" total partiel "+ "Facture Annulé" );
                }//test pour déterminé si la facture est valide ou non
           
            numeroFactures++;
            System.out.println();
            System.out.println("Voulez-vous continuer 'c' ou mettre fin au programme 'f' ");
            System.out.print("choix: ");
            reponse = Character.toUpperCase(Clavier.lireCharLn());
            nbAnimaux=0;
            tempMontantFacture=0;
                       
                while(reponse != 'C' && reponse != 'F'){ 
                System.out.println();
                System.out.println("erreur entré invalide");
                System.out.println("Voulez-vous continuer 'c' ou mettre fin au programme 'f' ");
                System.out.print("choix: ");
                reponse = Character.toUpperCase(Clavier.lireCharLn());
            } // test pour valider si l'usager veux faire une nouvelle facture
             
        }//boucle while pour revenir au début
    
        if(montantTotalFactures !=0){
            System.out.println("");
            System.out.println("/********************************/");
            System.out.println("Statistiques de vente d'animaux");
            System.out.println("Nombre de factures: "+totalNbFactures);
            System.out.println("Montant total des factures: "+dec2.format(montantTotalFactures)+"$");
            System.out.println("Tortues: "+totalTortues);
            System.out.println("Perruches: "+totalPerruches);
            System.out.println("Serins: "+totalSerins);
        }
        else {
            System.out.println("***************Fin Normale du programme***************");
        }//if de fin de programme
    } // main
    
} // TP1
