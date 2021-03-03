package com.tufarma.application.services;

import java.util.List;

import com.tufarma.application.models.LaboratorioModel;
import com.tufarma.application.repositories.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaboratorioService {
    
    @Autowired
    LaboratorioRepository laboratorioRepository;

    public List<LaboratorioModel> obtenerLaboratorios() throws Exception {
        try {
            return  (List<LaboratorioModel>) laboratorioRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public LaboratorioModel guardarLaboratorio(LaboratorioModel laboratorio) throws Exception {
        try {
            return laboratorioRepository.save(laboratorio);
        } catch (Exception e) {
            throw e;
        }
    }

}
