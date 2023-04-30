package ex001;

public class Funcionario {
    private int cracha ;
    private float salario;
    private String cargo; 

    public Funcionario() {
    }

    public Funcionario(int c, float s, String car) {
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }


    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   
   
    public float calculaAumento(float porcentagem){
        float aumento = salario + (salario*(porcentagem/100));
        return (aumento);
    }
    public float calculaAumento(int tempo){
        float aumento = salario + (tempo*150);
        return (aumento);
    
    }
}

