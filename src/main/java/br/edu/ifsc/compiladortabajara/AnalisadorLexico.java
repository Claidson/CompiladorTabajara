/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.compiladortabajara;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class AnalisadorLexico {

    
     
    
    char atual;
    int estado;

   

    public ArrayList<Token> Analisar(String codigo) {
        
        ArrayList<Token> meusTokens= new ArrayList<>();
        double start = System.nanoTime();
        estado = 0;
        
        for (int i = 0; i < codigo.length(); i++) {
            String token= "";
            atual = codigo.charAt(i);

            switch (estado) {
                case 0:
                    if (isLetra(atual)) {
                        estado = 1;
                        token += atual;
                    } else if (isNumero(atual)) {
                        estado = 11;
                        token += atual;
                    } else if (atual == '(') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == ')') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == '+') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == '-') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == '*') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == '/') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == '=') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == ';') {
                        token += atual;
                        meusTokens.add(new Token(token));
                        estado = 0;
                    } else if (atual == ' ') {
                    } else {
                        token = "Erro no codigo";
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i = codigo.length();
                    }
                    break;
                case 1:
                    if (isLetra(atual)) {
                        token += atual;
                    } else if (isNumero(atual)) {
                        token += atual;
                    } else if(isValido(atual)){
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i--;
                    } else {
                        token = "Erro no codigo";
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i = codigo.length();
                    }
                    break;                
                case 11:
                    if ((isNumero(atual))) {
                        token += atual;
                    } else if (atual == '.') {
                        estado = 12;
                        token += atual;
                    } else if (isValido(atual)) {
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i--;
                    } else {
                        token = "Erro no codigo";
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i = codigo.length();
                    }
                    break;
                case 12:
                    if (isNumero(atual)) {
                        estado = 13;
                        token += atual;
                    } else {
                        token = "Erro no codigo";
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i = codigo.length();
                    }
                    break;
                case 13:
                    if (isValido(atual)){
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i--;
                    } else if (isNumero(atual)) {
                        token += atual;
                    } else {
                        token = "Erro no codigo";
                        meusTokens.add(new Token(token));
                        estado = 0;
                        i = codigo.length();
                    }
                    break;                
                default:
                    break;
            }

        }
       // if(token != "") adicionaToken();
        double elapsed = (System.nanoTime() - start)/1000000;
        
        
       
        System.out.println("Tempo de execução: " + elapsed + " milisegundos");
        
        return meusTokens; 
    }

    public boolean isLetra(char c) {
        if (((c >= 'A') && (c <= 'Z'))
                || ((c >= 'a') && (c <= 'z'))) {
            return true;
        }
        return false;
    }

    public boolean isNumero(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
    
    public boolean isValido(char c){
        if(c == '+' || c == '-' || c == '*'|| c == '/' || c == '=' 
                || c == ' ' || c == '(' || c == ')' || c == ';') return true;
        return false;
    }
    

    public String showToken(ArrayList<Token> meusTokens) {
        String r = "";
        for (Token meusToken : meusTokens) {
            r += meusToken.getConteudo();
            r += "\n";
        }
        return r;
    }
}
