/*
В восточном календаре принят 60-летний цикл, состоящий из 12-
летних подциклов, обозначаемых названиями цвета: зеленый,
красный, желтый, белый и черный. В каждом подцикле годы носят
названия животных: крысы, коровы, тигра, зайца, дракона, змеи,
лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года
определить его название, если 1984 год — начало цикла: «год
зеленой крысы».
*/

package lesson1zad3;

import java.util.Scanner;

public class Lesson1Zad3 {

    enum Yearanimal { rat, cow, tiger, rabbit, dragon, snake, horse, sheep, monkey,chicken, dog, pig}
    enum Yearanimalr { крыса, корова, тигр, заяц, дракон, змея, лошадь, овца, обезьяна, курица, собака, свинья}
    
    public static void main(String[] args) {
        int godindex;
        String yearcolor = "";
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vvedite god (Press 0 to exit): ");
            int god = scanner.nextInt();
            if ( god == 0) {
                System.out.println("By-by");
                break;
            }
            
            switch (god % 10){
                case 0: case 1:
                    yearcolor = "white";
                    break;
                case 2: case 3:
                    yearcolor = "black/blue";
                    break;
                case 4: case 5:
                    yearcolor = "green";
                    break;
                case 6: case 7:
                    yearcolor = "red";
                    break;
                case 8: case 9:
                    yearcolor = "yellow";
                    break;
            }

            godindex = (god - 1984) % 12;
            if (godindex < 0) {godindex = 12 + godindex;}

            System.out.println(god + " god - " + yearcolor + " " + Yearanimal.values()[godindex] + "("+ Yearanimalr.values()[godindex] +")");
            System.out.println("==================================");
         }
    }
}
