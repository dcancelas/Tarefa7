package tarefa7;

public class Veleiro extends Barco {

    private int numMastiles;

    public Veleiro() {
    }
    public Veleiro(String matricula, int numDias, float eslora, int numMastiles) {
        super(matricula, numDias, eslora);
        this.numMastiles = numMastiles;
    }

    @Override
    public float calcularPrecio() {
        return (getNumDias() * (getEslora() * 10)) + (numMastiles * 8);
    }

    @Override
    public String tipoBarco() {
        return "Veleiro";
    }
}
