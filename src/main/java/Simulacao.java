public class Simulacao {
    private Vetor populacao;

    public Simulacao(int tamanho) {
        populacao = new Vetor();
        populacao.initVetor(tamanho);
    }

    public void contaminacao(double taxaInfeccao) {
        for (int i = 0; i < populacao.pessoas.length; i++) {
            Pessoa pessoa = populacao.pessoas[i];
            if (pessoa.getCondSaude() && !pessoa.getRecuperado()) {
                if (Math.random() < taxaInfeccao) {
                    pessoa.setCondSaude(false);
                }
            }
        }
    }

    public void recuperado(double taxaRecuperacao) {
        for (int i = 0; i < populacao.pessoas.length; i++) {
            Pessoa pessoa = populacao.pessoas[i];
            if (!pessoa.getRecuperado() && !pessoa.getCondSaude()) {
                if (Math.random() < taxaRecuperacao) {
                    pessoa.setRecuperado(true);
                }
            }
        }
    }

    public void printVetor() {
        populacao.printVetor();
    }

    public void addPessoa(Pessoa novaPessoa) {
        populacao.addPessoa(novaPessoa);
    }

    public void removerPessoa(int id) {
        populacao.removePessoa(id);
    }

    public void alterarPessoa(int id, boolean condSaude, boolean recuperado) {
        populacao.alteraPessoa(id, condSaude, recuperado);
    }

    public Pessoa[] getPopulacao() {
        return populacao.pessoas;
    }
}