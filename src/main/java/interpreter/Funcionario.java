package interpreter;

public class Funcionario {

    private double horasTrabalhadas;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        return Empresa.calcularSalario(this.horasTrabalhadas);
    }
}
