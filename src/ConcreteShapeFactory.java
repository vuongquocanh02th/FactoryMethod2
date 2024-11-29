public class ConcreteShapeFactory extends ShapeFactory{

    @Override
    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()){
            case "circle":
                return new Circle();
                case "rectangle":
                    return new Rectangle();
                    case "square":
                        return new Square();
                        default:
                            throw new IllegalArgumentException("Unknown shape type!");
        }
    }
}
