public class Poligono {
    private Point[] puntos;
    public Poligono(Point[] puntos) {
        this.puntos = puntos;
    }
    public Poligono() {
        puntos = new Point[100];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = null;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < puntos.length; i++) {
            s = s + puntos[i] + " - ";
        }
        s = s + puntos[0];
        return s;
    }
    public double getLength() {
        double length = 0;
        for (int i = 0; i < puntos.length - 1; i++) {
            Segment side = new Segment(puntos[i], puntos[i + 1]);
            length += side.getModule();
        }
        Segment side = new Segment(puntos[puntos.length - 1], puntos[0]);
        length += side.getModule();
        return length;
    }
    public void setOffset(int offX, int offY) {
        for (int i = 0; i < puntos.length; i++) {
            puntos[i].setOffset(offX, offY);
        }
    }
}

