package br.univille.chamados.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

    public class ChamadosController {

        @GetMapping("/teste")
        public String teste() {
            return "Aplicação funcionando";
        }
        
        @GetMapping("/identificacao")
        public String id(){
            return "Thiago, 144-6AN, Projeto Spring Boot em execução ";
        }
        
    }