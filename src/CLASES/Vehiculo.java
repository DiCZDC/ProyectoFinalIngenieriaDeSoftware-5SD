/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.util.Date;

/**
 *
 * @author raulc
 */
public class Vehiculo{
    private int id_vehiculo;
    private String modelo;
    private String variante;
    private int anio;
    private double precio_compra;
    private long kilometraje;
    private String tipo_gasolina;
    private Double precio_venta;
    private Date fecha_compra;
    private boolean tenencia;

    public Vehiculo(int id_vehiculo, String modelo, String variante, int anio, double precio_compra, long kilometraje, String tipo_gasolina, Double precio_venta, Date fecha_compra, boolean tenencia) {
        this.id_vehiculo = id_vehiculo;
        this.modelo = modelo;
        this.variante = variante;
        this.anio = anio;
        this.precio_compra = precio_compra;
        this.kilometraje = kilometraje;
        this.tipo_gasolina = tipo_gasolina;
        this.precio_venta = precio_venta;
        this.fecha_compra = fecha_compra;
        this.tenencia = tenencia;
    }


    
    

    public int getAnio() {
        return anio;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public long getKilometraje() {
        return kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public Double getPrecio_venta() {
        return precio_venta;
    }


    public String getTipo_gasolina() {
        return tipo_gasolina;
    }

    public String getVariante() {
        return variante;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(long kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setTenencia(boolean tenencia) {
        this.tenencia = tenencia;
    }



    public void setTipo_gasolina(String tipo_gasolina) {
        this.tipo_gasolina = tipo_gasolina;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }
    
    public boolean getTenencia(){
        return tenencia;
    }
    
}

