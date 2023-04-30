package figurasgeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] argas){
    
        Scanner input = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
    
        System.out.println("Digite o valor da base do triangulo: ");
        triangulo.setBase(input.nextInt());
        System.out.println("Digite o valor da altura do triangulo: ");
        triangulo.setAltura(input.nextInt());
        
        System.out.println("Digite o lado A: ");
        triangulo.setLadoA(input.nextInt());
        System.out.println("Digite o lado B: ");
        triangulo.setLadoB(input.nextInt());
        System.out.println("Digite o lado C: ");
        triangulo.setLadoC(input.nextInt());
        
        System.out.println("O Perimetro do triangulo = " + triangulo.obterPerimetro()+ "m²");
        System.out.println("A Area do triangulo = " + triangulo.obterArea()+ "m²");
    
    }
    
}
