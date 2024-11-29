package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListEditStudent {
    public void editStudentByPosition(ArrayList<Student> students, int position, Student object) {
        try {
            // Validate inputs
            if (students == null || object == null) {
                throw new IllegalArgumentException("Student list or Student object cannot be null!");
            }
            // Validate position
            if (position < 0 || position >= students.size()) {
                throw new IndexOutOfBoundsException("Position out of bounds: " + position);
            }
            // Update student at the given position
            students.set(position, object);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            // Handle validation errors
            System.out.println("Error editing student by position: " + e.getMessage());
        }
    }

    public void editStudentById(ArrayList<Student> students, String id, Student data) {
        try {
            // Validate inputs
            if (students == null || id == null || data == null) {
                throw new IllegalArgumentException("Inputs cannot be null!");
            }
            boolean found = false;
            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(students.get(i).id, id)) {
                    students.set(i, data);
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new IllegalArgumentException("Student with ID " + id + " not found!");
            }
        } catch (IllegalArgumentException e) {
            // Handle validation errors
            System.out.println("Error editing student by ID: " + e.getMessage());
        }
    }
}



