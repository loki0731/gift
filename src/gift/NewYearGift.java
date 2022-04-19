package gift;

import candies.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NewYearGift implements Comparable<Candy> {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static List<Candy> gift;

    private static void menu(){
        System.out.println("\nWhich candy you wanna input: ");
        System.out.println("1 - chocolate; " +
                "2 - marshmallow; " +
                "3 - lollipop; " +
                "4 - toffee; ");
    }

    public static void create(){
        try {
            gift = new ArrayList<>();
            System.out.println("Enter number of candies in gift: ");
            int numberOfCandies = Integer.parseInt(reader.readLine());
            for(int i = 0 ; i < numberOfCandies ; i++){
                add();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void add(){
        try {
            menu();
            int key = Integer.parseInt(reader.readLine());
            switch(key){
                case 1:
                    gift.add(new Chocolate("Alenka",100,51.9,"milk"));
                    break;
                case 2:
                    gift.add(new Marshmallow("Charovei",95,71.2,true));
                    break;
                case 3:
                    gift.add(new Lollipop("ChupaChups",54,30.1,"cherry"));
                    break;
                case 4:
                    gift.add(new Toffee("Meller",85,43.2,false));
                    break;
                default:
                    System.out.print("\nIncorrect input...");
                    System.out.println("You will get one less candy :( ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void found() {
        try {
            System.out.println("\nEnter the range of sugar content: ");
            System.out.println("Minimum: ");
            int minRange = Integer.parseInt(reader.readLine());
            System.out.println("Maximum: ");
            int maxRange = Integer.parseInt(reader.readLine());
            System.out.println("\nCandies with sugar content more then " + minRange + "g and less then " + maxRange + "g :");
            for(Candy array : gift){
                if(array.getSugarContent() >= minRange && array.getSugarContent() <= maxRange)
                    System.out.println(array);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void show(){
        double weightOfGift = 0;
        System.out.println();
        for(Candy gift : gift){
            System.out.println(gift);
            weightOfGift += gift.getWeight();
        }
        System.out.println("\nWeight of gift = " + weightOfGift + "g");
    }

    public static void sortByWeight(){
        gift.sort(weightComparator);
        System.out.println("List was sorted by WEIGHT.");
    }

    public static void sortBySugar(){
        gift.sort(sugarContentComparator);
        System.out.println("List was sorted by SUGAR CONTENT.");
    }

    public static void sortByName(){
        gift.sort(nameComparator);
        System.out.println("List was sorted by NAME.");
    }

    private static final Comparator<Candy> weightComparator = (o1, o2) -> (int) (o2.getWeight() - o1.getWeight());

    private static final Comparator<Candy> sugarContentComparator = (o1, o2) -> (int) (o2.getSugarContent() - o1.getSugarContent());

    private static final Comparator<Candy> nameComparator = Comparator.comparing(Candy::getName);

    @Override
    public int compareTo(Candy o) {
        return 0;
    }

    public static void finalMenu(){
        create();
        try {
            int key;
            do {
                forFinalMenu();
                key = Integer.parseInt(reader.readLine());
                switch (key){
                    case 1 :
                        show();
                        break;
                    case 2:
                        found();
                        break;
                    case 3:
                        sortByName();
                        break;
                    case 4:
                        sortByWeight();
                        break;
                    case 5:
                        sortBySugar();
                        break;
                    case 6:
                        System.out.println("EXIT.");
                        break;
                    default:
                        System.out.println("Incorrect input.\nTry again.");
                        break;
                }
            }while (key!=6);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void forFinalMenu(){
        System.out.println("\nMENU:\n" +
                "1 - show our gift;\n" +
                "2 - find a candy in a given range;\n" +
                "3 - sort the list by name;\n" +
                "4 - sort the list by weight;\n" +
                "5 - sort the list by sugar content;\n" +
                "6 - exit;\n");
    }
}