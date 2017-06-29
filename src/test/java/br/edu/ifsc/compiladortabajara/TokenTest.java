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
public class TokenTest {
    
    public TokenTest() {
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
     * Test of getId method, of class Token.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Token instance = new Token();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Token.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Token instance = new Token();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConteudo method, of class Token.
     */
    @Test
    public void testGetConteudo() {
        System.out.println("getConteudo");
        Token instance = new Token();
        String expResult = "";
        String result = instance.getConteudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConteudo method, of class Token.
     */
    @Test
    public void testSetConteudo() {
        System.out.println("setConteudo");
        String conteudo = "";
        Token instance = new Token();
        instance.setConteudo(conteudo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
