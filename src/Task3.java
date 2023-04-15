//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

public class Task3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }if (count > 2){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
