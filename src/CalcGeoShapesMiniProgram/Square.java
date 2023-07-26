package CalcGeoShapesMiniProgram;

public class Square extends Shapes {

    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    void calcArea() {
        System.out.println("Area of " + getName() + "is " + (edge*edge));
    }
    
}
