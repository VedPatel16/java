// give input = kiya

package string_08;
import java.util.*;
public class String_4_49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter");
        String word=sc.next();
        System.out.println("you entered this :"+word);

//  it gives error sometimes.(change the string)
//      word="ved";

//  it is valid in string in java;
        String full=" Hi!"+word;
        System.out.println(full);

//  by taking inspiration from this.
        String result="*";  // it gives error without initializing
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='k') result+='j';
            else result+=word.charAt(i);
        }
        System.out.println(result);
    }
}
