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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ponto de início do programa.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.2, 07/03/2022
 */
public class Programa {

    public static void main(String[] args) {
        
        //
        //
        // Descomente cada bloco isoladamente para realizar os testes
        //
        //

        //<editor-fold defaultstate="collapsed" desc="Precisão de números de ponto flutuante">
        System.out.printf(">> %f\n", 5.6f + 5.8f);
        System.out.printf(">> %.25f\n", 5.6f + 5.8f);

        System.out.printf(">> %f\n", 5.6 + 5.8);
        System.out.printf(">> %.25f\n", 5.6 + 5.8);
        //</editor-fold>
//
        //<editor-fold defaultstate="collapsed" desc="Testes iniciais com Clientes e Contas correntes">
//        //
//        // Teste de conta corrente
//        //
//
//        // Contas para verificação de geração automática de números
//        ContaCorrente cc1 = new ContaCorrente();
//        ContaCorrente cc2 = new ContaCorrente();
//        ContaCorrente cc3 = new ContaCorrente();
//
//        // Conta para teste efetivo
//        ContaCorrente cc4 = new ContaCorrente();
//
//        cc4.setAgencia((byte) 99);
//        cc4.depositar((float) 101.01);
//        cc4.depositar((float) .99);
//        cc4.sacar((float) .99);
//        cc4.sacar((float) 101.01);
//        cc4.sacar((float) 1000);
//
//        System.out.println("-- " + cc4.getAgencia());
//        System.out.println("-- " + cc4.getConta());
//        System.out.println("-- " + cc4.getSaldo());
//
//        //
//        // Teste de cliente
//        //
//
//        Cliente c = new Cliente();
//        c.setCpf(98765432101L);
//        c.setNome("Délio Ernane");
//        c.setNascimento(LocalDate.of(1980, 2, 22));
//        c.setTelefone(38912345678L);
//        c.setEmail("delioernane@mail.com");
//
//        c.setContaCorrente(cc4);
//
//        System.out.println(">> " + c.getCpf());
//        System.out.println(">> " + c.getNome());
//        System.out.println(">> " + c.getNascimento());
//        System.out.println(">> " + c.getIdade());
//        System.out.println(">> " + c.getTelefone());
//        System.out.println(">> " + c.getEmail());
//
//        System.out.println("  >> " + c.getContaCorrente().getAgencia());
//        System.out.println("  >> " + c.getContaCorrente().getConta());
//        System.out.println("  >> " + c.getContaCorrente().getSaldo());
        //</editor-fold>
//        
        //<editor-fold defaultstate="collapsed" desc="Arranjo de inteiros">
        // Declaração da variável
//        int[] x;
        // Criação de objeto que mantém 4 valores inteiros
//        x = new int[4];
//        x[0] = 1;
//        x[1] = 2;
//        x[2] = 3;
//        x[3] = 4;
//
//        // Declaração e inicialização
//        int[] y = { 1, 2, 3, 4, 5, 6, 7, 8, 111111 };
//
//        // For convencional
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(">> [" + i + "] = " + x[i]);
//        }
//
//        // For aprimorado
//        for (int tmp : x) {
//            System.out.println("-- " + tmp);
//        }
        //</editor-fold>
//        
        //<editor-fold defaultstate="collapsed" desc="Arranjo de contas correntes">
//        ContaCorrente[] contas;
//        contas = new ContaCorrente[3];
//        
//        contas[0] = new ContaCorrente();
//        contas[0].depositar(1000f);
//        contas[0].sacar(100f);
//        System.out.println(">> " + contas[0].getSaldo());
//
//        contas[1] = new ContaCorrente();
//        contas[1].depositar(10f);
//        contas[1].sacar(1000f);
//        System.out.println(">> " + contas[1].getSaldo());
//
//        contas[2] = new ContaCorrente();
//        contas[2].sacar(500f);
//        contas[2].depositar(100f);
//        System.out.println(">> " + contas[2].getSaldo());
//
        //</editor-fold>
//        
        //<editor-fold defaultstate="collapsed" desc="ArrayLists">
//        System.out.println("\n\nARRAYLISTS\n");
//
//        // ArrayList não pode operar sobre tipos primitivos e,
//        // quando necessário, é preciso empregar classes envelopadoras
//        ArrayList<Integer> inteiros;
//        inteiros = new ArrayList<>();
//
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//        inteiros.add(1000);
//        inteiros.add(1001);
//        inteiros.add(1002);
//        inteiros.add(1003);
//        inteiros.add(1004);
//
//        for (Integer n : inteiros) {
//            System.out.println(">> " + n);
//        }
        //</editor-fold>
//
        //<editor-fold defaultstate="collapsed" desc="Tratamento de exceções com try-catch">
//        Cliente c = new Cliente();
//
//        try {
//            // PROBLEMA
//            c.adicionarContaCorrente(
//                    500, // <--- !!! Índice inválido !!!
//                    new ContaCorrente());
//
//            c.obterConta(0).depositar(99f);
//            c.obterConta(0).sacar(1f);
//            System.out.println(">> " + c.obterConta(0).getSaldo());
//            
//        } catch (Exception ex) {
//            // SOLUÇÃO
//            System.out.println("Posição inválida!");
//        }
//
//        c.adicionarContaCorrente(1, new ContaCorrente());
//        c.adicionarContaCorrente(2, new ContaCorrente());
//
//        c.obterConta(1).depositar(1000f);
//        c.obterConta(1).sacar(999f);
//        System.out.println(">> " + c.obterConta(1).getSaldo());
//
        //</editor-fold>
//
        //<editor-fold defaultstate="collapsed" desc="Testes com ordenação de tipos abstratos de dados">
//        List<Cliente> clientes = new ArrayList<>(4);
//
//        clientes.add(new Cliente(11111111111L, "Zélia", LocalDate.of(1993, 3, 24), 3821040001L, "zelia@mail.com"));
//        clientes.add(new Cliente(33333333333L, "Zelia", LocalDate.of(1994, 3, 23), 3821040003L, "denise@mail.com"));
//        clientes.add(new Cliente(22222222222L, "zélia", LocalDate.of(1991, 3, 22), 3821040002L, "beatriz@mail.com"));
//        clientes.add(new Cliente(44444444444L, "Danilo", LocalDate.of(1992, 3, 21), 3821040004L, "danilo@mail.com"));
//
//        System.out.println("Antes de ordenar:\n" + clientes);
//
//        // Ordenação padrão implementada na classe Cliente (alfabética por nome)
//        Collections.sort(clientes);
//        System.out.println("Após ordenação padrão:\n" + clientes);
//        
//        // Definição de comparação por idade para ordenação
//        Comparator<Cliente> porIdade = Comparator.comparing(Cliente::getIdade);
//        Collections.sort(clientes, porIdade);
//        System.out.println("Após ordenação por idade:\n" + clientes);
        //</editor-fold>
    }
}
