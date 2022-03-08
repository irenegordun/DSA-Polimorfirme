public class Rectangle extends Figura {
    private double costat1;
    private double costat2;

    Rectangle(double costat1, double costat2){
        this.costat1=costat1;
        this.costat2=costat2;
    }

    public double area(){
        return costat1*costat2;
    }
}
