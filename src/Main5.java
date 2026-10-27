public class Main5 {
    public static void main(String[] args) {
        Point[] points = new Point[10];
        Rectangle[] rectangles = new Rectangle[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i);

        }
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);

        }
        for (int i = 0; i < points.length; i++) {
            rectangles[i] = new Rectangle(points[i], 1, 1);
            System.out.println(rectangles[i]);

        }
    }

}
