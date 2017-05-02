
/**
 * I N F 1 1 2 0
 *
 */
 
public class SolutionTableaux {

    // Affichage du contenu d'un tableau d'entiers
   final static int INT_MIN =  Integer.MIN_VALUE;


   // Question 3
   public static void afficher(int[] tab){
                    
       if (tab==null){
           System.out.println("tableau null");
        }else if (tab.length==0){
            System.out.println("tableau vide");
        }else{
            for(int i=0;i<tab.length;i++){
                System.out.println("Elément " + i + " = " + tab[i]);
            } 
        }
    }
    
            
          
    // Question 4
    public static int somme(int[] tab){
       
       int somme = 0;
       
       if (tab == null){
           somme = INT_MIN;
        }else if (tab.length != 0){
            for(int i=0;i<tab.length;i++){
                somme = somme + tab[i];                
            } 
        } 
        return somme;
    }
    
    // Question 5
    public static boolean superieurAzero(int[] tab){
       int i = 0;
       boolean supAzero = true;
       
       if (tab != null){
             
            // si le tableau est vide alors zéro itération pour la boucle while et 'supAzero' reste égale à true
            while(i < tab.length && supAzero){
                if (tab[i] < 0){
                    supAzero = false;
                } else{
                    i = i + 1;
                }
            } 
        }            
        return supAzero;
    } // End superieurAzero
    
    // Question 6
     public static int maximum (int[] tab){
       int max = INT_MIN;
       
       if (tab != null && tab.length !=0){
                
                // Initialisation de max au premier élément du tableau
                max = tab[0];
                for(int i=0; i<tab.length; i++){
                    if (tab[i] > max){
                        max = tab[i];
                    } 
                } // End while           
       }            
       return max;
    } // End maximum

   
    
    // Question 7
    public static int[] copie (int[] tab){
       
       int []tabCopie = null;

      if (tab!= null){
          tabCopie = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            tabCopie[i] = tab[i];
        }
      }                         
        return tabCopie;
    } // End copie
    
    
    
    // Question 8
    public static int[] inverse (int[] tab){
       
       int [] tabInverse = null;
       int maxNo;
       
       if (tab != null){
           maxNo = tab.length - 1;
           tabInverse = new int[tab.length];
           for(int i = maxNo; i >=0 ; i--){
               tabInverse[maxNo - i] = tab[i];
               
            }
        }
                  
     return tabInverse;
    } // End inverse
    
    // Question 9
    public static int[] epure (int[] tab){
       
       int position = 0;
       int tailleTabEpure = 0;
       int [] tabEpure = null;
       
       if (tab != null){
           // compter le nombre de valeurs différentes de zéro = taille du nouveau tableau
           
           for(int i=0; i<tab.length; i++){
             if (tab[i] != 0){
                 tailleTabEpure = tailleTabEpure + 1;
             }
           }
            
           tabEpure = new int[tailleTabEpure];
           
           for(int i=0; i<tab.length; i++){
               if (tab[i] != 0){
                   tabEpure[position] = tab[i];
                   position = position + 1;
                }
               
            }
        }
                  
        return tabEpure;
    } // End epure
    
    // Question 10
    public static int[] suite (int a, int b){
       
       int tabSuite[] = {};
       int tailleTabSuite; // taille du tableau tabSuite qui dépend de la valeur de a et b
             
       
       if (a <= b ){
           // calcul de la taille du tableau tabSuite 
           tailleTabSuite =  b - a + 1;
           // réservation de l'espace pour le tableau tabSuite
           tabSuite = new int[tailleTabSuite];
           
           for(int i=0; i < tailleTabSuite; i++){
             tabSuite[i] = a + i;
           }
        
        }
                  
        return tabSuite;
    } // End suite
    
     // Question 11
    public static String[] prefixe (String ch){
       
       String [] tabPrefixe = null;
       int tailleTabPrefixe; // taille du tableau tabPrefixe 
       
      
       
       if (ch != null ){
           // calcul de la taille du tableau tabPrefixe 
           tailleTabPrefixe = ch.length() + 1;
           // réservation de l'espace pour le tableau tabPrefixe
           tabPrefixe = new String [tailleTabPrefixe];
           tabPrefixe[0]="";
           
           for(int i = 1; i <= ch.length(); i++){
             tabPrefixe[i] = tabPrefixe[i-1] + ch.charAt(i-1); // vous pouvez aussi utiliser la méthode substring() pour extraire les prefixes
             
           }
        
        }
                  
     return tabPrefixe;
    } // End prefixe
    
    
    //Question 12
    public static void afficheEtoiles (int [] tab){
        
        if (tab == null){
            System.out.println("Tableau null");
        } else {
            for(int i = 0; i < tab.length; i++){
                //on entre pas dans le for si le nombre est <= 0
                for (int j = 1; j <= tab[i]; j++){
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        
    }
    
    
    //Question 13
    public static void afficheEtoilesNombre (int [] tab){
        int max = 0;
        int espaces;
        
        
        if (tab == null){
            System.out.println("Tableau null");
        } else {
            for(int i = 0; i < tab.length; i++){
                if(max < tab[i]){
                    max = tab[i];
                }
            }
            
            for(int i = 0; i < tab.length; i++){
                
                if (tab[i] < 0){
                    espaces = max + 1;
                } else {
                    espaces = max - tab[i] + 1;
                }
                
                //on entre pas dans le for si le nombre est <= 0
                for (int j = 1; j <= tab[i]; j++){                    
                    System.out.print('*');
                }
                
                for (int k = 1; k <= espaces; k++){
                    System.out.print(' ');
                }
                System.out.println("(" + tab[i] + ")");
            }
        }
        
    }
    
    //Question 14
    public static void afficheEtoilesVert (int [] tab){
        
        int max = 0;
        
        if (tab == null){
            System.out.println("Tableau null");
        } else {
            
            for(int i = 0; i < tab.length; i++){
                if(max < tab[i]){
                    max = tab[i];
                }
            }
            
            for(int i = max; i >= 1; i--){
                for (int j = 0; j < tab.length; j++){
                    if(tab [j] < i){
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
        
    }
        
    public static void main (String[] params) {

    } // main
        
} // SolutionTableaux
