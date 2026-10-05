package bridge.renderer;

/**
 * Concrete Implementor: draws shapes as vector graphics.
 */
public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle with radius " + radius + " as vector lines");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square with side " + side + " as vector lines");
    }
}
