package bridge;

import bridge.renderer.RasterRenderer;
import bridge.renderer.Renderer;
import bridge.renderer.VectorRenderer;
import bridge.shape.Circle;
import bridge.shape.Shape;
import bridge.shape.Square;

/**
 * Client: composes shapes with renderers at runtime.
 */
public class Main {

    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle = new Circle(5, vector);
        Shape square = new Square(10, vector);

        System.out.println("--- Vector renderer ---");
        circle.draw();
        square.draw();

        // Switching the implementation at runtime, the Shape classes do not change
        circle.setRenderer(raster);
        square.setRenderer(raster);

        System.out.println("--- Raster renderer ---");
        circle.draw();
        square.draw();
    }
}
