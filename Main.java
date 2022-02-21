import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Array
	    String[] frutas = new String[5];
        frutas[0] = "Maçã";
        frutas[1] = "Manga";
        frutas[2] = "Morango";
        frutas[3] = "Banana";
        frutas[4] = "Laranja";

        // ArrayList
        ArrayList<String> frutasLista = new ArrayList();
        frutasLista.add("Maça");
        frutasLista.add("Manga");
        frutasLista.add("Morango");
        frutasLista.add("Banana");
        frutasLista.add("Laranja");

        System.out.println(frutasLista); // [Maça, Manga, Morango, Banana, Laranja]

        frutasLista.remove("Maça");
        System.out.println(frutasLista); // [Manga, Morango, Banana, Laranja]

        System.out.println(frutasLista.contains("Melancia")); // false

        frutasLista.forEach(fruta -> {
            System.out.println(fruta);
        });
        // Manga
        // Morango
        // Banana
        // Laranja

        System.out.println("Sua lista de frutas tem " +
                (frutasLista.size() + 1) + " itens.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o item que você quer adicionar na lista: ");
        String frutaDesejada = scanner.nextLine();
        frutasLista.add(frutaDesejada);
        System.out.println(frutasLista); // [Manga, Morango, Banana, Laranja, Goiaba]
    }
}