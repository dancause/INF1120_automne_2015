
/**
 * I N F x 1 2 0
 *
 * Decrivez votre classe Tp3Gr20 ici.
 * 
 * ****************************************
 * @author Janin Dancause 
 * @version 15/12/2015
 * danj17087507
 * janin2000@gmail.com
 * ****************************************
 * 
 * ****************************************
 * @author (votre nom) 
 * @version (une date)
 * (votre code permanent)
 * (votre adresse de courriel)
 *  ****************************************
 */
 import java.io.*;

public class Tp3Gr20 {

    // Autres m�thodes s'il y a lieu
    //Package à importer afin d'utiliser l'objet File
 
    public static void main (String[] params) {
        char rep;
        char []tabRep={'N','O','I','T','L','C','E','A','V','M','R','S','Q'};
        Contenant [] tabInventaire=null;
        
        presentation();
        System.out.print("\n");
        tabInventaire= new Contenant[choisirNombre("\nEntrez la quantite a mettre en inventaire: ","\nUn minimum de 5 et un maximum de 15","\nquantitee invalide",5,15)];
           
        afficherMenuPrincipal();
        rep=demanderChar("\nEntrer une option du menu: ",tabRep);
        
        while(rep!='Q'){
                switch (rep){
                case('N'): tabInventaire=effectuerMenuN(tabInventaire);
                break;
                case('O'): effectuerMenuO(tabInventaire);
                break;
                case('I'): effectuerMenuI(tabInventaire);
                break;
                case('T'): effectuerMenuT(tabInventaire);
                break;
                case('L'): effectuerMenuL(tabInventaire);
                break;
                case('C'): effectuerMenuC(tabInventaire);
                break;
                case('E'): effectuerMenuE(tabInventaire);
                break;
                case('A'): effectuerMenuA(tabInventaire);
                break;
                case('V'): effectuerMenuV(tabInventaire);
                break;
                case('M'): effectuerMenuM(tabInventaire);
                break;
                case('R'): effectuerMenuR(tabInventaire);
                break;
                case('S'): tabInventaire=effectuerMenuS(tabInventaire);
                break;
            }
            afficherMenuPrincipal();
            rep=demanderChar("\nEntrer une option du menu: ",tabRep);
        }
        stockerDansFichier( tabInventaire );

    } // main
    
    public static Contenant [] effectuerMenuN ( Contenant [] inventaire ) {
        char []tabRep={'N','O'};
        String desc;
        int x;
        int y;
        int z;
        int position;
        boolean ok=false;
           do{
                position=trouverPosition(inventaire);
               
            if (position==inventaire.length){
            
                System.out.print("\nLe tableau plein");
                if(demanderChar("\nVoulez-vous agrandir le tableau N (non) ou O (oui): ",tabRep)=='O'){
                    inventaire=ajouteContenant(inventaire);
                    System.out.print("\nLe tableau ajuster");
                }else{
                    System.out.print("\nLe tableau n'a pas ete ajuste");
                }
                    
            }else{
                    
                System.out.print("\nEntrer la description du nouveau produit: ");
                desc=Clavier.lireString();
                x=choisirNombre("\nEntrer la Categorie: ","\n"+categories(),"Erreur ",Contenant.CATEGORIE_MIN,Contenant.CATEGORIE_MAX);
                y=choisirNombre("\nEntrer la Capacite: ","\nCapacite minimal du contenant est de 100 ml","\nErreur ",Contenant.CAPACITE_MIN,999999999);
                z=choisirNombre("\nEntrer la Quantite: ","\nQuantite minimale du contenant est de "+Contenant.QUANTITE_MIN+" ml et le maximum est de "+y+" ml","\nErreur ",Contenant.QUANTITE_MIN,y);
                inventaire[position]=new Contenant(desc,x,y,z);
                System.out.print(inventaire[position]+"\n");
            }
            
        }while(demanderChar("\nEntrer un nouveau produit N (non) ou O (oui): ",tabRep)=='O');
        return inventaire;
    }
    
    public static void stockerDansFichier ( Contenant [] inventaire ) {
        
        try{
            
            FileWriter ficInventaire = new FileWriter ("NonVides.txt");
            PrintWriter Sortie = new PrintWriter (ficInventaire);
            
            FileWriter ficInventaireVide = new FileWriter ("Vides.txt");
            PrintWriter SortieVide = new PrintWriter (ficInventaireVide);
            
                for(int i = 0 ; i < inventaire.length ; i++){
                    if(inventaire[i]!=null){
                        
                            if(inventaire[i].getQuantite()==0){
                            SortieVide.print("\nNumero: "+inventaire[i].getNumero()+" Description: "+inventaire[i].getDescription()+" Categorie: "+Contenant.categorie(inventaire[i].getCategorie())+" Capacite: "+inventaire[i].getCapacite()+"ml Quantite: "+inventaire[i].getQuantite()+"ml");
                        }else{
                            Sortie.print("\nNumero: "+inventaire[i].getNumero()+" Description: "+inventaire[i].getDescription()+" Categorie: "+Contenant.categorie(inventaire[i].getCategorie())+" Capacite: "+inventaire[i].getCapacite()+"ml Quantite: "+inventaire[i].getQuantite()+"ml");
                        } 
                    }
                }   
                Sortie.close();
                SortieVide.close();
        }catch(IOException e){
            System.out.print("\nProbleme d'entree/sortie avec le fichier");
        }
        
    }
    public static void afficherMenuPrincipal() {
    
        System.out.println("\n*****************************************************************************");
        System.out.println(" N - Ajouter un nouveau contenant à l'inventaire ");
        System.out.println(" O - Afficher la liste des numeros d'identification ");
        System.out.println(" I - Afficher les informations d'un contenant ");
        System.out.println(" T - Afficher les informations sur tous les contenants ");
        System.out.println(" L - Afficher les informations sur les contenants d'une categorie ");
        System.out.println(" C - Afficher les contenants dont la description contient la chaîne recherchee ");
        System.out.println(" E - Retirer du liquide ");
        System.out.println(" A - Ajouter du liquide ");
        System.out.println(" V - Vider completement un contenant ");
        System.out.println(" R - Remplir à pleine capacite un contenant ");
        System.out.println(" M - Modifier la description ");
        System.out.println(" S - Supprimer un contenant. ");
        System.out.println(" Q - Quitter le programme ");
        System.out.println("\n*****************************************************************************");
   
    }
    
    public static Contenant trouverContenant (Contenant [] inventaire, int numero){
        Contenant temp=null;
        for(int i =0 ; i< inventaire.length;i++){
            if(inventaire[i]!=null){
            if(numero==inventaire[i].getNumero()){
                temp=inventaire[i];
            }
        }
        }
        return temp;
    }
    
    public static char demanderChar(String msg, char []carac){
            char temp;
            boolean ok=false;
            System.out.print(msg);
        do{
                temp=Clavier.lireCharLn();
               for(int i = 0 ; i < carac.length;i++){
                if(Character.toUpperCase(temp) == carac[i]){
                    ok = true;
                }
                }
               if(!ok){
                System.out.print("\nChoix invalide\n"+msg);
               }
       
       }while(!ok);
       
       return Character.toUpperCase(temp);  
    }
    
    public static void presentation(){
     System.out.print("\n*************************************************************************************");
     System.out.print("\n   Logiciel de creation d'un inventaire de boissons");
     System.out.print("\n");
     System.out.print("\n  -Permet de creer deux fichiers d'inventaire");
     System.out.print("\n  -Un minimum de 5 à un maximum de 15 boisssons lors du demarrage");
     System.out.print("\n   -La quantite peut être ajuster au besoin");
     System.out.print("\n  -Il y a "+(Contenant.CATEGORIE_MAX+1)+" categories en inventaire");
     System.out.print("\n  -Les contenants doivent avoir une capacite d'un minimum de 100 ml");
     System.out.print("\n  -Le numero, la categorie et la capacite ne peuvent pas être modifies");
     System.out.print("\n  -Si vous faites une erreur, vous pouvez effacer le contenant");
     System.out.print("\n*************************************************************************************");
    }
   
    public static void effectuerMenuO ( Contenant [] inventaire ) {
            if(validerTableau(inventaire) != false){
                System.out.print("\n");
                System.out.print(" Numero\tDescription");
                for(int i=0 ; i < inventaire.length ; i ++ ){
                    if(inventaire[i]!=null){
                        System.out.print("\n");
                        System.out.print(" "+inventaire[i].getNumero()+"\t"+inventaire[i].getDescription());
                        finDeLigne(i);
                    }
                }
            
        }else {
        System.out.print("\n\nIl n'y a aucun contenant en inventaire\n\n");
        }
    }
    
    public static void effectuerMenuI ( Contenant [] inventaire ) {
        int x ;
        Contenant temp; 
            if(validerTableau(inventaire)!=false){
          x=choisirNombre("\nEntrer un numero de contenant a afficher: ","\nLe numero doit etre plus grand que zero","erreur",1,99999);
          temp=trouverContenant ( inventaire, x);
          if (temp!=null){
            System.out.println(temp);
          }else{
            System.out.print("\n\nle contenant n'existe pas\n\n");
          }
        }else{
            System.out.print("\n\nLe tableau est vide\n\n");
        
        }
    }//Afficher les informations d'un contenant
    
    public static void effectuerMenuT ( Contenant [] inventaire ) {
          
           if(validerTableau(inventaire)!=false){
             for(int i =0 ; i < inventaire.length; i++){
                 if(inventaire[i]!=null){
                 System.out.println(inventaire[i]);
                 finDeLigne(i);
            }
            }
               
        }else {
        System.out.print("\n\nIl n'y a aucun contenant en inventaire\n\n");
        }
    }
    
    public static Contenant [] effectuerMenuL ( Contenant [] inventaire ) {
        int x;
        int compteur=0;
        if(validerTableau(inventaire) != false){

             x=choisirNombre("\nEntrer la categorie à rechercher: ","\n"+categories(),"Erreur ",Contenant.CATEGORIE_MIN,Contenant.CATEGORIE_MAX);
             
                for(int i =0 ; i < inventaire.length; i++){
                 if(inventaire[i]!=null){                 
                 if(inventaire[i].getCategorie()==x){
                     System.out.println(inventaire[i]);
                     finDeLigne(compteur);
                     compteur=compteur+1;
                    }
                }
            }
            if(compteur==0){
                System.out.print("\nIl n'y a aucun contenant dans cette categorie\n");
            }

        }else {
            System.out.print("\n\nIl n'y a aucun contenant en inventaire\n\n");
        }
        return inventaire;
    }
    
    public static void effectuerMenuC ( Contenant [] inventaire ) {
        String rep;
        int compteur=0;
         if(validerTableau(inventaire) != false){
             
             System.out.print("\nEntrer le mot à rechercher dans la description: ");
             rep=Clavier.lireString();
             boolean trouver=false;
            
             for(int i =0 ; i < inventaire.length;i++){
                 trouver=false;
                 if(inventaire[i]!=null){
                     
                     for(int x=0; x < inventaire[i].getDescription().length()-(rep.length()-1) ;x++){

                            if (rep.compareToIgnoreCase(inventaire[i].getDescription().substring(x, x+rep.length()))==0){
                                trouver=true;
                                }
                       
                        }
                     if (trouver==true){ 
                         System.out.println(inventaire[i]);
                         finDeLigne(compteur);
                         compteur=compteur+1;
                     }
                }
            }
            if (compteur==0){ 
                System.out.print("\nAucun contenant ne contient la description recherchee\n");
             }

        }else {
            System.out.print("\n\nIl n'y a aucun contenant en inventaire\n\n");
        }
    }
    
    public static void effectuerMenuE ( Contenant [] inventaire ) {
            Contenant temp;
            int x;
            //retirer du liquide min max
           if(validerTableau(inventaire) != false){
            
                temp=trouverContenant ( inventaire, ( choisirNombre("\nEntrer le numero du contenant a enlever du liquide: ","\nLe numero doit etre plus grand que zero","erreur",1,99999)));
                if(temp !=  null){
                        if(temp.getQuantite()==0)
                        {
                        System.out.print("\nCe contenant est deja vide");
                        }else{
                       x=choisirNombre("\nQuantite à enlever : ","\nle maximum à enlever "+temp.getQuantite()+" ml","\nErreur",Contenant.QUANTITE_MIN,9999999);  

                       if( x > temp.getQuantite() ){
                           
                           System.out.print("\nIl y a une quantite qui n'a pu être enlever: "+ (x - (temp.getQuantite()))+" ml");
                           temp.setQuantite(Contenant.QUANTITE_MIN);

                        }else{
                         temp.setQuantite(temp.getQuantite()-x);
                        }
                      System.out.print(temp);
          
                    }
                }else{
                    System.out.print("\nLe contenant n'existe pas\n");
                }
            
        }else {
            System.out.print("\nIl n'y a aucun contenant en inventaire\n");
        }
    }
    
    public static void effectuerMenuA ( Contenant [] inventaire ) {
            Contenant temp;
            int x;
            //retirer du ajouter min max
           if(validerTableau(inventaire) != false){
            
                temp=trouverContenant ( inventaire, ( choisirNombre("\nEntrer le numero du contenant à ajouter du liquide: ","\nLe numero doit etre plus grand que zero","erreur",1,99999999)));
                if(temp !=  null){
                        if(temp.getQuantite()==temp.getCapacite())
                        {
                        System.out.print("\nCe contenant est deja plein");
                        }else{
                       System.out.print("\nNumero: "+temp.getNumero()+" Description: "+temp.getDescription()+" Quantite: "+temp.getQuantite()+"ml");
                       x=choisirNombre("\nQuantite à ajouter : ","\nLe maximum à ajouter "+(temp.getCapacite()-temp.getQuantite())+" ml","\nErreur",Contenant.QUANTITE_MIN, 99999999); 
                       if( x > temp.getCapacite()-temp.getQuantite() ){
                           
                           System.out.print("Il y a une quantite qui n'a pu être affecter: "+ (x - (temp.getCapacite()-temp.getQuantite()))+" ml");
                           temp.setQuantite(temp.getCapacite());
                        
                        }else{
                         temp.setQuantite(temp.getQuantite()+x);
                        }
                    }
                }else{
                    System.out.print("\nLe contenant n'existe pas\n");
                }
            
        }else {
            System.out.print("\nIl n'y a aucun contenant en inventaire\n");
        }
        
    }
    
    public static void effectuerMenuV ( Contenant [] inventaire ) {
           Contenant temp;
           if(validerTableau(inventaire) != false){
            
                temp=trouverContenant ( inventaire, ( choisirNombre("\nEntrer le numero du contenant a Vider: ","\nLe numero doit etre plus grand que zero","erreur",1,99999)));
                if(temp !=  null){
                        if(temp.getQuantite()==0)
                        {
                        System.out.print("\nCe contenant est deja vide");
                        }else{
                        System.out.print("\n");
                        System.out.print("Quantite a vider: "+ temp.vider()+" ml");
                        System.out.print("\n");
                        System.out.print("Nouvelle quantite: "+temp.getQuantite()+" ml");
                        System.out.print("\n");
                    }
                }else{
                    System.out.print("\nLe contenant n'existe pas\n");
                }
            
        }else {
            System.out.println("\nIl n'y a aucun contenant en inventaire\n");
        }
    }//Vider completement un contenant
    
    public static void effectuerMenuM ( Contenant [] inventaire ) {
        Contenant temp; 
        String desc;
         if(validerTableau(inventaire) != false){
                 temp=trouverContenant ( inventaire, ( choisirNombre ("\nEntrer le numero du contenant a modifier la description: ","\nLe numero doit etre plus grand que zero","erreur",1,99999)));
                if(temp !=  null){
                    System.out.print("\n");
                    System.out.print("Description Actuelle: "+temp.getDescription());
                    
                    System.out.print("\nEntrer la nouvelle description: ");
                    desc=Clavier.lireString();
                    while(desc==""){
                        System.out.print("\nLa description ne peut pas être vide\nEntrer la nouvelle description: ");
                        desc=Clavier.lireString();
                        }
                    
                    temp.setDescription(desc);
                    System.out.print("\n");
                    System.out.print(temp);
                }else{
                    System.out.print("\nLe contenant n'existe pas\n");
                } 
                
         }else {
                System.out.print("\n\nIl n'y a aucun contenant en inventaire\n\n");
         }
    }
    
    public static void effectuerMenuR ( Contenant [] inventaire ) {
             Contenant temp;   
           if(validerTableau(inventaire) != false){
            
                temp=trouverContenant ( inventaire, ( choisirNombre("\nEntrer un numero de contenant a remplir: ","\nLe numero doit etre plus grand que zero","erreur",1,99999999)));
                if(temp!=null){
                        if(temp.getQuantite()==temp.getCapacite())
                        {
                        System.out.print("\nCe contenant est deja plein");           
                        }else{
                        System.out.print("\n");
                        System.out.println("Ancienne quantite: "+temp.getQuantite()+" ml");
                        System.out.println("Quantite ajouter dans le contenant: "+temp.remplir()+" ml");
                        System.out.println("Nouvelle quantite: "+temp.getQuantite()+" ml");
                    }
                }else{
                     System.out.print("\nLe contenant n'existe pas\n");
                }
            
        }else {
            System.out.print("\nIl n'y a aucun contenant en inventaire\n");
        }
    }//Remplir a pleine capacite un contenant

     public static Contenant [] effectuerMenuS ( Contenant [] inventaire ) {
         int x;
         char []tabRep={'N','O'};
         char rep;
         int debut=0;
         int fin=0;
       
          if(validerTableau(inventaire) != false){
              x=choisirNombre("\nEntrer un numero de contenant à supprimer: ","\nLe numero doit etre plus grand que zero","erreur",1,99999);
              if(trouverContenant(inventaire,x)!=null){   
                  System.out.print( trouverContenant(inventaire,x));
                  if(demanderChar("\n\nEst-vous sur de vouloir effacer cette enrigistrement O (oui) ou N (non): ", tabRep)=='O'){
                     
                      if(demanderChar("\n\nEst-vous vraiment certain de vouloir effacer cette enrigistrement O (oui) ou N (non): ", tabRep)=='O'){
                          
                          
                              for(int i = 0; i < inventaire.length; i++){
                                      if(inventaire[i]!=null){
                                          if(x==inventaire[i].getNumero()){
                                             debut=i;
                                          }
                                    }
                              }  
                              fin=trouverPosition(inventaire);
                          
                              for(int i = debut; i < fin;i++){
                                inventaire[i]=inventaire[i+1];
                              }
                              inventaire[fin]=null;
                              System.out.print("\nLe contenant a ete correctement effacé");
                        
                        }else{
                            System.out.print("\nAucun changement n'a ete effectue");
                        }
                    }else{
                        System.out.print("\nAucun changement n'a ete effectue");
                    }
                }else{
                        System.out.print("\nContenant invalide");
                    }
        }else {
        System.out.println("\n\nIl n'y a aucun contenant en inventaire\n\n");
        }
        return inventaire;
    }
    
    public static int validerNombre(String msg){
          int temp=0;
          boolean ok=false;
          
           //valide que ca soit un nombre valide et non des caracteres
           do{     
           try{ 

               System.out.print(msg);
               temp=Clavier.lireInt();
               while(temp<0){
                   System.out.print("\n");
                   System.out.print(" nombre invalide "+msg);
                   temp=Clavier.lireInt();
                }
               ok=true;
            }catch (NumberFormatException e){
               System.out.print("\n");
               System.out.print("Erreur sur le format");
            }
        }while(!ok);
        return temp;
    }
    
    public static Contenant [] ajouteContenant(Contenant [] inventaire) {
        Contenant [] temp=null;
    
        if(validerTableau(inventaire) != false){
            temp = new Contenant[inventaire.length+5];
            for(int i = 0; i < inventaire.length; i++){
              temp[i] = inventaire[i];
            }
            
        }
        return temp;
    }
    
    public static int choisirNombre(String msg1,String msg2,String Erreur,int min, int max){
        int temp;
        
        System.out.print(msg2);
        temp=validerNombre(msg1);
        while((temp < min || temp > max)){
           temp=validerNombre(Erreur+msg1);
        }
        return temp;
    }
    
    public static String categories(){
        String temp="";
        
        for (int i = Contenant.CATEGORIE_MIN; i <= Contenant.CATEGORIE_MAX;i++){
            temp=temp+Contenant.categorie(i)+"\n";
        }
        return temp;
    }
    
    public static int trouverPosition(Contenant [] inventaire){
        int trouver=inventaire.length;
        Contenant x;
        
        for(int i = inventaire.length-1; i >= 0 ;i--){
           x=inventaire[i];
            if (inventaire[i]==null){
                trouver=i;
            }
        }
        return trouver;
    }//retourne la position du premier null
    
    public static boolean validerTableau (Contenant [] inventaire){
        boolean ok=true;
        int compteur=0;
        
        for(int i=0;i<inventaire.length;i++){
        
            if(inventaire[i]==null){
                compteur=compteur+1;
            }
        }
        if(compteur==inventaire.length){
            ok=false;
        }
        return ok;
    }// valide si inventaire contient des contenants 
    
    public static void finDeLigne(int x){
            if((x+1) % 3 == 0 ){
            System.out.println("******************************************");
            System.out.println("Entrer sur la touche entrer pour continuer");
            Clavier.lireFinLigne();
        }
    }
} // Tp3Gr20
