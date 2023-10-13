public class runableinetface implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        runableinetface r=new runableinetface();
        Thread t= new Thread(r);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}
