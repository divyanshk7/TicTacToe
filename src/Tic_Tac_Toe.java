import javax.swing.JOptionPane;

public class Tic_Tac_Toe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    int turn = 2;  //even then p1 turn,odd then p2 turn;
    int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int p1won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int p2won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int p1won() {
        if (p1won[0] == 1 && p1won[1] == 1 && p1won[2] == 1) {
            return 1;
        }
        if (p1won[3] == 1 && p1won[4] == 1 && p1won[5] == 1) {
            return 1;
        }
        if (p1won[6] == 1 && p1won[7] == 1 && p1won[8] == 1) {
            return 1;
        }
        if (p1won[0] == 1 && p1won[3] == 1 && p1won[6] == 1) {
            return 1;
        }
        if (p1won[1] == 1 && p1won[4] == 1 && p1won[7] == 1) {
            return 1;
        }
        if (p1won[2] == 1 && p1won[5] == 1 && p1won[8] == 1) {
            return 1;
        }
        if (p1won[2] == 1 && p1won[4] == 1 && p1won[6] == 1) {
            return 1;
        }
        if (p1won[0] == 1 && p1won[4] == 1 && p1won[8] == 1) {
            return 1;
        }

        return 0;

    }

    int p2won() {
        if (p2won[0] == 1 && p2won[1] == 1 && p2won[2] == 1) {
            return 1;
        }
        if (p2won[3] == 1 && p2won[4] == 1 && p2won[5] == 1) {
            return 1;
        }
        if (p2won[6] == 1 && p2won[7] == 1 && p2won[8] == 1) {
            return 1;
        }
        if (p2won[0] == 1 && p2won[3] == 1 && p2won[6] == 1) {
            return 1;
        }
        if (p2won[1] == 1 && p2won[4] == 1 && p2won[7] == 1) {
            return 1;
        }
        if (p2won[2] == 1 && p2won[5] == 1 && p2won[8] == 1) {
            return 1;
        }
        if (p2won[2] == 1 && p2won[4] == 1 && p2won[6] == 1) {
            return 1;
        }
        if (p2won[0] == 1 && p2won[4] == 1 && p2won[8] == 1) {
            return 1;
        }

        return 0;

    }

    int tie() {
        if (buttonused[0] == 1 && buttonused[1] == 1 && buttonused[2] == 1 && buttonused[3] == 1 && buttonused[4] == 1
                && buttonused[5] == 1 && buttonused[6] == 1 && buttonused[7] == 1 && buttonused[8] == 1) {
            return 1;
        }

        return 0;

    }

    public Tic_Tac_Toe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                          
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Calibri", 1, 64)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Reset.setText("Play Again");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
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
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (buttonused[0] == 0) {
                if (turn % 2 == 0) {
                    turn++;
                    b1.setText("X");
                    buttonused[0] = 1;
                    p1won[0] = 1;

                    int result1 = p1won();
                    int result2 = p2won();
                    int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                } else {
                    turn++;
                    b1.setText("O");
                    buttonused[0] = 1;
                    p2won[0] = 1;
                     int result1 = p1won();
                     int result2 = p2won();
                     int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                }
            } else if (buttonused[0] == 1){
                JOptionPane.showMessageDialog(null, "This button is already used");
            } 
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (buttonused[1] == 0) {
                if (turn % 2 == 0) {
                    turn++;
                    b2.setText("X");
                    buttonused[1] = 1;
                    p1won[1] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                } else {
                    turn++;
                    b2.setText("O");
                    buttonused[1] = 1;
                    p2won[1] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                }
            } else if (buttonused[1] == 1){
                JOptionPane.showMessageDialog(null, "This button is already used");
            }
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (buttonused[2] == 0) {
                if (turn % 2 == 0) {
                    turn++;
                    b3.setText("X");
                    buttonused[2] = 1;
                    p1won[2] = 1;
                     int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                } else {
                    turn++;
                    b3.setText("O");
                    buttonused[2] = 1;
                    p2won[2] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                }
            } else if (buttonused[2] == 1){
                JOptionPane.showMessageDialog(null, "This button is already used");
            }
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (buttonused[3] == 0) {
                if (turn % 2 == 0) {
                    turn++;
                    b4.setText("X");
                    buttonused[3] = 1;
                    p1won[3] = 1;
                     int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                } else {
                    turn++;
                    b4.setText("O");
                    buttonused[3] = 1;
                    p2won[3] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                }
            } else if (buttonused[3] == 1){
                JOptionPane.showMessageDialog(null, "This button is already used");
            }
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (buttonused[4] == 0) {
                if (turn % 2 == 0) {
                    turn++;
                    b5.setText("X");
                    buttonused[4] = 1;
                    p1won[4] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                } else {
                    turn++;
                    b5.setText("O");
                    buttonused[4] = 1;
                    p2won[4] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                }
            } else if (buttonused[4] == 1){
                JOptionPane.showMessageDialog(null, "This button is already used");
            }
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
            if (buttonused[5] == 0) {
                if (turn % 2 == 0) {
                    turn++;
                    b6.setText("X");
                    buttonused[5] = 1;
                    p1won[5] = 1;
                     int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                } else {
                    turn++;
                    b6.setText("O");
                    buttonused[5] = 1;
                    p2won[5] = 1;
                    int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                    if (result1 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 1 has won");
                    } else if (result2 == 1) {
                        JOptionPane.showMessageDialog(null, "Player 2 has won");
                    } else if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Match tied");
                    }
                }
            } else if (buttonused[5] == 1){
                JOptionPane.showMessageDialog(null, "This button is already used");
            }
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        if (buttonused[6] == 0) {
            if (turn % 2 == 0) {
                turn++;
                b7.setText("X");
                buttonused[6] = 1;
                p1won[6] = 1;
                int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                if (result1 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 1 has won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 2 has won");
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Match tied");
                }
            } else {
                turn++;
                b7.setText("O");
                buttonused[6] = 1;
                p2won[6] = 1;
                int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                if (result1 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 1 has won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 2 has won");
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Match tied");
                }
            }
        } else if (buttonused[6] == 1){
            JOptionPane.showMessageDialog(null, "This button is already used");
        }
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        if (buttonused[7] == 0) {
            if (turn % 2 == 0) {
                turn++;
                b8.setText("X");
                buttonused[7] = 1;
                p1won[7] = 1;
                int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                if (result1 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 1 has won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 2 has won");
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Match tied");
                }
            } else {
                turn++;
                b8.setText("O");
                buttonused[7] = 1;
                p2won[7] = 1;
                int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                if (result1 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 1 has won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 2 has won");
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Match tied");
                }
            }
        } else if (buttonused[7] == 1){
            JOptionPane.showMessageDialog(null, "This button is already used");
        }
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        if (buttonused[8] == 0) {
            if (turn % 2 == 0) {
                turn++;
                b9.setText("X");
                buttonused[8] = 1;
                p1won[8] = 1;
                int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                if (result1 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 1 has won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 2 has won");
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Match tied");
                }

            } else {
                turn++;
                b9.setText("O");
                buttonused[8] = 1;
                p2won[8] = 1;
                int result1 = p1won();
                int result2 = p2won();
                int result = tie();
                if (result1 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 1 has won");
                } else if (result2 == 1) {
                    JOptionPane.showMessageDialog(null, "Player 2 has won");
                } else if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Match tied");
                }

            }
        } else if (buttonused[8] == 1){
            JOptionPane.showMessageDialog(null, "This button is already used");
        }

    }                                  

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        turn = 2;
        for (int i = 0; i < 9; i++) {
            buttonused[i] = 0;
        }
        for (int i = 0; i < 9; i++) {
            p1won[i] = 0;
        }
        for (int i = 0; i < 9; i++) {
            p2won[i] = 0;
        }
    }                                     

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     

        System.exit(0);
    }                                    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Exit;
    private javax.swing.JButton Reset;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    // End of variables declaration                   
}
