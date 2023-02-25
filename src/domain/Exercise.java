package domain;

public class Exercise {

    /**
     * Атрибут для задання розміру.
     */
    private int N;

    /**
     * Масив, що зберігає цілі числа.
     */
    private int[] array;

    /**
     * Метод, який встановлює розмір та ініціалізує масив.
     *
     * @param n розмір масиву
     */
    public void setSize(int n) {
        N = n;
        array = new int[N];
    }

    /**
     * Метод виводу масива.
     */
    public void displayArray() {
        for (int elem : array) {
            System.out.println(elem);
        }
    }

    /**
     * Метод, що заповнює масив за завданням.
     */
    public void fillArray() {
        int j = 0;
        int k = 0;
        for (int i = N / 2; i < array.length; i++) {
            array[i] = j;
            j++;
        }
        for (int i = N / 2; i >= 0; i--) {
            array[i] = k;
            k++;
        }
    }
}