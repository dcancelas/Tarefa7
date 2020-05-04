package tarefa7;

public class Deportivo extends Barco {

    private float potencia;

    public Deportivo() {
    }
    public Deportivo(String matricula, int numDias, float eslora, float potencia) {
        super(matricula, numDias, eslora);
        this.potencia = potencia;
    }

    @Override
    public float calcularPrecio() {
        return (getNumDias() * (getEslora() * 10)) + (potencia * 2);
    }

    @Override
    public String tipoBarco() {
        return "Embarcación deportiva";
    }
}
