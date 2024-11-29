package StudentManagement;
import java.util.ArrayList;
import java.util.Comparator;

public class Student  {
    public String fullName;
    public String id;
    public double mark;
    public String rank;

    public Student(String id, String fullName, double mark)
    {
        this.id = id;
        this.fullName = fullName;
        this.mark = mark;

        if(this.mark >= 0 && this.mark <5){
            this.rank = "Fail";
        } else if (this.mark >=5 && this.mark < 6.5) {
            this.rank = "Medium";
        } else if (this.mark >= 6.5 && this.mark < 7.5) {
            this.rank = "Good";
        } else if (this.mark >= 7.5 && this.mark < 9) {
            this.rank = "Very Good";
        } else if(this.mark >= 9 && this.mark <= 10){
            this.rank = "Excellent";
        } else {
            this.rank = null;
        }
    }
    //getter and setter java for fullname
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public double getMark(){
        return mark;
    }
    public void setMark(double mark){
        this.mark = mark;
    }

    /*
    @Override
    public int compareTo(Student compareStu) {
        if(this.mark < compareStu.getMark()){
            return  -1;
        } else if (compareStu.getMark() < this.mark) {
            return 1;
        }
        return 0;
    }
     */
    public static Comparator<Student> IdStudentComparator = new Comparator<Student>()
    {
        public int compare(Student o1, Student o2) {
            String idStu1 = o1.getId().toUpperCase();
            String idStu2 = o2.getId().toUpperCase();
            return  idStu1.compareTo(idStu2);
        }
    };
    public static Comparator<Student> FullNameStduComparator = new Comparator<Student>()
    {
        public int compare(Student o1, Student o2) {
            String fullName1 = o1.getFullName().toUpperCase();
            String fullName2 = o2.getFullName().toUpperCase();
            return fullName1.compareTo(fullName2);
        }
    };



    public static Comparator<Student> MarkStduComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            double mark1 = o1.getMark();
            double mark2 = o2.getMark();
            if(mark1 < mark2){
                return -1;
            } else if (mark2 < mark1) {
                return 1;
            }
            return 0;
        }
    };

    public static void bubbleSortByMark(ArrayList<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getMark() > students.get(j + 1).getMark()) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    public static void quickSortById(ArrayList<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            // Gọi đệ quy để sắp xếp các phần nhỏ hơn và lớn hơn pivot
            quickSortById(students, low, pi - 1);
            quickSortById(students, pi + 1, high);
        }
    }
    private static int partition(ArrayList<Student> students, int low, int high) {
        String pivot = students.get(high).getId(); // Chọn ID của phần tử cuối làm pivot
        int i = low - 1; // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            if (students.get(j).getId().compareTo(pivot) <= 0) {
                i++;
                // Hoán đổi hai sinh viên
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        // Hoán đổi pivot vào đúng vị trí
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1; // Trả về vị trí của pivot
    }




    @Override
    public String toString() {
        return "[ID = "+ id +" , fullName = " + fullName + ", mark = " + mark + " , rank  = " + rank + " ]";
    }
}
