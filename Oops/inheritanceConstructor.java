class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }

}
class child extends Parent{
    public child(){
        System.out.println("child onstructor");
    }
}
public class inheritanceConstructor {
    public static void main(String[] args) {
        Parent p=new Parent();
        child c=new child();
    }
}
