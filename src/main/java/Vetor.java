public class Vetor {
    public Pessoa[] pessoas;

    public void initVetor(int tamanho) {
        pessoas = new Pessoa[tamanho];
        for (int i = 0; i < tamanho; i++) {
            pessoas[i] = new Pessoa(i, true, false);
        }
    }

    public void reorganizaVetor(){
        Pessoa[] novoVetor = new Pessoa[pessoas.length];
        int index = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                novoVetor[index++] = pessoa;
            }
        }
    }

    public void printVetor() {
        System.out.println("+----+------------------------+-------------+");
        System.out.println("| ID | Condição de Saúde       | Recuperado  |");
        System.out.println("+----+------------------------+-------------+");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("| %2d | %-22s | %-11s |\n",
                    pessoas[i].getId(),
                    pessoas[i].getCondSaude() ? "Saudavel" : "Doente",
                    pessoas[i].getRecuperado() ? "Sim" : "Não");
        }
        System.out.println("+----+------------------------+-------------+");
    }

    public void alteraPessoa(int id, boolean condSaude, boolean recuperado) {
        if (id < 0 || id >= pessoas.length || pessoas[id] == null) {
            System.out.println("ID inválido");
            return;
        }
        pessoas[id].setCondSaude(condSaude);
        pessoas[id].setRecuperado(recuperado);
    }

    public void addPessoa(Pessoa novaPessoa) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                novaPessoa.setCondSaude(true);
                novaPessoa.setRecuperado(false);
                pessoas[i] = novaPessoa;
                return;
            }
        }
        System.out.println("Vetor cheio. Não é possível adicionar nova pessoa.");
    }

    public void removePessoa(int id) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null && pessoas[i].getId() == id) {
                pessoas[i] = null;
                reorganizaVetor();
                return;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
    }
}