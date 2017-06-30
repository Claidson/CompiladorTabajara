/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.compiladortabajara;

import java.util.ArrayList;
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
        System.out.println("Testando metodo isValido()");
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

    /**
     * Test of isShowToken method, of class AnalisadorLexico.
     */
    @Test
    public void testShowToken() {
        System.out.println("Testando metodo isShowToken()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        Token token1 = new Token("token1");
        Token token2 = new Token("token2");
        Token token3 = new Token("token3");
        Token token4 = new Token("token4");
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList.add(token1);
        tokenList.add(token2);
        tokenList.add(token3);
        tokenList.add(token4);

        assertEquals("token1\ntoken2\ntoken3\ntoken4\n", analisadorLexico.showToken(tokenList));

    }

    /**
     * Test of Analisar method, of class AnalisadorLexico.
     */
    @Test
    public void testAnalisar() {
        System.out.println("Testando metodo Analisar()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        Token token1 = new Token("token1");
        Token token2 = new Token("token2");
        Token token3 = new Token("token3");
        Token token4 = new Token("token4");
        Token token5 = new Token(";");
        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList.add(token1);
        tokenList.add(token2);
        tokenList.add(token3);
        tokenList.add(token4);
        tokenList.add(token5);

        assertEquals("token1\ntoken2\ntoken3\ntoken4\n;\n", analisadorLexico.showToken(analisadorLexico.Analisar("token1 token2 token3 token4;")));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testeExceptionAnalisar() {
        System.out.println("Testando metodo Analisar() - testeExceptionAnalisar()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        analisadorLexico.Analisar("$");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeExceptionAnalisar2() {
        System.out.println("Testando metodo Analisar2() - testeExceptionAnalisar()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        analisadorLexico.Analisar("x = 3.O;");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testeExceptionAnalisar3() {
        System.out.println("Testando metodo Analisar3() - testeExceptionAnalisar()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        analisadorLexico.Analisar("soma = 4x; ");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testeExceptionAnalisar4() {
        System.out.println("Testando metodo Analisar4() - testeExceptionAnalisar()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        analisadorLexico.Analisar("resultado = 500*kgAço;");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeExceptionAnalisar5() {
        System.out.println("Testando metodo Analisar5() - testeExceptionAnalisar()");
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();

        analisadorLexico.Analisar("x = 50.5.10;");
    }
}
