package figurasgeometricas;

public class Triangulo implements FigurasGeometricas{
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String obterNomefigura() {
       return "Triangulo";  
    }

    @Override
    public int obterArea() {
        return (getBase()*getAltura());
    }

    @Override
    public int obterPerimetro() {
        return (getLadoA()+ getLadoB()+ getLadoC());
    }
     
    
}
