
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe Tp2Gr20 ici.
 * 
 * @author Janin Dancause
 * @version (une date)
 *
 * danj17087507
 * (votre adresse de courriel)
 */

public class Tp2Gr20 {

    // Autres m�thodes s'il y a lieu
  
    
    public static void main (String[] params) {
       String nom;
       
       message(" Qu'elle est votre nom: ");
       nom=reponse();
      
       message("\nBienvenue "+ nom+" !");
       message("\n");
       jeux(nom);
    
    } // main
    
    public static void message(String msg){
        System.out.print(msg);
    }
    
    public static String reponse(){
        return Clavier.lireString();
    }
    
    public static boolean valideNiveau(String test){
        boolean valid=false;
        if(test.equals("FACILE")){
            valid=true;
        }else if(test.equals("MOYEN")){
            valid=true;
        }else if(test.equals("DIFFICILE")){
            valid=true;
        }
        return valid;
    }
    
    public static void jeux(String joueur){
        String niveau;
        int nbEssaie=0;//nombre de fois que l'usager fait le test
        int nbReussi=0;//nombre de fois ou l'usager a bien répondu
        int nbTest=0;//nombre de test que l'usager a fait
        boolean valid=false;
        char operation;
        int premierOperande;
        int SecondOperande;
        int reponse;
        boolean question;
        
        
        niveau=demandeNiveau();
        initialisationJeu(niveau);
        question=NouvelleOperation();
        while( question==true){
        
            operation = JeuArithmetique.operationAuHasard ();
            premierOperande = JeuArithmetique.operandeAuHasard ();
            SecondOperande= JeuArithmetique.operandeAuHasard ();
            message("\n"+premierOperande+" "+operation+" "+SecondOperande+" "+"="+" "+"?"+"\nEntrez votre reponse : ");
            reponse=Clavier.lireInt();
            if(reponse==calcul(premierOperande,SecondOperande,operation)){
                message("good");
            
            }else{
                do{
                    message("\n"+premierOperande+" "+operation+" "+SecondOperande+" "+"="+" "+"?"+"\nEntrez votre reponse : ");
                    reponse=Clavier.lireInt();
                }while(reponse==calcul(premierOperande,SecondOperande,operation)||nbEssaie==3);
            }
            
            question=NouvelleOperation();
            
        }        
        
        message ("\n"+joueur+mention(nbReussi,nbTest));
        
    }
    
    public static String demandeNiveau(){
        String temp;
        boolean test=false;
       
        message("\nChoisissez un degre de difficulte (facile, moyen ou difficile) : ");
        temp=reponse();
        test=valideNiveau(temp.toUpperCase());
        while(test==false){
            message("\nRéponse Invalide\nChoisissez un degre de difficulte (facile, moyen ou difficile) : ");
            temp=reponse();
            test=valideNiveau(temp.toUpperCase());
        }
        return temp.toUpperCase();
    
    }
    
    public static void initialisationJeu(String niveau){
        switch (niveau){
            case("FACILE"):JeuArithmetique.choisirDegreDifficulte ( JeuArithmetique.FACILE );
            break;
            case("MOYEN"):JeuArithmetique.choisirDegreDifficulte ( JeuArithmetique.MOYEN );
            break;
            case("DIFFICILE"):JeuArithmetique.choisirDegreDifficulte ( JeuArithmetique.DIFFICILE );
            break;
        }
    }
    
    public static int calcul(int x , int y, char type){
        int reponse=0;
        switch (type){
            case('/'): reponse=x/y;
            break;
            case('-'):reponse=x-y;
            break;
            case('+'):reponse=x+y;
            break;
            case('*'):reponse=x*y;
            break;
        }
        return reponse;
    
    }
    
    public static boolean NouvelleOperation(){
        String c;
        boolean valide=false;
        message("\nVoulez-vous effectuer une operation (repondez par o ou n) ?");
        c=reponse().toUpperCase();
            switch(c){
            case("O"):valide=true;
            case("OU"):valide=true;
            case("OUI"):valide=true;
            break;
            case("N"):valide=false;
            case("NO"):valide=false;
            case("NON"):valide=false;
            break;
            default:
            message("\nEntré Invalide");
            valide=NouvelleOperation();
        }
        
        return valide;
    }
    
        public static String mention(int x, int y){
        String message;
        int temp =0;
        String text="TROLL";
        if(y!=0){
            temp=(x/y)*100;
                if(temp<50){
                    text="ÉCHEC";
                }else if(temp<60){
                    text="Passage";
                }else if(temp<70){
                    text="Bien";
                }else if(temp<80){
                    text="très Bien";
                }else{
                    text="Excellent";
                }
        }
        
        return (", votre score est "+temp+" % avec la mention "+text+"\nMerci d'avoir utilise nos services." );
    }
    public static int isNumeric(String x){
    
    
        return x;
    }
} // Tp2Gr20
