interface name{
    abstract void call();
static void cl(){
    System.out.println("hello");
}
    default void print(){
        System.out.println("Hello world");
    }
}
class inte implements name{
    @Override
    public void call() {
        System.out.println("I am calling u");

    }
}

public class Inter {
    public static void main(String[] args) {
        inte b= new inte();
        b.call();
        b.print();
    }


}
