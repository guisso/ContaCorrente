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
 * Ponto de início do programa.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 23/02/2022
 */
public class Programa {

    public static void main(String[] args) {

        //
        // Teste de conta corrente
        //
        
        // Contas para verificação de geração automática de números
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        ContaCorrente cc3 = new ContaCorrente();
        
        // Conta para teste efetivo
        ContaCorrente cc4 = new ContaCorrente();

        cc4.setAgencia((byte) 99);
        cc4.depositar((float) 101.01);
        cc4.depositar((float) .99);
        cc4.sacar((float) .99);
        cc4.sacar((float) 101.01);
        cc4.sacar((float) 1000);

        System.out.println("-- " + cc4.getAgencia());
        System.out.println("-- " + cc4.getConta());
        System.out.println("-- " + cc4.getSaldo());

        //
        // Teste de cliente
        //
        Cliente c = new Cliente();
        c.setCpf(98765432101L);
        c.setNome("Délio Ernane");
        c.setNascimento(LocalDate.of(1980, 2, 22));
        c.setTelefone(38912345678L);
        c.setEmail("delioernane@mail.com");
        
        c.setContaCorrente(cc4);

        System.out.println(">> " + c.getCpf());
        System.out.println(">> " + c.getNome());
        System.out.println(">> " + c.getNascimento());
        System.out.println(">> " + c.getIdade());
        System.out.println(">> " + c.getTelefone());
        System.out.println(">> " + c.getEmail());
        
        System.out.println("  >> " + c.getContaCorrente().getAgencia());
        System.out.println("  >> " + c.getContaCorrente().getConta());
        System.out.println("  >> " + c.getContaCorrente().getSaldo());
        
    }
}
