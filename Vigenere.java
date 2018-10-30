

public class Vigenere extends javax.swing.JFrame {

private String table = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    
 public Vigenere() {
     
        initComponents();
        
        setLocationRelativeTo(this);
    }

       private String Cleaning_text(String text)
     {
         text = text.replaceAll("\n", "");  
         
        for(int x = 0; x < text.length(); x++)
        {
            int position = table.indexOf(text.charAt(x));
            
            if (position == -1)
            {
                text= text.replace(text.charAt(x), ' ');
            }
        }        
        return text;
    } 
       
public  String Encrypt(String text,String key)
{
  String cleaned_text = Cleaning_text(text);
        
  String encrypted = "";
 
  for(int t = 0,k= 0; t < cleaned_text.length(); t++,k= (k+1) % key.length())
  {
    int position = (table.indexOf(cleaned_text.charAt(t)) + table.indexOf(key.charAt(k))) % table.length();

   encrypted += table.charAt(position );

  }
   return encrypted;
}

public String Decrypt(String text,String key  )
{
  String cleaned_text = Cleaning_text(text);  
    
  String decrypted = "";

  for(int t = 0, k = 0; t < cleaned_text.length(); t++,k= (k+1) % key .length())
  {
   int position = (table.indexOf(cleaned_text.charAt(t)) - table.indexOf(key.charAt(k)));

   position = (position < 0)?(position + table.length()): position;

   decrypted += table.charAt(position);
   }
  return decrypted;
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        encrypt_button = new javax.swing.JButton();
        decrypt_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        key_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        output.setBackground(new java.awt.Color(204, 204, 255));
        output.setColumns(20);
        output.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        input.setBackground(new java.awt.Color(204, 204, 255));
        input.setColumns(20);
        input.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        input.setRows(5);
        jScrollPane2.setViewportView(input);

        encrypt_button.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        encrypt_button.setText("Encrypt");
        encrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encrypt_buttonActionPerformed(evt);
            }
        });

        decrypt_button.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        decrypt_button.setText("Decrypt");
        decrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrypt_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel1.setText("Insert  key");

        key_field.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        key_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key_fieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel2.setText("PLAINTEXT");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel3.setText("CHIPERTEXT");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel4.setText("VIGENERE CHIPER");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel6.setText("~IRMAYANTI~");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(key_field))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(encrypt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decrypt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encrypt_button)
                    .addComponent(decrypt_button))
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel6.getAccessibleContext().setAccessibleName("~IRMAYANTI~");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encrypt_buttonActionPerformed
       
        String text = input.getText();
        
        String key = key_field.getText();
        
        output.setText(Encrypt(text,key ));
    }//GEN-LAST:event_encrypt_buttonActionPerformed

    private void decrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrypt_buttonActionPerformed
       
        String text = output.getText();
        
        String key = key_field.getText();
        
        input.setText(Decrypt(text,key ));
    }//GEN-LAST:event_decrypt_buttonActionPerformed

    private void key_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key_fieldActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new Vigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decrypt_button;
    private javax.swing.JButton encrypt_button;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField key_field;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
