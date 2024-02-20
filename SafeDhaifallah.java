import java.util.Arrays;

public class SafeDhaifallah {
    public static void trierTableauCroissant(int[] tableau) {
        Arrays.sort(tableau);
    }

    public static boolean estPalindrome(String chaine) {
        String inverse = new StringBuilder(chaine).reverse().toString();
        return chaine.equals(inverse);
    }
}
