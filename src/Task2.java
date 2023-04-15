import java.util.Scanner;

//Вычислить n! (произведение чисел от 1 до n)
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int fact = sc.nextInt();
        System.out.println(facktorial(fact));
    }

    static int facktorial(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 1;
        } else {
            return num * facktorial(--num);
        }
    }
}
