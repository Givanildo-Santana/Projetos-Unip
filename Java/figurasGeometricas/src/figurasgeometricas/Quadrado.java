package figurasgeometricas;


public class Quadrado implements FigurasGeometricas{
    private int lado;
    
    public Quadrado(int lado){
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public String obterNomefigura(){
        return "Quadrado";
        
    }

    @Override
    public int obterArea() {
        return(getLado()*getLado());
    }

    @Override
    public int obterPerimetro() {
        return(getLado()*4);
    }
    
    
   

   
}
