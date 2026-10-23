public class MainPoligono {
public static void main(String[] args) {
    Point[] puntos = new Point[4];
    puntos[0] = new Point(2, 2);
    puntos[1] = new Point(4, 2);
    puntos[2] = new Point(4, 4);
    puntos[3] = new Point(2, 4);
    Poligono p = new Poligono(puntos);
    System.out.println(p);
}
}