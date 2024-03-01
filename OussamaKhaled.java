public class OussamaKhaled {
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    public static double calculerMoyenne(int[] tableau) {
        int somme = calculerSomme(tableau);
        return (double) somme /    tableau.length   ;
    }
}
