// here there is a few string methods

public class string_methods_09 {
    public static void main(String[] args) {
        String name="patel Ved ";
        char letter;
        letter=name.charAt(0);
        System.out.println(letter);
        letter=name.charAt(2);
        System.out.println(letter);    // char is mutable.

        int index=name.indexOf(' ');   // can be used for any character , give -1 if not found
        System.out.println(index);   // returns first matched index
        System.out.println(name.lastIndexOf(' '));
//
//        name="patel"; // gives error sometimes
//        System.out.println(name);

//        name=name.toUpperCase();
//        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name);

        String fav="       ved      ";
        System.out.println(fav);
        System.out.println(fav.trim());

        name=name.replace('e','i');
        System.out.println(name);
//         if we don't comment out the 18 and 19 line then it will not work


        System.out.println(name.isEmpty());

        if(name.contains("V")) System.out.println("it contains "+'v');

        if(name.equals("passward"))
            System.out.println(" passward not possible");
        else System.out.println("ok");
    }
}



