package bridge.renderer;

/**
 * Implementor: declares the low-level drawing operations.
 */
public interface Renderer {

    void renderCircle(double radius);

    void renderSquare(double side);
}
