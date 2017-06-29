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
     * Test of getCodigo method, of class AnalisadorLexico.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        AnalisadorLexico instance = new AnalisadorLexico();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class AnalisadorLexico.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        AnalisadorLexico instance = new AnalisadorLexico();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Analisar method, of class AnalisadorLexico.
     */
    @Test
    public void testAnalisar() {
        System.out.println("Analisar");
        AnalisadorLexico instance = new AnalisadorLexico();
        instance.Analisar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showToken method, of class AnalisadorLexico.
     */
    @Test
    public void testShowToken() {
        System.out.println("showToken");
        AnalisadorLexico instance = new AnalisadorLexico();
        String expResult = "";
        String result = instance.showToken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
