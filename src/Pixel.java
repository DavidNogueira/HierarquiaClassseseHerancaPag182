/**
 * Created by David on 31/08/15.
 */

//Esta classe define um atributo "COR", getters e setters, e REDEFINE o método toString

public class Pixel extends Ponto2D {

    //Variáveis de instancia
    private int cor;

    //Consctruror
    public Pixel() {
        super(0.0, 0.0);
        cor = 0;
    }

    public Pixel(int cor) {
        this.cor = cor % 100;
    }

    public Pixel(double x, double y, int cor) {
        super(x, y);
        this.cor = cor % 100;
    }

    public Pixel(Pixel pix) {
        super(pix.getX(), pix.getY());
        cor = pix.getCor();
    }

    //Métodos
    public int getCor() {
        return cor;
    }

    public void mudaCor(int novaCor) {
        cor = novaCor % 100;
    }

    public void somaPixel(double x, double y) {
        super.desloca(x, y);
    }

    public void somaPixel(Pixel pix) {
        super.desloca(pix.getX(), pix.getY());
        cor = (cor + pix.getCor()) % 100;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Pixel: " + super.toString());
        s.append("+ (Cor ");
        s.append(cor);
        s.append(")\n");
        return s.toString();
    }
}
