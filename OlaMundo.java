import static javax.swing.JOptionPane.*;
import static java.lang.Float.parseFloat;

public class OlaMundo {
    public static void main(String[] args) {
        //Declara variáveis
        float altura;
        float peso;
        float imc;
        //Obtem os valores
        altura = parseFloat(showInputDialog("Altura:"));
        peso = parseFloat(showInputDialog("Peso:"));
        //Calcula IMC
        imc = peso / (altura*altura);
        //Exibe o IMC
        showMessageDialog(null,"IMC: " + imc);
    }
}
