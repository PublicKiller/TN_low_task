import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку:");
        StringUtil str = new StringUtil(new StringBuilder(console.nextLine()));
        StringBuilder result = str.reverse();
        System.out.println("Развёрнутая строка:");
        System.out.println(result);
    }
}