public class App {
    public static void main(String[] args) throws Exception {
        Point p1 = new Point("A",1,4);
        Point p2 = new Point("B",4,8);

        Line l1 = new Line("line1", p1,p2);

        System.out.printf("The length of %s is %f", l1.getName(),l1.getLength());
    }
}
