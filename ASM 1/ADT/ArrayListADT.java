package ADT;

import java.util.ArrayList;
import java.util.List;

public class ArrayListADT {
    public List<String> createArrayList()
    {
        //2 cach tao arraylist
        List<String> animals = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("chicken");
        animals.add("pig");
        animals.add("tiger");
        return animals;
    }
    public void showArrayList(List<String> arrayList)
    {
        System.out.println("My ArrayList : " + arrayList);
    }

    public void getElement(List<String> arrayList, int index)
    {
        String data = arrayList.get(index);
        System.out.println("Element : " + data);
    }

    public void changElement(List<String> arrayList, int index, String value)
    {
        arrayList.set(index,value);
        showArrayList(arrayList);
    }

    public void getSize(List<String> arrayList)
    {
        int size = arrayList.size();
        System.out.println("Size of ArrayList : " + size);
    }

    public void removeArrayList(List<String> arrayList, int index)
    {
        arrayList.remove(index);
        showArrayList(arrayList);
    }

    public void loopElementArrayList(List<String> arrayList)
    {
        //for (String item : arrayList)
        for ( int i = 0; i < arrayList.size(); i++)
        {
            System.out.println("Data item : " + arrayList.get(i));
        }
    }

}
