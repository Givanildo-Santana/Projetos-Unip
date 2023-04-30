package geometria;

public class Teste {
    public static void main(String[] args){
    
        Triangulo tri_sa = new Triangulo();
        Triangulo tri_ca = new Triangulo(10,15);
        
        tri_sa.setBase(20);
        tri_sa.setAltura(40);
        tri_sa.imprimeDados();
        
        
        tri_ca.imprimeDados();
        
        
    
    
    }
    
}
