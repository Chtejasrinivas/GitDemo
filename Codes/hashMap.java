//These are not synchronized and allows only one null value as a key
// and allows multiple null values as values in the key value pairs
import java.util.*;
public class hashMap
{
    public static void main(String[] args) 
    {
        Map <Integer,String> hmap=new HashMap<>();
        hmap.put(1,"Teja");
        hmap.put(2,"Srinivas");
        hmap.put(3,"Harsha");
        // Printing all the key value pairs
        System.out.println(hmap);
        System.out.println("Iterating hash map");
        for(Map.Entry m : hmap.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //getting keys
        System.out.println(hmap.keySet());
        //getting values
        System.out.println(hmap.values());
    }
}
