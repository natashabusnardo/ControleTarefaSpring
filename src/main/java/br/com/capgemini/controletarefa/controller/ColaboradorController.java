package br.com.capgemini.controletarefa.controller;

import br.com.capgemini.controletarefa.dto.NovoColaboradorDTO;
import br.com.capgemini.controletarefa.model.Colaborador;
import br.com.capgemini.controletarefa.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("colaborador")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    //action
    @GetMapping("formulario")
    public String formulario(NovoColaboradorDTO dto){
        return "colaborador/formulario";
    }

    @PostMapping("novo")
    public String novo (NovoColaboradorDTO dto){

        Colaborador colaborador = dto.toColaborador();
        colaboradorRepository.save(colaborador);
        System.out.println(colaborador);

        return "redirect:/home";
    }



}
