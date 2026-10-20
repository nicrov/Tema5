public class main {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        System.out.println(p.toString());
        p.moveTo(5,8);
        System.out.println(p.toString());
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
