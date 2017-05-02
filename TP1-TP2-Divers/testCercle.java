
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe testCercle ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
 
public class testCercle {

    // Autres m�thodes s'il y a lieu
    public static void main (String[] params) {
          //  Cercle c1; //
            int x;
            int circ;
            
            Cercle[] tableau=new Cercle[3];
            tableau[0]=new Cercle(3,4,3);
            tableau[2]= new Cercle(3,53,63);

            
        Cercle moncercle=new Cercle(1,2,3);
    
        Cercle.ajouterDeuxCercles(moncercle);
        Cercle.ajouterDeuxCercles2(tableau);
       // System.out.println(moncercle.getX()+"  "+moncercle.getY()+"  "+moncercle.rayon());
        
        for(int i=0; i < tableau.length;i++){
               if(tableau[i]!=null){
                System.out.println(tableau[i].getX()+"  "+tableau[i].getY()+"  "+tableau[i].rayon());
            }else{
                System.out.println(" enrigistrement null: "+i);
            }
        }

        
        Cercle3 c = new Cercle3(1,2,3);
        Cercle3 c1 =c.cloner();
        System.out.print(c);
            System.out.print("\nc1=: "+c1);
    } // main
    
} // testCercle
