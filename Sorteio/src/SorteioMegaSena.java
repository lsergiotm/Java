import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SorteioMegaSena {

    public static void main(String[] args) {
        int totalNumeros = 6; // Defina o total de números desejado
        ArrayList<Integer> numerosSorteados = sortearNumeros(totalNumeros);
        System.out.println("Números sorteados: " + numerosSorteados);
    }

    public static ArrayList<Integer> sortearNumeros(int totalNumeros) {
        Random rand = new Random();
        Set<Integer> numerosSet = new HashSet<>();

        // Define a quantidade de números pares e ímpares a serem sorteados
        int pares = (int) (totalNumeros * 0.4286);
        int impares = totalNumeros - pares;

        // Números pares
        while (numerosSet.size() < pares) {
            int numeroPar = rand.nextInt(31) * 2; // Números pares entre 0 e 60
            numerosSet.add(numeroPar);
        }

        // Números ímpares
        while (numerosSet.size() < totalNumeros) {
            int numeroImpar = rand.nextInt(31) * 2 + 1; // Números ímpares entre 1 e 59
            if (numeroImpar <= 60) {
                numerosSet.add(numeroImpar);
            }
        }

        // Adiciona o número 10 com 35,71% de chance
        if (rand.nextDouble() < 0.3571) {
            numerosSet.add(10);
        }

        // Converte o conjunto para a lista
        ArrayList<Integer> numeros = new ArrayList<>(numerosSet);

        // Embaralha a lista de números
        Collections.shuffle(numeros);

        return numeros;
    }
}
