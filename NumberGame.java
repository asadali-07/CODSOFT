import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomnum = (int) Math.floor(Math.random() * (max - min + 1) + min);
        // System.out.println(randomnum);
        Scanner sc = new Scanner(System.in);
        int guesses = 0;
        int n;
        System.out.println("Enter attempt you want to guess the number");
        int a = sc.nextInt();
        do {
            guesses++;
            if (guesses == a) {
                System.out.println("You have use all the attemps to be given!please try again!");
                break;
            }
            System.out.println("Enter the number:");
            n = sc.nextInt();
            if (randomnum == n) {
                System.out.println("you guess correct number!");
            } else if (randomnum < n) {
                System.out.println(" You gusses it wrong!Enter the lowest number!");
            } else {
                System.out.println("You gusses it wrong!Enter the greatest number!");
            }
        } while (randomnum != n);
        System.out.println("The number of gusses is:" + guesses);
        while (true) {
            String wlcm = "press 1 for play another round.\n press 2 for exit the game.";
            System.out.println(wlcm);
            System.out.println("Enter the your choice");
            int b = sc.nextInt();
            if (b == 1) {
                randomnum = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("Enter attempt you want to guess the number");
                a = sc.nextInt();
                guesses=0;
                do {
                    guesses++;
                    if (guesses == a) {
                        System.out.println("You have use all the attemps to be given!please try again!");
                        break;
                    }
                    System.out.println("Enter the number:");
                    n = sc.nextInt();
                    if (randomnum == n) {
                        System.out.println("you guess correct number!");
                    } else if (randomnum < n) {
                        System.out.println(" You gusses it wrong!Enter the lowest number!");
                    } else {
                        System.out.println("You gusses it wrong!Enter the greatest number!");
                    }
                } while (randomnum != n);
                System.out.println("The number of gusses is:" + guesses);
            } else if (b == 2) {
                System.out.println("Thanks for playing game,Have a great day");
                break;
            }
        }
    }
}
