package src.main.java;
public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Main <tamanho> <taxa de infecção> <taxaRecuperação>");
            return;
        }
        int tamanho = Integer.parseInt(args[0]);
        double taxaInfeccao = Double.parseDouble(args[1]);
        double taxaRecuperacao = Double.parseDouble(args[2]);

        Simulacao simulacao = new Simulacao(tamanho);
        
        simulacao.printVetor();
        System.out.println("Após contaminação:");
        simulacao.contaminacao(taxaInfeccao);
        simulacao.printVetor();
        System.out.println("Após recuperação:");
        simulacao.recuperado(taxaRecuperacao);
        simulacao.printVetor();
    }
}