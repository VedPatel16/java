// wap that take email id as input and stores string before @ as username and print it.

package string_08;
import java.util.*;
public class string_5_50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your e-mail id.");
        String e_mail=sc.next();

        String username=" ";
        for(int i=0;i<e_mail.length();i++){
            if(e_mail.charAt(i)=='@') break;
            else username+=e_mail.charAt(i);
        }
        System.out.println("username : "+username);
    }
}

// **** hint ****
// jem array ma i th element access karva mate arr[i]
// emm string i th element access karva mate string_name.charAt(i)