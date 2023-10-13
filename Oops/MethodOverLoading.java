class Test{
    public int max(int a,int b){
        return a>b?a:b;

    }
    public int max(int a , int b, int c){
        if(a>b && a>c) return a;
        if(b>c) return b;
        return c;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Test t=new Test();
        t.max(10,5);
        t.max(10,5,11);
        System.out.println(t.max(10,5));
        System.out.println(t.max(10,5 , 11));
    }
}
