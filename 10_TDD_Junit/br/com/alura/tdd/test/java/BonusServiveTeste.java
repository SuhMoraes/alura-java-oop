package br.com.alura.tdd.test.java;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiveTeste {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComAltoSalario(){
        BonusService service = new BonusService();

        // Duas maneiras de capturar a exception no JUnit

        // 1° Maneira
//        assertThrows(IllegalArgumentException.class,
//                () -> service.calcularBonus(new Funcionario("Marcelo", LocalDate.now(), new BigDecimal("15000"))));

        // 2° Maneira -> Util para quando vc quer pegar a mensagem da exception
        try {
            service.calcularBonus(new Funcionario("Marcelo", LocalDate.now(), new BigDecimal("15000")));
            fail("Não deu a exception!");
        } catch (Exception e){
            assertEquals("Funcionario com salario maior que R$10.000, não pode receber bônus", e.getMessage());
        }
//        assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Marcelo", LocalDate.now(), new BigDecimal("3000")));

        assertEquals(new BigDecimal("300.0"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMil(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Marcelo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    }


}
