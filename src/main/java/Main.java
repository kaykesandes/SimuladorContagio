import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Main <tamanho> <taxa de infecção> <taxa de recuperação>");
            return;
        }
        int tamanho = Integer.parseInt(args[0]);
        double taxaInfeccao = Double.parseDouble(args[1]);
        double taxaRecuperacao = Double.parseDouble(args[2]);

        Simulacao simulacao = new Simulacao(tamanho);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Estado atual:");
            simulacao.printVetor();

            System.out.println("Escolha uma opção:");
            System.out.println("1. Contaminar");
            System.out.println("2. Recuperar");
            System.out.println("3. Adicionar nova pessoa");
            System.out.println("4. Alterar condição de saúde de uma pessoa");
            System.out.println("5. Remover pessoa");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    simulacao.contaminacao(taxaInfeccao);
                    break;
                case 2:
                    simulacao.recuperado(taxaRecuperacao);
                    break;
                case 3:
                    System.out.println(
                            "Digite a condição de saúde da nova pessoa (true para saudável, false para doente):");
                    boolean condSaude = scanner.nextBoolean();
                    System.out.println(
                            "Digite o estado de recuperação da nova pessoa (true para recuperado, false para não recuperado):");
                    boolean recuperado = scanner.nextBoolean();
                    Pessoa novaPessoa = new Pessoa(-1, condSaude, recuperado); // ID será ajustado no método addPessoa
                    simulacao.addPessoa(novaPessoa);
                    break;
                case 4:
                    System.out.println("Digite o ID da pessoa a ser alterada:");
                    int idAlterar = scanner.nextInt();
                    System.out.println("Digite a nova condição de saúde (true para saudável, false para doente):");
                    boolean novaCondSaude = scanner.nextBoolean();
                    System.out.println(
                            "Digite o novo estado de recuperação (true para recuperado, false para não recuperado):");
                    boolean novoRecuperado = scanner.nextBoolean();
                    simulacao.alterarPessoa(idAlterar, novaCondSaude, novoRecuperado);
                    break;
                case 5:
                    System.out.println("Digite o ID da pessoa a ser removida:");
                    int idRemover = scanner.nextInt();
                    simulacao.removerPessoa(idRemover);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}