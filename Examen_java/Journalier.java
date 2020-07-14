import java.util.UUID;

public class Journalier extends Employe {
    private int duree;
    private int forfait ;

    public Journalier() {

    }
    public Journalier(int duree, int forfait , UUID id, String nomComplet) {
        super(id, nomComplet);
        this.duree=duree;
        this.forfait=forfait;
    }

    public int getduree() {
        return duree;
    }

    public void setduree(int duree) {
        this.duree=duree;
    }

    public int getForfait() {
        return forfait;
    }

    public void setForfait(int forfait) {
        this.forfait = forfait;
    }
    
    @Override
    public String affiche(){
       return super.affiche() +" forfait : "+ forfait +" durée "+ duree;
    }
    
}