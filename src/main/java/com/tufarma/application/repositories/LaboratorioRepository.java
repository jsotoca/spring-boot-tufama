package com.tufarma.application.repositories;

import com.tufarma.application.models.LaboratorioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratorioRepository extends CrudRepository<LaboratorioModel, Long> {
    
}
