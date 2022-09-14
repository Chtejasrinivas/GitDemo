//tree set is unordered and sorted collection of objects
// by default the order is ascdending order
import java.util.*;
public class treeset {
    public static void main(String[] args) {

        TreeSet <String> tree= new TreeSet<>();
        tree.add("Abc");
        tree.add("ABc");
        System.out.println(tree); //predict the output 
        //printing the every element in the treeset

        //intialize the iterator
        Iterator it1= tree.iterator();
        while(it1.hasNext()) {
            Object o = it1.next();
            System.out.println(o);
        }
    }
}
