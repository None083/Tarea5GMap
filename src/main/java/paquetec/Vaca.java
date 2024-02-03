package paquetec;


import java.time.LocalDate;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noelia
 */
public class Vaca{
    
    private String id;
    private LocalDate fecNacimiento;
    private String descripcion;

    public Vaca(String id, LocalDate fecNacimiento, String descripcion) {
        this.id = id;
        this.fecNacimiento = fecNacimiento;
        this.descripcion = descripcion;
    }

    public Vaca() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(LocalDate fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaca{");
        sb.append("id=").append(id);
        sb.append(", fecNacimiento=").append(fecNacimiento);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vaca other = (Vaca) obj;
        return Objects.equals(this.id, other.id);
    }

}
