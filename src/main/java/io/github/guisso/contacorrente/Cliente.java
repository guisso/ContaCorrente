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
import java.time.temporal.ChronoUnit;

/**
 * Detentor da conta corrente.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 23/02/2022
 */
public class Cliente {

    private Long cpf;
    private String nome;
    private LocalDate nascimento;
    private Byte idade;
    // todo Tipo inteiro é insuficiente para armazenar um telefone com DDD
    private Long telefone;
    private String email;
    private ContaCorrente contaCorrente;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;

        // todo Implementar cálculo da idade aqui
        idade = (byte) this.nascimento
                .until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public Byte getIdade() {
        return idade;
    }

    // Somente leitura dado que o valor é derivado de um cálculo
//    public void setIdade(Byte idade) {
//        this.idade = idade;
//    }
//
    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    //</editor-fold>

}
