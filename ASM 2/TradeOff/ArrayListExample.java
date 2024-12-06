package TradeOff;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayListADT list = new ArrayListADT(5);

        list.append(10);
        list.append(20);
        list.append(30);
        list.printList(); // Output: 10 20 30

        list.delete(1);
        list.printList(); // Output: 10 30

        System.out.println(list.get(0)); // Output: 10
    }
}
