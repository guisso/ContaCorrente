/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package io.github.guisso.contacorrente;

import java.time.LocalDate;

/**
 * Ponto para controle de depósitos, saques e saldo.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 23/02/2022
 */
public class ContaCorrente {

    private static Integer serial;
    private Byte agencia;
    private Integer conta;
    private Float saldo;

    //<editor-fold defaultstate="collapsed" desc="Inicializações estáticas">
    static {
//        ContaCorrente.serial = 1;
//        serial = 1;
        // Cliente do programa solicitou que o serial seguisse formato ANO0000, ex.: 20220001, assim o tipo deve ser inteiro
        serial = (int) (LocalDate.now().getYear() * 10000 + 1);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public ContaCorrente() {
        conta = serial++;
//        conta = ++serial;
        saldo = 0f;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Byte getAgencia() {
        return agencia;
    }

    public void setAgencia(Byte agencia) {
        this.agencia = agencia;
    }

    public Integer getConta() {
        return conta;
    }

    // Somente leitura dado que o número da conta é gerado pelo sistema
//    public void setConta(Integer conta) {
//        this.conta = conta;
//    }
//
    public Float getSaldo() {
        return saldo;
    }
    //</editor-fold>

    public Float depositar(Float valor) {
        saldo += valor;
        return saldo;
    }

    public Float sacar(Float valor) {
        saldo -= valor;
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{"
                + "agencia=" + agencia
                + ", conta=" + conta
                + ", saldo=" + saldo
                + '}';
    }
}
