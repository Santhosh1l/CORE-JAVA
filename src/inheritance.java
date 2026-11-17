package src;

class f{
    void house(){
        System.out.println("My house");
    }
}

public class inheritance extends f{
    public static void main(String[] args) {
       inheritance n= new inheritance();
       n.house();
    }
}