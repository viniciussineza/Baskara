public class Formula {

    public static double raizQuadrada(double delta) {
        return Math.sqrt(delta);
    }

    public static double solucaoUm(int a, int b, double raizDelta) {
        return (- b + raizDelta) / (2 * a);
    }

    public static double solucaoDois(int a, int b, double raizDelta) {
        return (- b - raizDelta) / (2 * a);
    }


}
