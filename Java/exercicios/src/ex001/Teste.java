package ex001;

public class Teste {
    
    public static void main(String[] args){
    
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario(100,2000.0f,"DEV");
    
        
        System.out.println("Funcionario 1: ");
        func1.setCargo("Gerente");
        System.out.println("Cargo: " + func1.getCargo());
        func1.setSalario(5000f);
        System.out.println("Salario: " + func1.getSalario());
        System.out.println("Salario com Aumento: " + func1.calculaAumento(15));
        
        System.out.println(" ");
        
        System.out.println("Funcionario 2: ");
        System.out.println("Cargo: " + func2.getCargo());
        System.out.println("Salario:" + func2.getSalario());
        System.out.println("Salario com Aumento: " + func2.calculaAumento(10));
        
  
    
    }
    
}
