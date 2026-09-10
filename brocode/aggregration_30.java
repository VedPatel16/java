public class aggregration_30 {
    public static void main(String[] args) {
        book b1=new book("stranger things",2000);
        book b2=new book("mahotu",100);
        book b3=new book("satya na prayogo",500);

        book[] books={b1,b2,b3};
//        for(book bok : books){
//            bok.bookDetail();
//        }

        library l1=new library("veer narmad",1970,books);
        l1.libraryDetail();
    }
}
class library{
    String name;
    int year;
    book[] books;

    library(String name,int year,book[] books){
        this.name=name;
        this.year=year;
        this.books=books;
    }

    void libraryDetail(){
        System.out.println(name+" from "+year);
        System.out.println("books in "+name+" library");

        for(book bok : books){
            bok.bookDetail();
        }
    }
}

class book{
    String name;
    int pages;

    book(String name,int pages){
        this.name=name;
        this.pages=pages;
    }

    void bookDetail(){
        System.out.println(name+" "+"("+pages+")");
    }
}