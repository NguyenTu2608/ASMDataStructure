package TradeOff;
import java.util.Arrays;
class ArrayListADT {
    private int[] array;
    private int size;
    public ArrayListADT(int initialCapacity) {
        array = new int[initialCapacity];
        size = 0;
    }
    public void append(int value) {
        if (size == array.length) {
            resize();
        }
        array[size++] = value;
    }
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
