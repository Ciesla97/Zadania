import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNumbers = 0;

        System.out.println("How much numbers do you want introduce?");
        int numbers = sc.nextInt();
        while(numbers > 0 ){
            System.out.println("Podaj kolejną liczbę");
            numbers --;
            sumNumbers = sumNumbers + sc.nextInt();
        }

        System.out.println("Liczby po zsumowaniu to : " + sumNumbers);

    }
}