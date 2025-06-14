public class FuncionarioExecucao {

    public static void executar() {
        
        if (ExerciciosMenu.funcionarioSalvo != null) {
            System.out.print("Já existe um funcionário salvo. Deseja limpar os dados anteriores? (s/n): ");
            String resposta = ExerciciosMenu.scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                ExerciciosMenu.funcionarioSalvo = null;
            }
        }
        if (ExerciciosMenu.funcionarioSalvo == null) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o cargo: ");
            String cargo = ExerciciosMenu.scanner.nextLine();
            System.out.print("Digite o salário atual: ");
            double salario = ExerciciosMenu.scanner.nextDouble();
            ExerciciosMenu.scanner.nextLine(); // Limpar buffer
            ExerciciosMenu.funcionarioSalvo = new Funcionario(nome, cargo, salario);
        }
        Funcionario f = ExerciciosMenu.funcionarioSalvo;
        System.out.println("Nome: " + f.getNome());
        System.out.println("Cargo: " + f.getCargo());
        System.out.printf("Salário atual: R$ %.2f\n", f.getSalario());
        System.out.print("Digite o percentual de aumento: ");
        double percentual = ExerciciosMenu.scanner.nextDouble();
        ExerciciosMenu.scanner.nextLine();
        double novoSalario = f.calcularAumento(percentual);
        System.out.printf("Novo salário com %.2f%% de aumento: R$ %.2f\n", percentual, novoSalario);
    }

}