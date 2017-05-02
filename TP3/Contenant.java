
/**
 * I N F 1 1 2 0   -   g r o u p e   2 0   -   Automne 2015
 *
 * TP3 - partie 1
 * 
 * Nom : Janin Dancause
 * Code permanent : danj17087507
 * Courriel : janin2000@gmail.com
 * 
 * Nom :
 * Code permanent :
 * Courriel :
 * 
 * Classe decrivant un contenant ayant ces attributs :
 * La description du produit contenu dans le contenant (cha�ne de caracteres non nulle. 
 * La valeur pas defaut est la cha�ne vide)
 * 
 * La categorie de produit, un ENTIER (0 = non-classifie, 1 = alcoolise, 2 = jus, 
 * 3 = produit laitier, 4 = eau de source, 5 = eau gazeuse, 6 =  boisson gazeuse. 
 * La valeur par defaut est 1)
 * 
 * La capacite maximale, en millilitres, du contenant (un nombre entier positif superieur 
 * ou egal a 100, la valeur par defaut est 750ml).  Une fois attribuee, la capacite d'un 
 * contenant ne peut plus �tre modifiee.
 * 
 * La quantite en millilitres de produit dans le contenant (un nombre entier positif ou nul, 
 * inferieur ou egal a la capacite du contenant)
 * 
 * Un numero unique d'identification distinct pour chaque contenant (nombre entier positif 
 * superieur ou egal a 1). Le numero doit �tre genere automatiquement lors de la creation 
 * du contenant. Les numeros sont consecutifs et debutent a 1. Le numero d'un contenant ne 
 * doit PAS �tre modifie une fois qu'il a ete attribue.
 */

public class Contenant {


    // IMPORTANT : Vous DEVEZ utiliser les constantes partout ou c'est pertinent dans le code

    private static final String[] CATEGORIES = { "non-classifie", "alcoolise", "jus", "produit laitier",
        "eau de source", "eau gazeuse", "boisson gazeuse"};
     
    public static final int CATEGORIE_MIN = 0;
    public static final int CATEGORIE_MAX = CATEGORIES.length - 1;
    
    public static final int CAPACITE_MIN = 100;
    public static final int QUANTITE_MIN = 0;
    
    public static final int CATEGORIE_DEFAUT = 1;
    public static final int CAPACITE_DEFAUT = 750; 
    public static final String DESCRIP_DEFAUT = "";
    
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////
    //                               Methode utilitaire de CLASSE                        //
    ///////////////////////////////////////////////////////////////////////////////////////
    
    
   /******************************************************************************
    * Retourne la chaine de caracteres correspondant a une categorie recu en
    * parametre. Si le parametre ne correspond pas a une categorie existante, 
    * la methode retourne la chaine vide ("").
    ******************************************************************************/
     public static String categorie (int cat) {
         String temp= DESCRIP_DEFAUT;
         if (cat >= CATEGORIE_MIN && cat <= CATEGORIE_MAX)
         {
           temp = cat+" - "+CATEGORIES[cat]; 
          }
        return temp;
      }

    //////////////////////////////////////////////////////  
    //                   Constructeurs                  //
    //  IMPORTANT : DEUX de vos constructeurs doivent   //
    //              en appeler un autre...              //
    //////////////////////////////////////////////////////
    
    public Contenant (String description, int categorie, int capacite, int quantite ) {
        
        numero = numero +1;
        no = numero;
        
        if(description == null){
            this.description = DESCRIP_DEFAUT;
        }else{
            this.description = description;
        }
                
        
        if(categorie < CATEGORIE_MIN && categorie > CATEGORIE_MAX){
            this.categorie = CATEGORIE_DEFAUT;
        }else{
            this.categorie = categorie;
        }
        
        if(capacite < CAPACITE_MIN){
            this.capacite = CAPACITE_DEFAUT;
        }else{
            this.capacite = capacite;
        }
        
        
        if(quantite < QUANTITE_MIN){
            this.quantite = QUANTITE_MIN;
        }else if(quantite > this.capacite){
            this.quantite = this.capacite;
        }else{
            this.quantite = quantite;
        }
        
        
        
        
    }
    
    /**
     *  Ce constructeur cree un nouveau contenant en fonction des parametres recus.
     *  Si la description, la capacite ou la categorie ne sont pas parmi les valeurs
     *  permises, la valeur par defaut est attribuee a l'attribut correspondant.
     *  Le  contenant cree est rempli automatiquement a pleine capacite.
     *  Le numero de contenant est attribue automatiqument lors de la creation.
     */
    public Contenant (String description, int categorie, int capacite ) {
        
        this(description,categorie,capacite,capacite);
        
    }

    /** 
     *  Ce constructeur cree un nouveau contenant rempli a pleine capacite 
     *  ayant comme capacite 1 litre (1000 millilitres).
     *  Si la description ou la categorie ne sont pas parmi les valeurs
     *  permises, la valeur par defaut est attribuee a l'attribut correspondant.
     *  Le numero de contenant est attribue automatiqument lors de la creation.
     */
    public Contenant ( String description, int categorie ) {
        
        this(description,categorie,1000,1000);
        
    }
   // Observateurs (getters) d'instance
   
      public String getDescription(){
        return description;
        }
      public int getCategorie(){
        return categorie;
        }
      public int getCapacite(){
        return capacite;
        }
      public int getQuantite(){
        return quantite;
        }
      public int getNumero(){
        return no;
        }

  
    
    // Modificateurs (setters) d'instance
    
    
    /**
     * Modifie la quantite presente dans le contenant
     * Si la quantite recue en parametres n'est pas parmi
     * les valeurs permises, aucune modification n'est 
     * effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setQuantite ( int q ) {
        //un nombre entier positif ou nul, * inferieur ou egal a la capacite du contenant
            if(q <= capacite && q >= 0 ){
            quantite=q;
        }

    }
    
    /**
     * Modifie la categorie du contenant
     * Si la categorie recue en parametres n'est pas parmi
     * les valeurs permises, aucune modification n'est 
     * effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setCategorie ( int cat ) {
        
        if( cat >= CATEGORIE_MIN && cat <= CATEGORIE_MAX ){
            this.categorie=cat;
        } 
        
    }
    
    /**
     * Modifie la description du contenant
     * Si la description est null, aucune modification
     * n'est effectuee et aucun message d'erreur ne sera affiche.
     */
    public void setDescription ( String desc ) {
        if(desc != null){
            this.description = desc;
        } 
        
    }
    
   
    ///////////////////////////////////////////////////////////////////////////////////////
    //                             Methodes utilitaires d'instance                       //
    ///////////////////////////////////////////////////////////////////////////////////////
    
     /**************************************************************************** 
     *  Vide le contenant et retourne la quantite qui restait dans le contenant
     ****************************************************************************/
    public int vider () {
        int temp=0;
        
        temp=quantite;
        quantite=QUANTITE_MIN;
       
        return temp; // a enlever une fois la methode completee  
    } // vider
    
    /********************************************************************************** 
     *  Remplit le contenant et retourne la quantite qui a ete ajoutee pour le remplir
     ***********************************************************************************/
    public int remplir () {
        int temp;
        
        temp=quantite;
        quantite=capacite;
        
        return capacite-temp; // a enlever une fois la methode completee  
    } // remplir
    
    
    
     /******************************************************************************
     * Retourne une chaine de caracteres qui correspond aux caracteristiques d'un 
     * contenant. Chaque attribut est precede d'une courte description.
     * Pour la categorie, on doit inclure la valeur numerique ET la chaine de 
     * caracteres correspondante. 
     * Chaque attribut doit �tre sur une ligne differente.
     ******************************************************************************/
    public String toString(){

        return ("\nNumero: "+no+"\nDescription: "+description+"\nCategorie: "+categorie(categorie)+"\nCapacite: "+capacite+"ml\nQuantite: "+quantite+"ml");//pour que ca compile... a enlever une fois la methode complete       
    
    }
    
    

    //----------   P a r t i e   p r i v e e   ----------//

    // variable de classe (pour usage interne : donner un numero a chaque contenant cree)
    // Vous DEVEZ utiliser cette variable pour GENERER le numero de contenant.
    
     private static int numero=0;
     private int no;
     private String description; 
     private int categorie=1; 
     private int capacite; 
     private int quantite;
    

    // variables d'instance
   
    
} // Contenant