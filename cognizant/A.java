package cognizant;

import java.io.*;

class A{
    public static void main(String[] args) {
        B obj = new B(); // Creates an object of class B
        obj.print();
    }
}
    class B{
        static  void print(){
            System.out.println("hello");
        }
    }
