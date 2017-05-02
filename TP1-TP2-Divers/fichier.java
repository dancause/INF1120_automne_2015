
/**
 * I N F x 1 2 0
 *
 * D�crivez votre classe fichier ici.
 * 
 * @author (votre nom) 
 * @version (une date)
 *
 * (votre code permanent)
 * (votre adresse de courriel)
 */
import java.io.*;
 
public class fichier {

    // Autres m�thodes s'il y a lieu
    
   public static void main(String[] args){
		String chaine="";
		String fichier ="fichiertexte.txt";
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
				chaine+=ligne+"\n";
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	
		//création ou ajout dans le fichier texte
		try {
			FileWriter fw = new FileWriter (fichier);
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter fichierSortie = new PrintWriter (bw); 
				fichierSortie.println (chaine+"\n test de lecture et écriture !!"); 
			fichierSortie.close();
			System.out.println("Le fichier " + fichier + " a été créé!"); 
		}
		catch (Exception e){
			System.out.println(e.toString());
		}		
	}
    
} // fichier
