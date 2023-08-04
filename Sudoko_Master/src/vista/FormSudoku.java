package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import modelo.Sudoku;

public class FormSudoku extends javax.swing.JFrame {

    public static TableroSudoku tableroSudoku;
    private TableroNumeros tableroNumeros;
    
    private boolean estadoCrear;

    private int xPos;
    private int yPos;

    public FormSudoku() {
        initComponents();
        iniciarComponentes();
        panelFondo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    public void iniciarComponentes() {
        tableroSudoku = new TableroSudoku();
        tableroSudoku.setTxtAltura(36);
        tableroSudoku.setTxtAncho(36);
        tableroSudoku.setTxtMargen(4);
        tableroSudoku.setTxtTamañoLetra(27);

        tableroSudoku.setPanelBackground(new Color(89, 43, 25));

        tableroSudoku.setTxtBackground1(Color.WHITE);
        tableroSudoku.setTxtForeground1(Color.BLACK);
        tableroSudoku.setTxtBackground2(Color.BLACK);
        tableroSudoku.setTxtForeground2(Color.BLACK);
        tableroSudoku.setTxtBackground3(Color.BLACK);
        tableroSudoku.setTxtForeground3(Color.WHITE);
        tableroSudoku.setTxtBackground4(new Color(213,213,213));
        tableroSudoku.setTxtForeground4(Color.BLACK);

        panelFondo.add(tableroSudoku);
        tableroSudoku.setLocation(70, 60);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();

        tableroSudoku.generarSudoku(2);
        estadoCrear = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(204, 204, 204));
        panelFondo.setPreferredSize(new java.awt.Dimension(540, 420));
        panelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelFondoMouseDragged(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setText("SUDOKU");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(170, 30, 140, 30);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton1);
        jButton1.setBounds(50, 410, 100, 25);

        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton2);
        jButton2.setBounds(180, 410, 110, 25);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton3);
        jButton3.setBounds(320, 410, 100, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed

        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed

    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
        this.setLocation(evt.getXOnScreen() - xPos, evt.getYOnScreen() - yPos);
    }//GEN-LAST:event_panelFondoMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          tableroSudoku.limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       tableroSudoku.comprobar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String[] args) {
        FormSudoku sudoku = new FormSudoku();
        sudoku.setVisible(true);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables

}
