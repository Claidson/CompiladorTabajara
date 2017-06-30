/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.compiladortabajara;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juca
 */
public class AnalisadorLexicoTest {

    public AnalisadorLexicoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isLetra method, of class AnalisadorLexico.
     */
    @Test
    public void testIsLetra() {
        System.out.println("Testando metodo isLetra()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();
        assertTrue(analisadorLexico.isLetra('a'));
        assertTrue(analisadorLexico.isLetra('A'));
        assertTrue(analisadorLexico.isLetra('b'));
        assertTrue(analisadorLexico.isLetra('B'));
        assertTrue(analisadorLexico.isLetra('c'));
        assertTrue(analisadorLexico.isLetra('C'));
        assertTrue(analisadorLexico.isLetra('d'));
        assertTrue(analisadorLexico.isLetra('D'));
        assertTrue(analisadorLexico.isLetra('e'));
        assertTrue(analisadorLexico.isLetra('E'));
        assertTrue(analisadorLexico.isLetra('f'));
        assertTrue(analisadorLexico.isLetra('F'));
        assertTrue(analisadorLexico.isLetra('z'));
        assertTrue(analisadorLexico.isLetra('Z'));

        assertFalse(analisadorLexico.isLetra('1'));
        assertFalse(analisadorLexico.isLetra('9'));
        assertFalse(analisadorLexico.isLetra('Ç'));
        assertFalse(analisadorLexico.isLetra('~'));
        assertFalse(analisadorLexico.isLetra('-'));
        assertFalse(analisadorLexico.isLetra('+'));
        assertFalse(analisadorLexico.isLetra('='));
        assertFalse(analisadorLexico.isLetra('@'));
        assertFalse(analisadorLexico.isLetra('ã'));

    }

    /**
     * Test of isNumero method, of class AnalisadorLexico.
     */
    @Test
    public void testIsNumero() {
        System.out.println("Testando metodo isNumber()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        assertTrue(analisadorLexico.isNumero('0'));
        assertTrue(analisadorLexico.isNumero('1'));
        assertTrue(analisadorLexico.isNumero('2'));
        assertTrue(analisadorLexico.isNumero('3'));
        assertTrue(analisadorLexico.isNumero('4'));
        assertTrue(analisadorLexico.isNumero('5'));
        assertTrue(analisadorLexico.isNumero('6'));
        assertTrue(analisadorLexico.isNumero('7'));
        assertTrue(analisadorLexico.isNumero('8'));
        assertTrue(analisadorLexico.isNumero('9'));

        assertFalse(analisadorLexico.isNumero('a'));
        assertFalse(analisadorLexico.isNumero('A'));
        assertFalse(analisadorLexico.isNumero('z'));
        assertFalse(analisadorLexico.isNumero('Z'));
        assertFalse(analisadorLexico.isNumero('.'));
        assertFalse(analisadorLexico.isNumero(';'));

    }

    /**
     * Test of isValido method, of class AnalisadorLexico.
     */
    @Test
    public void testIsValido() {
        System.out.println("Testando metodo isNumber()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();
        
        assertTrue(analisadorLexico.isValido('+'));
        assertTrue(analisadorLexico.isValido('-'));
        assertTrue(analisadorLexico.isValido('*'));
        assertTrue(analisadorLexico.isValido('/'));
        assertTrue(analisadorLexico.isValido('='));
        assertTrue(analisadorLexico.isValido(' '));
        assertTrue(analisadorLexico.isValido('('));
        assertTrue(analisadorLexico.isValido(')'));
        assertTrue(analisadorLexico.isValido(';'));
        
        
        assertFalse(analisadorLexico.isValido('0'));
        assertFalse(analisadorLexico.isValido('a'));
        assertFalse(analisadorLexico.isValido('~'));
        assertFalse(analisadorLexico.isValido('!'));
        assertFalse(analisadorLexico.isValido('Z'));

    }
    
    

}

