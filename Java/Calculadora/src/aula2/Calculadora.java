package aula2;

import java.util.Scanner;


public class Calculadora {
    
    public static void main(String[] args){
        Operacoes calc = new Operacoes();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor1: ");
        calc.valor1 = scan.nextFloat();
        
        System.out.print("Digite o valor2: ");
        calc.valor2 = scan.nextFloat();
        
        calc.Somar();
        System.out.println(calc.resultado);
    
    }



}
