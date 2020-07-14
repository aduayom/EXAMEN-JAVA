import java.util.UUID;
public class Service implements IService {
    private UUID id;
    private String libelle;

    public Service() {
    }

    public Service(UUID id, String libelle) {
        this.id=id;
        this.libelle=libelle;
    }

    public UUID getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String affiche() {
        return "id: " +id + " libelle: " + libelle;
    }
    /*
    public boolean compare(int id){

    }
    public boolean compare(String libelle){
        
    }
    */
}