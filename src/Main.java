public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ConcreteShapeFactory();
        Shape shape1 = shapeFactory.createShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.createShape("rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.createShape("square");
        shape3.draw();
    }
}