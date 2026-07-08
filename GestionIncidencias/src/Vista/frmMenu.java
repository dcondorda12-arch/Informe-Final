package Vista;
public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        meMantenimiento = new javax.swing.JMenu();
        miEmpleados = new javax.swing.JMenuItem();
        miAreas = new javax.swing.JMenuItem();
        miTiposIncidencia = new javax.swing.JMenuItem();
        meProcesos = new javax.swing.JMenu();
        miRegistrarIncidencia = new javax.swing.JMenuItem();
        miAsignarResponsable = new javax.swing.JMenuItem();
        miSeguimiento = new javax.swing.JMenuItem();
        miRegistrarSolucion = new javax.swing.JMenuItem();
        meReportes = new javax.swing.JMenu();
        miConsultaIncidencia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpEscritorioLayout = new javax.swing.GroupLayout(dpEscritorio);
        dpEscritorio.setLayout(dpEscritorioLayout);
        dpEscritorioLayout.setHorizontalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        dpEscritorioLayout.setVerticalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        meMantenimiento.setText("Mantenimiento");
        meMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meMantenimientoActionPerformed(evt);
            }
        });

        miEmpleados.setText("Empleados");
        miEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpleadosActionPerformed(evt);
            }
        });
        meMantenimiento.add(miEmpleados);

        miAreas.setText("Areas");
        miAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAreasActionPerformed(evt);
            }
        });
        meMantenimiento.add(miAreas);

        miTiposIncidencia.setText("Tipos Incidencia");
        miTiposIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTiposIncidenciaActionPerformed(evt);
            }
        });
        meMantenimiento.add(miTiposIncidencia);

        jMenuBar1.add(meMantenimiento);

        meProcesos.setText("Procesos");
        meProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meProcesosActionPerformed(evt);
            }
        });

        miRegistrarIncidencia.setText("Registrar Incidencia");
        miRegistrarIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarIncidenciaActionPerformed(evt);
            }
        });
        meProcesos.add(miRegistrarIncidencia);

        miAsignarResponsable.setText("Asisgnar Responsable");
        miAsignarResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignarResponsableActionPerformed(evt);
            }
        });
        meProcesos.add(miAsignarResponsable);

        miSeguimiento.setText("Seguimiento");
        miSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSeguimientoActionPerformed(evt);
            }
        });
        meProcesos.add(miSeguimiento);

        miRegistrarSolucion.setText("Registrar Solución");
        miRegistrarSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarSolucionActionPerformed(evt);
            }
        });
        meProcesos.add(miRegistrarSolucion);

        jMenuBar1.add(meProcesos);

        meReportes.setText("Reportes");

        miConsultaIncidencia.setText("Consulta de Incidencias");
        miConsultaIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaIncidenciaActionPerformed(evt);
            }
        });
        meReportes.add(miConsultaIncidencia);

        jMenuBar1.add(meReportes);

        jMenu4.setText("Salir");

        jMenuItem8.setText("Cerrar Sesión");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void miAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAreasActionPerformed
        frmÁreas area = new frmÁreas();

        dpEscritorio.add(area);

        area.setSize(1200,650);

        area.setLocation(0,0);

        area.setVisible(true);
    }//GEN-LAST:event_miAreasActionPerformed

    private void miAsignarResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignarResponsableActionPerformed
        frmAsignación asig = new frmAsignación();

        dpEscritorio.add(asig);

        asig.setSize(900,500);

        int x=(dpEscritorio.getWidth()-900)/2;

        int y=(dpEscritorio.getHeight()-500)/2;

        asig.setLocation(x,y);

        asig.setVisible(true);

    }//GEN-LAST:event_miAsignarResponsableActionPerformed
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void miConsultaIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaIncidenciaActionPerformed
    
        frmConsultaIncidencia con = new frmConsultaIncidencia();

        dpEscritorio.add(con);
        con.setSize(900,500);

        int x = (dpEscritorio.getWidth() - 900) / 2;
        int y = (dpEscritorio.getHeight() - 500) / 2;

        con.setLocation(x,y);

        con.setVisible(true);

    }//GEN-LAST:event_miConsultaIncidenciaActionPerformed

    private void meMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meMantenimientoActionPerformed
        
    }//GEN-LAST:event_meMantenimientoActionPerformed

    private void miEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpleadosActionPerformed
        frmEmpleado emp = new frmEmpleado();

        dpEscritorio.add(emp);

        emp.setSize(1000,600);

        emp.setLocation(20,20);

        emp.setVisible(true);
    }//GEN-LAST:event_miEmpleadosActionPerformed

    private void miTiposIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTiposIncidenciaActionPerformed
       frmTipoIncidencia tipo = new frmTipoIncidencia();

        dpEscritorio.add(tipo);

        tipo.setSize(1200,650);

        tipo.setLocation(0,0);

        tipo.setVisible(true);
    }//GEN-LAST:event_miTiposIncidenciaActionPerformed

    private void meProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meProcesosActionPerformed

    private void miRegistrarIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarIncidenciaActionPerformed
        frmIncidencia inc = new frmIncidencia();
        dpEscritorio.add(inc);
        inc.setSize(1200,650);

        inc.setLocation(0,0);

        inc.setVisible(true);

    }//GEN-LAST:event_miRegistrarIncidenciaActionPerformed

    private void miSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSeguimientoActionPerformed
        frmSeguimiento seg = new frmSeguimiento();
        dpEscritorio.add(seg);
        seg.setSize(1200,650);
        seg.setLocation(0,0);
        seg.setVisible(true);
    }//GEN-LAST:event_miSeguimientoActionPerformed

    private void miRegistrarSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarSolucionActionPerformed
        frmSolucion sol = new frmSolucion();

        dpEscritorio.add(sol);

        sol.setSize(900,500);

        int x=(dpEscritorio.getWidth()-900)/2;

        int y=(dpEscritorio.getHeight()-500)/2;

        sol.setLocation(x,y);

        sol.setVisible(true);

    }//GEN-LAST:event_miRegistrarSolucionActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpEscritorio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu meMantenimiento;
    private javax.swing.JMenu meProcesos;
    private javax.swing.JMenu meReportes;
    private javax.swing.JMenuItem miAreas;
    private javax.swing.JMenuItem miAsignarResponsable;
    private javax.swing.JMenuItem miConsultaIncidencia;
    private javax.swing.JMenuItem miEmpleados;
    private javax.swing.JMenuItem miRegistrarIncidencia;
    private javax.swing.JMenuItem miRegistrarSolucion;
    private javax.swing.JMenuItem miSeguimiento;
    private javax.swing.JMenuItem miTiposIncidencia;
    // End of variables declaration//GEN-END:variables
}
