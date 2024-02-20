import java.util.Arrays;

public class SafeDhiafallah {
    public static void trierTableauCroissant(int[] tableau) {
        Arrays.sort(tableau);
    }

    public static boolean estPalindrome(String chaine) {
        String inverse = new StringBuilder(chaine).reverse().toString();
        return chaine.equals(inverse);
    }
}
