public class Vector {

    Coordinates a;
    Coordinates b;


    public Vector(Coordinates a, Coordinates b) {
        this.a = a;
        this.b = b;
    }

    public double length() {
        double d = Math.sqrt(Math.pow(this.a.getX() - this.b.getX(), 2) + Math.pow(this.a.getY() - this.b.getY(), 2));
        return d;
    }

}
