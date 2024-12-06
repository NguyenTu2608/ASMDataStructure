package TradeOff;

class LinkedListADT {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Thêm phần tử vào cuối danh sách
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Xóa phần tử đầu tiên có giá trị cụ thể
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Lấy phần tử tại chỉ số
    public int get(int index) {
        int counter = 0;
        Node current = head;

        while (current != null) {
            if (counter == index) {
                return current.data;
            }
            counter++;
            current = current.next;
        }

        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    // In danh sách
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
