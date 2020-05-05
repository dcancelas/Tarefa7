package tarefa7;

public abstract class Barco {

    private String matricula;
    private int numDias;
    private float eslora;

    public Barco() {
    }
    public Barco(String matricula, int numDias, float eslora) {
        this.matricula = matricula;
        this.numDias = numDias;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getNumDias() {
        return numDias;
    }
    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }
    public float getEslora() {
        return eslora;
    }
    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public abstract float calcularPrecio();
    public abstract String tipoBarco();
}
