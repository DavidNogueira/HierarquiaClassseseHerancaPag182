public class Main {

    public static void main(String[] args) {
        System.out.println("creating a 2D point");
        Ponto2D ponto2D = new Ponto2D(1,2);
        System.out.println("point 2D created :" + ponto2D.getX() + " | " + ponto2D.getY());

        System.out.println("creating a 3D point");
        Ponto3D ponto3D = new Ponto3D(3,4,5);
        System.out.println("point 3D created :" + ponto3D.getX() + " | " + ponto3D.getY() + " | " + ponto3D.getZ());

        System.out.println("method 'somaPonto' : ");
        ponto3D.somaponto(1,2,3);
        System.out.println("now the point is :");
        System.out.println("point 3D modified :" + ponto3D.getX() + " | " + ponto3D.getY() + " | " + ponto3D.getZ());

        System.out.println("\nmethod 'Ponto3D somaPonto' (returning a Ponto3D object : ");
        Ponto3D point3D_to_add = new Ponto3D(10,11,12);
        System.out.println("point 3D :" + ponto3D.getX() + " | " + ponto3D.getY() + " | " + ponto3D.getZ());
        System.out.println("+");
        System.out.println("point 3D :" + point3D_to_add.getX() + " | " + point3D_to_add.getY() + " | " + point3D_to_add.getZ());
        System.out.println( "=" );
        System.out.println("-------------------------------------");
        ponto3D.somaPonto(point3D_to_add);
        System.out.println("point 3D: " + ponto3D.getX() + " | " + ponto3D.getY() + " | " + ponto3D.getZ());

    }
}
