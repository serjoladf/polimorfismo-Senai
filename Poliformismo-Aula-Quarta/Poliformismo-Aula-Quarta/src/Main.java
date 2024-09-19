public class Main {
    public static void main(String[] args) {
//      Assistente assistente = new Funcionario(); // erro que todo assistente é funcionário mas há funcionario que não é assistente

        Assistente assistenteAndre = new Assistente(); // Posso criar neste formato
        Funcionario assistenteMateus = new Assistente(); // Poliformismo

        Gerente gerentCarlos = new Gerente(); // metodo direto
        Funcionario gerenteMarcos = new Gerente(); // Poliformismo
        Funcionario gerenteClecio = new Gerente(); // Poliformismo

        Estagiario estagiarioJaw = new Estagiario();
        Funcionario estagiarioDouglas = new Estagiario();  // Poliformismo

       double salarioFinal =  assistenteAndre.calcularSalario();

       // Salário Funcionários
        System.out.println("___________________________________");
        System.out.println("Salário Funcionários");
        System.out.println("-----------------------------------");
        System.out.println("Salario Assistente R$ "+salarioFinal);
        salarioFinal =  assistenteMateus.calcularSalario(700);
        System.out.println("Salario Assistente R$ "+ salarioFinal);
        // Salário Gerentes om param
        System.out.println("___________________________________");
        System.out.println("Salário Gerentes");
        System.out.println("-----------------------------------");
        salarioFinal =  gerentCarlos.calcularSalario();
        System.out.println("Salario Gerente Carlos R$ " + salarioFinal);
        salarioFinal =  gerenteMarcos.calcularSalario(1500.00,300);
        System.out.println("Salario Gerente Marcoss R$ " + salarioFinal);
        salarioFinal =  gerenteClecio.calcularSalario(1300.00,300);
        System.out.println("Salario Gerente Clécio R$ "+salarioFinal);

        System.out.println("___________________________________");
        System.out.println("Salário Estagiario");
        System.out.println("-----------------------------------");
        salarioFinal = estagiarioDouglas.calcularSalario();
        System.out.println("Salario Estagiario Douglas R$ "+salarioFinal);
        salarioFinal = estagiarioJaw.calcularSalario();
        System.out.println("Salario Estagiario Jaw R$ "+salarioFinal);

    }
}

