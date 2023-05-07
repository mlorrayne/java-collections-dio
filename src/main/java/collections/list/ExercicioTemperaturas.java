package collections.list;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima dessa média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1- Janeiro, 2 - Fevereiro, etc).
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        //Adicionando as temperaturas à lista:
        for(int i =0; i <= 5; i++){
            System.out.println("Digite a temperatura: ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }
        System.out.println();

        //exibindo todas as temperaturas
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t +" "));

        //média das temperaturas
        System.out.println("Média semestral: ");
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma/temperaturas.size();
        System.out.println(media);

        //Temperaturas acima da média
        //Obs: para exibir as temperaturas acima da média, foi usado o métdo de remoção das temperaturas inferiores.
        System.out.println("Temperaturas acima da média: ");
        Iterator<Double> iterator1 = temperaturas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < media) iterator1.remove();
        }
        System.out.println(temperaturas);

        //meses em que a temperatura ficou acima da média
        System.out.println("Meses com temperatura acima da média");
        Iterator<Double> iterator2 = temperaturas.iterator();

        int count = 0;
        while (iterator2.hasNext()){
            Double temp = iterator2.next();
            if (temp > media){
                switch (count){
                    case (0):
                        System.out.println("1 - Janeiro: " + temp);
                        break;
                    case (1):
                        System.out.println("2 - Fevereiro: " + temp);
                        break;
                    case (2):
                        System.out.println("3 - Março: " + temp);
                        break;
                    case (3):
                        System.out.println("4 - Abril: " + temp);
                        break;
                    case (4):
                        System.out.println("5 - Maio: " + temp);
                        break;
                    case (5):
                        System.out.println("6 - Junho " + temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }

    }
}
