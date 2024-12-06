package TradeOff;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedListADT list = new LinkedListADT();

        list.append(10);
        list.append(20);
        list.append(30);
        list.printList(); // Output: 10 20 30

        list.delete(20);
        list.printList(); // Output: 10 30

        System.out.println(list.get(1)); // Output: 30
    }
}

