// 1) printf is a method used to print output
// 2) it is an alternative of print and println
// 3) syntax : %[flags]/[width]/[.precision]/[specifier-character]

public class printf_08 {
    public static void main(String[] args) {

        String name ="ved";
        char first='j';
        int dob=17;
        double fav=17.61;
        boolean isGod=true;

//  1) %[specifier-character]

        System.out.printf("my name is %.2s\n",name);
        System.out.printf("my dob is %d\n",dob);
        System.out.printf("first char is %c\n",first);
        System.out.printf("my fav is %f\n",fav);
        System.out.printf("god is exist %b\n",isGod);

        System.out.printf("%s is %d years old\n",name,dob);

//  2) %[.precision]

        double prise1=170000.3576475;
        double prise2=46.975344;
        double prise3=-25.2578543;

        System.out.printf("%.2f\n",prise1);
        System.out.printf("%.3f\n",prise2);
        System.out.printf("%.4f\n",prise3);

//  3) %[flags]

//        1) + = plus the output
//        2) , = comma grouping separator
//        3) ( = negative number are enclosed in ()
//        4) space = display minus if negative, space if positive


        System.out.printf("%+.2f\n",prise2);  // cant add - symbol
        System.out.printf("%+.2f\n",prise3);
        System.out.printf("%,+.2f\n",prise1);
        System.out.printf("%(.2f\n",prise3);
        System.out.printf("%(+.2f\n",prise3);
        System.out.printf("% .2f\n",prise2);
        System.out.printf("% .2f\n",prise3);

//  4) %[width]

//        1) 0 = zero padding
//        2) number = right justified padding
//        3) negative = left justifying padding

        int id1=1;
        int id2=23;
        int id3=324;
        int id4=3567;

        System.out.printf("%4d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%04d\n",id4);
        System.out.printf("%-4d\n",id1); // it releases the space see in output !!!!!!


    }
}
