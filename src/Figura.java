public abstract class Figura implements Comparable<Figura> {

    //constructor sense arguments
    public Figura() {};

    //metode abstracte a implementar en subclasses
    abstract public double area();

    //aplicar la implementacion del compareTo
    //para ordenar segun el tamanyo del arena
    @Override
    public int compareTo(Figura f) {
        if (f.area() > this.area())
            return -1;
        else if (f.area() == this.area())
            return 0;
        else
            return 1;
    }
}
