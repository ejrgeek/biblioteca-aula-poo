package br.edu.fescfafic.biblioteca.Main;

import br.edu.fescfafic.biblioteca.Model.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Erlon",
                "erlon@gmail.com"
        );

        usuario.exibirInfo();


    }
}