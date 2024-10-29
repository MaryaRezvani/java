public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle Perimeter is: " + rectangle.get_perimeter());
        System.out.println("Rectangle Area is: " + rectangle.get_area());
        Square square = new Square(4);
        System.out.println("Square Perimeter is: " + square.get_perimeter());
        System.out.println("Square Area is: " + square.get_area());

        Pyramid pyramid = new Pyramid(5,10);

        System.out.println("Pyramid Volume is: " + pyramid.get_perimeter());
        System.out.println("Pyramid Surface Area is: " + pyramid.get_area());

    }
}
