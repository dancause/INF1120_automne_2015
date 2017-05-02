
/**
 * I N F 1 1 2 0
 *
 * Logiciel qui permet d'évaluer les connaissances arithmetiques selon 3 differents niveaux
 * 
 * @author Janin Dancause 
 * @version 2015/11/03
 *
 * danj17087507
 * janin2000@gmail.com
 */
 
public class Tp2Gr20 {

    // Autres m�thodes s'il y a lieu
    public static void main (String[] params) {  
        
        final  int point=3;
        int test;
        char operation;
        int premierOperande;
        int secondOperande;
        int totalPoint=0;
        int pointUsager=0;
        String usager;
            
        presentation();
        usager=demandeNom();
        JeuArithmetique.choisirDegreDifficulte ( saisirDifficulte() );
            
            while(saisirEtValiderReponseOuiNon()!='N'){
            operation = JeuArithmetique.operationAuHasard ();
            premierOperande = JeuArithmetique.operandeAuHasard ();
            secondOperande= JeuArithmetique.operandeAuHasard ();
               
            message("\n"+premierOperande+" "+operation+" "+secondOperande+" "+"="+" "+"?"+"\nEntrez votre reponse : ");
            pointUsager=(pointUsager)+point-verifierReponseUtilisateur(usager,calculer(operation,premierOperande,secondOperande));
            totalPoint=totalPoint+point;
        }
        
        if( totalPoint > 0){
            message("\n\n\n"+usager+libelle((int)(((double)pointUsager/(double)totalPoint)*100))+"\nMerci d'avoir utilise nos services." );
        }else{
            message("\nMerci d'avoir utilise nos services." );
        }
    } // main
    
    public static int saisirDifficulte() {
        
        int niveau=0;
        String temp;
        message("\nChoisissez un degre de difficulte (facile, moyen ou difficile) : ");
        temp=reponse();
        while(temp.equalsIgnoreCase("FACILE")!=true && temp.equalsIgnoreCase("MOYEN")!=true && temp.equalsIgnoreCase("DIFFICILE")!=true ){
            message("\nChoisissez un degre de difficulte valide (facile, moyen ou difficile) : ");
            temp=reponse();
        }
        
        if(temp.equalsIgnoreCase("FACILE")){
            niveau=1;
        }else if(temp.equalsIgnoreCase("MOYEN")){
            niveau=3;
        }else if(temp.equalsIgnoreCase("DIFFICILE")){
            niveau=4;
        }
        return niveau;
    }
    
    public static char saisirEtValiderReponseOuiNon(){
        
        char c='a';
        String rep;
        message("\nVoulez-vous effectuer une operation (repondez par o ou n) ?");
        rep=reponse();
        while(rep.equalsIgnoreCase("o")!=true && rep.equalsIgnoreCase("oui")!=true && rep.equalsIgnoreCase("n")!=true && rep.equalsIgnoreCase("non")!=true ){
          message("\nEntré Invalide\nVoulez-vous effectuer une operation (repondez par o ou n) ?");
          rep=reponse(); 
        }
        
            switch(rep.toUpperCase()){
            case("O"):c='O';
            case("OUI"):c='O';
            break;
            case("N"):c='N';
            case("NON"):c='N';
            break;
            default:
        }
        return c;
    }// valide que l'usager entre les bonnes valeurs soit O OUI N NON et retourne soit la lettre O ou N
    
    public static int calculer ( char operation, int op1, int op2 ){
        
         int reponse=0;
        switch (operation){
            case('/'): reponse = op1 / op2;
            break;
            case('-'): reponse = op1 - op2;
            break;
            case('+'): reponse = op1 + op2;
            break;
            case('*'): reponse = op1 * op2;
            break;
            case('%'): reponse = op1 % op2;
            break;
        }
        return reponse;
    }//méthode qui s'occupe des calculs mathématique simple
    
    public static String libelle ( int x ) {
        
         String text;
         if(x<45){
         text="Médiocre";
         }else if(x<60){
         text="Passage";
         }else if(x<75){
         text="Bien";
         }else if(x<90){
         text="très Bien";
         }else{
         text="Excellent";       
        }
        return (", votre score est "+x+" % avec la mention "+text);
        
    }// recoit la note calculer de l'usager et associe le bon libelle et construit une phrase dans el return
    
    public static int verifierReponseUtilisateur ( String nom, int reponse ) {
        int x;
        int nbEssaie=0;
        x=valideNombre();
        while( x!=reponse && nbEssaie !=3 )
        {
            message("\nDesole "+nom+", ce n'est pas la bonne reponse. ");
            message("\nEntrez votre reponse : ");
            x=valideNombre(); 
            nbEssaie=nbEssaie+1;
        }
        
        if(nbEssaie==3){
            message("\n"+nom+" la reponse est : "+reponse );
        }
        return nbEssaie;
    }
    
    public static void presentation(){
        message("\n*************************************************");
        message("\n* Logiciel de test de connaissance arithmetique *");
        message("\n*      3 mode facile / moyen / difficile        *");
        message("\n*************************************************");
    }
        /************************************** ajout de méthode *******************************/
    public static void message(String temp){
        System.out.print(temp);
    }
    
    public static String reponse(){
        return Clavier.lireString();
    } 
    
       public static int valideNombre(){
        String nombre;
        nombre=reponse();
        while(isNumeric(nombre)==false){
            message("\nNe doit que contenir que des nombres\nEntrez votre reponse : ");
            nombre=reponse();
        }
        return Integer.parseInt(nombre);
    }// la méthode boucle sur la méthode isNuméric() pour valider si le retour est faux ou vrais
        
      public static boolean isNumeric(String x){
          
         boolean valide= false;             // la méthode analyse la string caractère par caractère pour valider 
         int z =x.length();
         boolean noLettre=true;
                
       for(int i=0;i<x.length();i++){
           if((char)x.charAt(i) >= '0' && (char)x.charAt(i) <= '9'){
               valide=true;
           }else if((x.charAt(i) >= 'A'&& x.charAt(i) >= 'Z')||(x.charAt(i) >= 'a'&& x.charAt(i) >= 'z')){
             noLettre=false;
           }else if(x.charAt(0) == '-'){
               valide=true;
           }
       }
        for(int i=1;i<x.length();i++){
           if((char)x.charAt(i) == '-'){
               valide=false;
           }
       }    
        return valide && noLettre; 
    }//confirme qu'une chaine de caratere ne contient que des chiffres
    
    public static String demandeNom(){
        String nom;
        message("\nEntré votre nom: ");
        nom=reponse();
        while( nom.length() == 0 ){
            message("\nEntré un nom valide: ");
            nom=reponse();
        }
        return nom;
    }//valide si l'usager a entré une information valide
    
} // Tp2Gr20
