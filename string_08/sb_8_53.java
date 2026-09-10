// reverse the sting (method-2)

package string_08;
import java.util.*;
public class sb_8_53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String input= sc.next();
        StringBuilder word=new StringBuilder(input);
        int len=word.length();

        char sample=word.charAt(2);
        System.out.println(sample);

//        getting inspire from above 2 lines
        for(int i=0;i<len/2;i++){
           char temp=word.charAt(i);
           word.setCharAt(i,word.charAt(len-1-i));
           word.setCharAt(len-1-i,temp);
        }

        System.out.println(word);
    }
}
