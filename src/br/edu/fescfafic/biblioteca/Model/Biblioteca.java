package br.edu.fescfafic.biblioteca.Model;

public class Biblioteca {

    //nome, endereco, lista de livros[100]
    public String nome;
    public String endereco;
    public Livro[] acervo = new Livro[100];
    public int quantidadeDeLivros = 0;

    public Biblioteca(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    /*public void cadastrarLivro(Livro livro){
        for (int i = 0; i < this.acervo.length; i++){
            if (this.acervo[i] == null){
                this.acervo[i] = livro;
                break;
            }
        }
    }*/

    public void cadastrarLivro(Livro livro){
        this.acervo[this.quantidadeDeLivros] = livro;
        this.quantidadeDeLivros++;
    }


    // verificarDisponibilidade, cadastrarLivro, localizarLivroPorTitulo e Autor
    // devolver, emprestar, exibirInfo

}
