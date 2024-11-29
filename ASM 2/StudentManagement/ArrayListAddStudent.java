package StudentManagement;

import java.util.ArrayList;

public class ArrayListAddStudent {
    public void addStudent(ArrayList<Student> students, Student objectData){
        try {
            // Validate ID
            if (objectData.id == null || objectData.id.isEmpty()) {
                throw new IllegalArgumentException("Student ID cannot be empty!");
            }
            for (Student s : students) {
                if (s.id.equals(objectData.id)) {
                    throw new IllegalArgumentException("Student ID already exists: " + objectData.id);
                }
            }
            if (objectData.fullName == null || objectData.fullName.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty or whitespace!");
            }
            // Validate Mark
            if (objectData.mark < 0 || objectData.mark > 10) {
                throw new IllegalArgumentException("Mark must be between 0 and 10!");
            }
            // If valid, add student to the list
            students.add(objectData);
        } catch (IllegalArgumentException e) {
            // Handle validation errors
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
}


