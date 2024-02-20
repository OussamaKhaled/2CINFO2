public class NouhaDawdi {
    public static double calculerPuissance(double base, int exposant) {
        return Math.pow(base, exposant);
    }

    public static int calculerPGCD(int a, int b) {
        if (b == 0)
            return a;
        return calculerPGCD(b, a % b);
    }
}
