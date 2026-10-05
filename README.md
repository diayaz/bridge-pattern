# Assignment 3 — Bridge Pattern (Shape–Renderer)

Implementation of the **Bridge** structural design pattern in Java 17.

Shapes (`Circle`, `Square`) are separated from the way they are drawn
(`VectorRenderer`, `RasterRenderer`). The `Shape` class holds a reference
to a `Renderer` (composition), so both hierarchies can change independently.

## Structure

```
src/bridge/
├── Main.java                  Client
├── shape/
│   ├── Shape.java             Abstraction
│   ├── Circle.java            Refined Abstraction
│   └── Square.java            Refined Abstraction
└── renderer/
    ├── Renderer.java          Implementor
    ├── VectorRenderer.java    Concrete Implementor
    └── RasterRenderer.java    Concrete Implementor
docs/
└── uml.png                    UML class diagram
```

## How to run

In IntelliJ IDEA: mark `src` as Sources Root and run `bridge.Main`.

From the terminal:

```
javac -d out $(find src -name "*.java")
java -cp out bridge.Main
```

## Output

```
--- Vector renderer ---
Drawing a circle with radius 5.0 as vector lines
Drawing a square with side 10.0 as vector lines
--- Raster renderer ---
Drawing a circle with radius 5.0 as pixels
Drawing a square with side 10.0 as pixels
```

The same `Circle` and `Square` objects are drawn first with the vector
renderer and then with the raster renderer, without changing the shape classes.
