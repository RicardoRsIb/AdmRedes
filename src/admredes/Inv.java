package admredes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import admredes.DataInventario;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Inv extends JFrame {
    // Declarar los componentes de la interfaz
    private JLabel etiquetaFabricante;
    private JLabel etiquetaModelo;
    private JLabel etiquetaEstado;
    private JLabel etiquetaUbicacion;
    private JLabel etiquetaDireccionIP;
    private JTextField campoFabricante;
    private JTextField campoModelo;
    private JTextField campoEstado;
    private JTextField campoUbicacion;
    private JTextField campoDireccionIP;
    private JButton botonAgregar;
    private JButton botonModificar;
    private JButton botonRegresar;
    private JButton botonEliminar;
    private JTable tablaInventario;
    private DefaultTableModel modeloTabla;
    private JScrollPane panelTabla;

    // Crear el constructor de la clase
    public Inv() {
        // Inicializar los componentes de la interfaz
        etiquetaFabricante = new JLabel("Fabricante:");
        etiquetaModelo = new JLabel("Modelo:");
        etiquetaEstado = new JLabel("Estado:");
        etiquetaUbicacion = new JLabel("Ubicación:");
        etiquetaDireccionIP = new JLabel("Dirección IP:");
        campoFabricante = new JTextField(15);
        campoModelo = new JTextField(15);
        campoEstado = new JTextField(15);
        campoUbicacion = new JTextField(15);
        campoDireccionIP = new JTextField(15);
        botonAgregar = new JButton("Agregar");
        botonRegresar= new JButton("Regresar");
        botonModificar = new JButton("Modificar");
        botonEliminar = new JButton("Eliminar");
        tablaInventario = new JTable();
        modeloTabla = new DefaultTableModel();
        panelTabla = new JScrollPane(tablaInventario);

        // Configurar la ventana
        setTitle("Inventario de la red");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Añadir los componentes a la ventana
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 30, 10, 30);
        add(etiquetaFabricante, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(campoFabricante, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(etiquetaModelo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(campoModelo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(etiquetaEstado, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(campoEstado, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(etiquetaUbicacion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(campoUbicacion, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(etiquetaDireccionIP, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(campoDireccionIP, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        add(botonAgregar, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 2;
        add(botonModificar, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 2;
        add(botonEliminar, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridheight = 2;
        add(botonRegresar, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(panelTabla, gbc);

        // Configurar la tabla
        modeloTabla.addColumn("Fabricante");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Estado");
        modeloTabla.addColumn("Ubicación");
        modeloTabla.addColumn("Dirección IP");
        tablaInventario.setModel(modeloTabla);
        tablaInventario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Crear la conexión con la base de datos
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            // Establecer la conexión con la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario", "root", "comeasyouH3Y");
            // Crear un objeto Statement para ejecutar consultas SQL
            Statement sentencia = conexion.createStatement();
            // Ejecutar una consulta SQL para obtener los datos del inventario
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM inventario");
            // Recorrer el resultado y añadir los datos a la tabla
            while (resultado.next()) {
                // Obtener los datos de cada fila del resultado
                String fabricante = resultado.getString("fabricante");
                String modelo = resultado.getString("modelo");
                String estado = resultado.getString("estado");
                String ubicacion = resultado.getString("ubicacion");
                String direccionIP = resultado.getString("direccionIP");
                // Crear un objeto Inventario con los datos
                DataInventario inventario = new DataInventario(fabricante, modelo, estado, ubicacion, direccionIP);
                // Añadir el objeto Inventario al modelo de la tabla
                modeloTabla.addRow(new Object[]{inventario.getFabricante(), inventario.getModelo(), inventario.getEstado(), inventario.getUbicacion(), inventario.getDireccionIP()});
            }
            // Cerrar el resultado, la sentencia y la conexión
            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre alguna excepción
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Añadir los listeners a los botones
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Obtener los datos de los campos de texto
                String fabricante = campoFabricante.getText();
                String modelo = campoModelo.getText();
                String estado = campoEstado.getText();
                String ubicacion = campoUbicacion.getText();
                String direccionIP = campoDireccionIP.getText();
                // Validar que los campos no estén vacíos
                if (fabricante.isEmpty() || modelo.isEmpty() || estado.isEmpty() || ubicacion.isEmpty() || direccionIP.isEmpty()) {
                    // Mostrar un mensaje de advertencia si algún campo está vacío
                     JOptionPane.showMessageDialog(Inv.this, "Todos los campos son obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else

 {
                    // Crear un objeto Inventario con los datos
                    DataInventario inventario = new DataInventario(fabricante, modelo, estado, ubicacion, direccionIP);
                    // Añadir el objeto Inventario al modelo de la tabla
                    modeloTabla.addRow(new Object[]{inventario.getFabricante(), inventario.getModelo(), inventario.getEstado(), inventario.getUbicacion(), inventario.getDireccionIP()});
                    // Crear la conexión con la base de datos
                    Connection conexion = null;
                    try {
                        // Cargar el driver de MySQL
                        Class.forName("com.mysql.jdbc.Driver");
                        // Establecer la conexión con la base de datos
                        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario", "root", "1234");
                        // Crear un objeto PreparedStatement para ejecutar consultas SQL parametrizadas
                        PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO inventario (fabricante, modelo, estado, ubicacion, direccionIP) VALUES (?, ?, ?, ?, ?)");
                        // Asignar los valores a los parámetros de la consulta
                        sentencia.setString(1, inventario.getFabricante());
                        sentencia.setString(2, inventario.getModelo());
                        sentencia.setString(3, inventario.getEstado());
                        sentencia.setString(4, inventario.getUbicacion());
                        sentencia.setString(5, inventario.getDireccionIP());
                        // Ejecutar la consulta SQL para insertar el objeto Inventario en la base de datos
                        int filas = sentencia.executeUpdate();
                        // Mostrar un mensaje de éxito si se insertó el objeto Inventario
                        if (filas > 0) {
                            JOptionPane.showMessageDialog(Inv.this, "Se agregó el objeto al inventario", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        }
                        // Cerrar la sentencia y la conexión
                        sentencia.close();
                        conexion.close();
                    } catch (Exception e) {
                        // Mostrar un mensaje de error si ocurre alguna excepción
                        JOptionPane.showMessageDialog(Inv.this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    // Limpiar los campos de texto
                    campoFabricante.setText("");
                    campoModelo.setText("");
                    campoEstado.setText("");
                    campoUbicacion.setText("");
                    campoDireccionIP.setText("");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        // Crear y mostrar el JFrame 
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Inv().setVisible(true);
            }
        });
    }
}
