package br.com.zup.edu.livrariaclient.livros;

import br.com.zup.edu.livrariaclient.client.AutorResponse;
import br.com.zup.edu.livrariaclient.client.LivroResponse;
import br.com.zup.edu.livrariaclient.client.LivrosClient;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class DetalharLivroController {

    @Autowired
    private LivrosClient client;

    @GetMapping("/livros/{id}")
    public ResponseEntity<?> detalhar(@PathVariable Long id) {

        LivroResponse livro;

        try {
            livro = client.detalharLivro(id);
        } catch (FeignException ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Não foi possível detalhar o livro");
        }

        AutorResponse autor = client.detalharAutor(livro.getAutorId());

        LivroDetalhadoResponse livroDetalhado = new LivroDetalhadoResponse(livro,autor);

        return ResponseEntity.ok(livroDetalhado);
    }

}
