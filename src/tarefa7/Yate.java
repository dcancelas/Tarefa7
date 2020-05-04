package tarefa7;

public class Yate extends Barco {

    private float potencia;
    private int numCamarotes;

    public Yate(float potencia, int numCamarotes) {
    }
    public Yate(String matricula, int numDias, float eslora, float potencia, int numCamarotes) {
        super(matricula, numDias, eslora);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public float calcularPrecio() {
        return (getNumDias() * (getEslora() * 10)) + (potencia * 2) + (numCamarotes * 25);
    }

    @Override
    public String tipoBarco() {
        return "Yate";
    }
}
