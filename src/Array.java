import java.util.Arrays;

public class Array {
    int size;
    int[] array;

    public Array(int[] inputArray, int inputSize) {
        this.array = inputArray;
        this.size = inputSize;
    }

    public boolean compareElements(int i, int j) {
        return this.array[i] == this.array[j] & i != j;
    }

    public void deleteRepeats() {
        for (int i = 0; i < this.size; i++) {
            for (int j = i + 1; j < this.size; j++) {
                if (compareElements(i, j)) {
                    for (int k = j; k < this.size - 1; k++) {
                        this.array[k] = this.array[k + 1];
                    }
                    this.size -= 1;
                }
                if (this.array[i] == this.array[j]) {
                    j--;
                }
            }
        }
        this.array = Arrays.copyOf(this.array, this.size);
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.printf(" %d", this.array[i]);
        }
    }
}
