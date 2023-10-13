abstract class chubb{
    abstract void printinfo();
}
class employee extends chubb{
    void printinfo(){
        String name="Akhil";
        int age=21;
        float sal=7.0f;

        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
    }
}
public class abstraction {
    public static void main(String[] args) {
        chubb c=new employee();
        c.printinfo();
    }
}
