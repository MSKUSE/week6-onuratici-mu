public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3,4);
        Rectangle r1 = new Rectangle(p1,3,4);
        System.out.println(Rectangle.counter);
        System.out.println(r1.counterForObject);

        Rectangle r2 = new Rectangle(p1,3,4);
        System.out.println(Rectangle.counter);
        System.out.println(r1.counterForObject);
        System.out.println(r2.counterForObject);

        System.out.println(Integer.parseInt("3"));

        System.out.println(p1);
    }
}