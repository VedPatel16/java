import java.lang.reflect.Array;
import java.util.Arrays;

public class forEachLoop_13 {
    public static void main(String[] args) {
        String fruits[]={"banana","mango","apple","kivi"};
        Arrays.sort(fruits);                //*****************  new  ************
//      Arrays.fill(fruits,"sugarcane");    //*****************  new  ************

//  for each loop( enhanced for loop)
        for(String fruit:fruits){           // ***********  new  *************
            System.out.println(fruit);      // only use in reading process(print)
        }

        char letter[]={'v','e','d','a','y','j','i'};
        Arrays.sort(letter);
        for(char var:letter){
            System.out.println(var);
        }
    }
}
