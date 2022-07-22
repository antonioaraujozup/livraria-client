package br.com.zup.edu.livrariaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "livrosClient",
        url = "http://localhost:8080/oauth2-resourceserver-livraria"
)
public interface LivrosClient {

    @GetMapping("/api/livros/{id}")
    public LivroResponse detalharLivro(@PathVariable Long id);

    @GetMapping("/api/autores/{id}")
    public AutorResponse detalharAutor(@PathVariable Long id);

}
