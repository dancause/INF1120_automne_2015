
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe revision ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class revision {

    // Autres m�thodes s'il y a lieu
    public static final int x=99;
    
    public static void main (String[] params) {
           quesiton1a();
           quesiton1b();
           question1c();
           question1d();
           question1e();
           question2b();
           coursString();
           questionMois();
    } // main
    
    public static void quesiton1a()
    {
         System.out.println("question 1 a ");
        int a = 23; //nombre de 25¢
        int b = 6; //nombre de 10¢
        int c = 19; //nombre de 5¢
        int d = 15; //nombre de 1¢
        System.out.println((double)(a*25+b*10+c*5+d*1)/100);
        
    }
    
    public static void quesiton1b()
    {
          System.out.println("question 1 b ");
        int temp;
        int a = 23; //nombre de 25¢
        int b = 6; //nombre de 10¢
        int c = 19; //nombre de 5¢
        int d = 15; //nombre de 1¢
        temp=(a*25+b*10+c*5+d*1);
        System.out.print("argent: " + (temp/100) + " petite monnaie: "+ (temp%100));
        
        
    }
    
   public static void question1c(){
         System.out.println("question 1 c ");
        int tmp;
        double toto = 3.5;
        int test=(4 + 7 % 4 * 2);
        boolean condition;
        
        tmp = (int)(3.0 * (double)(4 + 7 % 4 * 2) / 4);
        condition = !(tmp / 2 == toto) || !(true == false) ;
        System.out.println(condition);
        System.out.println(test);
    
    }
    public static void question1d()
    {
         System.out.println("question 1 d ");
        System.out.println(true || false && false);
    }
    public static void question1e()
    {
        System.out.println("question 1 e ");
        double j = 4;
        double k = 2;
        System.out.println(2 / j / k);
        System.out.println(2 / (j / k));
    }
    public static void question2b()
    {
     System.out.println("question 2 b "); 
     int x = 14;
     int y = 0;
     int z = 1;

     do {
         y = y + x % 10;
         x = x / 10;
        
         if (y >= 5) {
             x = 14;
            
                 do {
                     z = z * (x % 10);
                     x = x / 10;
                 } while (x != 0);
            
             y = y * z;
         }
    
     } while (y <= 14);
     System.out.println("x:"+x);
     System.out.println("y:"+y);
     System.out.println("z:"+z);
    }
    
    public static void coursString(){
               System.out.println("coursString");
            String truc="allo";
            int machin=2;
            boolean bobo =false;
            String rep;
            String msg="Bonjour";
            
        rep=23+truc+(14+machin*3)+bobo;
        System.out.println(rep);
        System.out.println(msg.substring(2,5));
        System.out.println(msg.charAt(machin));
    
    }
    public static void questionMois(){
        int annee;
        int mois;
        System.out.println("Entrez une année: ");
        annee=Clavier.lireInt();
        System.out.println("Entrez un mois: ");
        mois=Clavier.lireInt();
        System.out.println("Nombre de jour dans le mois "+ nbJoursMois(annee,mois) );
    
    }
    
   public static int nbJoursMois(int ans,int mois){
         int jourMois=0;  
         if(mois==1 || mois == 3 || mois==5  || mois==7 || mois== 8 || mois==10 || mois==12){
                jourMois=31;
            }else if(mois==4 || mois == 6 || mois==9  ||  mois== 11){
                jourMois=30;
            }else if(mois==2){
                    if(estBisextyle(ans)){
                        jourMois=29;
                    }else{
                        jourMois=28;
                }               
            }

        return jourMois;
    }
    public static boolean estBisextyle(int x){
        
      return ((x%4==0)&&(x%100!=0)|| x % 400 ==0); 
    
    }
} // revision
