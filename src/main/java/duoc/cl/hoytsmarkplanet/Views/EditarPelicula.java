
package duoc.cl.hoytsmarkplanet.Views;

import DAO.DAO;
import duoc.cl.hoytsmarkplanet.Service.PeliculaService;
import javax.swing.JOptionPane;

public class EditarPelicula extends javax.swing.JInternalFrame {
    private final PeliculaService peliculaService;
    
    public EditarPelicula() {
        initComponents();
        this.peliculaService = new PeliculaService();
        this.peliculaService.listarPeliculas(tablaPeliculas);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPeliculas = new javax.swing.JTable();
        botonModificar = new javax.swing.JButton();
        textoApoyo = new javax.swing.JLabel();

        setTitle("Editar Película");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Director", "Año", "Duracion", "Genero"
            }
        ));
        jScrollPane1.setViewportView(tablaPeliculas);

        getContentPane().add(jScrollPane1, new java.awt.GridBagConstraints());

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(botonModificar, gridBagConstraints);

        textoApoyo.setText("(*)Para editar, selecciona la pelicula en la tabla y apreta Modificar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(textoApoyo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        try {
            int column = 0;
            int row = tablaPeliculas.getSelectedRow();
            int movElim = Integer.valueOf(tablaPeliculas.getModel().getValueAt(row, column).toString());
            new VentanaModificar(movElim).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una pelicula para modificar");
        }
    }//GEN-LAST:event_botonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPeliculas;
    private javax.swing.JLabel textoApoyo;
    // End of variables declaration//GEN-END:variables
}
