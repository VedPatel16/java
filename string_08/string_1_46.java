// some string function is  in-built in String class which is part of java.lang package which is in-built in jdk.

// string is immutable.
package string_08;
import java.util.*;
public class string_1_46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="ved mahesh ";
//        name.setcharAt(4)='j';     **** not valid*****
//        System.out.println(name);
        System.out.println(name.length());
// **** note **** in array for length -> array_name.length
//               in string for length -> string_name.length()

        System.out.println("enter your surname.");
        String sName=sc.nextLine();
        System.out.println(sName);

//        concatenation
        String fName=name+"@"+" "+sName;
        System.out.println(fName);

//        charAt
        for(int i=0;i< fName.length();i++){
            System.out.println(fName.charAt(i));
        }

    }
}

// 1) name.setCharAt(i)='j'; can't use in normal string
// 2) name.charAt(i);
// 3) concatenation
// 4) s1.compareTo(s2)
// 5) s1,equals(s2)
// 6) s1.substring(_,_)

// 7) name.toUpperCase();
// 8) name.toLowerCase();
// 9) name.isEmpty();    *** returns true or false ****
//10) name.replace('old char','new char');
//11) if name="       ved      "
//      then to remove spaces  sout(name.trim());



