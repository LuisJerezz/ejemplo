package com.accesos.primeraversion.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String email;
    private int numeroDNI;
    private char letraDNI;
    private LocalDate fechaNacimiento;
    private Sexo sexo;
    private List<Direccion> direcciones;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, int numeroDNI, char letraDNI, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroDNI = numeroDNI;
        this.letraDNI = letraDNI;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.direcciones = new ArrayList<Direccion>();
    }

    public List<Direccion> getDirecciones() {
        return this.direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones){
        this.direcciones = direcciones;
    }

    public void addDireccion(Direccion d){
        this.direcciones.add(d);
    }

    public void delDireccion(Direccion d){
        this.direcciones.removeIf(it -> it.equals(d));
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroDNI() {
        return this.numeroDNI;
    }

    public void setNumeroDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public char getLetraDNI() {
        return this.letraDNI;
    }

    public void setLetraDNI(char letraDNI) {
        this.letraDNI = letraDNI;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona apellido(String apellido) {
        setApellido(apellido);
        return this;
    }

    public Persona email(String email) {
        setEmail(email);
        return this;
    }

    public Persona numeroDNI(int numeroDNI) {
        setNumeroDNI(numeroDNI);
        return this;
    }

    public Persona letraDNI(char letraDNI) {
        setLetraDNI(letraDNI);
        return this;
    }

    public Persona fechaNacimiento(LocalDate fechaNacimiento) {
        setFechaNacimiento(fechaNacimiento);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(email, persona.email) && numeroDNI == persona.numeroDNI && letraDNI == persona.letraDNI && Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email, numeroDNI, letraDNI, fechaNacimiento, sexo);
    }

    @Override
    public String toString() {
        return "{" +
            " \'nombre\'':'" + getNombre() + "'" +
            ", \'apellido\'':'" + getApellido() + "'" +
            ", \'email\'':'" + getEmail() + "'" +
            ", \'numeroDNI\'':'" + getNumeroDNI() + "'" +
            ", \'letraDNI\'':'" + getLetraDNI() + "'" +
            ", \'fechaNacimiento\'':'" + getFechaNacimiento() + "'" +
            "}";
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
}
