import java.time.LocalDate;
import java.util.UUID;

public class Embauche extends Employe {

    private int Salaire;
    private LocalDate dateEmb;

    public Embauche() {

    }
    public Embauche(int Salaire, LocalDate dateEmb, UUID id, String nomComplet) {
        super(id, nomComplet);
        this.Salaire=Salaire;
        this.dateEmb=dateEmb;
    }

    public int getSalaire() {
        return Salaire;
    }

    public void setSalaire(int salaire) {
        this.Salaire = salaire;
    }

    public LocalDate getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(LocalDate dateEmb) {
        this.dateEmb = dateEmb;
    }
    
    @Override
    public String affiche(){
       return super.affiche() +" Salaire : "+ Salaire +" date Embauche "+dateEmb;
    }
    
    


}
  
