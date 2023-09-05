package br.edu.fescfafic.biblioteca.Main;

import br.edu.fescfafic.biblioteca.Model.Usuario;
import br.edu.fescfafic.biblioteca.Model.Livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Erlon",
                "erlon@gmail.com"
        );

        //usuario.exibirInfo();

        Livro livro = new Livro(
                "Admiravel Mundo Novo",
                "Aldous Huxley",
                "d8a9sd7as98d",
                LocalDate.of(1932, 5, 12),
                10
        );

        livro.exibirInfo();


    }
}