import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество символов в массиве:");
        int size = console.nextInt();
        System.out.println("Введите элементы массива:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
        Array someArray = new Array(array, size);
        someArray.deleteRepeats();
        someArray.print();
    }
}