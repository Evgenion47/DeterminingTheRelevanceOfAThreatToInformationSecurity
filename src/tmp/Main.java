package tmp;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] probabilityOfRealizationOrDegreeOfPossibleDamage = {"Низкая","Средняя","Высокая"};
        Random r = new Random();

        Scanner s = new Scanner(System.in);
        while (true!=false){
            s.nextLine();
            System.out.println("=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=+*=");
            int _tmpA = Math.abs(r.nextInt()%3);
            int _tmpB = Math.abs(r.nextInt()%3);
            String result = (_tmpA+_tmpB<2) ? "Неактуальна" : "Актуальна";
            System.out.println(probabilityOfRealizationOrDegreeOfPossibleDamage[_tmpA]+" "+probabilityOfRealizationOrDegreeOfPossibleDamage[_tmpB]+" "+result);
        }
    }
}
