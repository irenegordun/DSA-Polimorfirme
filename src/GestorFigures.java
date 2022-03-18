import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GestorFigures {

    public static double suma (Figura[] v){
        double res = 0;
        for (Figura f:v){
            res+= f.area();
        }
        return res;
    }

    public static void sort(Figura[] v){
        Arrays.sort(v);
    }

    public static void main(String[]args){
        Triangle t= new Triangle (2,5);
        Cercle c = new Cercle (2);
        Rectangle r = new Rectangle (3,4);
        Quadrat q = new Quadrat (5);

        Figura[] figuras ={t, c, r, q};

        for (Figura figura : figuras) {
            System.out.println("Area de la figura: " + figura.area());
        }
        System.out.println("Suma total: " + suma(figuras));

        sort(figuras);
        for (Figura figura : figuras) {
            System.out.println(figura.area());
        }

    }
}
