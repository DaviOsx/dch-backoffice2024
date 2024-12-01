package pe.edu.cibertec.dch_backoffice2024.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.dch_backoffice2024.dto.CityDto;
import pe.edu.cibertec.dch_backoffice2024.service.MaintenanceService;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class MaintenanceController {


    //ASIGNAR MEMORIA
    @Autowired
    MaintenanceService maintenanceService;


    @GetMapping("/start")
    public String start(Model model) {

        List<CityDto> citys = maintenanceService.findAllCitys();
        model.addAttribute("citys", citys);
        return "maintenance";
    }

}
