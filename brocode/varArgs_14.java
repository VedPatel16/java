// -> imagine the case in which there are no.of method with same name but have
//    different no. of input.
// -> to overcome this problem we can use variable-arguments

public class varArgs_14 {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3,4);
        add(1,2,3);
        add(3,5,7,8,9);
    }

    static void add(int... digits){        //can handle variable no. of arguments
        int sum=0;
        for(int num: digits){        // for each/enhanced for loop
            sum+=num;
        }
        System.out.println(sum);
    }
//    static void add(int a,int b){
//        System.out.println(a+b);
//    }
//    static void add(int a,int b,int c){
//        System.out.println(a+b+c);
//    }
//    static void add(int a,int b,int c,int d){
//        System.out.println(a+b+c+d);
//    }
//    static void add(int a,int b,int c,int d,int e){
//        System.out.println(a+b+c+d+e);
//    }


}
