package InnerClassesMiniProgram;

public class Problem {
    
    public static class Mathematic{

        public static void areaOfCircle(int yaricap){
            System.out.println("area of circle" + (Math.PI * yaricap * yaricap));
        }
        public static void perimeterOfTriangle(int edge1, int edge2, int edge3){
            System.out.println("perimeter of triangle" + (edge1+edge2+edge3));
        }
    }

    
    public static class Physic{
        
        public static void innerMultiply(Vector vec1, Vector vec2){
            int answer = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println("ic carpım sonucu: " +answer);
        }
    }
}
