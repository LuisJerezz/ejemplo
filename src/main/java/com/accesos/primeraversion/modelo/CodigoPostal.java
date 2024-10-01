package com.accesos.primeraversion.modelo;
import java.util.Objects;

public class CodigoPostal {
    private int cp;
    private String localidad;
    private String provincia;


    public CodigoPostal() {
    }

    public CodigoPostal(int cp, String localidad, String provincia) {
        this.cp = cp;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public CodigoPostal cp(int cp) {
        setCp(cp);
        return this;
    }

    public CodigoPostal localidad(String localidad) {
        setLocalidad(localidad);
        return this;
    }

    public CodigoPostal provincia(String provincia) {
        setProvincia(provincia);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CodigoPostal)) {
            return false;
        }
        CodigoPostal codigoPostal = (CodigoPostal) o;
        return cp == codigoPostal.cp && Objects.equals(localidad, codigoPostal.localidad) && Objects.equals(provincia, codigoPostal.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cp, localidad, provincia);
    }

    @Override
    public String toString() {
        return "{" +
            " cp='" + getCp() + "'" +
            ", localidad='" + getLocalidad() + "'" +
            ", provincia='" + getProvincia() + "'" +
            "}";
    }
    
}
