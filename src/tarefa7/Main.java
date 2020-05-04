package tarefa7;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author dcancelas
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<Barco>();

        int repetir;
        do {
            String[] tiposBarco = {"Veleiro", "Deportivo", "Yate"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione o tipo de barco", "Aluguer de barcos", JOptionPane.QUESTION_MESSAGE, null, tiposBarco, tiposBarco[0]);
            switch (opcion) {
                case "Veleiro":
                    barcos.add(new Veleiro(Metodos.pedirMatricula(), Metodos.pedirNumDias(), Metodos.pedirEslora(), Metodos.pedirNumMastiles()));
                    break;
                case "Deportivo":
                    barcos.add(new Deportivo(Metodos.pedirMatricula(), Metodos.pedirNumDias(), Metodos.pedirEslora(), Metodos.pedirPotencia()));
                    break;
                case "Yate":
                    barcos.add(new Yate(Metodos.pedirMatricula(), Metodos.pedirNumDias(), Metodos.pedirEslora(), Metodos.pedirPotencia(), Metodos.pedirNumCamarotes()));
                    break;
            }
            repetir = JOptionPane.showConfirmDialog(null, "Queres consultar outro barco?", "Aluguer de barcos", JOptionPane.YES_NO_OPTION);
        }while (repetir == 0);

        for (Barco barco: barcos) {
            JOptionPane.showMessageDialog(
                    null,
                    "\nTipo de barco: " + barco.tipoBarco() +
                    "\nMatrícula: " + barco.getMatricula() +
                    "\nEslora: " + barco.getEslora() + " metros" +
                    "\n\nPrecio: " + barco.calcularPrecio() + "€\n ",
                    "Aluguer de barcos",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}
