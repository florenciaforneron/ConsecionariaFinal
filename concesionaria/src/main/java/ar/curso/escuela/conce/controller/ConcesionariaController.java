package ar.curso.escuela.conce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.curso.escuela.conce.service.Auto;
import ar.curso.escuela.conce.service.ConcesionariaService;

@Controller
public class ConcesionariaController {
	
	@Autowired
    ConcesionariaService miServicio;

    @GetMapping({ "/", "/lista-view" })
    public String mostrarLista(@ModelAttribute ArrayList<Auto> listaModelos, Model modelo) {
        modelo.addAttribute("listaVehiculos", miServicio.getListaAutos());
        modelo.addAttribute("objBuscar", new Auto());
        return "lista-view";
    }

    @GetMapping("/agregar-form")
    public String mostrarFormulario(Model modelo) {
        modelo.addAttribute("nuevoVehiculo", new Auto());
        return "agregar-form";
    }

    @PostMapping("/agregar-form")
    public String agregarVehiculo(@ModelAttribute Auto nuevo) {
        miServicio.setVehiculo(nuevo);
        return "redirect:/agregar-form";
    }

    @GetMapping("/busqueda-form")
    public String resultadoBusqueda(Model modelo) {
        modelo.addAttribute("objBuscar", new Auto());
        modelo.addAttribute("tablaModelos", new ArrayList<Auto>());
        return "busqueda-form";
    }

    @PostMapping("/buscar-modelo")
    public String getModelo(@ModelAttribute Auto objBuscar, Model modelo) {

        ArrayList<Auto> resultado = miServicio.getListaModelo(objBuscar.getModelo());
       
        if (resultado == null) {
             return "resultado-view";
         } else {
             modelo.addAttribute("mensaje", "ok");
             modelo.addAttribute("tablaModelos", resultado);
         }
         modelo.addAttribute("objBuscar", new Auto());
        return "busqueda-form";
    }

}
