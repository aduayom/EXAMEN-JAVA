public class Enregistrement {
     
     final int TAILLE=10;
        private int nbreService=0;
        private int nbreEmploye=0;
        private int nbreEmbauche=0;
        private int nbreJournalier=0;
     //Declaration des Tableaux
     private Service [] tabService;
     private Employe [] tabEmploye;
     private Embauche [] tabEmbauche;
     private Journalier [] tabJournalier;
 
     public Enregistrement(){
         //Creation des Tableaux
         tabService=new Serivce[TAILLE];
         tabEmploye=new Employe[TAILLE];
         tabEmbauche=new Embauche[TAILLE];
         tabJournalier=new Journalier[TAILLE];
 
     }
 
 
     public void creerService(Serivce service){
         if(nbreService<TAILLE){
             //Generer ID de la Classe
             classe.setId(nbreClasse+1);
             tabclasse[nbreService]=service;
             nbreClasse++;
         }else{
             System.out.println("Tableau Rempli");
         }
     }

     public void listerService(){
         for(int i=0;i<nbreService;i++){
             System.out.println(tabService[i].affiche());
         }

     }
 
}