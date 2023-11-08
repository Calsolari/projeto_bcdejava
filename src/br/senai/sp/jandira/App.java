package br.senai.sp.jandira;

import br.senai.sp.jandira.controller.EmpresaController;
import br.senai.sp.jandira.model.Conexao;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        EmpresaController empresaController = new EmpresaController();

        empresaController.consultarFuncionarios();
    }
}
