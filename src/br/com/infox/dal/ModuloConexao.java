/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Isaq&Mari
 */
public class ModuloConexao {
    //método responsável por estabelecer a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco
            String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão com o banco
        try { //Na tentativa de estabelecer a conexão, se der tudo certo...
            conexao = DriverManager.getConnection(url, user, password);
            /* A linha acima obtém a conexão usando os paramentros entre () e
            armazena na variavel conexao e retorna a conexao na linha returna
            abaixo
            */
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}
