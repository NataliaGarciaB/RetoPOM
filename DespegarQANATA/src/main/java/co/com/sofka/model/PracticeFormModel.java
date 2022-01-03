package co.com.sofka.model;

import co.com.sofka.util.Trayecto;

public class PracticeFormModel {
    private String origen;
    private String destino;
    private String day_ida;
    private String month_ida;
    private String year_ida;
    private String day_vuelta;
    private String month_vuelta;
    private String year_vuelta;
    private Trayecto trayecto;
    private String nombre;
    private String apellido;
    private String cedula;


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDay_ida() {
        return day_ida;
    }

    public void setDay_ida(String day_ida) { this.day_ida = day_ida;}

    public String getMonth_ida() {
        return month_ida;
    }

    public void setMonth_ida(String month_ida) {
        this.month_ida = month_ida;
    }

    public String getYear_ida() {
        return year_ida;
    }

    public void setYear_ida(String year_ida) {
        this.year_ida = year_ida;
    }

    public String getDay_vuelta() {
        return day_vuelta;
    }

    public void setDay_vuelta(String day_vuelta) {
        this.day_vuelta = day_vuelta;
    }

    public String getMonth_vuelta() {
        return month_vuelta;
    }

    public void setMonth_vuelta(String month_vuelta) {
        this.month_vuelta = month_vuelta;
    }

    public String getYear_vuelta() {
        return year_vuelta;
    }

    public void setYear_vuelta(String year_vuelta) {
        this.year_vuelta = year_vuelta;
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
