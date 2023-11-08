package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conexao;

public class App {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        System.out.println(conexao.connectDrive());
    }
}
