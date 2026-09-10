// wap to round off the decimal value.

import java.text.DecimalFormat;

public class roundoff_07 {
    public static void main(String[] args) {
        double value=17.3563784883334;

//  method-1
        double rounded=Math.round(value*100.0)/100.0;
        System.out.println(rounded);

//  method-2 using String.format
        String rounded1=String.format("%.2f",value);
        System.out.println(rounded1);

//  method-3 using DecimalFormat
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println(df.format(value));
// DecimalFormat is part of java.text package not java,util.*;
//        to avoid problem import java,text.DecimalFormat;


//  method-4
        System.out.printf("value is %.3f",value,"good");
    }
}
