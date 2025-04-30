import java.util.*;

public class Baralho {
    private final List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] naipes = {"Copas", "Ouros", "Espadas", "Paus"};
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String naipe : naipes) {
            for (String nome : nomes) {
                cartas.add(new Carta(nome, naipe));
            }
        }

        for (int i = 0; i < 4; i++) {
            cartas.add(new Carta("Coringa", "Coringa"));
        }
    }

    public void embaralhar() {
        Random random = new Random();
        int tamanho = cartas.size();

        for (int i = 0; i < tamanho; i++) {
            int j = random.nextInt(tamanho);
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public Carta distribuirCarta() {
        return hasCarta() ? cartas.remove(0) : null;
    }

    public boolean hasCarta() {
        return !cartas.isEmpty();
    }

    public void imprimirBaralho() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}