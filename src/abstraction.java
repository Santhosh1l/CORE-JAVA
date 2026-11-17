package src;

public class abstraction {
    public static void main(String[] args) {
        circle c= new circle();
        c.draw();

    }}
    abstract class  shape{
        abstract void draw();
        void display(){
            System.out.println("display");
        }
    }

     class circle extends shape{
        @Override
        void draw() {
            System.out.println("circle");
        }
    }

