package ADT;

import java.util.*;
// System.out.println("Hello and welcome!");
//        HinhChuNhat rec = new HinhChuNhat( 4,5);
//        double dientichhcn = rec.CalculatorArea();
//        double chuvihcn = rec.CalculatorPermeter();
//        System.out.println("Dien tich hinh chu nhat la : " + dientichhcn);
//        System.out.println("Chu vi hinh chu nhat la " + chuvihcn);
//
//        HinhVuong rec1 = new HinhVuong(10,10);
//        double area1 = rec1.CalculatorArea();
//        System.out.println("Dien tich hinh vuong la : " + area1);
//
//        Shape sq = new HinhVuong(4,4);
//        double area3 = sq.CalculatorArea();
//        System.out.println("Dien tich hinh vuong la : " + area3);
//
//        //khoi tao doi tuong thuoc class produccontroller
//        //lam the nao de truy cap vao thuoc tinh cua doi tuong do
//        ProductController product = new ProductController(null);
//        String name = ProductController.myName; // la static nen khong can su dung doi tuong cua class
//        System.out.println("Ten cua ban la " + name);
//        ProductController.showAge();
//        ProductController.showAge();
//        ProductController.showAge();
//
//        int age = ProductController.age;// ma co the su dung class luon
//
//        System.out.println("Tuoi cua ban la " + age);
//
//
//        ArrayBasic array = new ArrayBasic();
//        //array.showArray();
//
//        int[] radNumbers = {300,4,1,9,5,7,8,10,2};
//        int max = array.maxNumberInArray(radNumbers);
//        System.out.println("Max in number : "+ max);
//
//        int min = array.minNumberInArray(radNumbers);
//        System.out.println("Min in number : "+min);
//
//        int TinhTongCacSoNguyenTo = array.sumNumbersInArray(radNumbers);
//        System.out.println("Tong cac so nguyen to : "+TinhTongCacSoNguyenTo);
//
//        int DemSoNguyenTo = array.countNumber((radNumbers));
//        System.out.println("Tong so cac so nguyen to la :" + DemSoNguyenTo);
//
//        double avgNumber = array.avgNumber(radNumbers);
//        System.out.println("Trung binh cong cac so nguyen to la : "+ avgNumber);
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedListADT LinkedListADT = new LinkedListADT();
        List<String> data = LinkedListADT.createLinkedList();
        LinkedListADT.addElement(data);


        LinkedListADT.addElementByIndex(data, 2, "Dragon");


        LinkedListADT.getElementByIndex(data,0);


        LinkedListADT.removeDataElement(data,0);

        LinkedListADT.reverseList(data);

//        LinkedListADT.changeDataElement(data,0,"hihi");

        LinkedListADT.findElement(data,"Dragon");

        LinkedListADT.findElementV1(data,"Cat");

        LinkedListADT.findElementV2(data,"Dog");

        LinkedListADT.loopElement(data);


        StackADT stackADT = new StackADT(5);
        Stack<Integer> dataStack = stackADT.createStack();
        stackADT.displayStack(dataStack);

        stackADT.removeStack(dataStack);

        stackADT.peekStack(dataStack);

        //stackADT.countElement(dataStack);
        //stackADT.findElement(dataStack,1);

        stackADT.isEmpty(dataStack);

//        stackADT.isEmpty1(dataStack1);



        System.out.println("Is stack full ? " + stackADT.isFull(dataStack));

        stackADT.loopElement(dataStack);

        //Queue<String> queue = queueADT.createQueue();
        //queueADT.insertDataQueue(queue);
//        Queue<String> animals = queueADT.createQueue();

        QueueADT queueADT = new QueueADT();
        Queue<String> colors = queueADT.createQueue();
        queueADT.showQueue(colors);

        queueADT.insertDataQueue(colors);

        queueADT.showQueue(colors);


        queueADT.checkSizeQueue(colors);

        //queueADT.getElementQueue(colors);

        queueADT.removeElement(colors);

        queueADT.getElementQueueV2(colors);

        queueADT.isEmptyQueue(colors);


//        System.out.println("Is the Queue full ? " + queueADT.isFullQueue(colors));

        //queueADT.removeElementV2(animals);
        //queueADT.showQueue(colors);
        //queueADT.removeElement(animals);
        //queueADT.showQueue(animals);
        queueADT.loopElement(colors);

        ArrayListADT arrayList = new ArrayListADT();
        List<String> animal = arrayList.createArrayList();
        arrayList.showArrayList(animal);
        arrayList.getElement(animal,1);
        arrayList.changElement(animal,1,"bird");
        arrayList.getSize(animal);
        arrayList.removeArrayList(animal,4);
        arrayList.loopElementArrayList(animal);

        Student student1 = new Student("BH001", "Ti", 18, "Ha Noi");
        Student student2 = new Student("BH002","Ngo", 18,"Ha Noi" );
        Student student3 = new Student("BH003", "Dan", 18, "Ho Chi Minh");
        Student student4 = new Student("BH004", "Siu", 18, "Ho Chi Minh");
        ArrayList<Student> dataStudent = new ArrayList<>();
        ArrayListStudent studentArrayList = new ArrayListStudent();
        studentArrayList.createDataStudent(student1,dataStudent);
        studentArrayList.createDataStudent(student2,dataStudent);
        studentArrayList.createDataStudent(student3,dataStudent);
        studentArrayList.createDataStudent(student4,dataStudent);

//        boolean checkingStudent = studentArrayList.checkdataStudentById(dataStudent,"BH005");
//        if ( checkingStudent )
//        {
//            System.out.println("Found it ");
//        }
//        else
//        {
//            System.out.println("Not found it ");
//        }
        studentArrayList.changeDataStudentById(dataStudent,"BH002","Mui");
        studentArrayList.showInforStudent(dataStudent);


        studentArrayList.removeDataStudentById(dataStudent,"BH003");
        studentArrayList.showInforStudent(dataStudent);



    }


}