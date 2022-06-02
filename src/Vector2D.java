public class Vector2D extends Coordinates  {

    private Coordinates vector1;
    private Coordinates vector2;

    public Vector2D(double x, double y) {
        super(x, y);
    }


    public double length() {
        double length = Math.sqrt(vector1.getX1() * vector2.getX() + vector1.getY1() * vector2.getY());
        return length;
    }

    }

