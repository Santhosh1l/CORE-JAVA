class calc{
    private  int n1;
    private int n2;
    public double getnum1(){
        return n1;
    }

public void setN1(int n1) {
        this.n1 = n1;
    }
    public double getnum2(){
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    protected double add(){
        return n1+n2;}


}

public class encapsulation {

    public static void main(String[] args) {
        calc c =  new calc();
        c.setN1(2);
        c.setN2(2);
        System.out.println(c.add());}
}
