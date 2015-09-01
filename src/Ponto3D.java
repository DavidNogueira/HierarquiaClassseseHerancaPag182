/**
 * Created by David on 01/09/15.
 */
public class Ponto3D extends Ponto2D {

    //Variaveis de instancia
    private double z;

    //Construtores
    public Ponto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Ponto3D() {
        super();
        z = 0.0;
    }

    //Métodos de instancia
    public double getZ() {
        return z;
    }

    public void desloca(double dx, double dy, double dz) {

        super.desloca(dx, dy);
        z += dz;
    }
    public void somaponto(double x, double y, double z){// neste, o bojeto so ira alterar o Z porque a invocação da super vai preencher outro obj
        super.somaPonto(x,y);
        this.z += z;
        //super.desloca(x, y);  assim deverá estar bem
    }

    public void somaPonto(Ponto3D p){//este é o método bem!

        super.somaPonto(p);
        z += p.getZ();
    }
    public Ponto3D somaPonto(double dx, double dy, double dz){

        return new Ponto3D( dx + this.getX() , this.getY() + dy, this.z += dz );//this.getZ() + dz seria o correcto
    }


    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append(", ");
        s.append(z);
        return s.toString();
    }
}
