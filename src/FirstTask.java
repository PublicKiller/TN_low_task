import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку:");
        Palindrome pal = new Palindrome(console.nextLine());
        boolean result = pal.check();
        if (result) {
            System.out.println("Данная строка является палиндромом!");
        } else {
            System.out.println("Данная строка не является палиндромом!");
        }
    }
}