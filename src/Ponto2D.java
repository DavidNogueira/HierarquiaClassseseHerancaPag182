/**
 * Created by David on 31/08/15.
 */
public class Ponto2D {

    //construtores
    public Ponto2D(double cx, double cy) {
        x = cx;
        y = cy;
    }

    public Ponto2D() {
        this(0.0, 0.0);
    }

    public Ponto2D(Ponto2D p) {
        x = p.getX();
        y = p.getY();
    }

    //Variaveis
    private double x, y;

    //Métodos de instancia
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void desloca(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void somaPonto(Ponto2D p) {
        x += p.getX();
        y += p.getY();
    }


    public Ponto2D somaPonto(double dx, double dy) {

        return new Ponto2D(x + dx, y + dy);
    }

    public String toString() {
        return new String("Ponto (" + x + ", " + y + ")");
    }

    public Ponto2D clone() {
        return new Ponto2D(this);
    }
}
