package collections.set;

/*
Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
 */

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos valores: ");
        System.out.println(soma/notas.size());

        System.out.println("Remova a nota zero: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba na lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram criadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verificar se os conjuntos estão vazios: ");
        System.out.println(notas.isEmpty());
        System.out.println(notas2.isEmpty());
        System.out.println(notas3.isEmpty());

    }
}
