package src;


interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

public class mutlitple_inhertitance  implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }

    public static void main(String[] args) {
        mutlitple_inhertitance obj = new mutlitple_inhertitance();
        obj.methodA();
        obj.methodB();
    }
}