/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafico;

import Entidades.Producto;
import Repositorios.CProductoRepositorio;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author plini
 */
public class JFProductoCRUD extends javax.swing.JFrame {

    private CProductoRepositorio _cProductoRepositorio;
    private String estadoSistema = "guardar";

    private String _nombreAux;

    public JFProductoCRUD() {
        initComponents();
        this.setLocationRelativeTo(null);
        _cProductoRepositorio = new CProductoRepositorio();

        CargarCliente();
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cbEstado = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnIrComprar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnValidarCliente = new javax.swing.JButton();
        btnIrMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos"));
        jPanel1.setAutoscrolls(true);

        jLabel2.setText("Nombre: ");

        jLabel4.setText("Precio: ");

        txtPrecio.setEnabled(false);

        jLabel5.setText("Estado: ");

        btnGuardar.setText("Crear Producto");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbEstado.setEnabled(false);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnIrComprar.setText("Ir a Compras");
        btnIrComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrComprarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnValidarCliente.setText("Validar Producto");
        btnValidarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarClienteActionPerformed(evt);
            }
        });

        btnIrMenu.setText("Ir al Menu");
        btnIrMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIrComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIrMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnValidarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnValidarCliente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIrComprar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIrMenu)
                .addGap(23, 23, 23))
        );

        tCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarCliente() {
        DefaultTableModel modelCliente = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<Producto> listProductos = _cProductoRepositorio.GetAll();
        String[] clienteString = new String[3];

        modelCliente.addColumn("Nombre");
        modelCliente.addColumn("PrecioUnitario");
        modelCliente.addColumn("Estado");

        if (listProductos.size() == 0) {
            tCliente.setModel(modelCliente);
            return;
        }

        listProductos.forEach((producto) -> {
            clienteString[0] = producto.getNombre();
            clienteString[1] = String.valueOf(producto.getPrecioUnitario());

            if (producto.isEstado()) {
                clienteString[2] = "Activo";
            } else {
                clienteString[2] = "Inactivo";
            }
            modelCliente.addRow(clienteString);
        });
        tCliente.setModel(modelCliente);
    }

    private void CrearCliente(Producto entidad) {

        try {

            if (_cProductoRepositorio.Crear(entidad) == 1) {
                JOptionPane.showMessageDialog(null, "Producto Creado");
                CargarCliente();
                Limpiar();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al crear: " + e.getMessage());
            Limpiar();
        }

    }

    private void ModificarCliente(Producto entidad) {
        try {

            if (_cProductoRepositorio.Modificar(entidad) == 1) {
                JOptionPane.showMessageDialog(null, "Cambios realizados");
                CargarCliente();
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear: " + e.getMessage());
            Limpiar();
        }
    }

    private void DesactivarCliente(String cedula) {
        try {

            if (_cProductoRepositorio.Eliminar(cedula) == 1) {
                JOptionPane.showMessageDialog(null, "Producto desactivado");
                CargarCliente();
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear: " + e.getMessage());
            Limpiar();
        }
    }

    private void Limpiar() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtNombre.setEnabled(true);
        cbEstado.setSelectedIndex(0);
        estadoSistema = "guardar";
        btnGuardar.setText("Crear Cliente");
        btnLimpiar.setText("Limpiar");
        btnEliminar.setEnabled(false);
        DesactivarRegistro();
        _nombreAux = "";
    }

    private String QuitarGuion(String valor) {
        if (valor == null || valor.isEmpty()) {
            return valor;
        }
        return valor.replace("-", "");
    }

    private String AgregarGuion(String valor) {
        StringBuilder formattedNumber = new StringBuilder(valor);
        formattedNumber.insert(3, '-');
        formattedNumber.insert(11, '-');
        return formattedNumber.toString();
    }

    private void ActivarRegistro() {
        txtPrecio.setEnabled(true);
        cbEstado.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnValidarCliente.setEnabled(false);
    }

    private void DesactivarRegistro() {
        txtPrecio.setEnabled(false);
        cbEstado.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnValidarCliente.setEnabled(true);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String Nombre = txtNombre.getText();
        Double Precio = Double.parseDouble(txtPrecio.getText());
        String auxEstado = cbEstado.getSelectedItem().toString();
        boolean Estado = false;
        if ("Activo".equals(auxEstado)) {
            Estado = true;
        }

        Producto entidad = new Producto(Nombre, Precio, Estado);
        switch (estadoSistema) {
            case "guardar":
                CrearCliente(entidad);
                break;
            case "modificar":
                entidad.setNombre(_nombreAux + "-" + entidad.getNombre());
                ModificarCliente(entidad);
                break;
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIrComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrComprarActionPerformed
        JFPrincipal principal = new JFPrincipal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIrComprarActionPerformed

    private void tClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClienteMouseClicked
        //txtNombre.setEnabled(false);

        int fila = tCliente.getSelectedRow();

        _nombreAux = tCliente.getValueAt(fila, 0).toString();
        txtNombre.setText(tCliente.getValueAt(fila, 0).toString());
        txtPrecio.setText(tCliente.getValueAt(fila, 1).toString());
        cbEstado.setSelectedItem(tCliente.getValueAt(fila, 2));

        if ("Activo".equals(tCliente.getValueAt(fila, 2).toString())) {
            btnEliminar.setEnabled(true);
        } else {
            btnEliminar.setEnabled(false);
        }

        btnGuardar.setText("Guardar Cambios");
        estadoSistema = "modificar";
        btnLimpiar.setText("Cancelar");
        ActivarRegistro();
    }//GEN-LAST:event_tClienteMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        estadoSistema = "eliminar";
        DesactivarCliente(txtNombre.getText());

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnValidarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarClienteActionPerformed

        Producto cliente = _cProductoRepositorio.GetAllEstado(txtNombre.getText());
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "El Producto existe");
            DesactivarRegistro();
            return;
        }
        ActivarRegistro();
    }//GEN-LAST:event_btnValidarClienteActionPerformed

    private void btnIrMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrMenuActionPerformed
        JFMenuInicio principal = new JFMenuInicio();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIrMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JFProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFProductoCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIrComprar;
    private javax.swing.JButton btnIrMenu;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnValidarCliente;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
