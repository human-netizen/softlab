public class FactoryPatternDemo {
    public static void main(String[] args) {
        //ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = ShapeFactory.getShape("SQUARE");shape1.draw();
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");shape2.draw();
    }
}
