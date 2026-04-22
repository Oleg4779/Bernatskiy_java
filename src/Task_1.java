import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        int a = checkNumber();
        System.out.println("Введите второе целое число: ");
        int b = checkNumber();

        compare(a, b);
        operations(a, b);
    }

    public static int checkNumber() {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        boolean isNumber = false;
        while(!isNumber) {
            if(scn.hasNextInt()) {
                x = scn.nextInt();
                isNumber = true;
            } else {
                System.out.println("Необходимо ввести целое число! Попробуйте еще раз: ");
                scn.nextLine();
            }
        }
        scn.close();
        return x;
    }

    public static void compare(int a, int b) {
        if(a > b) {
            System.out.println("a > b");
        } else if(a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void operations(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        if(b == 0) {
            System.out.println("Деление на 0 запрещено");
        } else {
            if(a % b != 0) {
                double res = (double) a / b;
                System.out.printf("%d / %d = %.2f%n", a, b, res);
            } else {
                System.out.println("a / b = " + (a / b));
            }
        }
        System.out.println("a * b = " + (a * b));
    }
}