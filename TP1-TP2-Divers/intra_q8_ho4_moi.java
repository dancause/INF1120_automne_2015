
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe intra_q8_ho4_moi ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class intra_q8_ho4_moi {

    // Autres m�thodes s'il y a lieu
    
    public static void main (String[] params) {
        
        int somme=0;
        int temp=0;
        int tour=0;
        boolean moin40=false;
       
        while (temp!=999)
        {
            System.out.print("Entré la température :");
            temp=Clavier.lireInt();
            if(temp !=999){
               if(temp >= -50 && temp <= 50) 
               {
                somme=somme+temp;
                tour++;
                moin40=moin40 || (temp<=-40);
                   
                } else{
                    System.out.println(" Erreur ");
            }
            
            
        }

    }//while
    if (moin40==true)
    {
        System.out.println(" au moins une température est à -40 ");
    }
    System.out.println(" somme : "+somme);
    System.out.println(" temp : "+temp);
    if(tour!=0){
        System.out.println(" moyenne : "+(somme/tour));
    }else{
    System.out.println(" moyenne : "+0);
    }
    
    System.out.println(" nbtour : "+tour);
    } // main
    
} // intra_q8_ho4_moi
