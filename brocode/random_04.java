import java.util.*;
public class random_04 {
    public static void main(String[] args) {
        Random rm=new Random(); // for this package is java.util.Random;

// wap to generate the random numbers and make a pair of three dies
        int random1=rm.nextInt(); // origin inclusive and end not inclusive
        int random2=rm.nextInt(1,7);
        int random3 =rm.nextInt(11);    //
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

// float random
        float floatrm=rm.nextFloat(12.99f);
        System.out.println(floatrm);

// char random
        char charrm=(char)('a'+rm.nextInt(26));
        System.out.println(charrm);

// wap for heads and tails
        boolean isHead=rm.nextBoolean();
        System.out.println("coin flip result is "+isHead);
    }
}
