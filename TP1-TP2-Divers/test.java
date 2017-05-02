
/**
 * I N F 1 1 2 0
 *
 * D�crivez votre classe test ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */

public class test {
public static void main(){
int nbseconde =0;
int NbHeure=0;
int Nbminute = 0;
int NbJour = 0;

        System.out.print("Entrez un nombre de seconde : ");
        nbseconde = Clavier.lireInt();


        while (nbseconde !=0) {
    
                if (nbseconde< 0){
                System.out.println("Nombre Négatif");
            }
                else{
                    Nbminute= nbseconde/60;
                    nbseconde= nbseconde % 60;
                    NbHeure= Nbminute / 60;
                    Nbminute= Nbminute % 60;
                    NbJour=NbHeure/24;
                    NbHeure= NbHeure % 24;
                    System.out.println("Jours: "+ NbJour);
                    System.out.println("Heures: "+ NbHeure);
                    System.out.println("Minutes: "+ Nbminute);
                    System.out.println("Secondes: "+ nbseconde);    
                }
                System.out.println("---------------------------------");
                System.out.print("Entrez un nombre de seconde : ");
                nbseconde = Clavier.lireInt();
            }


System.out.println("FIN");


        }
    }
    

