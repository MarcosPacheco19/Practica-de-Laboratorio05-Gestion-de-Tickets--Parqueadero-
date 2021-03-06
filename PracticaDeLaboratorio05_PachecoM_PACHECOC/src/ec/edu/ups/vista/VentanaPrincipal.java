/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTickets;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author xpacheco
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    
        //Ventanas
    private VentanaListarTickets ventanaListarTickets;
    private VentanaRegistroDeEntrada ventanaRegistroDeEntrada;
    private VentanaRegistroDeSalida ventanaRegistroDeSalida;
    private VentanaCrearVehiculo ventanaCrearVehiculo;
    private VentanaCrearCliente ventanaCrearCliente;

    //Daos
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private ITicketDAO ticketDAO;

    //Controladores
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTickets controladorTicket;
    //idioma
    //localizacion
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
       //Instanciamos los Daos
        clienteDAO = new ClienteDAO();
        vehiculoDAO = new VehiculoDAO();
        ticketDAO = new TicketDAO();

        //Instanciamos los Controladores
        controladorCliente = new ControladorCliente(clienteDAO);
        controladorVehiculo = new ControladorVehiculo(vehiculoDAO, controladorCliente);
        controladorTicket = new ControladorTickets(ticketDAO);

        //Ventanas
        ventanaListarTickets = new VentanaListarTickets(controladorTicket);
        ventanaRegistroDeEntrada = new VentanaRegistroDeEntrada(controladorCliente, controladorTicket, controladorVehiculo);
        ventanaRegistroDeSalida = new VentanaRegistroDeSalida(controladorTicket);
        ventanaCrearVehiculo = new VentanaCrearVehiculo(ventanaRegistroDeEntrada, controladorVehiculo, controladorCliente);
        ventanaCrearCliente= new VentanaCrearCliente(ventanaRegistroDeEntrada, controladorCliente);

        
        //mensajes
        localizacion = new Locale("es", "EC");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);

    }
    
    public void cambiarIdioma(String idioma, String localidad) {
        localizacion = new Locale(idioma, localidad);
       mensajes = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes",localizacion);
    btListarTickets.setText(mensajes.getString("listarTickets"));
    btRegistrarEntrada.setText(mensajes.getString("registrarEntrada"));
    btRegistrarSalida.setText(mensajes.getString("registrarSalida"));
    menuIdioma.setText(mensajes.getString("idioma"));
    menuInicio.setText(mensajes.getString("inicio"));
    menuItemCerrarSesion.setText(mensajes.getString("cerrar"));
    menuItemClientes.setText(mensajes.getString("clientes"));
    menuItemEspañol.setText(mensajes.getString("español"));
    menuItemIngles.setText(mensajes.getString("ingles"));
    menuItemIniciarSesion.setText(mensajes.getString("iniciarSesion"));
    menuItemTickets.setText(mensajes.getString("tickets"));
    menuItemVehiculos.setText(mensajes.getString("vehiculos"));
    menuRegistros.setText(mensajes.getString("registro"));
    
    if(ventanaRegistroDeEntrada  != null ){
    ventanaRegistroDeEntrada.setMensajes(mensajes);
    ventanaRegistroDeEntrada.cambiarIdioma(idioma, localidad);
    ventanaRegistroDeSalida.setMensajes(mensajes);
    ventanaRegistroDeSalida.cambiarIdioma(idioma, localidad);
    ventanaListarTickets.setMensajes(mensajes);
    ventanaListarTickets.cambiarIdioma(idioma, localidad);
    ventanaCrearVehiculo.setMensajes(mensajes);
    ventanaCrearVehiculo.cambiarIdioma(idioma, localidad);
    ventanaCrearCliente.setMensajes(mensajes);
    ventanaCrearCliente.cambiarIdioma(idioma, localidad);
   
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        btRegistrarEntrada = new javax.swing.JButton();
        btListarTickets = new javax.swing.JButton();
        btRegistrarSalida = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuItemIniciarSesion = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuRegistros = new javax.swing.JMenu();
        menuItemClientes = new javax.swing.JMenuItem();
        menuItemVehiculos = new javax.swing.JMenuItem();
        menuItemTickets = new javax.swing.JMenuItem();
        menuIdioma = new javax.swing.JMenu();
        menuItemEspañol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        panelBotones.setForeground(new java.awt.Color(255, 255, 255));

        btRegistrarEntrada.setText("Registrar Entrada");
        btRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarEntradaActionPerformed(evt);
            }
        });

        btListarTickets.setText("Listar Tickets");
        btListarTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTicketsActionPerformed(evt);
            }
        });

        btRegistrarSalida.setText("Registrar Salida");
        btRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btListarTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuInicio.setText("Inicio");

        menuItemIniciarSesion.setText("Iniciar Sesion");
        menuInicio.add(menuItemIniciarSesion);

        menuItemCerrarSesion.setText("Cerrar Sesion");
        menuInicio.add(menuItemCerrarSesion);

        jMenuBar1.add(menuInicio);

        menuRegistros.setText("Registros");

        menuItemClientes.setText("Clientes");
        menuRegistros.add(menuItemClientes);

        menuItemVehiculos.setText("Vehiculos");
        menuRegistros.add(menuItemVehiculos);

        menuItemTickets.setText("Tickets");
        menuRegistros.add(menuItemTickets);

        jMenuBar1.add(menuRegistros);

        menuIdioma.setText("Idioma");

        menuItemEspañol.setText("Español");
        menuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspañolActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemEspañol);

        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemIngles);

        jMenuBar1.add(menuIdioma);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarEntradaActionPerformed
        ventanaRegistroDeEntrada.setVisible(true);
    }//GEN-LAST:event_btRegistrarEntradaActionPerformed

    private void btRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarSalidaActionPerformed
        ventanaRegistroDeSalida.setVisible(true);
    }//GEN-LAST:event_btRegistrarSalidaActionPerformed

    private void btListarTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTicketsActionPerformed
        ventanaListarTickets.setVisible(true);
    }//GEN-LAST:event_btListarTicketsActionPerformed

    private void menuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspañolActionPerformed
       
        localizacion = new Locale("es", "EC");
        this.cambiarIdioma("es","EC");
    }//GEN-LAST:event_menuItemEspañolActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        
        localizacion = new Locale("en", "UK");
        this.cambiarIdioma("en","UK");
    }//GEN-LAST:event_menuItemInglesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListarTickets;
    private javax.swing.JButton btRegistrarEntrada;
    private javax.swing.JButton btRegistrarSalida;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemEspañol;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuItemIniciarSesion;
    private javax.swing.JMenuItem menuItemTickets;
    private javax.swing.JMenuItem menuItemVehiculos;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
}
