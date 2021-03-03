package com.tufarma.application.models;

import javax.persistence.*;

@Entity
@Table(name = "laboratorio")
public class LabotatorioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_laboratorio;

    @Column(nullable = false, length = 65)
    private String nombre;

    
    @Column(nullable = true)
    private Boolean vigencia;

    public Long getId_laboratorio() {
        return id_laboratorio;
    }

    public void setId_laboratorio(Long id_laboratorio) {
        this.id_laboratorio = id_laboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    

}
