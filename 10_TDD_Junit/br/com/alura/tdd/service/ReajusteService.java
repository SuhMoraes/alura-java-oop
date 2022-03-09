package br.com.alura.tdd.service;

import br.com.alura.tdd.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario func, Desempenho desempenho) {
        //Before
//        if( desempenho == Desempenho.A_DESEJAR) {
//            BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.03"));
//            func.reajustarSalario(reajuste);
//        }
//
//        if( desempenho == Desempenho.BOM) {
//            BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.15"));
//            func.reajustarSalario(reajuste);
//        }
//
//        if( desempenho == Desempenho.OTIMO) {
//            BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.20"));
//            func.reajustarSalario(reajuste);
//        }

        // Refatoring - After
        BigDecimal percentualReajuste = desempenho.percentualReajuste();
        BigDecimal reajuste = func.getSalario().multiply(percentualReajuste);
        func.reajustarSalario(reajuste);
    }
}
