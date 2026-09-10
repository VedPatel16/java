// it shows the use of super keyword

public class superKeyword_23   {
    public static void main(String[] args) {
        human h1=new human("ved","patel");
        h1.printName();
        System.out.println(h1);     // see in tostring method -> why giving hash code

        stu s1=new stu("nisarg","patel",7.1);
        s1.printStu();

        emp e1=new emp("vansh","patel",200000);
        e1.printEmp();
    }
}

class human {
    String firstName;
    String lastName;

    human(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    void printName(){
        System.out.println(firstName+" "+lastName);
    }
}
class stu extends human{
    double gpa;

    stu(String firstName,String lastName,double gpa){
        super(firstName,lastName);
        this.gpa=gpa;
    }

    void printStu(){
        System.out.println(firstName+" "+lastName+"'s G.P.A. = "+gpa);
    }
}

class emp extends human{
    double salary;

    emp(String firstName,String lastName,double salary){
        super(firstName,lastName);
        this.salary=salary;
    }

    void printEmp(){
        System.out.println(firstName+" "+lastName+"'s salary is "+salary);
    }
}
