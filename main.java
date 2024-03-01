import java.util.Arrays;

public class main  {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        
        // Utilisation des méthodes des différents membres
        System.out.println("Somme: " + OussamaKhaled.calculerSomme(tableau));
        System.out.println("Moyenne: " + OussamaKhaled.calculerMoyenne(tableau));

        System.out.println("Factorielle de 5: " + AhmedHichri.calculerFactorielle(5));
        System.out.println("Est pair: " + AhmedHichri.estPair(6));

        System.out.println("Est premier: " + OussamaBelhadjAhmed.estPremier(7));
        System.out.println("Inverser chaine: " + OussamaBelhadjAhmed.inverserChaine("hello"));

        System.out.println("Puissance: " + NouhaDawdi.calculerPuissance(2, 3));
        System.out.println("PGCD: " + NouhaDawdi.calculerPGCD(12, 18));

        int[] tableau2 = {5, 3, 9, 1, 7};
        SafeDhiafallah.trierTableauCroissant(tableau2);
        System.out.println("Tableau trié: " + Arrays.toString(tableau2));

        System.out.println("Est palindrome: " + SafeDhiafallah.estPalindrome("radar"));

        int[] tableau3 = {4, 8, 2, 6};
        System.out.println("Max: " + MehdiYounsi.trouverMax(tableau3));

        int[] tableau4 = {1, 2, 3};
        int[] tableau5 = {4, 5, 6};
        int[] concatene = MehdiYounsi.concatenerTableaux(tableau4, tableau5);
        System.out.println("Concaténation: " + Arrays.toString(concatene));
    }
}
