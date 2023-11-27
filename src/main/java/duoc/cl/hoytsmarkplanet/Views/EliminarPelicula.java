
package duoc.cl.hoytsmarkplanet.Views;

import DAO.DAO;
import duoc.cl.hoytsmarkplanet.Service.PeliculaService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarPelicula extends javax.swing.JInternalFrame {
    
    private final PeliculaService peliculaService;

    public EliminarPelicula() {
        initComponents();
        this.peliculaService = new PeliculaService();
        this.peliculaService.listarPeliculas(listaMovies);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMovies = new javax.swing.JTable();

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        listaMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(listaMovies);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            int column = 0;
            int row = listaMovies.getSelectedRow();
            int movElim = Integer.valueOf(listaMovies.getModel().getValueAt(row, column).toString());
            this.peliculaService.eliminarPelicula(movElim);
            DefaultTableModel model = (DefaultTableModel) listaMovies.getModel();
            model.setRowCount(0);
            this.peliculaService.listarPeliculas(listaMovies);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una pelicula para eliminar");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaMovies;
    // End of variables declaration//GEN-END:variables
}
