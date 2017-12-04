
package conversão.de.numeros;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conversao extends javax.swing.JFrame {

    
    public Conversao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnDecimal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDec = new javax.swing.JTextField();
        txtRom = new javax.swing.JTextField();
        btnRomano = new javax.swing.JButton();
        lblResp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnDecimal.setText("Romanos para Arabicos");
        BtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDecimalActionPerformed(evt);
            }
        });

        jLabel1.setText("Arábico");

        jLabel2.setText("Romano");

        txtDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecActionPerformed(evt);
            }
        });

        btnRomano.setText("Arabicos para Romanos");
        btnRomano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomanoActionPerformed(evt);
            }
        });

        lblResp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Conversão de números ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Arabicos X Romanos");

        jLabel5.setText("Digite um valor em um dos campos informados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResp, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRomano)
                                .addGap(18, 18, 18)
                                .addComponent(BtnDecimal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRomano)
                    .addComponent(BtnDecimal))
                .addGap(18, 18, 18)
                .addComponent(lblResp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecActionPerformed

    private void BtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDecimalActionPerformed
    //converte numeros romanos para Arabicos.
        String rom = txtRom.getText();
        //padroniza os caracteres aceitos
        Pattern p = Pattern.compile("[A-Za-z]");
        Matcher m = p.matcher(txtRom.getText());
        
        //regras de validação de campo.      
         if(!m.find()){
            lblResp.setText("Impossível inserção de Números!!");// Erro para caracter errado
        }else if(rom.equals("")){
            lblResp.setText("Favor insira um texto"); // Campo vazio
        }else{
            //  criação do objeto e chamada de metodos
            NumerosDecimais nd = new NumerosDecimais(); 
            if (nd.trocaNum(rom).equals("0")){  //valida e gerar mensagem de erro.
                lblResp.setText("Dado inserido invalido!!");
            }else{
                lblResp.setText(nd.trocaNum(rom)); //informa o resultado 
            }
        }
    
    
        
        
    }//GEN-LAST:event_BtnDecimalActionPerformed

    private void btnRomanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomanoActionPerformed
    //converte numeros Arabicos para romanos.
        
        int dec = Integer.parseInt(txtDec.getText());
        
        //padroniza os caracteres aceitos
        Pattern p = Pattern.compile("[A-Za-z]");
        Matcher m = p.matcher(txtDec.getText());
        
        
        if (dec > 3999){
            lblResp.setText("Só converte números menores que 4 mil"); //valor maximo a ser inserido
        }else if(m.find()){
            lblResp.setText("Impossível inserção de Letras!!"); //mensagem de erro para entrada essada 
        }else if (dec <= 0){
            lblResp.setText("Não há conversão de números menores ou igual a Zero!"); // Entrada de numeros errados
        }else if(String.valueOf(dec).equals("")){
            lblResp.setText("Favor insira um texto"); // valida quando o campo esta vazio
        }else{
            //criação de objeto e metodos
          NumerosRomanos nr = new NumerosRomanos();
            
          //pega o numero transformado pe exibe na tela.
           lblResp.setText(nr.seperaNumero(String.valueOf(dec)));
           
        }
        
    }//GEN-LAST:event_btnRomanoActionPerformed

   

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
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDecimal;
    private javax.swing.JButton btnRomano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblResp;
    private javax.swing.JTextField txtDec;
    private javax.swing.JTextField txtRom;
    // End of variables declaration//GEN-END:variables
}
