public class ShapeFactory {
    private static Shape ins = null;
    private ShapeFactory(){}

    public static Shape getShape(String shapeType){
        if(ins != null)return ins;
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            ins = new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            ins =  new Square();
        }
        return ins;
    }
}