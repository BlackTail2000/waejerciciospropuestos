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

    @GetMapping("/Dos")
    public String ejercicioDos() {
        return "segundoejercicio";
    }

    @PostMapping("/Dos")
    public String ejercicioDos(@RequestParam("m") int m,
                               @RequestParam("a") int a,
                               Model model){
        String nombreMes = switch (m) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            default -> "Diciembre";
        };

        int cantidadDias = switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> a % 4 == 0 && (a % 100 != 0 || a % 400 == 0) ? 29 : 28;
        };

        model.addAttribute("nombreMes", nombreMes);
        model.addAttribute("cantidadDias", cantidadDias);
        model.addAttribute("anio", a);
        return "segundoejercicio";
    }
}
