// wap to generate a random string.

import java.util.*;
public class randomString_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();

        String character=("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789");
        StringBuilder random=new StringBuilder(" ");
        int len=10;
        int index;
        for(int i=0;i<len;i++){
            index=rm.nextInt(character.length());
            random.append(character.charAt(index));

//      when we use method as input of other method then aavu na aave { ' ' ," " ,....} see in append
        }

        System.out.println(random);
        sc.close();
    }
}
