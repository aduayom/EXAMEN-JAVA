import java.util.UUID;
public abstract class Employe implements IService {
    protected UUID id;
    protected String nomComplet;
    public Employe(){
    }
    public Employe(UUID id, String nomComplet) {
        this.id=id;
        this.nomComplet=nomComplet;
    }
    //getters et setters de id
    public UUID getId(){
        return this.id;
    }
   
    //getters et setters de nom
    public String getNomComplet(){
        return this.nomComplet ;
    }
    public void setNomComplet(String nomComplet){
		this.nomComplet=nomComplet;
    }
    public boolean isEmbauche(){
        return true ;
    }
    public boolean isJournalier(){
        return true ;
    }

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }
}