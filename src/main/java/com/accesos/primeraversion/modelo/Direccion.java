package com.accesos.primeraversion.modelo;
import java.util.Objects;

public class Direccion {
    private long id;
    private String nombreVia; 
    private TipoVia tipoVia;
    private int numero;
    private String detalle;
    


    public Direccion() {
    }

    public Direccion(long id, String nombreVia, TipoVia tipoVia, int numero, String detalle) {
        this.id = id;
        this.nombreVia = nombreVia;
        this.tipoVia = tipoVia;
        this.numero = numero;
        this.detalle = detalle;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreVia() {
        return this.nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public TipoVia getTipoVia() {
        return this.tipoVia;
    }

    public void setTipoVia(TipoVia tipoVia) {
        this.tipoVia = tipoVia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Direccion id(long id) {
        setId(id);
        return this;
    }

    public Direccion nombreVia(String nombreVia) {
        setNombreVia(nombreVia);
        return this;
    }

    public Direccion tipoVia(TipoVia tipoVia) {
        setTipoVia(tipoVia);
        return this;
    }

    public Direccion numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Direccion detalle(String detalle) {
        setDetalle(detalle);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Direccion direccion = (Direccion) obj;
        return id == direccion.id && Objects.equals(nombreVia, direccion.nombreVia) && Objects.equals(tipoVia, direccion.tipoVia) && numero == direccion.numero && Objects.equals(detalle, direccion.detalle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreVia, tipoVia, numero, detalle);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombreVia='" + getNombreVia() + "'" +
            ", tipoVia='" + getTipoVia() + "'" +
            ", numero='" + getNumero() + "'" +
            ", detalle='" + getDetalle() + "'" +
            "}";
    }
    
}
