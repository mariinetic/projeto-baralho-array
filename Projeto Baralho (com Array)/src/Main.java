public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        System.out.println("Baralho original:");
        baralho.imprimirBaralho();

        baralho.embaralhar();

        System.out.println("\nBaralho embaralhado:");
        baralho.imprimirBaralho();

        System.out.println("\nDistribuindo 5 cartas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Carta retirada: " + baralho.distribuirCarta());
        }

        System.out.println("\nAinda tem cartas? " + baralho.hasCarta());

        System.out.println("\nDistribuindo o restante das cartas:");
        while(baralho.hasCarta()) {
            System.out.println("Carta retirada: " + baralho.distribuirCarta());
        }
        System.out.println("\nAinda tem cartas? " + baralho.hasCarta());
    }
}