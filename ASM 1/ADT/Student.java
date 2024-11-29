package ADT;

public class Student {
    public String Id;
    public String Name;
    public int Age;
    public String Address;

    public Student(String _Id, String _Name , int _Age, String _Address)
    {
        Id = _Id;
        Name = _Name;
        Age = _Age;
        Address = _Address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
