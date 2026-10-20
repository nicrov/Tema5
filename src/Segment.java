public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment() {
        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getModule() {
        int c1, c2;
        c1 = endPoint.getX() - startPoint.getX();
        c2 = endPoint.getY() - startPoint.getY();
        double module = Math.sqrt(c1 * c1 + c2 * c2);
        return module;
    }

    @Override
    public String toString() {
        return startPoint + " - " + endPoint;

    }

    public void setOffset(int offX, int offY) {
        startPoint.setX(startPoint.getX() + offX);
        startPoint.setY(startPoint.getY() + offX);
        endPoint.setX(endPoint.getX() + offX);
        endPoint.setY(endPoint.getY() + offY);

    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}






