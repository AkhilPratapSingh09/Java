interface test{
    void meth1();
    void meth2();

}
class My implements test{
    public void meth1(){
        System.out.println("class My from Meth 1");

    }
    public void meth2(){
        System.out.println("class my from meth 2");
    }
}
public class interfaces {
    public static void main(String[] args) {
        test t=new My();
        t.meth1();
        t.meth2();
    }
}
