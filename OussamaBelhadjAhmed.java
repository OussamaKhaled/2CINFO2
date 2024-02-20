public class OussamaBelhadjAhmed {
    public static boolean estPremier(int nombre) {
        if (nombre <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0)
                return false;
        }
        return true;
    }

    public static String inverserChaine(String chaine) {
        return new StringBuilder(chaine).reverse().toString();
    }
    // cmnt
}
