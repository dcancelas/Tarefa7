package tarefa7;

import javax.swing.*;

public class Metodos {

    public static String pedirMatricula() {
        return JOptionPane.showInputDialog(null, "Introduzca a matrícula", "Aluguer de barcos", JOptionPane.PLAIN_MESSAGE);
    }

    public static int pedirNumDias() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca o numero de días", "Aluguer de barcos", JOptionPane.PLAIN_MESSAGE));
    }

    public static float pedirEslora() {
        return Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca a eslora (metros)", "Aluguer de barcos", JOptionPane.PLAIN_MESSAGE));
    }

    public static int pedirNumMastiles() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca o numero de mastiles", "Aluguer de barcos", JOptionPane.PLAIN_MESSAGE));
    }

    public static float pedirPotencia() {
        return Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca a potencia (CV)", "Aluguer de barcos", JOptionPane.PLAIN_MESSAGE));
    }

    public static int pedirNumCamarotes() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca o numero de camarotes", "Aluguer de barcos", JOptionPane.PLAIN_MESSAGE));
    }
}
