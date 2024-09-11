public class Pessoa {
    public int id;
    public boolean condSaude;
    public boolean recuperado;

    public Pessoa(int id, boolean condSaude, boolean recuperado) {
        this.id = id;
        this.condSaude = condSaude;
        this.recuperado = recuperado;
    }

    public int getId() {
        return id;
    }

    public boolean getCondSaude() {
        return condSaude;
    }

    public boolean getRecuperado() {
        return recuperado;
    }

    public void setCondSaude(boolean condSaude) {
        this.condSaude = condSaude;
    }

    public void setRecuperado(boolean recuperado){
         this.recuperado = recuperado;
    }
}
