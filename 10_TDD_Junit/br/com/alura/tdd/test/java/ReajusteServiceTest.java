package br.com.alura.tdd.test.java;

import br.com.alura.tdd.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    private ReajusteService service;
    private Funcionario func;

    @BeforeEach
    public void inicializar(){
        service = new ReajusteService();
        func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(func, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), func.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom(){
         service.concederReajuste(func, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), func.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo(){
       service.concederReajuste(func, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), func.getSalario());
    }
}
