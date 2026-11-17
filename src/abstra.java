public class abstra {

    public static void main(String[] args) {

        circle s= new circle();
        s.draw();
        s.display();
    }
}

abstract class shape{
    abstract void draw();
    void display(){
        System.out.println("hello");
    }
}
class circle  extends shape{
    void draw(){
        System.out.println("Hello");
    }
}


