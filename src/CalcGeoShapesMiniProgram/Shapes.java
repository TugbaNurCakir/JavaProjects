package CalcGeoShapesMiniProgram;

public abstract class Shapes {
    private String name;

    public Shapes(String name){
        this.name = name;
    }
    
    abstract void calcArea();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
