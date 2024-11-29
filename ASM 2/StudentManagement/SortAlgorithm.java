package StudentManagement;

import StudentManagement.Student;

import java.util.ArrayList;

public class SortAlgorithm {
    public static void bubbleSortByMark(ArrayList<Student> students) {
        int n = students.size();
        // Outer loop for each pass through the list
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent students
            for (int j = 0; j < n - i - 1; j++) {
                // If the current student's mark is greater than the next student's mark
                if (students.get(j).getMark() > students.get(j + 1).getMark()) {
                    // Swap the students
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

            // Recursively sort the two halves
            quickSortById(students, low, pi - 1);
            quickSortById(students, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Student> students, int low, int high) {
        String pivot = students.get(high).getId(); // Pivot is the ID of the last student
        int i = low - 1;  // Index of the smaller element

        // Loop through the list and compare IDs
        for (int j = low; j < high; j++) {
            if (students.get(j).getId().compareTo(pivot) <= 0) {
                i++;
                // Swap students[i] and students[j]
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        // Swap the pivot element (students[high]) with students[i + 1]
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

}
