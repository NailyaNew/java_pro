package lesson1.geometry;

public class Rectangle {

    Point se;
    Point nw;

    public static double area(double se, double nw)
    {
        return (se * nw);
    }

    public Rectangle(Point se, Point nw) {
        this.se = se;
        this.nw = nw;
    }

    public Point getSe() {
        return se;
    }

    public void setSe(Point se) {
        this.se = se;
    }

    public Point getNw() {
        return nw;
    }

    public void setNw(Point nw) {
        this.nw = nw;
    }
}
