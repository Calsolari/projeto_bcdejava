package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

    public void consultarFuncionarios() throws SQLException {

        //Instanciando com o banco
        Conexao conexao = new Conexao();

        //Representa a conexão com banco de dados no Controller
        Connection objetoConnection = conexao.getConnection();

        //Responsavel por executar a query
        Statement statement = objetoConnection.createStatement();

        //Query
        String queryConsulta = "SELECT * FROM funcionarios";

        //Armazena a resposta do banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("id_funcionarios");
            String nome = resultSet.getNString("nome");
            String cargo = resultSet.getNString("cargo");
            double salario = resultSet.getDouble("salario");
            String departamento = resultSet.getNString("departamento");

            System.out.println(idFuncionario);
            System.out.println(nome);
            System.out.println(cargo);
            System.out.println(salario);
            System.out.println(departamento);
            System.out.println("--------------------------------");
        }
    }



}
