public class wrapper_class_33 {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static utility methods.

//  Autoboxing

        // Integer a=new Integer(1711);    --> old method
        Integer a = 123;
        System.out.println(a);
        // Double b=new Double(1711);      --> old method
        Double b = 3.14;
        // Character c=new Character(1711) --> old method
        Character c = '$';
        // Boolean d=new Boolean(1711);    --> old method
        Boolean d = true;

//        why we don't see option for string bcz String is already stored as a object
        String name="ved";

//  Unboxing

        int x = a;

//  it has some static utility methods :
//    1) convert various data type into string.

        String w = Integer.toString(1711);
        String e = Double.toString(17.16);
        String r = Character.toString('j');
        String t = Boolean.toString(false);

        System.out.println(w + e + r + t);

//    2) convert string to its primitive datatype.

        Integer v = Integer.parseInt("1234");
        Double i = Double.parseDouble("12.34");
        Character l = "patel".charAt(0);
//        parseCharacter is not available and chatAt() is not related to wrapper class
        Boolean n = Boolean.parseBoolean("ccc");
//        if we give any unofficial i/p ,except true or false it will return false.


//  method of Character wrapper class :
//    .isLetter() method.

        char ch = 'j';
        System.out.println(Character.isLetter(ch));

        char ch1 = '$';
        System.out.println(Character.isLetter(ch1));

        char ch2 = 'j';
        System.out.println(Character.isUpperCase(ch2));
    }
}
