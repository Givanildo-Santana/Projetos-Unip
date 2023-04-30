package geometria;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaArea(){
        double area = base*(altura/2);
        return area;
    }
    
    public void imprimeDados(){
        System.out.println("\nbase: " + base);
         System.out.println("altura: " + altura);
        System.out.println("Area do triangulo: " + calculaArea());
    }
    
}
