// ArrayList = A resizeable array that stores objects (autoboxing)
//             Arrays are fixed in size, but ArrayLists is resizable

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_34 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(11);
        list.add(6);

        System.out.println(list);

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(5.11);
        list1.add(11.06);
        list1.add(06.55);

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("mango");
        list2.add("apple");
        list2.add("orange");
        list2.add("banana");
        System.out.println(list2);
        list2.remove("banana"); // remove the element named banana
        list2.remove("grapes");  // if element is not there it do nothing
        System.out.println(list2);

        list2.set(1,"pineapple");  // replaces the element at index 1 with pineapple
        System.out.println(list2);

        System.out.println(list2.get(0)); //return the element stored at index 0
        System.out.println(list2.size());  // return the number of element in Arraylist


        Collections.sort(list2); // we have to import Collections package
                                 // it sorts String array in alphabetical order
        System.out.println(list2);

        for(String fruit: list2){
            System.out.println(fruit);
        }
    }
}


// ****methods of arraylist**********
// list.add(int,double,char,string);
// list.remove( ||           ||   );
// list.get(index);
// list.set(index,int/double/char/string);
// list.size();
// Collections.sort(list);
//         -> import java.util.Collections;
