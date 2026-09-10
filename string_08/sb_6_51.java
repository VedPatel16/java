

package string_08;
import java.util.*;
public class sb_6_51 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ved");
        System.out.println(sb);

//        char at index any index
        System.out.println(sb.charAt(1));

//        set j at any index
        sb.setCharAt(0,'j');
        System.out.println(sb);

//        insert char at any index
        sb.insert(1,'i');
        sb.insert(2,'y');
        System.out.println(sb);

//        delete char at any index
        sb.delete(3,5);   // ending index is not inclusive.
        System.out.println(sb);
//        till hear playing with single character

//        append string
        sb.append('a');
        sb.append(   17);
        sb.append(11);
        sb.append("ved"); // str+="ved" <- approach without string builder

        System.out.println(sb);
    }
}

// 1) sb.charAt(index);
// 2) sb.setCharAt(index,'char'); **** can't set string
// 3) sb.insert(index,'char')
//       sb.insert(index,"str");
// 4) sb.delete(start index,end index);     start inclu and end exclu
// 5) sb.append(" ");
//       sb.append(' ');
//       sb.append(17);
