package src.main.java;
/* 
classe vetor {
    // Atributos
    Array de Individuos

    // Métodos
    // Inicializa o vetor com indivíduos saudáveis
    inicializarVetor(tamanho) {
        para i de 0 até tamanho-1 {
            adicionar novo Individuo(saúdavel) ao Array
        }
    }
}
*/

public class Vetor {
    public Pessoa[] pessoas;

    public void initVetor(int tamanho) {
        pessoas = new Pessoa[tamanho];
        for (int i = 0; i < tamanho; i++) {
            pessoas[i] = new Pessoa(i, true, false);
        }
    }

    public void printVetor() {
        System.out.println("+----+------------------------+-------------+");
        System.out.println("| ID | Condição de Saúde       | Recuperado  |");
        System.out.println("+----+------------------------+-------------+");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("| %2d | %-22s | %-11s |\n",
                    pessoas[i].getId(),
                    pessoas[i].getCondSaude(),
                    pessoas[i].getRecuperado() ? "Sim" : "Não");
        }
        System.out.println("+----+------------------------+-------------+");
    }
}