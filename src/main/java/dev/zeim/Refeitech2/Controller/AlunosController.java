package dev.zeim.Refeitech2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class AlunosController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e a minha mensagem";
    }
}
