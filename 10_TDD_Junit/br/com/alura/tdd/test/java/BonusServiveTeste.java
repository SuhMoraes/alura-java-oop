package br.com.alura.tdd.test.java;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiveTeste {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComAltoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Marcelo", LocalDate.now(), new BigDecimal("15000")));

        assertEquals(BigDecimal.ZERO, bonus);
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
