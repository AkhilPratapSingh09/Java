class Parent{
    public void display(){
        System.out.println("Parent");
    }
}
class child extends Parent{
    public void display(){
        System.out.println("child");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.display();

        child c=new child();
        c.display();

        Parent pc=new child();
        pc.display();
    }
}
