package basics_01;

import java.util.*;
public class input_from_user_04 {
    public static void main(String[] args){
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in); // we can put anything instade of sc
        //String name=sc.next(); -->> [ by next() only one word ]
        String name=sc.nextLine();
//        nextnt();
//        nextfloat();  ..... double,long
        System.out.println(name+" your name is : "+name);
    }
}