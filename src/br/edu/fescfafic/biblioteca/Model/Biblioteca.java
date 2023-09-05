package br.edu.fescfafic.biblioteca.Model;

public class Biblioteca {

    //nome, endereco, lista de livros[100]
    public String nome;
    public String endereco;
    public Livro[] acervo = new Livro[100];

    public Biblioteca(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void cadastrarLivro(Livro livro){
        for (int i = 0; i < this.acervo.length; i++){
            if (this.acervo[i] == null){
                this.acervo[i] = livro;
                break;
            }
        }
    }


    // verificarDisponibilidade, cadastrarLivro, localizarLivroPorTitulo e Autor
    // devolver, emprestar, exibirInfo

}
