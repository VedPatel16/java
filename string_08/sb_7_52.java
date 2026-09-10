// reverse the string (method-1)

package string_08;
import java.util.*;
public class sb_7_52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String word=sc.next();

        String rev=" ";
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }
        System.out.println(rev);

    }
}
