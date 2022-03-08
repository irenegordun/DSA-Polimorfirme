public class Cercle extends Figura{
    private double radi;
    private static double PI=3.1415;

    Cercle (double radi){
        this.radi=radi;
    }

    public double area () {
       return PI*radi*radi;
    }
}
