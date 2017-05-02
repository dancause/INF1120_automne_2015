
public class Tableau {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //         int[] tab = new int[10];
        //         for (int i = 0; i < tab.length; i++) {
        //             tab[i] = i * i;
        //             System.out.print(tab[i] + " ");
        //         }
        // 
        //         System.out.println();
        //         double[] tab1 = new double[10];
        //         System.out.println(tab1[0]);
        // 
        //         int[] tab2 = new int[ 10 ];
        //         System.out.println ( tab2 [ 10 ] ); //Array out of bounds
        // 
        //         double[] tab3 = new int[ 10 ];
        //         System.out.println ( tab3 [ 0 ] ); //cannot convert int to double
        // 
        //         int[ 5 ] tab4 = new int[ 5 ]; //syntax error on firts 5
        //         System.out.println (tab4 [ 0 ] );
        // 
        //         int[] tab5;
        //         System.out.println ( tab5 [ 0 ] ); //tab5 not initialised
        // 
        //         int[] tab6;
        //         System.out.println ( tab6.length ); //tab6 not initialised
        // 
        //         String[] tab7 = new String[3];
        //         tab7[0] = "Bonjour";
        //         tab7[1] = "Allo";
        //         for (int i = 0; i < tab7.length; i++) {
        //             System.out.println(tab7[i]);
        //         }
        // 
        //         String[] tab9 = new String[4];
        //         tab9[0] = "Bonjour";
        //         tab9[1] = "Allo";
        //         tab9[3] = tab9[1] + " " + tab9[0];
        //         for (int i = 0; i < tab9.length; i++) {
        //             System.out.println("i = " + i + " tab9[" + i + "] = " + tab9[i]);
        //         }
        //         String[] tab8 = new String[6];
        //         tab8[0] = "Bonjour";
        //         tab8[1] = "Allo";
        //         tab8[3] = "";
        //         tab8[2] = "";
        //         tab8[4] = "\ntable\n";
        //         for (int i = 0; i < tab8.length; i++) {
        //             System.out.println("i = " + i + " tab8[" + i + "]" + tab8[i].length()); 
        //         }// 
        // 
        //int[] tab10 = new int[5];
        //int[] tab11 = null;
        //int[] tab12 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1 };

        //afficher(tab10);
        //System.out.println(somme(tab11));
        //System.out.println(superieurZero(tab11));
        //System.out.println(maximum(tab12));

        //afficher(copie(tab12));
        //afficher(inverse(tab12));
        //int[] tabSuit = suite(2, 4);
        //for (int i = 0; i < tabSuit.length; i++) {
        //    System.out.print(tabSuit[i]+" ");
        //}
        //String[] tabPrefix = strPrefix("Bonjour");
        //for (int i = 0; i < tabPrefix.length; i++) {
        //    System.out.println(tabPrefix[i]);
        //}
        System.out.println("hi");
        int[] tabQ3 = null;
        int[] tab10 = new int[5];
        int[] tab11 = new int [0];
        tab10[4] = 6;
        tab10[2] = 3;
        tab10[3] = -3;
        tab10[0] = 3;
        int[] tab14 = {2,-4,5,1,0,2};
        int a = somme (tab10);
        //System.out.println("la valeure returnee par la methode somme = " + a);
        //afficher(tabQ3);
        //afficher(tab10);
        //afficher(tab11);
        afficheEtoilesTab14(tab14);
        //afficheEtoilesTab(tabQ3);
    }

    /**
     * Q3
     * ecrivez une methode afficher qui prend en parametre un tableau de nombres int et qui affiche le contenu du tableau a la console, 
     * un nombre par ligne. Si le tableau est null ou s'il a une longueur de 0, la methode doit le mentionner (afficher "tableau null" ou "tableau vide")
     */
    public static void afficher(int[] tab) {
        if (tab == null || tab.length == 0) {
            System.out.println("Tableau null ou vide!");
        } else {
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]+" ");
            }

        }
    }

    /**
     * Q4
     * ecrivez une methode somme qui prend en parametre un tableau de nombres int et qui retourne la somme des nombres contenus dans le tableau. 
     * Si le tableau est null la methode doit retourner la valeur Integer.MIN_VALUE. Si le tableau a une longueur de 0, la methode doit retourner 0.
     */
    public static int somme(int[] tab) {
        int somme = Integer.MIN_VALUE;
        if (tab != null) {
            if (tab.length == 0) {
                somme = 0;
            } else {
                somme = 0;
                for (int i = 0; i < tab.length; i++) {
                    somme = somme + tab[i];
                }
            }
        }
        return somme;
    }

    /**
     * Q4_ver2
     */
    public static int somme2(int[] tab) {
        int somme = 0;
        if (tab == null) {
            somme = Integer.MIN_VALUE;
        } else {
            for (int i = 0; i < tab.length; i++) {
                somme = somme + tab[i];
            }
        }
        return somme;
    }

    /**
     * Q5
     * ecrivez une methode qui prend en parametre un tableau de nombres int et qui retourne true si tous les nombres compris dans le tableau 
     * sont superieurs ou egaux a zero. La methode doit retourner true dans le cas ou le tableau est null ou de longueur 0.
     */
    public static boolean superieurZero(int[] tab) {
        boolean res = true;
        if (tab == null) {
            res = false;
        } else {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] < 0) {
                    res = false;
                }
            }
        }
        return res;
    }

    /**
     * Q6
     * ecrivez une methode maximum qui prend en parametre un tableau de nombres int et qui retourne le maximum des nombres compris dans le tableau. 
     * La methode doit retourner Integer.MIN_VALUE dans le cas ou le tableau est null ou de longueur 0.
     */
    public static int maximum(int[] tab) {
        int maximum = Integer.MIN_VALUE;
        if (tab != null && tab.length != 0) {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > maximum) {
                    maximum = tab[i];
                }
            }
        }
        return maximum;
    }

    /**
     * Q7
     * ecrivez une methode copie qui prend en parametre un tableau de nombres int et 
     * qui retourne une copie du tableau passe en parametre
     */
    public static int[] copie(int[] tab){
        int[] copie;
        if(tab == null){
            copie = null;
        }else{
            if(tab.length == 0){
                copie = new int[0];
            }else{
                copie = new int[tab.length];
                for(int i = 0; i < tab.length; i++){
                    copie[i] = tab[i];
                }
            }
        }       
        return copie;       
    }

    /**
     * Q8
     * Ecrivez une methode inverse qui prend en parametre un tableau de nombres int et qui retourne une copie du tableau 
     * passe en parametre mais en ordre inverse.
     */
    public static int[] inverse(int[] tab){
        int[] inverse;
        if(tab == null){
            inverse = null;
        }else{
            if(tab.length == 0){
                inverse = new int[0];
            }else{
                inverse = new int[tab.length];
                int index = tab.length - 1;
                for(int i = 0; i < tab.length; i++){
                    inverse[i] = tab[index];
                    index--;
                }
            }
        }       
        return inverse;     
    }

    /**
     * Q9
     * ecrivez une methode epure qui prend en parametre un tableau de nombres int et qui retourne un
     * nouveau tableau contenant uniquement, dans le meme ordre, les elements contenus dans le tableau passe
     * en parametre sauf les elements egaux a 0. Si le tableau passe en parametre est null, la valeur retournee doit etre null
     */
    public static int[] epure (int[] tab) {
        int[] tabEpure = null;
        if(tab != null){
            int nbZero = 0;
            for(int i = 0; i < tab.length; i++){
                if (tab[i] == 0) {
                    nbZero = nbZero + 1;
                } 
            }
            tabEpure = new int[tab.length - nbZero];
            for(int i = 0, j = 0; i < tab.length; i++){
                if (tab[i] != 0) {
                    tabEpure[j] = tab[i];
                    j++;
                } 
            }
        }
        return tabEpure;
    }

    /**
     * Q10
     * ecrivez une methode suite qui prend en parametre deux entiers, disons a et b. La methode doit
     * retourner un tableau de nombres int contenant les nombres entiers a, a+1, a+2, ..., b. Par exemple, si a = 3 et b = 11, 
     * la methode doit retourner le tableau contenant : 3, 4, 5, 6, 7, 8, 9, 10, 11. Si a > b, la methode doit retourner 
     * un tableau de longueur 0.
     */
    public static int[] suite (int a, int b) {
        int[] suit;
        int taille = 0;
        if (a < b) {
            taille = b - a + 1;
        }

        suit = new int[taille];
        if (a < b) {
            for(int i = 0; i < taille; i++){
                suit[i] = a + i;
            } 

        }

        return suit;
    }

    /**
     * Q11
     * ecrivez une methode prefixe qui prend en parametre une chaîne de caractere (String) et qui retourne
     * un tableau de String contenant tous les prefixes de longueur ≥ 0 de la chaîne passee en parametre. Si
     * la chaîne passee en parametre est null, la methode doit retourner null.
     */
    public static String[] strPrefix (String str) {
        String[] tabPrefix = new String[str.length()];
        String prefix = "";
        for(int i = 0; i < tabPrefix.length; i++){
            prefix = prefix + str.charAt(i);
            tabPrefix[i] = prefix;
        }
        return tabPrefix;
    }

    /**
     * Q12
     * ecrivez une methode qui prend en parametre un tableau de nombres int et qui affiche, pour chaque element du tableau, 
     * un nombre d'etoiles correspondant au nombre dans la case du tableau. Chaque serie d'etoiles, correspondant a chaque element du tableau, 
     * doit etre ecrite sur une ligne differente. Si le nombre est negatif, aucune etoile n'est affichee. Si le tableau est null, 
     * un message approprie doit etre affiche. 
     */
    public static void afficheEtoilesTab12 (int[] tab) {
        if(tab != null){

            for(int i = 0; i < tab.length; i++){
                if (tab[i] >= 0) {
                    afficherChar(tab[i], '*');
                }
                System.out.println();
            }

        } else {
            System.out.println("Le tableau est null");
        }

    }

    public static void afficherChar (int nb, char car) {
        for(int i = 1; i <= nb; i++){
            System.out.print(car);
        }

    }

    /**
     * Q13
     * Modifiez la methode ecrite en 6 pour qu'elle affiche au bout de chaque ligne d'etoiles, le nombre d'etoiles entre parentheses. 
     * Il faudra que les nombres soient tous sur la meme colonne. Aussi, le nombre ecrit a droite de la ligne ayant le plus d'etoiles 
     * doit l'etre avec un espace separant la derniere etoile d'avec la parenthese ouvrante. 
     */
    public static void afficheEtoilesTab13 (int[] tab) {
        if(tab != null){
            int max = maximum(tab) + 3;
            for(int i = 0; i < tab.length; i++){
                int nbSpc = max;
                if (tab[i] >= 0) {     
                    afficherChar(tab[i], '*');
                    nbSpc = max - tab[i];
                } 
                afficherChar(nbSpc, ' ');
                System.out.println("(" + tab[i] + ")"); 
            }

        } else {
            System.out.println("Le tableau est null");
        }

    }

    /**
     * Q14
     * Modifiez la methode ecrite en 6 pour qu'elle affiche les series d'etoiles a la verticale. 
     */
    public static void afficheEtoilesTab14 (int[] tab) {
        if(tab != null){
            int max = maximum(tab) + 3;
            for(int i = 1; i <= max; i++){
                for(int j = 0; j < tab.length; j++){
                    int nbSpc = max;
                    if (tab[j] >= 0 ) {
                        nbSpc = max - tab[j];
                    }
                    if ( i <= nbSpc ) {     
                        afficherChar(1, ' ');
                    } else {
                        afficherChar(1, '*');
                    } 
                }
                System.out.println(); 
            }
        } else {
            System.out.println("Le tableau est null");
        }

    }
}
