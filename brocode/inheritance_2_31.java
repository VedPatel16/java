// we make the object of class a and store the value of variable a ,in object
// of class a which is a1.
// in such a case when we try to use variable a by the object of class b which is b1 then
// it will give error,
// bcz the value of variable a is stored in object a1.variable a can't accessed by object b1.

import java.util.*;
public class inheritance_2_31 {
    public static void main(String[] args) {
//        a a1=new a();
        b b1=new b();
        b1.geta();
        b1.getb();
        b1.mul();
    }
}

class a{
Scanner sc=new Scanner(System.in);
    int a=10;
    void geta(){
        System.out.println("enter the value of a");
        a=sc.nextInt();
    }
}

class b extends a{
    Scanner sc1=new Scanner(System.in);
    int b;

    void getb(){
        System.out.println("enter the value of b");
        b=sc1.nextInt();
    }

    void mul(){
        int c;
        c=a*b;
        System.out.println(c);
    }
}