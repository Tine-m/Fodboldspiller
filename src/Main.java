public class Main {

    public static void main(String[] args) {

        // Lav Hold objekt
        Hold dreamTeam = new Hold();

        // Tilføj spillere til hold
        // TODO spiller-info bør indlæses vha Scanner
        // Data er hardkodet for lettere at teste
        dreamTeam.tilFøjSpiller("Lionel", "Messi", 1.67, 68);
        dreamTeam.tilFøjSpiller("Cristiano", "Ronaldo", 1.87, 83);

        // OPGAVE 1:Tilføj endnu en spiller til holdet

        //Beregn gennemsnitshøjde på spillerne
        double gennemsnitsHøjde = dreamTeam.beregnGennemsnitsHøjde();
        System.out.println("Gennemsnitshøjden er: " + gennemsnitsHøjde);
    }
}
