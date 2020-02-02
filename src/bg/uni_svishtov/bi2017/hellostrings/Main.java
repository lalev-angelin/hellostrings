package bg.uni_svishtov.bi2017.hellostrings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String abc = "abcdefghijklm";

	    /* Изваждане на символ на позиция N=3
         * Броенето е на база 0, т.е. в низа abc,
         * буквата а е на позиция 0,
         * b е на позиция 1, c е на позиция 2 и т.н.
         */
        System.out.println(abc.charAt(3));

        /* Определяне на дължината на низа в брой символи */
        System.out.println("Низът в променливата abc се състои от " +
                abc.length() +
                " символа");

        /* Слепяне на два символни низа */
        System.out.println("Това е "+"едно цяло");
        /* Същото може да става и с променливи от тип String */
        System.out.println(abc+abc);

        /* Изваждане на подниз от позиция N до позиция М */
        System.out.println(abc.substring(0, 3));

        /* Дали даденият низ съдържа копие на друг в себе си */
        if (abc.contains("cde")) {
            System.out.println("Променливата abc съдържа последователност от символи "+"cde");
        }


        /*****************************************************
         * МНОГО ВАЖНО!!!!
         *
         * Как сравняваме два низа за еднаквост в JAVA
         */

        /* ТАКА Е ГРЕШНО!!! */
        String a = "Тестов низ";
        String b = "Тестов низ";
        if (a==b) {
            /* Това може и да даде верен резултат в някои случаи, но е ГРЕШНО,
             * защото в други случаи ще даде false при сравнение!!!
             */
            System.out.println("Низовете са еднакви");
        }

        /* Така със сигурност ще даде, че двата низа са различни, дори когато
         * потребителят въведе едно и също!!!
         */
        Scanner scan = new Scanner(System.in);
        String c = scan.next();  //Въведете първи низ, например "abc"
        String d = scan.next(); //Въведете същия низ като горе
        if (c==d) {
            System.out.println("Низовете c и d са еднакви");
        }

        /* ПРАВИЛНИЯТ НАЧИН ЗА СРАВНЕНИЕ Е ТОЗИ: */
        if (c.equals(d)) {
            System.out.println("Съдържанието на низовете c и d е еднакво");
        }

    }
}
