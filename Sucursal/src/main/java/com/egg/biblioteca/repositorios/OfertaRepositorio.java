
package com.egg.biblioteca.repositorios;


import com.egg.biblioteca.entidades.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepositorio extends  JpaRepository<Oferta, String>{
    
}
