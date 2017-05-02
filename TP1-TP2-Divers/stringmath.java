
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe stringmath ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 import static java.lang.Math.*;
 
public class stringmath {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        System.out.print(equation(1.00,8.00,1.00));
        System.out.print("\n"+rembourcementMensuelle(6.5,340000,25,5));
        
        int [] tabint={2,4,-9};
        int[] tabD2=new int [0];
         int[] tabD3=null;
       tabint=new int [tabint.length+1];
       
        
        String temp;
          System.out.print("\nEntrer un mots: ");
          temp=Clavier.lireString();
          System.out.print("\nmajuscule"+majuscule(temp));
          System.out.print("\n nbEspaces"+nbEspaces(temp));
          System.out.print("\n pas de E:  "+pasDeEDansMaChaine("EdeEDDEEEEFeee"));
          System.out.print("\n trouver le mot: "+trouveLeMot("onesmaison","mait"));
          
          afficher(tabint);
          afficher(tabD2);
           System.out.print("\n "+somme(tabint));
           System.out.print("\n "+somme(tabD2));
            System.out.print("\n "+somme(tabD3));
          //afficher(tab);
    }// main
    
    public static double equation(double a,double b, double c){
    
        
        return (-b+sqrt((b*b)-(4*a*c)))/(2*a);
  
    }
    public static double rembourcementMensuelle(double taux,int montant, int periode, int duree){
    
        return 0.0;
    }
    
    public static  boolean majuscule(String x) {
            boolean testMaj=false;
            if(x.length() !=0) {
                if(x.charAt(0)>='A' && x.charAt(0)<='Z' ) {
                testMaj=true;
            }
        }
        return testMaj;
    }
    
    public static int nbEspaces(String x){
        int nbrEspace=0;
       if(x.length() !=0) {
               for(int i =0; i<x.length();i++){
                    if(x.charAt(i)==' '){
                        nbrEspace++;
                    }
                }
               
            }
       return nbrEspace; 
            }
            
    public static String pasDeEDansMaChaine(String x){
        String newString="";
        for(int i=0; i < x.length();i++){
            if (x.charAt(i) != 'E' && x.charAt(i) !='e'){
                newString=newString+x.charAt(i);
            }
        }
        return newString;
    }
    
    public static boolean trouveLeMot(String x, String y){
  
        int b=0;
        int c=0;
        int i=0;
        int trouver=0;

        while (i != x.length() && y.length()==trouver){
            if(x.charAt(b)==y.charAt(c)){
                trouver++;
                c++;
                i++;
                b++;
            }else{
            b++;
            i++;
            }
        }
        return trouver==y.length();
    }
    
    public static void afficher(int [] x){
            
      if(x == null || x.length ==0 ){
        System.out.print("\nLe tableau est vide");
         }else {
                  for(int i=0;i<x.length;i++){
                System.out.print("\n "+(i+1)+" : "+x[i]);
            }
        }
            
    }
    
    public static int somme(int [] x){
       int somme=0;
        
         if(x == null){
             somme=Integer.MIN_VALUE;
         }else {
                  for(int i=0;i<x.length;i++){
             somme=somme+x[i];
            }
        }
        
       
        return somme;
    }
}

