package admredes;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class DataInventario {
    private String fabricante;
    private String modelo;
    private String estado;
    private String ubicacion;
    private String direccionIP;

    public DataInventario(String fabricante, String modelo, String estado, String ubicacion, String direccionIP) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.direccionIP = direccionIP;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }
    
}

