package sujetJava;
import java.io.Console;
import java.util.Scanner;



public class Version1 {

	//Creation d'un tableau 1 dimension pour les departments.
	public static final int[] Departements ={21,25,39,44,72,73,74,75,85,90};
			
	//Creation d'un tableau à 2 dimensions
	public static final double[][] tarifs = {{2,0.86,1.72,21.93,1.29,2.58,21.93},{2.1,0.83,1.66,22.5,1.2,2.4,22.5},{2.1,0.83,1.66,22.5,1.23,2.46,25},{2.2,0.79,1.58,24.19,1.19,2.37,24.19},{2.15,0.79,1.58,22.86,1.19,2.38,22.86},{2.4,0.84,1.68,25.4,1.26,2.52,25.4},{3.15,0.92,1.84,17.3,1.38,2.76,17.3},{2.5,1,1.24,0,1.5,1.5,0},{2.3,0.8,1.6,22.2,1.2,2.4,22.2},{2.2,0.83,1.66,21,1.15,2.3,21}};
	
	public static Scanner Saisie = new Scanner(System.in);
	
	//Fonction qui récupére la saisie
	public static int int_saisie(String chaine){
		//methode de ctrl
		int i=0;
		boolean OK=false;
		
		while(!OK)
		{
			System.out.println(chaine);
			
			try {
				
				i=Saisie.nextInt();
				OK=true;
			}
			catch(Exception ex){
				String c =Saisie.next();
				System.err.println("L'erreur suivant s'est produite :"+ex.toString());
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		//Variables locals
		int departements;
		int distance;
		int duree; //en minute
		int i=0; //recherche dans le tableau
		boolean trouve=false;
		
		//On demande le departements jusqu'a que la saisie soit correcte
		do{
			String chaine ="Veuillez saisir le numéro de departement:";
			//Saisie le département	
			departements=int_saisie(chaine);
			
			//Recherche dans le tableau
			while (i<Departements.length && trouve !=true)
			{
				if(departements==Departements[i])
				{
					trouve=true;//on a trouvé dans le tableau
				}
				i++;//on incrémente i
			}//fin du while
			
		}while(trouve==false);
		
		//On demande de saisir la durée en minute du trajet
			do{
					trouve=true;
					String chaine ="\nVeuillez saisir la durée du trajet en minute:";
					//Saisie la durée
					duree=int_saisie(chaine);
					
					if(duree<=0)//on regarde si le nombre saisie est bien supérieur à 0
					{
						trouve=false;
						System.out.println("\n Veuillez saisir une durée positive.");
					}
					
				}while (trouve==false);
		
		//On demande de saisir la distance parcourue

			do{
					trouve=true;
					String chaine="\n Veuillez saisir la distance du trajet (km):";
					//Saisie la distance
					distance=int_saisie(chaine);
					
					if(distance<=0)//on regarde si le nombre saisie est bien supérieur à 0
					{
						trouve=false;
						System.out.println("\n Veuillez saisir une distance positive.");
					}
					
				}while (trouve==false);
			
		
		//On souhaite savoir s'il s'agit d'un trajet en semaine ou le dimanche

			//on affiche les trajet possible
			System.out.println("\n Liste trajet possible :");
			System.out.println("\n\t S - Aller Simple");
			System.out.println("\n\t R - Aller Retour");
			
			String trajet;
			
			do{
				
				System.out.println("\n\t\t Veuillez choisir votre trajet effectué (S ou R) :");
				
				//On recupére la saisie
				trajet=Saisie.next();
				
			}while(trajet!="S" && trajet!="R");

		
		//On souhaite savoir si le trajet se fais de semaine ou le dimanche
			
			//on affiche les trajet possible
			System.out.println("\n Liste temps :");
			System.out.println("\n\t S - Semaine");
			System.out.println("\n\t D - Dimanche");
			
			String jour;
			
			do{
				
				System.out.println("\n\t\t Veuillez choisir (S ou D):");
				
				//On recupére la saisie
				jour=Saisie.next();
				
			}while(jour!="S" && jour!="D");

		//On souhaite savoir si le trajet été de nuit ou non
			
			//on affiche les trajet possible
			System.out.println("\n Liste des horaires :");
			System.out.println("\n\t J - Jour");
			System.out.println("\n\t N - Nuit");
			
			String horaire;
			
			do{
				
				System.out.println("\n\t\t Veuillez choisir (J ou N):");
				
				//On recupére la saisie
				horaire=Saisie.next();
				
			}while(horaire!="J" && horaire!="N");

	}

}