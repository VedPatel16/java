public class interface_27 {
    public static void main(String[] args) {
        rabbit r1=new rabbit();
        r1.flee();

        hawk h1=new hawk();
        h1.hunt();

        fesh f1=new fesh();
        f1.flee();
        f1.hunt();

    }
}

interface prey{
    void flee(); // abstract method
}
interface predator{
    void hunt();// abstract method
}

class rabbit implements prey{
    @Override
    public void flee(){
        System.out.println("rabbit is fleeing");
    }
}
class hawk implements predator{
    @Override
    public void hunt(){
        System.out.println("hawk is hunting");
    }

}
class fesh implements prey,predator{
    @Override
    public void flee() {
        System.out.println("fesh is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("fish is hunting");
    }
}
