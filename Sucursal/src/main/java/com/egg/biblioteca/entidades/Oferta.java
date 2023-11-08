package com.egg.biblioteca.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Oferta {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String idOferta;
    private String precio; 
    private String nombreOferta; 
    
   @OneToOne
    public Imagen imagen;
       //queremos que cuando la noticia se registre en el sistema se guarde la fecha de alta 
    //por lo tanto vamos a crear un atributo del tipo date 
    @Temporal(TemporalType.DATE)
    private Date altaOferta;

    public Oferta() {
    }

    public String getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(String idOferta) {
        this.idOferta = idOferta;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombreOferta() {
        return nombreOferta;
    }

    public void setNombreOferta(String nombreOferta) {
        this.nombreOferta = nombreOferta;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Date getAltaOferta() {
        return altaOferta;
    }

    public void setAltaOferta(Date altaOferta) {
        this.altaOferta = altaOferta;
    }
    
    
}
