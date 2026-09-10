import java.util.Scanner;

public class arrayOfObject_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//      variable that we will use multiple time for getting the data from user
        String name;
        String dept;
        int year;
        boolean isGood;

//      array of objects of five students. (data type is Student and array name is s .)
    Student[] s=new Student[3];
    for(int i=0;i<50;i++){
        System.out.println("enter name of "+i+1);
        name=sc.nextLine();
        System.out.println("enter dept of "+i+1);
        dept=sc.next();
        System.out.println("enter year");
        year= sc.nextInt();
        System.out.println("enter good or bad");
        isGood=sc.nextBoolean();

        sc.nextLine();
        s[i]=new Student(name,dept,year,isGood);
    }
    int count=0;
    while(count<3){
        System.out.println("displaying details of "+count+1);
        for(Student student: s){  // badha s mate display method call karo
            student.display();
            count++;
        }
    }

    }
}

class Student{
    String name;
    String dept;
   static int year;
    boolean isGood;

//  constructor
    Student(String name,String dept,int year,boolean isGood){
        this.name=name;
        this.dept=dept;
        this.year=year;
        this.isGood=isGood;
    }
//  method for displaying the data
    void display(){
        System.out.println(name);
        System.out.println(dept);
        System.out.println(year);
        System.out.println(isGood);
    }
}

