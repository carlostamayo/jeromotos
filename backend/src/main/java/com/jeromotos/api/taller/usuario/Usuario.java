package com.jeromotos.api.taller.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cedula;
    private String nombre;
    private String telefono;
    private String ciudad;
    private String direccion;
    private String email;
    private String rol;

    public Usuario () {}

    public Usuario (
        String cedula,
        String nombre,
        String telefono,
        String ciudad,
        String direccion,
        String email,
        String rol
    ){
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.rol = rol;
    }

    public Long getId() {return id;}

    public void setCedula (String cedula) {this.cedula = cedula;}

    public String getCedula () {return cedula;}

    public void setNombre (String nombre) {this.nombre = nombre;}

    public String getNombre () {return nombre;}

    public void setTelefono (String telefono) {this.telefono = telefono;}

    public String getTelefono () {return telefono;}

    public void setCiudad (String ciudad) {this.ciudad = ciudad;}

    public String getCiudad () {return ciudad;}

    public void setDireccion (String direccion) {this.direccion = direccion;}

    public String getDireccion () {return  direccion;}

    public void setEmail (String email) {this.email = email;}

    public String getEmail () {return  email;}

    public void setRol (String rol) {this.rol = rol;}

    public String getRol () {return rol;}

}
