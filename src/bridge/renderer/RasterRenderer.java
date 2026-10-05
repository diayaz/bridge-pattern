package bridge.renderer;

/**
 * Concrete Implementor: draws shapes as pixels.
 */
public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing a circle with radius " + radius + " as pixels");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing a square with side " + side + " as pixels");
    }
}
