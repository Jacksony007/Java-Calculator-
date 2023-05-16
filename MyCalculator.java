
public class MyCalculator extends javax.swing.JFrame {

    double num, ans;
    int calc;

    public MyCalculator() {
        initComponents();
        Btn_on.setEnabled(false);
    }

    public void operation() {
        try {
            switch (calc) {
                case 1:
                    ans = num + Double.parseDouble(screen.getText());
                    screen.setText(Double.toString(ans));
                    break;

                case 2:
                    ans = num - Double.parseDouble(screen.getText());
                    screen.setText(Double.toString(ans));
                    break;
                case 3:
                    ans = num * Double.parseDouble(screen.getText());
                    screen.setText(Double.toString(ans));
                    break;
                case 4:
                    ans = num / Double.parseDouble(screen.getText());
                    screen.setText(Double.toString(ans));
                    break;
                case 5:
                    ans = num * (Double.parseDouble(screen.getText())/100);
                    screen.setText(Double.toString(ans));
                    break;
            }
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public void on() {
        screen.setEnabled(true);

        zero.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        dot.setEnabled(true);
        three.setEnabled(true);
        divide.setEnabled(true);
        multiply.setEnabled(true);
        sub.setEnabled(true);
        perce.setEnabled(true);
        clr.setEnabled(true);
        back.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        screen.setEnabled(true);
        show.setEnabled(true);
        plus.setEnabled(true);
        equal.setEnabled(true);
    }

    public void off() {
        screen.setEnabled(false);
        Btn_on.setEnabled(true);

        zero.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        dot.setEnabled(false);
        three.setEnabled(false);
        divide.setEnabled(false);
        multiply.setEnabled(false);
        sub.setEnabled(false);
        perce.setEnabled(false);
        clr.setEnabled(false);
        back.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        screen.setEnabled(false);
        show.setEnabled(false);
        plus.setEnabled(false);
        equal.setEnabled(false);
        show.setText("");
        screen.setText("");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        on_off = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JLabel();
        screen = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        perce = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        five = new javax.swing.JButton();
        two = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        three = new javax.swing.JButton();
        six = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        Btn_on = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Calculator\n");

        jPanel1.setPreferredSize(new java.awt.Dimension(490, 433));
        jPanel1.setLayout(null);

        show.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(show);
        show.setBounds(270, 0, 120, 50);

        screen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(screen);
        screen.setBounds(0, 50, 390, 100);

        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setText("<-");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(110, 170, 70, 40);

        dot.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        jPanel1.add(dot);
        dot.setBounds(210, 420, 70, 40);

        multiply.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multiply.setText("x");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        jPanel1.add(multiply);
        multiply.setBounds(310, 240, 70, 40);

        divide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel1.add(divide);
        divide.setBounds(310, 300, 70, 40);

        perce.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        perce.setText("%");
        perce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perceActionPerformed(evt);
            }
        });
        jPanel1.add(perce);
        perce.setBounds(310, 360, 70, 40);

        equal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel1.add(equal);
        equal.setBounds(310, 420, 70, 40);

        plus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus);
        plus.setBounds(210, 240, 70, 40);

        eight.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel1.add(eight);
        eight.setBounds(10, 240, 70, 40);

        five.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel1.add(five);
        five.setBounds(10, 300, 70, 40);

        two.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel1.add(two);
        two.setBounds(10, 360, 70, 40);

        seven.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel1.add(seven);
        seven.setBounds(210, 300, 70, 40);

        four.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four);
        four.setBounds(210, 360, 70, 40);

        one.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel1.add(one);
        one.setBounds(110, 420, 70, 40);

        zero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel1.add(zero);
        zero.setBounds(10, 420, 70, 40);

        three.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel1.add(three);
        three.setBounds(110, 360, 70, 40);

        six.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel1.add(six);
        six.setBounds(110, 300, 70, 40);

        clr.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clr.setText("CLR");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        jPanel1.add(clr);
        clr.setBounds(210, 170, 70, 40);

        sub.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel1.add(sub);
        sub.setBounds(310, 170, 70, 40);

        nine.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel1.add(nine);
        nine.setBounds(110, 240, 70, 40);

        on_off.add(Btn_on);
        Btn_on.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_on.setText("ON");
        Btn_on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_onActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_on);
        Btn_on.setBounds(20, 170, 50, 20);

        on_off.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(20, 200, 60, 20);

        jLabel1.setText("CALCULATOR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        screen.setText(screen.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        screen.setText(screen.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        screen.setText(screen.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        screen.setText(screen.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        screen.setText(screen.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        screen.setText(screen.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        screen.setText(screen.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        screen.setText(screen.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        screen.setText(screen.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        int back = screen.getText().length();
        int back1 = screen.getText().length() - 1;

        if (back > 0) {
            StringBuilder obj = new StringBuilder(screen.getText());
            obj.deleteCharAt(back1);
            String store = obj.toString();
            screen.setText(store);

        }


    }//GEN-LAST:event_backActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        screen.setText(screen.getText() + ".");
    }//GEN-LAST:event_dotActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        screen.setText("");
        show.setText("");
    }//GEN-LAST:event_clrActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        try {
            num = Double.parseDouble(screen.getText());
            calc = 1;
            screen.setText("");
            show.setText(num + "+");
        } catch (Exception e2) {

        }
    }//GEN-LAST:event_plusActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        screen.setText(screen.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        operation();
    }//GEN-LAST:event_equalActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        try {
            num = Double.parseDouble(screen.getText());
            calc = 3;
            screen.setText("");
            show.setText(num + "x");
        } catch (Exception e3) {

        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        try {
            num = Double.parseDouble(screen.getText());
            calc = 4;
            screen.setText("");
            show.setText(num + "/");
        } catch (Exception e4) {

        }
    }//GEN-LAST:event_divideActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        try {
            num = Double.parseDouble(screen.getText());
            calc = 2;
            screen.setText("");
            show.setText(num + "-");
        } catch (Exception e3) {

        }
    }//GEN-LAST:event_subActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        off();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void Btn_onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_onActionPerformed
        on();
    }//GEN-LAST:event_Btn_onActionPerformed

    private void perceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perceActionPerformed
        try {
            num = Double.parseDouble(screen.getText());
            calc = 5;
            screen.setText("");
            show.setText(num + "%");
        } catch (Exception e4) {

        }

    }//GEN-LAST:event_perceActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Btn_on;
    private javax.swing.JButton back;
    private javax.swing.JButton clr;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.ButtonGroup on_off;
    private javax.swing.JButton one;
    private javax.swing.JButton perce;
    private javax.swing.JButton plus;
    private javax.swing.JTextField screen;
    private javax.swing.JButton seven;
    private javax.swing.JLabel show;
    private javax.swing.JButton six;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
