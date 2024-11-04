
package com.TallerMecanico.rest.models;

public class Cuenta {
    private Integer id;
    private String email;
    private String clave;
    private Boolean estado;

    public Cuenta() {
    }

    public Cuenta(Integer id, String email, String clave, Boolean estado) {
        this.id = id;
        this.email = email;
        this.clave = clave;
        this.estado = estado;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
