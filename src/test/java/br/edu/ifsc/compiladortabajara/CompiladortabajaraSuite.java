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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Juca
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({br.edu.ifsc.compiladortabajara.InterfaceTest.class, br.edu.ifsc.compiladortabajara.TokenTest.class, br.edu.ifsc.compiladortabajara.AnalisadorLexicoTest.class})
public class CompiladortabajaraSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
