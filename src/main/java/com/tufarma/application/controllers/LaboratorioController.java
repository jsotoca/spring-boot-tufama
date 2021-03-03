package com.tufarma.application.controllers;

import java.util.List;

import com.tufarma.application.models.LaboratorioModel;
import com.tufarma.application.services.LaboratorioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {
    
    @Autowired
    LaboratorioService laboratorioService;

    @GetMapping()
    public List<LaboratorioModel> obtenerLaboratorios(){
        try {
            return laboratorioService.obtenerLaboratorios();
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,
        MediaType.MULTIPART_FORM_DATA_VALUE} )
    public LaboratorioModel guardarLaboratorio(
        @ModelAttribute LaboratorioModel laboratorio
    ){
        try {
            return laboratorioService.guardarLaboratorio(laboratorio);
        } catch (Exception e) {
            return null;
        }
    }

}
