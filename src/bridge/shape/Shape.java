package bridge.shape;

import bridge.renderer.Renderer;

/**
 * Abstraction: holds a reference to the Renderer (the "bridge")
 * and delegates the actual drawing to it.
 */
public abstract class Shape {

    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
