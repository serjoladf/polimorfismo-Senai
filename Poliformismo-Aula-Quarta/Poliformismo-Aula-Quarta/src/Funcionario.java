abstract class Funcionario {
    private double salarioBase = 1200;
    private double salario;


    public double calcularSalario(){
        salario = salarioBase;
        return salario;
    }

    public double calcularSalario(double gratificacao){ // Sobrecarga 1
        salario = salarioBase + gratificacao;
        return salario;
    }
    public double calcularSalario(double gratificacao, double bonificacao) { // Sobrecarga 2
        salario = salarioBase + gratificacao + bonificacao;
        return salario;
    }
}
