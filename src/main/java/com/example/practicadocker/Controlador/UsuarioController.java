package com.example.practicadocker.Controlador;

import com.example.practicadocker.Entidad.Formulario;
import com.example.practicadocker.Repositorio.FormRepo;
import com.example.practicadocker.Servicio.FormularioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/barcamp/")
public class UsuarioController {

    //@Autowired
    FormRepo formRepo;

    @Autowired
    private FormularioServices formServices;

    public UsuarioController(FormRepo formRepo) {
        this.formRepo = formRepo;
    }

    @RequestMapping("/")
    public String inicio(Model model){
        model.addAttribute("titutlo", "Inicio");
        model.addAttribute("label", "Inicio");;
        Map<String,Object> attributes = new HashMap<>();
        attributes.put("formularios",formRepo.findAll());
        for(int i = 0; i < formRepo.findAll().size(); i++) {
            System.out.println("\n ok");
            long id = 5;
            System.out.println(formRepo.getOne(id).getPregunta4());
        }
        //Formulario formulario = new Formulario(10,8,9,"yes");
        //formRepo.save(formulario);

        return "grafica";
    }

    @RequestMapping(path = "/form")
    public String index(Model model){
        model.addAttribute("titutlo", "Formulario Barcamp");
        model.addAttribute("label", "Formulario Barcamp");
        System.out.println("\n\n\nFORMULARIO\n\n\n\n");
        return "formu";
    }

    @RequestMapping(path ="saveform", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String guardarform (@RequestBody Formulario formulario)
        {
            System.out.println("El formulario tiene:\n\n\nGUARDANDO\n\n\n\n "+formulario.getPregunta1().toString());
            formRepo.save(formulario);
            return "redirect:/barcamp//";
    }
}
