
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe loop ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */

public class loop {
 public static void main(){
     char x='a';
     int temp=0;
     for (int y=0; y<5; y++){
            for(int i=0; i<10; i++){
              x=(char)(temp);
              
              System.out.print(" Char: " + x + " dec " + temp);
              x=x++;
              temp++;
            } 
             System.out.println("");
        }
       /* 
        int temp;
        int temp1=0;
        int temp2=0;
        
        System.out.print("entrer un nombre entier: ");
        temp=Clavier.lireInt();
        
        System.out.println(temp);
        
        do{
         System.out.print(temp%10);
         temp=temp/10;
        }
        while(temp!=0);*/
        
}
}
