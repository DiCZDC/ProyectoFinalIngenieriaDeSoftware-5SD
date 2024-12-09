/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;


import CONEXION.*;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author raulc
 */
public class controladorVehiculos {
    private ArrayList<Vehiculo> vehiculos;
    Connection cn;
    
    
    public controladorVehiculos() {
        vehiculos = new ArrayList<>();
    }
    
    public boolean ActualizarVehiculos(){
        vehiculos.clear();
        String query = "select * from vehiculo Order by id_vehiculo asc";
        try {
            cn = Conexion.conectar();
            PreparedStatement pstmt = cn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Vehiculo carro = new Vehiculo(
                        rs.getInt("id_vehiculo"),
                        rs.getString("modelo"),
                        rs.getString("variante"),
                        rs.getInt("anio"),
                        rs.getDouble("precio_compra"),
                        rs.getLong("kilometraje"),
                        rs.getString("tipo_gasolina"),
                        rs.getDouble("precio_venta"),
                        rs.getDate("fecha_compra"),
                        rs.getBoolean("tenencia")
                        );
                vehiculos.add(carro);
            }            
            
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean agregarVehiculo(Vehiculo v){
        String query = "INSERT INTO vehiculo(modelo,variante,anio,precio_compra,kilometraje,tipo_gasolina,precio_venta,fecha_compra,tenencia) VALUES(?, ?, ?, ?, ?, ?, ? ,? ,?)";
        try {
            cn = Conexion.conectar();
            PreparedStatement pstmt = cn.prepareStatement(query);
            pstmt.setString(1,v.getModelo());
            pstmt.setString(2,v.getVariante());
            pstmt.setInt(3,v.getAnio());
            pstmt.setDouble(4,v.getPrecio_compra());
            pstmt.setLong(5,v.getKilometraje());
            pstmt.setString(6,v.getTipo_gasolina());
            pstmt.setDouble(7,v.getPrecio_venta());
            pstmt.setDate(8, new java.sql.Date(v.getFecha_compra().getTime()) );
            pstmt.setBoolean(9,v.getTenencia());
            pstmt.executeUpdate();
            
            this.ActualizarVehiculos();
            return true;
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
    
    public boolean editarVehiculo(Vehiculo v){
        String query = "UPDATE vehiculo SET modelo = ?, variante = ?, anio = ?, precio_compra = ?, kilometraje = ?, tipo_gasolina = ?, precio_venta = ?, fecha_compra = ?, tenencia = ? WHERE id_vehiculo = ?";
        try {
            cn = Conexion.conectar();
            PreparedStatement pstmt = cn.prepareStatement(query);
            pstmt.setString(1,v.getModelo());
            pstmt.setString(2,v.getVariante());
            pstmt.setInt(3,v.getAnio());
            pstmt.setDouble(4,v.getPrecio_compra());
            pstmt.setLong(5,v.getKilometraje());
            pstmt.setString(6,v.getTipo_gasolina());
            pstmt.setDouble(7,v.getPrecio_venta());
            pstmt.setDate(8, new java.sql.Date(v.getFecha_compra().getTime()) );
            pstmt.setBoolean(9,v.getTenencia());
            pstmt.setInt(10, v.getId_vehiculo());
            pstmt.executeUpdate();
            this.ActualizarVehiculos();
            return true;
            
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean tenenciaPagada( int id_vehiculo){
        String query = "Update vehiculo set tenencia = true WHERE id_vehiculo = ?";
        //"UPDATE vehiculo SET modelo = ?, variante = ?, anio = ?, precio_compra = ?, kilometraje = ?, tipo_gasolina = ?, precio_venta = ?, fecha_compra = ?, tenencia = ? WHERE id_vehiculo = ?";
        try {
            cn = Conexion.conectar();
            PreparedStatement pstmt = cn.prepareStatement(query);
            pstmt.setInt(1,id_vehiculo);
            pstmt.executeUpdate();
            this.ActualizarVehiculos();
            return true;
            
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public Date consultarFecha(int id_vehiculo){
        String query = "select fecha_compra from vehiculo WHERE id_vehiculo = ?";
        try {
            cn = Conexion.conectar();
            PreparedStatement pstmt = cn.prepareStatement(query);
            pstmt.setInt(1,id_vehiculo);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
                return rs.getObject("fecha_compra",Date.class);
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
                    return null;
    }
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
    public ArrayList<Vehiculo> getVehiculosNoTenencia(){
        ArrayList<Vehiculo> temp = new ArrayList<>();
        for(Vehiculo carro:vehiculos){
            if(!carro.getTenencia()){
                temp.add(carro);
            }
        }
        return temp;
    }
}
