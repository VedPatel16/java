//String compare

package string_08;
import java.util.*;
public class String_2_47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//  compare string.  -> s1.compareTo(s2)
//                                    if s1>s2 -> returns +ve value
//                                    if equal -> returns 0
//                                    if s1<s2 -> returns -ve value
        String name1="ved";
        String name2="patel";
        if(name1.compareTo(name2)==0) System.out.println("equal");
        else System.out.println("not equal");

        if(name1.equals(name2)) System.out.println("equal");
        else System.out.println("not equal");



//  hello and wello ma wello is bigger. -> first it will first charactar.

//  it is another method but not efficient in every case.
        String n1="ved";
        String n2="ved";
        if(n1==n2) System.out.println("equal");
        else System.out.println("not equal");


//  another mystery.
        if(new String("ved")==new String("ved")) System.out.println("equal");
        else System.out.println("not equal");
//      **** reason ****
//      in java string is objects. --> more explanation will get in string builder lecture.

//        substring   ( first start index is inclusive and end index is exclusive
        String name="patel ved mahesh";
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(10,name.length()));

        String nameq=new String("ved");
        System.out.println(nameq);
    }
}
