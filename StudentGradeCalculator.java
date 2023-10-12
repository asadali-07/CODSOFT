import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of subject you have!");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter the marks you have obtained out of 100 in all subject one by one.");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("All marks you give an input!");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
        }
        for (int i = 0; i < n; i++) {
            if (marks[i] <= 33) {
                System.out.println("You have failed due to less number in this subject you got onlymarks: " + marks[i]);
            }
        }
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        System.out.println("The all the given number is:" + sum);
        float percentage = sum / n;
        System.out.println("Percentage you have got in exam is: " + percentage + "%");
        if (percentage > 90 && percentage <= 100) {
            System.out.println("You have achieved grade: A1 ");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("You have achieved grade: A2 ");
        } else if (percentage > 70 && percentage <= 80) {
            System.out.println("You have achieved grade: B1 ");
        } else if (percentage > 60 && percentage <= 70) {
            System.out.println("You have achieved grade: B2 ");
        } else if (percentage > 50 && percentage <= 60) {
            System.out.println("You have achieved grade: C1 ");
        } else if (percentage > 40 && percentage <= 50) {
            System.out.println("You have achieved grade: C2 ");
        } else if (percentage > 33 && percentage <= 40) {
            System.out.println("You have achieved grade: D ");
        } else {
            System.out.println("You have achieved grade: E ");
            System.out.println("You have failed due to less percentage all subjects!Please Try Again and Work Hard!");
        }
    }
}