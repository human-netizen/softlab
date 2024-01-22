public class FactoryPatternDemo {
    public static void main(String[] args) {
        //ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = ShapeFactory.getShape("SQUARE");shape1.draw();
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");shape2.draw();
        System.out.println("hashcode of shape1: " + shape1.hashCode());
        System.out.println("hashcode of shape2: " + shape2.hashCode());
    }
}
