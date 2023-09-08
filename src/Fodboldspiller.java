public class Fodboldspiller {

    //Attributter
    private String fornavn;
    String efternavn;
    private double højde;
    private int vægt;

    //parametre
    public Fodboldspiller(String fornavn, String efternavn, double højde, int vægt) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.højde = højde;
        this.vægt = vægt;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public double getHøjde() {
        return højde;
    }

    public int getVægt() {
        return vægt;
    }
}
