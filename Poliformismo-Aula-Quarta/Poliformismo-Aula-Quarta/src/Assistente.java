public class Assistente extends Funcionario{

    @Override
    public double calcularSalario() {
        return super.calcularSalario(200);
    }
}
