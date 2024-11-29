package ADT;

import java.util.ArrayList;

public class ArrayListStudent {
    public void createDataStudent(Student student, ArrayList<Student> arrayList)
    {
        arrayList.add(student);

    }

    public boolean changeDataStudentById(ArrayList<Student> arrayListStudent, String id,String nameStudent)
    {

        for (int i = 0; i < arrayListStudent.size(); i++)
        {
            if(arrayListStudent.get(i).getId().equals(id))
            {
                arrayListStudent.get(i).setName(nameStudent);
                return true;
            }

        }
        return false;
    }

    public boolean removeDataStudentById(ArrayList<Student> arrayListStudent, String id)
    {
        for (int i = 0; i < arrayListStudent.size(); i++)
        {
            if(arrayListStudent.get(i).getId().equals(id))
            {
                arrayListStudent.remove(i);
                return true;
            }

        }
        return false;
    }

    public void showInforStudent(ArrayList<Student> arrayListStudent)
    {
        for (Student item : arrayListStudent)
        {
            System.out.println("Id = " + item.getId() + "; Name = " + item.getName());
        }
    }


}
