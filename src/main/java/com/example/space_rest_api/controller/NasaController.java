package com.example.space_rest_api.controller;

import com.example.space_rest_api.service.NasaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/nasa")
public class NasaController {
    private final NasaService nasaService;

    public NasaController(NasaService nasaService) {
        this.nasaService = nasaService;
    }

    @GetMapping("/apod")
    public String getApod(Model model) {
        model.addAttribute("apod", nasaService.getDailyApod());
        return "index";
    }
    
    
}
