
/**
 *
 * @author gonza
 */

package Practicas;

public class Calculadora extends javax.swing.JFrame {
    int num1,num2;
    String signo;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        resultado.setBackground(new java.awt.Color(255, 102, 102));
        resultado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("C");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("+/-");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("%");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("÷");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(102, 102, 102));
        jb7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb7.setForeground(new java.awt.Color(255, 255, 255));
        jb7.setText("7");
        jb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(102, 102, 102));
        jb4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 255, 255));
        jb4.setText("4");
        jb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(102, 102, 102));
        jb8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb8.setForeground(new java.awt.Color(255, 255, 255));
        jb8.setText("8");
        jb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(102, 102, 102));
        jb5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb5.setForeground(new java.awt.Color(255, 255, 255));
        jb5.setText("5");
        jb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(102, 102, 102));
        jb9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb9.setForeground(new java.awt.Color(255, 255, 255));
        jb9.setText("9");
        jb9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(102, 102, 102));
        jb6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb6.setForeground(new java.awt.Color(255, 255, 255));
        jb6.setText("6");
        jb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 153, 0));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("×");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 153, 0));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("-");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jb1.setBackground(new java.awt.Color(102, 102, 102));
        jb1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("1");
        jb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(102, 102, 102));
        jb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setText("2");
        jb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(102, 102, 102));
        jb3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 255, 255));
        jb3.setText("3");
        jb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 153, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("+");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jb0.setBackground(new java.awt.Color(102, 102, 102));
        jb0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb0.setForeground(new java.awt.Color(255, 255, 255));
        jb0.setText("0");
        jb0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jb0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(102, 102, 102));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText(".");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton21.setBackground(new java.awt.Color(255, 153, 0));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("=");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jb0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        resultado.setText(resultado.getText()+"0");
    }//GEN-LAST:event_jb0ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        resultado.setText(resultado.getText()+"1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        resultado.setText(resultado.getText()+"2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        resultado.setText(resultado.getText()+"3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        resultado.setText(resultado.getText()+"4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        resultado.setText(resultado.getText()+"5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        resultado.setText(resultado.getText()+"6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        resultado.setText(resultado.getText()+"7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        resultado.setText(resultado.getText()+"8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        resultado.setText(resultado.getText()+"9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resultado.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        num1=Integer.parseInt(resultado.getText());
        signo="/";
        resultado.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        num1=Integer.parseInt(resultado.getText());
        signo="*";
        resultado.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        num1=Integer.parseInt(resultado.getText());
        signo="-";
        resultado.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        num1=Integer.parseInt(resultado.getText());
        signo="+";
        resultado.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        num2=Integer.parseInt(resultado.getText());
        
        switch(signo){
            case "+":
                resultado.setText(Integer.toString(num1+num2));
                break;
            case "-":
                resultado.setText(Integer.toString(num1-num2));
                break;
            case "*":
                resultado.setText(Integer.toString(num1*num2));
                break;
            case "/":
                resultado.setText(Integer.toString(num1/num2));
                break;
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            String cadena;
            Double num;
            cadena=resultado.getText();
            if(cadena.length()>0){
                num=(-1)*Double.parseDouble(cadena);
                resultado.setText(num.toString());
                
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
