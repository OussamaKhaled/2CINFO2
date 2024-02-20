import java.util.Arrays;

public class MehdiYounsi {
    public static int trouverMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max)
                max = tableau[i];
        }
        return max;
    }

    public static int[] concatenerTableaux(int[] tableau1, int[] tableau2) {
        int[] resultat = Arrays.copyOf(tableau1, tableau1.length + tableau2.length);
        System.arraycopy(tableau2, 0, resultat, tableau1.length, tableau2.length);
        return resultat;
    }
}
