
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe testContenant ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class testContenant {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
   
        Contenant []test = new Contenant[10];
     test[0] = new Contenant("all",8,1000,10000);
      test[1] = new Contenant("gin",5,100,-1);
       test[2] = new Contenant("coolaid",1,1000,10);
       test[4] = new Contenant("eau",3,1500);
       test[5]=new  Contenant("eau",8);
       
       Contenant test2= new Contenant("coke",3,300);
    // test[3]=test[2];
   //test= new Contenant[11];
    // test[10]=new  Contenant("eau",3);      

         for(int i =0 ; i < test.length; i++)
         {
             if(test[i]!=null)
             {
             System.out.println(test[i]);
            }
            }
            System.out.println(test2);
         
    } // main
    
} // testContenant
