public class Main {

    private static Discriminante d = new Discriminante();
    private static Formula r = new Formula();

    public static void main(String[] args) {

        System.out.println("Hello world!");

        String entrada = args[0];
        String[] numeros = entrada.split(",");

        System.out.println(numeros);

        // 4,-3,-1
        int a = Integer.parseInt(numeros[0]);
        int b = Integer.parseInt(numeros[1]);
        int c = Integer.parseInt(numeros[2]);

        double delta = d.discriminante(a,b,c);

        System.out.println(delta);

        double raizDelta = r.raizQuadrada(delta);
        double xUm = r.solucaoUm(a,b,raizDelta);
        double xDois = r.solucaoDois(a,b,raizDelta);

        System.out.printf("X um é %.2f e X Dois é %.2f", xUm, xDois);

    }
}