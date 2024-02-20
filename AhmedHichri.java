public class AhmedHichri {
    public static long calculerFactorielle(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculerFactorielle(n - 1);
    }

    public static boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }
}
