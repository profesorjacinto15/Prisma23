import javax.swing.JOptionPane;

public class Main {

    public static double leerValor() {
        String dato ="";
        do {
            dato = JOptionPane.showInputDialog("Introduce valor numerico");
        } while (!esNumero(dato));
        return Double.parseDouble(dato);
    }

    public static void imprimirValor(String valor) {
        JOptionPane.showMessageDialog(null, valor);
    }

    public static boolean esNumero(String valor) {
        for(int i=0;i<valor.length();i++) {
            if (Character.isDigit(valor.charAt(i))!=true) {
                return false;
            }
        }
        return true;
    }

    public static double alturaTriangulo(double baseTriangulo) {
        double haltutri = ((Math.sqrt(3))/2)*baseTriangulo;
        return haltutri;
    }

    public static double areaBase(double baseTriangulo, double alturaTriangulo) {
        return (baseTriangulo*alturaTriangulo)/2;
    }

    public static double perimetro(double baseTriangulo) {
        return 3*baseTriangulo;
    }

    public static double areaLateral(double perimetro, double alturaPrisma) {
        return perimetro*alturaPrisma;
    }

    public static double areaTotal(double areaBase, double areaLateral) {
        return 2*areaBase+areaLateral;
    }
    public static void main(String[] args) {

        double alturaprisma, btriangulo, htriangulo, peri, abase, alate, atotal;
        imprimirValor("Introduce lado de la base");
        btriangulo = leerValor();
        imprimirValor("Introduce la altura del prisma");
        alturaprisma = leerValor();
        htriangulo = alturaTriangulo(btriangulo);
        peri = perimetro(btriangulo);
        abase = areaBase(btriangulo, htriangulo);
        alate = areaLateral(peri, alturaprisma);
        atotal = areaTotal(abase, alate);
        String areat = ""+atotal;
        imprimirValor("Area total");
        imprimirValor(areat);
    }
}