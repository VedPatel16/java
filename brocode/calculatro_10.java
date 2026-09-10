import java.util.*;
public class calculatro_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=17;
        int b=11;
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> {
                if(b==0) System.out.println("infinity");
                else System.out.println(a/b);
            }
            case '%' -> System.out.println(a%b);
            default -> System.out.println("invalid choice");
        }
        double result=10.0/0.0;
        System.out.println(result);
    }
}
