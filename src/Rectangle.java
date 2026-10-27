public class Rectangle extends Point {
    private int width;
    private int heihgt;

    public Rectangle() {
        super();
        width = 0;
        heihgt = 0;
    }

    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getY();
        heihgt = p2.getY() - p1.getX();
    }

    public Rectangle(Point point, int newwidth, int newheihgt) {
        super(point.getX(), point.getY());
        this.width = newwidth;
        this.heihgt = newheihgt;
    }

    public Rectangle(Segment segment) {
        super();
        int x, y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (startPoint.getX() < endPoint.getX()) {
            x = startPoint.getX();
        } else {
            x = endPoint.getX();
        }
        if (startPoint.getY() < endPoint.getY()) {
            y = startPoint.getY();
        } else {
            y = endPoint.getY();
        }
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ") width: " + width + "heihgt: " + heihgt;
    }

    public int getArea() {
        return width + heihgt;
    }

    public Point getPoint() {

        return new Point(getX(), getY());

    }

    public Point getTopPoint() {
        return new Point(getX(), getY() + heihgt);

    }

    public Point getTopPointRight() {
        return new Point(getX() + width, getY() + heihgt);
    }
    public Point getBottomLeftPoint(){
        return new Point(getX(), getY());
    }
    public Point getBottomRightPoint(){
        return new Point(getX() + width, getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeihgt() {
        return heihgt;
    }

    public void setHeihgt(int heihgt) {
        this.heihgt = heihgt;
    }
}

