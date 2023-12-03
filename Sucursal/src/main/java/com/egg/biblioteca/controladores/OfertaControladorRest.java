/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Oferta;
import com.egg.biblioteca.servicios.OfertaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfertaControladorRest {

    @Autowired
    private OfertaServicio ofertaServicio;

    @RequestMapping(value = "/ofertarest")
    public List<Oferta> listar() {
        
        return ofertaServicio.listarOfertas();
    }

}
