interface father{
    abstract void age();
    abstract int dob();
}

interface mothe{
    abstract void gender();
}

class son implements father, mothe{
    @Override
    public void age() {
        System.out.println("12");

    }

    @Override
    public int dob() {
        System.out.println("01-06-2004");
        return 0;
    }
    public void gender(){

    }
}
public class multiple {
    public static void main(String[] args) {
        son s= new son();
        s.age();s.dob();
    }
}
