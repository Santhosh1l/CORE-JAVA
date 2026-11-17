public class inner_ {
   static class sum{


       void display() {
           System.out.println("Inside inner class defined in MainClass");
       }
    }

    public static void main(String[] args) {
        sum s = new sum();

        s.display();

    }
}
class outer extends inner_{
    void display(){

    }
}




