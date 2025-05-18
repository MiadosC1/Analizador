/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java_cup.runtime.Symbol;

/**
 *
 * @author Estudio
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }
   
private void analizarlexico()throws IOException
{
    int contador = 1;
    
    String expr = (String) txtAnalizarLexico0.getText();
    Lexer lexer = new Lexer(new StringReader(expr));
    String resultado = "LINEA" + contador + "\t\tSIMBOLO\n";
    while (true)
            {
                Symbol sym = lexer.yylex();
                if(token == null)
                {
                    txtAnalizarLexico1.setText(resultado);
                    return;
                }
                switch (token) {
    case Pregunta:
        resultado += "  <Pregunta>\t\t" + lexer.lexeme + "\n";
        break;
    case Contrario:
        resultado += "  <Contrario>\t\t" + lexer.lexeme + "\n";
        break;
    case Comparar:
        resultado += "  <Comparar>\t\t" + lexer.lexeme + "\n";
        break;
    case Identificador:
        resultado += "  <Identificador>\t" + lexer.lexeme + "\n";
        break;
    case Literal:
        resultado += "  <Literal>\t\t" + lexer.lexeme + "\n";
        break;
    case Numero:
        resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
        break;
    case Operaciones:
        resultado += "  <Operaciones>\t\t" + lexer.lexeme + "\n";
        break;
    case Tipodato:
        resultado += "  <Tipodato>\t\t" + lexer.lexeme + "\n";
        break;
    case Acceso:
        resultado += "  <Acceso>\t\t" + lexer.lexeme + "\n";
        break;
    case ControlFlujo:
        resultado += "  <ControlFlujo>\t" + lexer.lexeme + "\n";
        break;
    case Constantes:
        resultado += "  <Constantes>\t\t" + lexer.lexeme + "\n";
        break;
    case OperadoresEspeciales:
        resultado += "  <OperadoresEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case ManejoErrores:
        resultado += "  <ManejoErrores>\t" + lexer.lexeme + "\n";
        break;
    case Reservadas:
        resultado += "  <Reservadas>\t\t" + lexer.lexeme + "\n";
        break;
    case Asignacion:
        resultado += "  <Asignacion>\t\t" + lexer.lexeme + "\n";
        break;
    case Incremento:
        resultado += "  <Incremento>\t\t" + lexer.lexeme + "\n";
        break;
    case Decremento:
        resultado += "  <Decremento>\t\t" + lexer.lexeme + "\n";
        break;
    case Punto:
        resultado += "  <Punto>\t\t" + lexer.lexeme + "\n";
        break;
    case Logico:
        resultado += "  <Logico>\t\t" + lexer.lexeme + "\n";
        break;
    case Bits:
        resultado += "  <Bits>\t\t" + lexer.lexeme + "\n";
        break;
    case Relacional:
        resultado += "  <Relacional>\t\t" + lexer.lexeme + "\n";
        break;
    case Funciones:
        resultado += "  <Funciones>\t\t" + lexer.lexeme + "\n";
        break;
    case Clases:
        resultado += "  <Clases>\t\t" + lexer.lexeme + "\n";
        break;
    case Excepciones:
        resultado += "  <Excepciones>\t\t" + lexer.lexeme + "\n";
        break;
    case EspacioNombre:
        resultado += "  <EspacioNombre>\t" + lexer.lexeme + "\n";
        break;
    case Herencia:
        resultado += "  <Herencia>\t\t" + lexer.lexeme + "\n";
        break;
    case Modificadores:
        resultado += "  <Modificadores>\t" + lexer.lexeme + "\n";
        break;
    case Variables:
        resultado += "  <Variables>\t\t" + lexer.lexeme + "\n";
        break;
    case Ciclos:
        resultado += "  <Ciclos>\t\t" + lexer.lexeme + "\n";
        break;
    case Condiciones:
        resultado += "  <Condiciones>\t\t" + lexer.lexeme + "\n";
        break;
    case E_S:
        resultado += "  <E_S>\t\t" + lexer.lexeme + "\n";
        break;
    case Require:
        resultado += "  <Require>\t\t" + lexer.lexeme + "\n";
        break;
    case Punteros:
        resultado += "  <Punteros>\t\t" + lexer.lexeme + "\n";
        break;
    case Genericos:
        resultado += "  <Genericos>\t\t" + lexer.lexeme + "\n";
        break;
    case Concurrencia:
        resultado += "  <Concurrencia>\t" + lexer.lexeme + "\n";
        break;
    case OtrosReservados:
        resultado += "  <OtrosReservados>\t" + lexer.lexeme + "\n";
        break;
    case Aserciones:
        resultado += "  <Aserciones>\t\t" + lexer.lexeme + "\n";
        break;
    case Comentarios:
        resultado += "  <Comentarios>\t\t" + lexer.lexeme + "\n";
        break;
    case TipadoDebil:
        resultado += "  <TipadoDebil>\t\t" + lexer.lexeme + "\n";
        break;
    case EstructurasAdicionales:
        resultado += "  <EstructurasAdicionales>\t" + lexer.lexeme + "\n";
        break;
    case Streams:
        resultado += "  <Streams>\t\t" + lexer.lexeme + "\n";
        break;
    case Metaprogramacion:
        resultado += "  <Metaprogramacion>\t" + lexer.lexeme + "\n";
        break;
    case OtrosValores:
        resultado += "  <OtrosValores>\t" + lexer.lexeme + "\n";
        break;
    case Alias:
        resultado += "  <Alias>\t\t" + lexer.lexeme + "\n";
        break;
    case Seguridad:
        resultado += "  <Seguridad>\t\t" + lexer.lexeme + "\n";
        break;
    case ManejoMemoria:
        resultado += "  <ManejoMemoria>\t" + lexer.lexeme + "\n";
        break;
    case Archivos:
        resultado += "  <Archivos>\t\t" + lexer.lexeme + "\n";
        break;
    case Redes:
        resultado += "  <Redes>\t\t" + lexer.lexeme + "\n";
        break;
    case Web:
        resultado += "  <Web>\t\t" + lexer.lexeme + "\n";
        break;
    case Contexpr:
        resultado += "  <Contexpr>\t\t" + lexer.lexeme + "\n";
        break;
    case Conceptos:
        resultado += "  <Conceptos>\t\t" + lexer.lexeme + "\n";
        break;
    case Sincronizacion:
        resultado += "  <Sincronizacion>\t" + lexer.lexeme + "\n";
        break;
    case Basededatos:
        resultado += "  <Basededatos>\t\t" + lexer.lexeme + "\n";
        break;
    case Vectores:
        resultado += "  <Vectores>\t\t" + lexer.lexeme + "\n";
        break;
    case FuncionesEspeciales:
        resultado += "  <FuncionesEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case CiclosEspeciales:
        resultado += "  <CiclosEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case TiposEspeciales:
        resultado += "  <TiposEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case Otros:
        resultado += "  <Otros>\t\t" + lexer.lexeme + "\n";
        break;
    case EscrituraPantalla:
        resultado += "  <EscrituraPantalla>\t" + lexer.lexeme + "\n";
        break;
    case FinalizarPrograma:
        resultado += "  <FinalizarPrograma>\t" + lexer.lexeme + "\n";
        break;
    case Opcionales:
        resultado += "  <Opcionales>\t\t" + lexer.lexeme + "\n";
        break;
    case Iteradores:
        resultado += "  <Iteradores>\t\t" + lexer.lexeme + "\n";
        break;
    case Conversiones:
        resultado += "  <Conversiones>\t" + lexer.lexeme + "\n";
        break;
    case CodigosRetorno:
        resultado += "  <CodigosRetorno>\t" + lexer.lexeme + "\n";
        break;
    case Estados:
        resultado += "  <Estados>\t\t" + lexer.lexeme + "\n";
        break;
    case EstructuraCondicional:
        resultado += "  <EstructuraCondicional>\t" + lexer.lexeme + "\n";
        break;
    case VariablesEspeciales:
        resultado += "  <VariablesEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case LiteralesEspeciales:
        resultado += "  <LiteralesEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case Serializacion:
        resultado += "  <Serializacion>\t" + lexer.lexeme + "\n";
        break;
    case Tiempo:
        resultado += "  <Tiempo>\t\t" + lexer.lexeme + "\n";
        break;
    case Random:
        resultado += "  <Random>\t\t" + lexer.lexeme + "\n";
        break;
    case Recursos:
        resultado += "  <Recursos>\t\t" + lexer.lexeme + "\n";
        break;
    case Logs:
        resultado += "  <Logs>\t\t" + lexer.lexeme + "\n";
        break;
    case Enums:
        resultado += "  <Enums>\t\t" + lexer.lexeme + "\n";
        break;
    case Declaraciones:
        resultado += "  <Declaraciones>\t" + lexer.lexeme + "\n";
        break;
    case Generadores:
        resultado += "  <Generadores>\t\t" + lexer.lexeme + "\n";
        break;
    case Modularizacion:
        resultado += "  <Modularizacion>\t" + lexer.lexeme + "\n";
        break;
    case OperacionesMatematicas:
        resultado += "  <OperacionesMatematicas>\t" + lexer.lexeme + "\n";
        break;
    case Matrices:
        resultado += "  <Matrices>\t\t" + lexer.lexeme + "\n";
        break;
    case Compilacion:
        resultado += "  <Compilacion>\t\t" + lexer.lexeme + "\n";
        break;
    case Versiones:
        resultado += "  <Versiones>\t\t" + lexer.lexeme + "\n";
        break;
    case Git:
        resultado += "  <Git>\t\t" + lexer.lexeme + "\n";
        break;
    case SeguridadWeb:
        resultado += "  <SeguridadWeb>\t" + lexer.lexeme + "\n";
        break;
    case Anotaciones:
        resultado += "  <Anotaciones>\t\t" + lexer.lexeme + "\n";
        break;
    case Proxies:
        resultado += "  <Proxies>\t\t" + lexer.lexeme + "\n";
        break;
    case Reflexion:
        resultado += "  <Reflexion>\t\t" + lexer.lexeme + "\n";
        break;
    case Identificiadores:
        resultado += "  <Identificiadores>\t" + lexer.lexeme + "\n";
        break;
    case NumeroEntero:
        resultado += "  <NumeroEntero>\t" + lexer.lexeme + "\n";
        break;
    case NumeroDecimal:
        resultado += "  <NumeroDecimal>\t" + lexer.lexeme + "\n";
        break;
    case NumerosHexadecimal:
        resultado += "  <NumerosHexadecimal>\t" + lexer.lexeme + "\n";
        break;
    case Caracter:
        resultado += "  <Caracter>\t\t" + lexer.lexeme + "\n";
        break;
    case Cadena:
        resultado += "  <Cadena>\t\t" + lexer.lexeme + "\n";
        break;
    case EnlaceExterno:
        resultado += "  <EnlaceExterno>\t" + lexer.lexeme + "\n";
        break;
    case LlaveApertura:
        resultado += "  <LlaveApertura>\t" + lexer.lexeme + "\n";
        break;
    case LlaveCerradura:
        resultado += "  <LlaveCerradura>\t" + lexer.lexeme + "\n";
        break;
    case ParentesisApertura:
        resultado += "  <ParentesisApertura>\t" + lexer.lexeme + "\n";
        break;
    case ParentesisCerradura:
        resultado += "  <ParentesisCerradura>\t" + lexer.lexeme + "\n";
        break;
    case CorcheteApertura:
        resultado += "  <CorcheteApertura>\t" + lexer.lexeme + "\n";
        break;
    case CorcheteCerradura:
        resultado += "  <CorcheteCerradura>\t" + lexer.lexeme + "\n";
        break;
    case Delimitador:
        resultado += "  <Delimitador>\t\t" + lexer.lexeme + "\n";
        break;
    case ERROR:
        resultado += "  <ERROR>\t\t" + lexer.lexeme + "\n";
        break;
}

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnalizarLexico1 = new javax.swing.JTextArea();
        BotonArchivo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarSintactico = new javax.swing.JTextArea();
        BotonAnalizarLexico = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarLexico0 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        BotonAnalizarSintactico = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ricardo Ibarra Garcia; 22211585 - Lenguajes y Automatas I");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Analizador léxico");

        txtAnalizarLexico1.setColumns(20);
        txtAnalizarLexico1.setRows(5);
        jScrollPane1.setViewportView(txtAnalizarLexico1);

        BotonArchivo.setText("Abrir archivo");
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });

        txtAnalizarSintactico.setColumns(20);
        txtAnalizarSintactico.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarSintactico);

        BotonAnalizarLexico.setText("Analizar");
        BotonAnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalizarLexicoActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtAnalizarLexico0.setColumns(20);
        txtAnalizarLexico0.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarLexico0);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Analizador sintactico");

        BotonAnalizarSintactico.setText("Analizar");
        BotonAnalizarSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalizarSintacticoActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonArchivo)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonAnalizarLexico)
                                .addGap(110, 110, 110)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAnalizarSintactico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAnalizarLexico)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAnalizarSintactico)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalizarLexicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAnalizarLexicoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonAnalizarSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalizarSintacticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAnalizarSintacticoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try
        {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtAnalizarLexico0.setText(ST);
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnalizarLexico;
    private javax.swing.JButton BotonAnalizarSintactico;
    private javax.swing.JButton BotonArchivo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLexico0;
    private javax.swing.JTextArea txtAnalizarLexico1;
    private javax.swing.JTextArea txtAnalizarSintactico;
    // End of variables declaration//GEN-END:variables
}
