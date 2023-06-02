package interpreter;

public class Empresa {

    public static String formula = "horasTrabalhadas * 7";

    public static double calcularSalario(double horasTrabalhadas) {
        String expressao;
        expressao = formula.replace("horasTrabalhadas", Double.toString(horasTrabalhadas));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
