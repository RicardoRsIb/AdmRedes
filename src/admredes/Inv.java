package admredes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import admredes.DataInventario;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Inv extends JFrame {
    // Declarar los componentes de la interfaz
    private JLabel etiquetaFabricante;
    private JLabel etiquetaModelo;
    private JLabel etiquetaBuscar;
    private JTextField campoBuscar;
    private JButton botonBuscar;
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


    private boolean modificar = false;
    BufferedImage imagenFondo = null;
    public Inv() {
        // Inicializar los componentes de la interfaz
        etiquetaFabricante = new JLabel("Fabricante:");
        etiquetaModelo = new JLabel("Modelo:");
        etiquetaEstado = new JLabel("Estado:");
        etiquetaUbicacion = new JLabel("Ubicación:");
        etiquetaDireccionIP = new JLabel("Dirección IP:");
        etiquetaBuscar = new JLabel("Buscar por dirección IP:");
        campoFabricante = new JTextField(15);
        campoModelo = new JTextField(15);
        campoEstado = new JTextField(15);
        campoUbicacion = new JTextField(15);
        campoDireccionIP = new JTextField(15);
        campoBuscar = new JTextField(15);
        botonAgregar = new JButton("Agregar");
        botonRegresar= new JButton("Regresar");
        botonModificar = new JButton("Modificar");
        botonEliminar = new JButton("Eliminar");
        botonBuscar = new JButton("Buscar");
        tablaInventario = new JTable();
        modeloTabla = new DefaultTableModel();
        panelTabla = new JScrollPane(tablaInventario);

        // Configurar la ventana
        setTitle("Inventario de la red");
        setSize(800, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Añadir los componentes a la ventana
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(etiquetaFabricante, gbc);
        //ubicacion de los textfield
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(campoFabricante, gbc);
        
        
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(etiquetaBuscar, gbc);

        //Añadir el campoBuscar al panel
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(campoBuscar, gbc);

        //Añadir el botonBuscar al panel
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(botonBuscar, gbc);

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
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión con la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminredes", "root", "comeasyouH3Y");
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


        //Crear un objeto BufferedImage que contenga la imagen de fondo
        //BufferedImage imagenFondo = null;
//        try {
//            //Cargar la imagen desde un recurso
//            imagenFondo = ImageIO.read(getClass().getResource("inv.png"));
//        } catch (IOException e) {
//            //Mostrar un mensaje de error si ocurre alguna excepción
//            JOptionPane.showMessageDialog(this, "Error al cargar la imagen de fondo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }

//        //Crear un objeto JPanel que contenga la imagen de fondo
//        JPanel panelFondo = new JPanel() {
//            //Sobrescribir el método paintComponent
//            @Override
//            public void paintComponent(Graphics g) {
//                //Llamar al método paintComponent de la clase padre
//                super.paintComponent(g);
//                //Verificar que el objeto Graphics sea de tipo Graphics2D
//                if (g instanceof Graphics2D) {
//                    //Casting del objeto Graphics a Graphics2D
//                    Graphics2D g2 = (Graphics2D) g;
//                    //Dibujar la imagen de fondo en el panel
//                    g2.drawImage(imagenFondo, 0, 0, this);
//                }
//            }
//        };

        //Añadir el panel con la imagen de fondo a la ventana
//        add(panelFondo);


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
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        // Establecer la conexión con la base de datos
                        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminredes", "root", "comeasyouH3Y");
                        // Crear un objeto PreparedStatement para ejecutar consultas SQL parametrizadas
                        PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO inventario (fabricante,modelo,estado,ubicacion,direccionIP) VALUES (?,?,?,?,?)");
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
    

    //Crear el listener para el botón de modificar
    botonModificar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            //Verificar el estado del botón de modificar
            if (!modificar) {
                //Si el botón está deshabilitado, copiar los datos de la fila seleccionada en los campos de texto
                //Obtener el índice de la fila seleccionada en la tabla
                int fila = tablaInventario.getSelectedRow();
                //Verificar que se haya seleccionado una fila
                if (fila != -1) {
                    //Obtener los datos de la fila seleccionada usando el modelo de la tabla
                    String fabricante = modeloTabla.getValueAt(fila, 0).toString();
                    String modelo = modeloTabla.getValueAt(fila, 1).toString();
                    String estado = modeloTabla.getValueAt(fila, 2).toString();
                    String ubicacion = modeloTabla.getValueAt(fila, 3).toString();
                    String direccionIP = modeloTabla.getValueAt(fila, 4).toString();
                    //Asignar los datos a los campos de texto
                    campoFabricante.setText(fabricante);
                    campoModelo.setText(modelo);
                    campoEstado.setText(estado);
                    campoUbicacion.setText(ubicacion);
                    campoDireccionIP.setText(direccionIP);
                    //Habilitar el botón de modificar
                    botonModificar.setEnabled(true);
                    //Cambiar el estado del botón de modificar a verdadero
                    modificar = true;
                } else {
                    //Mostrar un mensaje de advertencia si no se seleccionó una fila
                    JOptionPane.showMessageDialog(Inv.this, "Debe seleccionar una fila de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else
                {
                //Si el botón está habilitado, actualizar los datos en la base de datos y en la tabla
                //Obtener el índice de la fila seleccionada en la tabla
                int fila = tablaInventario.getSelectedRow();
                //Obtener los datos de los campos de texto
                String fabricante = campoFabricante.getText(); 
                String modelo = campoModelo.getText();
                String estado = campoEstado.getText();
                String ubicacion = campoUbicacion.getText();
                String direccionIP = campoDireccionIP.getText();
                //Crear la conexión con la base de datos
                Connection conexion = null;
                try {
                    //Cargar el driver de MySQL
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Establecer la conexión con la base de datos
                    conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminredes", "root", "comeasyouH3Y");
                    //Crear un objeto PreparedStatement para ejecutar consultas SQL parametrizadas
                    PreparedStatement sentencia = conexion.prepareStatement("UPDATE inventario SET fabricante = ?, modelo = ?, estado = ?, ubicacion = ?, direccionIP = ? WHERE fabricante = ?");
                    //Asignar los valores a los parámetros de la consulta
                    sentencia.setString(1, fabricante);
                    sentencia.setString(2, modelo);
                    sentencia.setString(3, estado);
                    sentencia.setString(4, ubicacion);
                    sentencia.setString(5, direccionIP);
                    //Obtener el valor del fabricante original de la fila seleccionada
                    String fabricanteOriginal = modeloTabla.getValueAt(fila, 0).toString();
                    //Asignar el valor del fabricante original al último parámetro de la consulta
                    sentencia.setString(6, fabricanteOriginal);
                    //Ejecutar la consulta SQL para actualizar los datos en la base de datos
                    int filas = sentencia.executeUpdate();
                    //Mostrar un mensaje de éxito si se actualizaron los datos
                    if (filas > 0) {
                        JOptionPane.showMessageDialog(Inv.this, "Se modificó el registro del inventario", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        //Actualizar los datos en la tabla
                        modeloTabla.setValueAt(fabricante, fila, 0);
                        modeloTabla.setValueAt(modelo, fila, 1);
                        modeloTabla.setValueAt(estado, fila, 2);
                        modeloTabla.setValueAt(ubicacion, fila, 3);
                        modeloTabla.setValueAt(direccionIP, fila, 4);
                    }
                    //Cerrar la sentencia y la conexión
                    sentencia.close();
                    conexion.close();
                } catch (Exception e) {
                    //Mostrar un mensaje de error si ocurre alguna excepción
                    JOptionPane.showMessageDialog(Inv.this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                //Deshabilitar el botón de modificar
                botonModificar.setEnabled(false);
                //Cambiar el estado del botón de modificar a falso
                modificar = false;
            }
        }
    });


    //Crear el listener para el botón de eliminar
    botonEliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            //Obtener el índice de la fila seleccionada en la tabla
            int fila = tablaInventario.getSelectedRow();
            //Verificar que se haya seleccionado una fila
            if (fila != -1) {
                //Obtener el dato que identifica al registro, por ejemplo, el fabricante
                String fabricante = modeloTabla.getValueAt(fila, 0).toString();
            int opcion=JOptionPane.showConfirmDialog (null, "¿Está seguro que sea continuar?", "No podrá revertir esta opcion", JOptionPane.YES_NO_OPTION);;  
            if(opcion==JOptionPane.YES_OPTION){
                 //Crear la conexión con la base de datos
                Connection conexion = null;
                try {
                    //Cargar el driver de MySQL
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Establecer la conexión con la base de datos
                    conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminredes", "root", "comeasyouH3Y");
                    //Crear un objeto PreparedStatement para ejecutar consultas SQL parametrizadas
                    PreparedStatement sentencia = conexion.prepareStatement("DELETE FROM inventario WHERE fabricante = ?");
                    //Asignar el valor al parámetro de la consulta
                    sentencia.setString(1, fabricante);
                    //Ejecutar la consulta SQL para eliminar el registro de la base de datos
                    int filas = sentencia.executeUpdate();
                    //Mostrar un mensaje de éxito si se eliminó el registro
                    if (filas > 0) {
                        JOptionPane.showMessageDialog(Inv.this, "Se eliminó el registro del inventario", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        //Eliminar la fila de la tabla
                        modeloTabla.removeRow(fila);
                    }
                    //Cerrar la sentencia y la conexión
                    sentencia.close();
                    conexion.close();
                } catch (Exception e) {
                    //Mostrar un mensaje de error si ocurre alguna excepción
                    JOptionPane.showMessageDialog(Inv.this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                 JOptionPane.showMessageDialog(Inv.this, "Operacion cancelada", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
                
                
                
            }
//            else {
//                //Mostrar un mensaje de advertencia si no se seleccionó una fila
//                
//            }
        }
    });
    
    botonBuscar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtener el texto del campoBuscar, que será el valor que quieras buscar
        String direccionIP = campoBuscar.getText();
        //Crear la conexión con la base de datos
        Connection conexion = null;
        try {
            //Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establecer la conexión con la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminredes", "root", "comeasyouH3Y");
            //Crear un objeto PreparedStatement para ejecutar consultas SQL parametrizadas
            PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM inventario WHERE direccionIP = ?");
            //Asignar el valor al parámetro de la consulta
            sentencia.setString(1, direccionIP);
            //Ejecutar la consulta SQL, que devuelve un objeto ResultSet con los resultados de la consulta
            ResultSet resultado = sentencia.executeQuery();
            //Crear una variable para contar el número de registros encontrados
            int contador = 0;
            //Recorrer el ResultSet, usando el método next
            while (resultado.next()) {
                //Obtener los datos de cada registro, usando los métodos get de la clase ResultSet
                String fabricante = resultado.getString("fabricante");
                String modelo = resultado.getString("modelo");
                String estado = resultado.getString("estado");
                String ubicacion = resultado.getString("ubicacion");
                //Mostrar los datos de cada registro en la interfaz, usando el método JOptionPane.showMessageDialog
                JOptionPane.showMessageDialog(Inv.this, "Se encontró el siguiente registro con la dirección IP " + direccionIP + ":\n" +
                "Fabricante: " + fabricante + "\n" +
                "Modelo: " + modelo + "\n" +
                "Estado: " + estado + "\n" +
                "Ubicación: " + ubicacion, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                //Incrementar el contador de registros encontrados
                contador++;
            }
            //Mostrar un mensaje de que no se encontró ningún registro si el contador es cero
            if (contador == 0) {
                JOptionPane.showMessageDialog(Inv.this, "No se encontró ningún registro con la dirección IP " + direccionIP, "Error", JOptionPane.ERROR_MESSAGE);
            }
            //Cerrar el ResultSet, la sentencia y la conexión
            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            //Mostrar un mensaje de error si ocurre alguna excepción
            JOptionPane.showMessageDialog(Inv.this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});
    botonRegresar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            Menu m = new Menu();
            m.setVisible(true); 
            Inv.this.setVisible(false);
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
