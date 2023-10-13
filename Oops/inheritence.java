class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }

}
class cylinder extends circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class inheritence {
    public static void main(String[] args) {
        cylinder c= new cylinder();
        c.radius=7;
        c.height=6;
        System.out.println(c.volume());
    }
}
