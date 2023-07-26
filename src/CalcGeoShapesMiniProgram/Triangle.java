package CalcGeoShapesMiniProgram;

public class Triangle extends Shapes{

    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calcArea() {
        double u = (a+b+c) / 2.0;
        double area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Area of " + getName() + "is " + area);
    }

}
