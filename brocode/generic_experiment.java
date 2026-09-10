import java.util.ArrayList;

public class generic_experiment {
    public static void main(String[] args) {

//***  1 : you are thinking that want to make a list of string, and you made the ArrayList.
//         why Arraylist,what is it? 1) see arraylist file know that for what arraylist is used.
//                                   2) ctrl+enter on ArrayList.
//        originally arraylist is arraylist<> list=new ArrayList<>(); aavu hoy.
//        but here we don't give the type of arraylist. sso problem occur.what problrm?
//        let we add integer by mistake. and we are thinking that we made list of all string.
//        when we are using the element of list assuming that all string but there is
//        integer or something different type data
        ArrayList list=new ArrayList();
        list.add("ved");
        list.add(17);

        System.out.println(list);

        String name=(String) list.get(1); // we expecting string but it is integer so,
//                                           we have to typecast explisitly ,which is not so good.
        String name2=(String) list.get(0); // dekhay che k string vhe chata pn typecast karvu pade j che,
        System.out.println(name);

//        solution

        ArrayList<String> list2=new ArrayList<>();
        list2.add("ved");
//        list2.add(17);  give compile time error,can't add except string.
    }
}
