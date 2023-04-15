//1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        int result = num * (num + 1) / 2;
        System.out.println("треугольное число от " + num + "равно: " + result);
    }
}
