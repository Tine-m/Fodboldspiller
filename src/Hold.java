public class Hold {

    private Fodboldspiller[] spillerListe;
    int count = 0;

    public Hold() {
        this.spillerListe = new Fodboldspiller[3];
    }

    public void tilFøjSpiller(String fornavn, String efternavn, double højde, int vægt) {
        // count++ tæller én op og sikrer at næste spiller indsættes på næste indeksplads i arrayet
        spillerListe[count++] = new Fodboldspiller(fornavn, efternavn, højde, vægt);
    }

    public double beregnGennemsnitsHøjde() {

        //OPGAVE 2: Udskift den hardkodede værdi med en beregning.
        return 1.77;
    }

}
