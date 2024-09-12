public class Vetor {
    public Pessoa[] pessoas;

    public void initVetor(int tamanho) {
        pessoas = new Pessoa[tamanho];
        for (int i = 0; i < tamanho; i++) {
            pessoas[i] = new Pessoa(i, true, false);
        }
    }

    public void reorganizaVetor() {
        Pessoa[] novoVetor = new Pessoa[pessoas.length];
        int index = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) {
                novoVetor[index++] = pessoa;
            }
        }
        pessoas = novoVetor;
    }

    public void alteraPessoa(int id, boolean condSaude, boolean recuperado) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null && pessoa.getId() == id) {
                pessoa.setCondSaude(condSaude);
                pessoa.setRecuperado(recuperado);
                return;
            }
        }
        System.out.println("Pessoa com ID " + id + " não encontrada.");
    }


    public void printVetor() {
        System.out.println("+----+------------------------+-------------+");
        System.out.println("| ID | Condição de Saúde       | Recuperado  |");
        System.out.println("+----+------------------------+-------------+");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.printf("| %2d | %-22s | %-11s |\n",
                        pessoas[i].getId(),
                        pessoas[i].getCondSaude() ? "Saudavel" : "Doente",
                        pessoas[i].getRecuperado() ? "Sim" : "Não");
            }
        }
        System.out.println("+----+------------------------+-------------+");
    }

    public void addPessoa(Pessoa novaPessoa) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                novaPessoa.setId(i); // Ajusta o ID da nova pessoa
                pessoas[i] = novaPessoa;
                return;
            }
        }
        // Se o vetor estiver cheio, aumente o tamanho do vetor
        Pessoa[] novoVetor = new Pessoa[pessoas.length + 1];
        System.arraycopy(pessoas, 0, novoVetor, 0, pessoas.length);
        novaPessoa.setId(pessoas.length); // Ajusta o ID da nova pessoa
        novoVetor[pessoas.length] = novaPessoa;
        pessoas = novoVetor;
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