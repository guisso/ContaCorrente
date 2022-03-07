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
import java.util.Arrays;
import java.util.Objects;

/**
 * Detentor da conta corrente.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 23/02/2022
 */
public class Cliente
        implements Comparable<Cliente> {

    private Long cpf;
    private String nome;
    private LocalDate nascimento;
    private Byte idade;
    // Tipo inteiro é insuficiente para armazenar DDD + número de telefone
    private Long telefone;
    private String email;

    // Um-para-um
    private ContaCorrente contaCorrente;

    // Um-para-muitos
    private ContaCorrente[] contas;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Cliente() {
        contas = new ContaCorrente[3];
    }

    public Cliente(Long cpf, String nome, LocalDate nascimento, Long telefone, String email) {
        // Invocação explícita ao construtor padrão que já possui
        // procedimentos padrão para inicialização da nova instância
        // !!! Deve ser a primeira linha de execução no métodos !!!
        this();

        // Atribuições
        this.cpf = cpf;
        this.nome = nome;
        // this.nascimento = nascimento; // <--- Não calcula idade...
        setNascimento(nascimento); // <--- !!! Cálculo implícito da idade !!!
        this.telefone = telefone;
        this.email = email;
    }
    //</editor-fold>

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

    public void adicionarContaCorrente(int idx, ContaCorrente cc) {
        contas[idx] = cc;
    }

    public ContaCorrente obterConta(int idx) {
        return contas[idx];
    }

    //<editor-fold defaultstate="collapsed" desc="hashCode/equals/toString/compareTo">
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.cpf);
        //
        // Somente o CPF foi empregado para geração do hash
        //
//        hash = 73 * hash + Objects.hashCode(this.nome);
//        hash = 73 * hash + Objects.hashCode(this.nascimento);
//        hash = 73 * hash + Objects.hashCode(this.idade);
//        hash = 73 * hash + Objects.hashCode(this.telefone);
//        hash = 73 * hash + Objects.hashCode(this.email);
//        hash = 73 * hash + Objects.hashCode(this.contaCorrente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;

        // CPF é a chave que identifica um cliente, ou seja,
        // dois CPFs iguais indicam o mesmo cliente
        return Objects.equals(this.cpf, other.cpf);

        // Como o hash é gerado em função do CPF, a linha abaixo poderia 
        // ser usada em substituição à comparação (equals) acima.
//        return this.hashCode() == other.hashCode();
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "cpf=" + cpf
                + ", nome=" + nome
                + ", nascimento=" + nascimento
                + ", idade=" + idade
                + ", telefone=" + telefone
                + ", email=" + email
                + ", contaCorrente=" + contaCorrente
                + ", contas=" + Arrays.toString(contas)
                + "}\n";
    }

    @Override
    public int compareTo(Cliente cliente) {
        return getNome().compareTo(cliente.getNome());
//        return getNascimento().compareTo(cliente.getNascimento());
//        return getCpf().compareTo(cliente.getCpf());
    }
    //</editor-fold>

}
