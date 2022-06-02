public class Main {
    public static void main(String[] args) {

        Coordinates coordinates1 = new Coordinates(1,5);
        Coordinates coordinates2 = new Coordinates(4,6);
        Vector vectors = new Vector(coordinates1, coordinates2);


        System.out.println("Vector2D length = " + vectors.length());



}
}
