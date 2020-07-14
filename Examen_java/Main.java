import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	int choix;
	Scanner saisir=new Scanner(System.in);
	do{
		System.out.println("1-Ajouter un service");
		System.out.println("2-Lister les services");
		System.out.println("3-Ajouter un employé");
		System.out.println("4-Lister journalier");
		System.out.println("5-Lister les embauchés d'un service");
		System.out.println("6 -Quitter");
		choix=saisir.nextInt();
		switch(choix){
			case 1:
				System.out.println("Entrer le libelle du service");
				String libelle =saisir.nextLine();
				Service S1 = new Service(id,libelle);
            break;
			case 2:

			break;
			case 3:
				System.out.println("Entrer le nom complet de l'employé");
				String nomComplet =saisir.nextLine();
				String reponse;
				System.out.println("l'employe est il journalier: o/n: ");
				reponse =saisir.nextLine();
				isJournalier()==(reponse=="o");

			break;
			case 4:
			break;
			case 5:
            break;
        }
	} while (choix !=6) ;
	

}   
}