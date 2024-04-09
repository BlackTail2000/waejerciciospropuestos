package pe.edu.cibertec.waejerciciospropuestos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Ejercicios")
public class EjerciciosController {
    @GetMapping("/Uno")
    public String ejercicioUno(){
        return "primerejercicio";
    }

    @PostMapping("/Uno")
    public String ejercicioUno(@RequestParam("r") double r, @RequestParam("h") double h,
                               Model model){
        model.addAttribute("areabase", 3.14 * r * 2);
        model.addAttribute("arealateral", 2 * 3.14 * h);
        model.addAttribute("areatotal", 2 * 3.14 * (r + h));
        System.out.print("Estas aquí");
        return "primerejercicio";
    }
}
