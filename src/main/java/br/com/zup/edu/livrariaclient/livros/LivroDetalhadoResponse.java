package br.com.zup.edu.livrariaclient.livros;

import br.com.zup.edu.livrariaclient.client.AutorResponse;
import br.com.zup.edu.livrariaclient.client.LivroResponse;

import java.time.LocalDate;

public class LivroDetalhadoResponse {

    private Long id;
    private String nome;
    private String descricao;
    private String isbn;
    private LocalDate publicadoEm;
    private AutorResponse autor;

    public LivroDetalhadoResponse(LivroResponse livro, AutorResponse autor) {
        this.id = livro.getId();
        this.nome = livro.getNome();
        this.descricao = livro.getDescricao();
        this.isbn = livro.getIsbn();
        this.publicadoEm = livro.getPublicadoEm();
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicadoEm() {
        return publicadoEm;
    }

    public AutorResponse getAutor() {
        return autor;
    }
}
