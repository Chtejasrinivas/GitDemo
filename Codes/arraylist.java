// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class arraylist {
    public static void main(String[] args) {
        //Creation of a Array List
        //Syntax ArrayList <dtype> name_of_list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); 
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        Iterator ie = list.iterator();
        while(ie.hasNext())
        {
            System.out.println(ie.next());
        }
        // the parameter to the "get" method is index
        for(int i=0;i<list.size();i++)
        {
             System.out.println(list.get(i));
        }
    }
}