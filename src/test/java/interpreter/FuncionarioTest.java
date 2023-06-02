package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Funcionario funcionario = new Funcionario();
        funcionario.setHorasTrabalhadas(115.0);

        assertEquals(805.0, funcionario.calcularSalario());
    }
}
