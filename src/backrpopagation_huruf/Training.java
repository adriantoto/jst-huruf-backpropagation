package backrpopagation_huruf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.StrictMath.exp;
import javax.swing.JOptionPane;

//---------- Inisialisasi ---------- 
public class Training extends javax.swing.JFrame {
        int n=0;
        Object  inputS[]=new Object[63];
        Object inputT[]=new Object[7];
        double biastestY [] = new double [7];
        int [][] x = new int [63][26]; //nilai input
        double[] y= new double[7]; //nilai y
        double [] biasY=new double[7]; //bias output
        double [] y_inK = new double [7];
        double wtest [][];
        double vtest[][];
        double biastestZ[];
        int [][] t = new int [7][26];
        double [] faktorK = new double[7];
        double[] delta_biasY=new double[7]; //delta bias output
        double alpha;
        int iterasi;
        String Huruf[]=new String[26];
        int p;
        int hidden;
        
    //---------- Tampilan Window ----------     
    public Training() {
        setTitle("Training");
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width)/2,
               ( screenSize.height - frameSize.height)/2);       
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tr63 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tr1 = new javax.swing.JToggleButton();
        tr2 = new javax.swing.JToggleButton();
        tr3 = new javax.swing.JToggleButton();
        tr4 = new javax.swing.JToggleButton();
        tr5 = new javax.swing.JToggleButton();
        tr6 = new javax.swing.JToggleButton();
        tr7 = new javax.swing.JToggleButton();
        tr8 = new javax.swing.JToggleButton();
        tr9 = new javax.swing.JToggleButton();
        tr10 = new javax.swing.JToggleButton();
        tr11 = new javax.swing.JToggleButton();
        tr12 = new javax.swing.JToggleButton();
        tr13 = new javax.swing.JToggleButton();
        tr14 = new javax.swing.JToggleButton();
        tr15 = new javax.swing.JToggleButton();
        tr16 = new javax.swing.JToggleButton();
        tr17 = new javax.swing.JToggleButton();
        tr18 = new javax.swing.JToggleButton();
        tr19 = new javax.swing.JToggleButton();
        tr20 = new javax.swing.JToggleButton();
        tr21 = new javax.swing.JToggleButton();
        tr22 = new javax.swing.JToggleButton();
        tr23 = new javax.swing.JToggleButton();
        tr24 = new javax.swing.JToggleButton();
        tr25 = new javax.swing.JToggleButton();
        tr26 = new javax.swing.JToggleButton();
        tr27 = new javax.swing.JToggleButton();
        tr28 = new javax.swing.JToggleButton();
        tr29 = new javax.swing.JToggleButton();
        tr30 = new javax.swing.JToggleButton();
        tr31 = new javax.swing.JToggleButton();
        tr32 = new javax.swing.JToggleButton();
        tr33 = new javax.swing.JToggleButton();
        tr34 = new javax.swing.JToggleButton();
        tr35 = new javax.swing.JToggleButton();
        tr36 = new javax.swing.JToggleButton();
        tr37 = new javax.swing.JToggleButton();
        tr38 = new javax.swing.JToggleButton();
        tr39 = new javax.swing.JToggleButton();
        tr40 = new javax.swing.JToggleButton();
        tr41 = new javax.swing.JToggleButton();
        tr42 = new javax.swing.JToggleButton();
        tr43 = new javax.swing.JToggleButton();
        tr44 = new javax.swing.JToggleButton();
        tr45 = new javax.swing.JToggleButton();
        tr46 = new javax.swing.JToggleButton();
        tr47 = new javax.swing.JToggleButton();
        tr48 = new javax.swing.JToggleButton();
        tr49 = new javax.swing.JToggleButton();
        tr50 = new javax.swing.JToggleButton();
        tr51 = new javax.swing.JToggleButton();
        tr52 = new javax.swing.JToggleButton();
        tr53 = new javax.swing.JToggleButton();
        tr54 = new javax.swing.JToggleButton();
        tr55 = new javax.swing.JToggleButton();
        tr56 = new javax.swing.JToggleButton();
        tr57 = new javax.swing.JToggleButton();
        tr58 = new javax.swing.JToggleButton();
        tr59 = new javax.swing.JToggleButton();
        tr60 = new javax.swing.JToggleButton();
        tr61 = new javax.swing.JToggleButton();
        tr62 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t7 = new javax.swing.JToggleButton();
        t1 = new javax.swing.JToggleButton();
        t2 = new javax.swing.JToggleButton();
        t3 = new javax.swing.JToggleButton();
        t4 = new javax.swing.JToggleButton();
        t5 = new javax.swing.JToggleButton();
        t6 = new javax.swing.JToggleButton();
        tr_huruf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tr_clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tr_alpha1 = new javax.swing.JTextField();
        tr_iterasi = new javax.swing.JTextField();
        tr_hidden = new javax.swing.JTextField();
        tr_training = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tr_save = new javax.swing.JButton();
        radio_biner = new javax.swing.JRadioButton();
        radio_bipolar = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Training - Pengenalan Huruf");
        setBackground(new java.awt.Color(0, 0, 153));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 3));

        jLabel17.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Pengenalan Pola Huruf dengan Backpropagation");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/MATITS.png"))); // NOI18N
        jLabel9.setAlignmentY(0.0F);

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Oleh:");

        jLabel15.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Adrian Maulana M. ");

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("TUGAS JARINGAN SYARAF TIRUAN");
        jLabel16.setAlignmentY(0.0F);

        jLabel18.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("M. Kevin Adnan M. ");

        jLabel19.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel19.setText("(06111540000099)");

        jLabel20.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel20.setText("(06111640000045)");

        jLabel21.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel21.setText("Departemen Matematika");

        jLabel22.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel22.setText("Fakultas Sains dan Analitika Data");

        jLabel23.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel23.setText("Institut Teknologi Sepuluh Nopember");

        jLabel25.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel25.setText("Surabaya");

        jLabel26.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel26.setText("2020");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jLabel24)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(263, 263, 263)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel20))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel19)))
                                    .addGap(4, 4, 4))
                                .addComponent(jLabel23))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(140, 140, 140))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(77, 77, 77)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addGap(67, 67, 67)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jLabel24))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Judul", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setText("TRAINING MODE");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/MATITS.png"))); // NOI18N
        jLabel27.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addGap(199, 199, 199))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tr63.setBackground(java.awt.Color.white);
        tr63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr63.setText("F");
        tr63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr63ActionPerformed(evt);
            }
        });
        jPanel1.add(tr63, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setText("Pola Huruf");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        tr1.setBackground(java.awt.Color.white);
        tr1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr1.setText("F");
        tr1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr1ActionPerformed(evt);
            }
        });
        jPanel1.add(tr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 30));

        tr2.setBackground(java.awt.Color.white);
        tr2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr2.setText("F");
        tr2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr2ActionPerformed(evt);
            }
        });
        jPanel1.add(tr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        tr3.setBackground(java.awt.Color.white);
        tr3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr3.setText("F");
        tr3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr3ActionPerformed(evt);
            }
        });
        jPanel1.add(tr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 30));

        tr4.setBackground(java.awt.Color.white);
        tr4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr4.setText("F");
        tr4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr4ActionPerformed(evt);
            }
        });
        jPanel1.add(tr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, 30));

        tr5.setBackground(java.awt.Color.white);
        tr5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr5.setText("F");
        tr5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr5ActionPerformed(evt);
            }
        });
        jPanel1.add(tr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, 30));

        tr6.setBackground(java.awt.Color.white);
        tr6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr6.setText("F");
        tr6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr6ActionPerformed(evt);
            }
        });
        jPanel1.add(tr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 30, 30));

        tr7.setBackground(java.awt.Color.white);
        tr7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr7.setText("F");
        tr7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr7ActionPerformed(evt);
            }
        });
        jPanel1.add(tr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        tr8.setBackground(java.awt.Color.white);
        tr8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr8.setText("F");
        tr8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr8ActionPerformed(evt);
            }
        });
        jPanel1.add(tr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        tr9.setBackground(java.awt.Color.white);
        tr9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr9.setText("F");
        tr9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr9ActionPerformed(evt);
            }
        });
        jPanel1.add(tr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 30, 30));

        tr10.setBackground(java.awt.Color.white);
        tr10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr10.setText("F");
        tr10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr10ActionPerformed(evt);
            }
        });
        jPanel1.add(tr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 30, 30));

        tr11.setBackground(java.awt.Color.white);
        tr11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr11.setText("F");
        tr11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr11ActionPerformed(evt);
            }
        });
        jPanel1.add(tr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 30));

        tr12.setBackground(java.awt.Color.white);
        tr12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr12.setText("F");
        tr12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr12ActionPerformed(evt);
            }
        });
        jPanel1.add(tr12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 30, 30));

        tr13.setBackground(java.awt.Color.white);
        tr13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr13.setText("F");
        tr13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr13ActionPerformed(evt);
            }
        });
        jPanel1.add(tr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 30, 30));

        tr14.setBackground(java.awt.Color.white);
        tr14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr14.setText("F");
        tr14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr14ActionPerformed(evt);
            }
        });
        jPanel1.add(tr14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        tr15.setBackground(java.awt.Color.white);
        tr15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr15.setText("F");
        tr15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr15ActionPerformed(evt);
            }
        });
        jPanel1.add(tr15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 30));

        tr16.setBackground(java.awt.Color.white);
        tr16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr16.setText("F");
        tr16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr16ActionPerformed(evt);
            }
        });
        jPanel1.add(tr16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        tr17.setBackground(java.awt.Color.white);
        tr17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr17.setText("F");
        tr17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr17ActionPerformed(evt);
            }
        });
        jPanel1.add(tr17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        tr18.setBackground(java.awt.Color.white);
        tr18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr18.setText("F");
        tr18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr18ActionPerformed(evt);
            }
        });
        jPanel1.add(tr18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, 30));

        tr19.setBackground(java.awt.Color.white);
        tr19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr19.setText("F");
        tr19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr19ActionPerformed(evt);
            }
        });
        jPanel1.add(tr19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 30));

        tr20.setBackground(java.awt.Color.white);
        tr20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr20.setText("F");
        tr20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr20ActionPerformed(evt);
            }
        });
        jPanel1.add(tr20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        tr21.setBackground(java.awt.Color.white);
        tr21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr21.setText("F");
        tr21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr21ActionPerformed(evt);
            }
        });
        jPanel1.add(tr21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        tr22.setBackground(java.awt.Color.white);
        tr22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr22.setText("F");
        tr22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr22ActionPerformed(evt);
            }
        });
        jPanel1.add(tr22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        tr23.setBackground(java.awt.Color.white);
        tr23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr23.setText("F");
        tr23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr23ActionPerformed(evt);
            }
        });
        jPanel1.add(tr23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 30, 30));

        tr24.setBackground(java.awt.Color.white);
        tr24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr24.setText("F");
        tr24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr24ActionPerformed(evt);
            }
        });
        jPanel1.add(tr24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 30, 30));

        tr25.setBackground(java.awt.Color.white);
        tr25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr25.setText("F");
        tr25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr25ActionPerformed(evt);
            }
        });
        jPanel1.add(tr25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 30, 30));

        tr26.setBackground(java.awt.Color.white);
        tr26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr26.setText("F");
        tr26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr26ActionPerformed(evt);
            }
        });
        jPanel1.add(tr26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        tr27.setBackground(java.awt.Color.white);
        tr27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr27.setText("F");
        tr27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr27ActionPerformed(evt);
            }
        });
        jPanel1.add(tr27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 30, 30));

        tr28.setBackground(java.awt.Color.white);
        tr28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr28.setText("F");
        tr28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr28ActionPerformed(evt);
            }
        });
        jPanel1.add(tr28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 30));

        tr29.setBackground(java.awt.Color.white);
        tr29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr29.setText("F");
        tr29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr29ActionPerformed(evt);
            }
        });
        jPanel1.add(tr29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 30, 30));

        tr30.setBackground(java.awt.Color.white);
        tr30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr30.setText("F");
        tr30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr30ActionPerformed(evt);
            }
        });
        jPanel1.add(tr30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 30));

        tr31.setBackground(java.awt.Color.white);
        tr31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr31.setText("F");
        tr31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr31ActionPerformed(evt);
            }
        });
        jPanel1.add(tr31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, 30));

        tr32.setBackground(java.awt.Color.white);
        tr32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr32.setText("F");
        tr32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr32ActionPerformed(evt);
            }
        });
        jPanel1.add(tr32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 30, 30));

        tr33.setBackground(java.awt.Color.white);
        tr33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr33.setText("F");
        tr33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr33ActionPerformed(evt);
            }
        });
        jPanel1.add(tr33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        tr34.setBackground(java.awt.Color.white);
        tr34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr34.setText("F");
        tr34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr34ActionPerformed(evt);
            }
        });
        jPanel1.add(tr34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 30, 30));

        tr35.setBackground(java.awt.Color.white);
        tr35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr35.setText("F");
        tr35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr35ActionPerformed(evt);
            }
        });
        jPanel1.add(tr35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 30));

        tr36.setBackground(java.awt.Color.white);
        tr36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr36.setText("F");
        tr36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr36ActionPerformed(evt);
            }
        });
        jPanel1.add(tr36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        tr37.setBackground(java.awt.Color.white);
        tr37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr37.setText("F");
        tr37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr37ActionPerformed(evt);
            }
        });
        jPanel1.add(tr37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 30));

        tr38.setBackground(java.awt.Color.white);
        tr38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr38.setText("F");
        tr38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr38ActionPerformed(evt);
            }
        });
        jPanel1.add(tr38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 30, 30));

        tr39.setBackground(java.awt.Color.white);
        tr39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr39.setText("F");
        tr39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr39ActionPerformed(evt);
            }
        });
        jPanel1.add(tr39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 30, 30));

        tr40.setBackground(java.awt.Color.white);
        tr40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr40.setText("F");
        tr40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr40ActionPerformed(evt);
            }
        });
        jPanel1.add(tr40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 30));

        tr41.setBackground(java.awt.Color.white);
        tr41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr41.setText("F");
        tr41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr41ActionPerformed(evt);
            }
        });
        jPanel1.add(tr41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 30, 30));

        tr42.setBackground(java.awt.Color.white);
        tr42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr42.setText("F");
        tr42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr42ActionPerformed(evt);
            }
        });
        jPanel1.add(tr42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        tr43.setBackground(java.awt.Color.white);
        tr43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr43.setText("F");
        tr43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr43ActionPerformed(evt);
            }
        });
        jPanel1.add(tr43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 30, 30));

        tr44.setBackground(java.awt.Color.white);
        tr44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr44.setText("F");
        tr44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr44ActionPerformed(evt);
            }
        });
        jPanel1.add(tr44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30, 30));

        tr45.setBackground(java.awt.Color.white);
        tr45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr45.setText("F");
        tr45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr45ActionPerformed(evt);
            }
        });
        jPanel1.add(tr45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 30));

        tr46.setBackground(java.awt.Color.white);
        tr46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr46.setText("F");
        tr46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr46ActionPerformed(evt);
            }
        });
        jPanel1.add(tr46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, 30));

        tr47.setBackground(java.awt.Color.white);
        tr47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr47.setText("F");
        tr47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr47ActionPerformed(evt);
            }
        });
        jPanel1.add(tr47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 30, 30));

        tr48.setBackground(java.awt.Color.white);
        tr48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr48.setText("F");
        tr48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr48ActionPerformed(evt);
            }
        });
        jPanel1.add(tr48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, 30));

        tr49.setBackground(java.awt.Color.white);
        tr49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr49.setText("F");
        tr49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr49ActionPerformed(evt);
            }
        });
        jPanel1.add(tr49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 30, 30));

        tr50.setBackground(java.awt.Color.white);
        tr50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr50.setText("F");
        tr50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr50ActionPerformed(evt);
            }
        });
        jPanel1.add(tr50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 30, 30));

        tr51.setBackground(java.awt.Color.white);
        tr51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr51.setText("F");
        tr51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr51ActionPerformed(evt);
            }
        });
        jPanel1.add(tr51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30, 30));

        tr52.setBackground(java.awt.Color.white);
        tr52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr52.setText("F");
        tr52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr52ActionPerformed(evt);
            }
        });
        jPanel1.add(tr52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 30, 30));

        tr53.setBackground(java.awt.Color.white);
        tr53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr53.setText("F");
        tr53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr53ActionPerformed(evt);
            }
        });
        jPanel1.add(tr53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 30, 30));

        tr54.setBackground(java.awt.Color.white);
        tr54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr54.setText("F");
        tr54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr54ActionPerformed(evt);
            }
        });
        jPanel1.add(tr54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, 30));

        tr55.setBackground(java.awt.Color.white);
        tr55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr55.setText("F");
        tr55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr55ActionPerformed(evt);
            }
        });
        jPanel1.add(tr55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, 30));

        tr56.setBackground(java.awt.Color.white);
        tr56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr56.setText("F");
        tr56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr56ActionPerformed(evt);
            }
        });
        jPanel1.add(tr56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 30, 30));

        tr57.setBackground(java.awt.Color.white);
        tr57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr57.setText("F");
        tr57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr57ActionPerformed(evt);
            }
        });
        jPanel1.add(tr57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 30, 30));

        tr58.setBackground(java.awt.Color.white);
        tr58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr58.setText("F");
        tr58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr58ActionPerformed(evt);
            }
        });
        jPanel1.add(tr58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 30, 30));

        tr59.setBackground(java.awt.Color.white);
        tr59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr59.setText("F");
        tr59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr59ActionPerformed(evt);
            }
        });
        jPanel1.add(tr59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 30, 30));

        tr60.setBackground(java.awt.Color.white);
        tr60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr60.setText("F");
        tr60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr60ActionPerformed(evt);
            }
        });
        jPanel1.add(tr60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 30, 30));

        tr61.setBackground(java.awt.Color.white);
        tr61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr61.setText("F");
        tr61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr61ActionPerformed(evt);
            }
        });
        jPanel1.add(tr61, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, 30));

        tr62.setBackground(java.awt.Color.white);
        tr62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr62.setText("F");
        tr62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr62ActionPerformed(evt);
            }
        });
        jPanel1.add(tr62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setText("Kode Huruf");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        t7.setBackground(java.awt.Color.white);
        t7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t7.setText("F");
        t7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel2.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 30, 30));

        t1.setBackground(java.awt.Color.white);
        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setText("F");
        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        t2.setBackground(java.awt.Color.white);
        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2.setText("F");
        t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, 30));

        t3.setBackground(java.awt.Color.white);
        t3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3.setText("F");
        t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, 30));

        t4.setBackground(java.awt.Color.white);
        t4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t4.setText("F");
        t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 30, 30));

        t5.setBackground(java.awt.Color.white);
        t5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t5.setText("F");
        t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 30, 30));

        t6.setBackground(java.awt.Color.white);
        t6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t6.setText("F");
        t6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 30, 30));

        tr_huruf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tr_huruf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_huruf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tr_huruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_hurufActionPerformed(evt);
            }
        });
        jPanel2.add(tr_huruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setText("Huruf :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jLabel11.setText("*Masukkan huruf yang sesuai");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        tr_clear.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tr_clear.setText("REFRESH");
        tr_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_clearMouseClicked(evt);
            }
        });
        tr_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_clearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setText("Iterasi :");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel4.setText("Alpha :");

        tr_alpha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_alpha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_alpha1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_alpha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_alpha1ActionPerformed(evt);
            }
        });

        tr_iterasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_iterasi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_iterasi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_iterasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_iterasiActionPerformed(evt);
            }
        });

        tr_hidden.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_hidden.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_hidden.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_hidden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_hiddenActionPerformed(evt);
            }
        });

        tr_training.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        tr_training.setText("TRAINING");
        tr_training.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_trainingMouseClicked(evt);
            }
        });
        tr_training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_trainingActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel8.setText("Hidden :");

        tr_save.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        tr_save.setText("SIMPAN");
        tr_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_saveMouseClicked(evt);
            }
        });
        tr_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_saveActionPerformed(evt);
            }
        });

        radio_biner.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        radio_biner.setText("Biner");
        radio_biner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_binerActionPerformed(evt);
            }
        });

        radio_bipolar.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        radio_bipolar.setText("Bipolar");

        jButton2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButton2.setText("LAKUKAN TESTING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tr_iterasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tr_alpha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tr_hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio_biner)
                                            .addComponent(radio_bipolar)
                                            .addComponent(tr_save)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(tr_training, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tr_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tr_hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(radio_biner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tr_iterasi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(radio_bipolar))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tr_alpha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tr_save))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tr_training, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tr_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Training", jPanel6);

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 102));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---------- Fungsi Sigmoid ---------- 
    public static Double Sigmoid(Double x){
    Double hasil;
    hasil = 1/(1+exp(-x));
    return hasil;
}
public static Double DiffSigmoid(Double x){
    Double hasil;
    hasil = Sigmoid(x)*(1-Sigmoid(x));
    return hasil;
}

public static Double Sigmoid2(Double x){
    Double hasil;
    hasil = (2/(1+exp(-x)))-1;
    return hasil;
}
public static Double DiffSigmoid2(Double x){
    Double hasil;
    hasil = ((1+Sigmoid2(x))*(1-Sigmoid2(x))/2);
    return hasil;
}
    //---------- GUI ----------      
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked

    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void radio_binerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_binerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_binerActionPerformed

    private void tr_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_saveActionPerformed

        if(radio_biner.isSelected() && radio_bipolar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Pilih salah satu fungsi aktivasi");
        } else if (!radio_biner.isSelected() && !radio_bipolar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Fungsi aktivasi belum dipilih");
        } else {
            if ( tr_huruf.getText().equals("") || tr_alpha1.getText().equals("") || tr_iterasi.getText().equals("") || tr_hidden.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom isian tidak boleh kosong ");
            } else {
                tr_save.setSelected(true);
                Integer Iterasi = Integer.parseInt(tr_iterasi.getText());
                Double alpha=Double.parseDouble(tr_alpha1.getText());
                if (Iterasi < 0 ) {
                    JOptionPane.showMessageDialog(null, "Iterasi harus lebih dari 0");
                } else if ( alpha < 0 || alpha > 1 ) {
                    JOptionPane.showMessageDialog(null, "Nilai Alfa tidak boleh kosong dan harus 0 <= Alfa <= 1 ");
                } else {
                    tr_huruf.enable(false);
                    tr_iterasi.enable(false);
                    tr_alpha1.enable(false);
                    tr_hidden.enable(false);
                    inputS[0]=tr1.getSelectedObjects();
                    inputS[1]=tr2.getSelectedObjects();
                    inputS[2]=tr3.getSelectedObjects();
                    inputS[3]=tr4.getSelectedObjects();
                    inputS[4]=tr5.getSelectedObjects();
                    inputS[5]=tr6.getSelectedObjects();
                    inputS[6]=tr7.getSelectedObjects();
                    inputS[7]=tr8.getSelectedObjects();
                    inputS[8]=tr9.getSelectedObjects();
                    inputS[9]=tr10.getSelectedObjects();
                    inputS[10]=tr11.getSelectedObjects();
                    inputS[11]=tr12.getSelectedObjects();
                    inputS[12]=tr13.getSelectedObjects();
                    inputS[13]=tr14.getSelectedObjects();
                    inputS[14]=tr15.getSelectedObjects();
                    inputS[15]=tr16.getSelectedObjects();
                    inputS[16]=tr17.getSelectedObjects();
                    inputS[17]=tr18.getSelectedObjects();
                    inputS[18]=tr19.getSelectedObjects();
                    inputS[19]=tr20.getSelectedObjects();
                    inputS[20]=tr21.getSelectedObjects();
                    inputS[21]=tr22.getSelectedObjects();
                    inputS[22]=tr23.getSelectedObjects();
                    inputS[23]=tr24.getSelectedObjects();
                    inputS[24]=tr25.getSelectedObjects();
                    inputS[25]=tr26.getSelectedObjects();
                    inputS[26]=tr27.getSelectedObjects();
                    inputS[27]=tr28.getSelectedObjects();
                    inputS[28]=tr29.getSelectedObjects();
                    inputS[29]=tr30.getSelectedObjects();
                    inputS[30]=tr31.getSelectedObjects();
                    inputS[31]=tr32.getSelectedObjects();
                    inputS[32]=tr33.getSelectedObjects();
                    inputS[33]=tr34.getSelectedObjects();
                    inputS[34]=tr35.getSelectedObjects();
                    inputS[35]=tr36.getSelectedObjects();
                    inputS[36]=tr37.getSelectedObjects();
                    inputS[37]=tr38.getSelectedObjects();
                    inputS[38]=tr39.getSelectedObjects();
                    inputS[39]=tr40.getSelectedObjects();
                    inputS[40]=tr41.getSelectedObjects();
                    inputS[41]=tr42.getSelectedObjects();
                    inputS[42]=tr43.getSelectedObjects();
                    inputS[43]=tr44.getSelectedObjects();
                    inputS[44]=tr45.getSelectedObjects();
                    inputS[45]=tr46.getSelectedObjects();
                    inputS[46]=tr47.getSelectedObjects();
                    inputS[47]=tr48.getSelectedObjects();
                    inputS[48]=tr49.getSelectedObjects();
                    inputS[49]=tr50.getSelectedObjects();
                    inputS[50]=tr51.getSelectedObjects();
                    inputS[51]=tr52.getSelectedObjects();
                    inputS[52]=tr53.getSelectedObjects();
                    inputS[53]=tr54.getSelectedObjects();
                    inputS[54]=tr55.getSelectedObjects();
                    inputS[55]=tr56.getSelectedObjects();
                    inputS[56]=tr57.getSelectedObjects();
                    inputS[57]=tr58.getSelectedObjects();
                    inputS[58]=tr59.getSelectedObjects();
                    inputS[59]=tr60.getSelectedObjects();
                    inputS[60]=tr61.getSelectedObjects();
                    inputS[61]=tr62.getSelectedObjects();
                    inputS[62]=tr63.getSelectedObjects();

                    //Menginisiasi S
                    for(int i=0;i<63; i++){
                        if(radio_biner.isSelected()) {
                            if(inputS[i]!=null) {
                                x[i][n]=1;
                            } else {
                                x[i][n]=0;
                            }
                        } else if (radio_bipolar.isSelected()){
                            if(inputS[i]!=null) {
                                x[i][n]=1;
                            } else {
                                x[i][n]=-1;
                            }}}

                    inputT[0]=t1.getSelectedObjects();
                    inputT[1]=t2.getSelectedObjects();
                    inputT[2]=t3.getSelectedObjects();
                    inputT[3]=t4.getSelectedObjects();
                    inputT[4]=t5.getSelectedObjects();
                    inputT[5]=t6.getSelectedObjects();
                    inputT[6]=t7.getSelectedObjects();

                    for(int i=0;i<7; i++){
                        if(radio_biner.isSelected()) {
                            if(inputT[i]!=null) {
                                t[i][n]=1;
                            } else {
                                t[i][n]=0;
                            }
                        } else if (radio_bipolar.isSelected()){
                            if(inputT[i]!=null) {
                                t[i][n]=1;
                            } else {
                                t[i][n]=-1;
                            }}}
                    
                    //Mengambil inputan huruf
                    Huruf[n]=tr_huruf.getText();
                    n=n+1;
                    p=n;
                    JOptionPane.showMessageDialog(null, "Huruf disimpan dalam database");
                }}}
    }//GEN-LAST:event_tr_saveActionPerformed

    private void tr_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_saveMouseClicked

    }//GEN-LAST:event_tr_saveMouseClicked

    private void tr_trainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_trainingActionPerformed

        hidden = Integer.parseInt(tr_hidden.getText());

        wtest = new double [hidden][7];
        vtest = new double [63][hidden];
        biastestZ = new double [hidden];
        double  [] biasZ = new double [hidden]; //bias hidden
        double [][] w = new double[hidden][7]; //bobot menuju outoput
        double[] z = new double[hidden]; //nilai z
        double[][] v = new double[63][hidden];//bobot menuju hidden
        double [] z_inJ = new double [hidden]; 
        double [][] delta_w = new double[hidden][7];//delta bobot hidden
        double [][] delta_v = new double[63][hidden];//delta bobot hidden
        double [] faktorJ = new double[hidden];
        double[] faktor_inJ = new double[hidden];//faktor_in pada hidden
        double [] delta_biasZ=new double [hidden]; //delta bias hidden

        if(tr_save.isSelected()) {
            Integer iterasi = Integer.parseInt(tr_iterasi.getText());
            Double alpha = Double.parseDouble(tr_alpha1.getText());
            int it=0;            
            for (int i=0; i< 63; i++) {
                for(int j=0; j<hidden; j++) {
                    v[i][j] = Math.random()-0.5;
                }
            }
            for (int i=0; i<hidden; i++) {
                biasZ[i] = Math.random()-0.5;
            }
            for (int i=0; i<7; i++) {
                biasY[i] = Math.random()-0.5;
            }
//-------------------------- Algoritma Training --------------------------                   
            //---------- Step 0 ----------      
            for (int i=0; i< hidden; i++) {
                for(int j=0; j<7; j++) {
                    // small random values
                    w[i][j] = Math.random()-0.5;
                }}
            //---------- Step 1 ----------      
            // While stopping condition is false 
            while (it < iterasi){ 
                //---------- Step 2 ----------      
                // For each training pair
                for(int k=0; k<p; k++){ 
                    // Feedforward:
                    //---------- Step 3 ----------      
                    // The hidden units
                    for(int j=0; j<hidden; j++){ 
                        z_inJ[j]=0.0;
                        //---------- Step 4 ----------      
                        for(int i=0; i<63; i++){
                            // z_in
                            z_inJ[j]=z_inJ[j]+(x[i][k]*v[i][j]); 
                        }
                        z_inJ[j] = z_inJ[j]+biasZ[j];
                    }
                    // Penggunaan Sigmoid (aktivasi)
                    for (int j=0; j<hidden; j++) {
                        if(radio_biner.isSelected()) {
                            z[j] = Sigmoid(z_inJ[j]);
                        } else if(radio_bipolar.isSelected()){
                            z[j] = Sigmoid2(z_inJ[j]);
                        }
                    }
                    //---------- Step 5 ----------      
                    for( int r=0; r<7; r++){
                        y_inK[r]= 0.0;
                        for(int j=0; j<hidden; j++){
                             // y_in
                            y_inK[r]=y_inK[r]+(z[j]*w[j][r]);  
                        }
                        y_inK[r]= y_inK[r] + biasY[r];
                    }
                    // Penggunaan Sigmoid (aktivasi)
                    for (int j=0; j<7; j++) {
                        if(radio_biner.isSelected()) {
                            y[j] = Sigmoid(y_inK[j]);
                        } else if(radio_bipolar.isSelected()){
                            y[j] = Sigmoid2(y_inK[j]);
                        }
                    }
                    //---------- Step 6 ----------      
                    // Backpropagation of Error:
                    for (int i=0; i<7; i++) {
                        if(radio_biner.isSelected()) {
                            faktorK [i] = (t[i][k]-y[i])*DiffSigmoid(y_inK[i]);
                        } else if(radio_bipolar.isSelected()){
                            faktorK [i] = (t[i][k]-y[i])*DiffSigmoid2(y_inK[i]);
                        }
                    }
                    for (int i=0; i<7; i++) {
                        for (int j=0; j< hidden; j++) {
                            // delta w
                            delta_w[j][i] = alpha*faktorK[i]*z[j];  
                        }
                        // delta bias
                        delta_biasY[i] = alpha*faktorK[i];
                    }
                    //---------- Step 7 ----------      
                    for(int j=0; j<hidden; j++){
                        faktor_inJ[j]=0.0;  
                        for( int r=0; r<7; r++){
                            faktor_inJ[j]=faktor_inJ[j]+(faktorK[r]*w[j][r]);
                        }
                    }
                    for(int j=0; j<hidden; j++){
                        if(radio_biner.isSelected()) {
                            faktorJ[j]=faktor_inJ[j]*DiffSigmoid(z_inJ[j]);
                        } else if(radio_bipolar.isSelected()) {
                            faktorJ[j]=faktor_inJ[j]*DiffSigmoid2(z_inJ[j]);
                        }
                    }
                    for(int j=0; j<hidden; j++){
                        for(int i=0; i<63; i++){
                            delta_v[i][j]=alpha*faktorJ[j]*x[i][k];
                        }
                        delta_biasZ[j]=alpha*faktorJ[j];
                    }
                    //---------- Step 8 ----------      
                    for(int j=0; j<hidden; j++){
                        for(int r=0; r<7; r++){
                            // updating weight
                            w[j][r]=w[j][r]+delta_w[j][r];  
                        }
                    }
                    for(int j=0; j<63; j++){
                        for(int r=0; r<hidden; r++){
                            v[j][r]=v[j][r]+delta_v[j][r];  
                        }
                    }
                    for(int j=0; j<hidden; j++){
                        // updating bias
                        biasZ[j]=biasZ[j]+delta_biasZ[j];   
                    }
                    for(int j=0; j<7; j++){
                        biasY[j]=biasY[j]+delta_biasY[j];   
                    }
                    for(int i=0; i<63;i++){ 
                        for(int j=0; j<hidden; j++){                            
                            vtest[i][j]=v[i][j];
                        }
                    }                                        
                    for(int j=0; j<hidden;j++){                        
                        for(int r=0; r<7; r++){                            
                            wtest[j][r]=w[j][r];
                        }
                    }                    
                    for(int j=0; j<hidden;j++){
                        biastestZ[j]=biasZ[j];
                    }                   
                    for(int r=0; r<7;r++){
                        biastestY[r]=biasY[r];
                    }
                }
                //---------- Step 9 ----------      
                // Iterasi bertambah
                it++; 
            }
//------------------------------------------------------------------------------      
            JOptionPane.showMessageDialog(null, "Training huruf "+tr_huruf.getText()+" berhasil dilakukan");
        } else {
            JOptionPane.showMessageDialog(null, "Tombol simpan harus ditekan terlebih dahulu");
        }
    }//GEN-LAST:event_tr_trainingActionPerformed

    private void tr_trainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_trainingMouseClicked

    }//GEN-LAST:event_tr_trainingMouseClicked

    private void tr_hiddenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_hiddenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_hiddenActionPerformed

    private void tr_iterasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_iterasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_iterasiActionPerformed

    private void tr_alpha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_alpha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_alpha1ActionPerformed

    private void tr_hurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_hurufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_hurufActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        if (t6.isSelected()) {
            t6.setBackground(Color.BLACK);
            t6.setText("T");
            t6.setForeground(Color.WHITE);
        } else {
            t6.setBackground(Color.WHITE);
            t6.setText("F");
            t6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_t6ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        if (t5.isSelected()) {
            t5.setBackground(Color.BLACK);
            t5.setText("T");
            t5.setForeground(Color.WHITE);
        } else {
            t5.setBackground(Color.WHITE);
            t5.setText("F");
            t5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_t5ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        if (t4.isSelected()) {
            t4.setBackground(Color.BLACK);
            t4.setText("T");
            t4.setForeground(Color.WHITE);
        } else {
            t4.setBackground(Color.WHITE);
            t4.setText("F");
            t4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_t4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        if (t3.isSelected()) {
            t3.setBackground(Color.BLACK);
            t3.setText("T");
            t3.setForeground(Color.WHITE);
        } else {
            t3.setBackground(Color.WHITE);
            t3.setText("F");
            t3.setForeground(Color.BLACK);    
        }
    }//GEN-LAST:event_t3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        if (t2.isSelected()) {
            t2.setBackground(Color.BLACK);
            t2.setText("T");
            t2.setForeground(Color.WHITE);
        } else {
            t2.setBackground(Color.WHITE);
            t2.setText("F");
            t2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        if (t1.isSelected()) {
            t1.setBackground(Color.BLACK);
            t1.setText("T");
            t1.setForeground(Color.WHITE);
        } else {
            t1.setBackground(Color.WHITE);
            t1.setText("F");
            t1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_t1ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        if (t7.isSelected()) {
            t7.setBackground(Color.BLACK);
            t7.setText("T");
            t7.setForeground(Color.WHITE);
        } else {
            t7.setBackground(Color.WHITE);
            t7.setText("F");
            t7.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_t7ActionPerformed

    private void tr62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr62ActionPerformed
        if (tr62.isSelected()) {
            tr62.setBackground(Color.BLACK);
            tr62.setText("T");
            tr62.setForeground(Color.WHITE);
        } else {
            tr62.setBackground(Color.WHITE);
            tr62.setText("F");
            tr62.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr62ActionPerformed

    private void tr61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr61ActionPerformed
       if (tr61.isSelected()) {
            tr61.setBackground(Color.BLACK);
            tr61.setText("T");
            tr61.setForeground(Color.WHITE);
        } else {
            tr61.setBackground(Color.WHITE);
            tr61.setText("F");
            tr61.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr61ActionPerformed

    private void tr60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr60ActionPerformed
        if (tr60.isSelected()) {
            tr60.setBackground(Color.BLACK);
            tr60.setText("T");
            tr60.setForeground(Color.WHITE);
        } else {
            tr60.setBackground(Color.WHITE);
            tr60.setText("F");
            tr60.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr60ActionPerformed

    private void tr59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr59ActionPerformed
        if (tr59.isSelected()) {
            tr59.setBackground(Color.BLACK);
            tr59.setText("T");
            tr59.setForeground(Color.WHITE);
        } else {
            tr59.setBackground(Color.WHITE);
            tr59.setText("F");
            tr59.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr59ActionPerformed

    private void tr58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr58ActionPerformed
        if (tr58.isSelected()) {
            tr58.setBackground(Color.BLACK);
            tr58.setText("T");
            tr58.setForeground(Color.WHITE);
        } else {
            tr58.setBackground(Color.WHITE);
            tr58.setText("F");
            tr58.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr58ActionPerformed

    private void tr57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr57ActionPerformed
        if (tr57.isSelected()) {
            tr57.setBackground(Color.BLACK);
            tr57.setText("T");
            tr57.setForeground(Color.WHITE);
        } else {
            tr57.setBackground(Color.WHITE);
            tr57.setText("F");
            tr57.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr57ActionPerformed

    private void tr56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr56ActionPerformed
        if (tr56.isSelected()) {
            tr56.setBackground(Color.BLACK);
            tr56.setText("T");
            tr56.setForeground(Color.WHITE);
        } else {
            tr56.setBackground(Color.WHITE);
            tr56.setText("F");
            tr56.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr56ActionPerformed

    private void tr55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr55ActionPerformed
        if (tr55.isSelected()) {
            tr55.setBackground(Color.BLACK);
            tr55.setText("T");
            tr55.setForeground(Color.WHITE);
        } else {
            tr55.setBackground(Color.WHITE);
            tr55.setText("F");
            tr55.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr55ActionPerformed

    private void tr54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr54ActionPerformed
        if (tr54.isSelected()) {
            tr54.setBackground(Color.BLACK);
            tr54.setText("T");
            tr54.setForeground(Color.WHITE);
        } else {
            tr54.setBackground(Color.WHITE);
            tr54.setText("F");
            tr54.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr54ActionPerformed

    private void tr53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr53ActionPerformed
        if (tr53.isSelected()) {
            tr53.setBackground(Color.BLACK);
            tr53.setText("T");
            tr53.setForeground(Color.WHITE);
        } else {
            tr53.setBackground(Color.WHITE);
            tr53.setText("F");
            tr53.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr53ActionPerformed

    private void tr52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr52ActionPerformed
        if (tr52.isSelected()) {
            tr52.setBackground(Color.BLACK);
            tr52.setText("T");
            tr52.setForeground(Color.WHITE);
        } else {
            tr52.setBackground(Color.WHITE);
            tr52.setText("F");
            tr52.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr52ActionPerformed

    private void tr51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr51ActionPerformed
        if (tr51.isSelected()) {
            tr51.setBackground(Color.BLACK);
            tr51.setText("T");
            tr51.setForeground(Color.WHITE);
        } else {
            tr51.setBackground(Color.WHITE);
            tr51.setText("F");
            tr51.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr51ActionPerformed

    private void tr50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr50ActionPerformed
        if (tr50.isSelected()) {
            tr50.setBackground(Color.BLACK);
            tr50.setText("T");
            tr50.setForeground(Color.WHITE);
        } else {
            tr50.setBackground(Color.WHITE);
            tr50.setText("F");
            tr50.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr50ActionPerformed

    private void tr49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr49ActionPerformed
        if (tr49.isSelected()) {
            tr49.setBackground(Color.BLACK);
            tr49.setText("T");
            tr49.setForeground(Color.WHITE);
        } else {
            tr49.setBackground(Color.WHITE);
            tr49.setText("F");
            tr49.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr49ActionPerformed

    private void tr48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr48ActionPerformed
        if (tr48.isSelected()) {
            tr48.setBackground(Color.BLACK);
            tr48.setText("T");
            tr48.setForeground(Color.WHITE);
        } else {
            tr48.setBackground(Color.WHITE);
            tr48.setText("F");
            tr48.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr48ActionPerformed

    private void tr47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr47ActionPerformed
        if (tr47.isSelected()) {
            tr47.setBackground(Color.BLACK);
            tr47.setText("T");
            tr47.setForeground(Color.WHITE);
        } else {
            tr47.setBackground(Color.WHITE);
            tr47.setText("F");
            tr47.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr47ActionPerformed

    private void tr46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr46ActionPerformed
        if (tr46.isSelected()) {
            tr46.setBackground(Color.BLACK);
            tr46.setText("T");
            tr46.setForeground(Color.WHITE);
        } else {
            tr46.setBackground(Color.WHITE);
            tr46.setText("F");
            tr46.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr46ActionPerformed

    private void tr45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr45ActionPerformed
        if (tr45.isSelected()) {
            tr45.setBackground(Color.BLACK);
            tr45.setText("T");
            tr45.setForeground(Color.WHITE);
        } else {
            tr45.setBackground(Color.WHITE);
            tr45.setText("F");
            tr45.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr45ActionPerformed

    private void tr44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr44ActionPerformed
        if (tr44.isSelected()) {
            tr44.setBackground(Color.BLACK);
            tr44.setText("T");
            tr44.setForeground(Color.WHITE);
        } else {
            tr44.setBackground(Color.WHITE);
            tr44.setText("F");
            tr44.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr44ActionPerformed

    private void tr43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr43ActionPerformed
        if (tr43.isSelected()) {
            tr43.setBackground(Color.BLACK);
            tr43.setText("T");
            tr43.setForeground(Color.WHITE);
        } else {
            tr43.setBackground(Color.WHITE);
            tr43.setText("F");
            tr43.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr43ActionPerformed

    private void tr42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr42ActionPerformed
        if (tr42.isSelected()) {
            tr42.setBackground(Color.BLACK);
            tr42.setText("T");
            tr42.setForeground(Color.WHITE);
        } else {
            tr42.setBackground(Color.WHITE);
            tr42.setText("F");
            tr42.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr42ActionPerformed

    private void tr41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr41ActionPerformed
        if (tr41.isSelected()) {
            tr41.setBackground(Color.BLACK);
            tr41.setText("T");
            tr41.setForeground(Color.WHITE);
        } else {
            tr41.setBackground(Color.WHITE);
            tr41.setText("F");
            tr41.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr41ActionPerformed

    private void tr40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr40ActionPerformed
        if (tr40.isSelected()) {
            tr40.setBackground(Color.BLACK);
            tr40.setText("T");
            tr40.setForeground(Color.WHITE);
        } else {
            tr40.setBackground(Color.WHITE);
            tr40.setText("F");
            tr40.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr40ActionPerformed

    private void tr39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr39ActionPerformed
        if (tr39.isSelected()) {
            tr39.setBackground(Color.BLACK);
            tr39.setText("T");
            tr39.setForeground(Color.WHITE);
        } else {
            tr39.setBackground(Color.WHITE);
            tr39.setText("F");
            tr39.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr39ActionPerformed

    private void tr38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr38ActionPerformed
        if (tr38.isSelected()) {
            tr38.setBackground(Color.BLACK);
            tr38.setText("T");
            tr38.setForeground(Color.WHITE);
        } else {
            tr38.setBackground(Color.WHITE);
            tr38.setText("F");
            tr38.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr38ActionPerformed

    private void tr37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr37ActionPerformed
        if (tr37.isSelected()) {
            tr37.setBackground(Color.BLACK);
            tr37.setText("T");
            tr37.setForeground(Color.WHITE);
        } else {
            tr37.setBackground(Color.WHITE);
            tr37.setText("F");
            tr37.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr37ActionPerformed

    private void tr36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr36ActionPerformed
        if (tr36.isSelected()) {
            tr36.setBackground(Color.BLACK);
            tr36.setText("T");
            tr36.setForeground(Color.WHITE);
        } else {
            tr36.setBackground(Color.WHITE);
            tr36.setText("F");
            tr36.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr36ActionPerformed

    private void tr35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr35ActionPerformed
        if (tr35.isSelected()) {
            tr35.setBackground(Color.BLACK);
            tr35.setText("T");
            tr35.setForeground(Color.WHITE);
        } else {
            tr35.setBackground(Color.WHITE);
            tr35.setText("F");
            tr35.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr35ActionPerformed

    private void tr34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr34ActionPerformed
        if (tr34.isSelected()) {
            tr34.setBackground(Color.BLACK);
            tr34.setText("T");
            tr34.setForeground(Color.WHITE);
        } else {
            tr34.setBackground(Color.WHITE);
            tr34.setText("F");
            tr34.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr34ActionPerformed

    private void tr33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr33ActionPerformed
        if (tr33.isSelected()) {
            tr33.setBackground(Color.BLACK);
            tr33.setText("T");
            tr33.setForeground(Color.WHITE);
        } else {
            tr33.setBackground(Color.WHITE);
            tr33.setText("F");
            tr33.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr33ActionPerformed

    private void tr32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr32ActionPerformed
        if (tr32.isSelected()) {
            tr32.setBackground(Color.BLACK);
            tr32.setText("T");
            tr32.setForeground(Color.WHITE);
        } else {
            tr32.setBackground(Color.WHITE);
            tr32.setText("F");
            tr32.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr32ActionPerformed

    private void tr31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr31ActionPerformed
        if (tr31.isSelected()) {
            tr31.setBackground(Color.BLACK);
            tr31.setText("T");
            tr31.setForeground(Color.WHITE);
        } else {
            tr31.setBackground(Color.WHITE);
            tr31.setText("F");
            tr31.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr31ActionPerformed

    private void tr30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr30ActionPerformed
        if (tr30.isSelected()) {
            tr30.setBackground(Color.BLACK);
            tr30.setText("T");
            tr30.setForeground(Color.WHITE);
        } else {
            tr30.setBackground(Color.WHITE);
            tr30.setText("F");
            tr30.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr30ActionPerformed

    private void tr29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr29ActionPerformed
        if (tr29.isSelected()) {
            tr29.setBackground(Color.BLACK);
            tr29.setText("T");
            tr29.setForeground(Color.WHITE);
        } else {
            tr29.setBackground(Color.WHITE);
            tr29.setText("F");
            tr29.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr29ActionPerformed

    private void tr28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr28ActionPerformed
        if (tr28.isSelected()) {
            tr28.setBackground(Color.BLACK);
            tr28.setText("T");
            tr28.setForeground(Color.WHITE);
        } else {
            tr28.setBackground(Color.WHITE);
            tr28.setText("F");
            tr28.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr28ActionPerformed

    private void tr27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr27ActionPerformed
        if (tr27.isSelected()) {
            tr27.setBackground(Color.BLACK);
            tr27.setText("T");
            tr27.setForeground(Color.WHITE);
        } else {
            tr27.setBackground(Color.WHITE);
            tr27.setText("F");
            tr27.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr27ActionPerformed

    private void tr26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr26ActionPerformed
        if (tr26.isSelected()) {
            tr26.setBackground(Color.BLACK);
            tr26.setText("T");
            tr26.setForeground(Color.WHITE);
        } else {
            tr26.setBackground(Color.WHITE);
            tr26.setText("F");
            tr26.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr26ActionPerformed

    private void tr25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr25ActionPerformed
        if (tr25.isSelected()) {
            tr25.setBackground(Color.BLACK);
            tr25.setText("T");
            tr25.setForeground(Color.WHITE);
        } else {
            tr25.setBackground(Color.WHITE);
            tr25.setText("F");
            tr25.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr25ActionPerformed

    private void tr24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr24ActionPerformed
        if (tr24.isSelected()) {
            tr24.setBackground(Color.BLACK);
            tr24.setText("T");
            tr24.setForeground(Color.WHITE);
        } else {
            tr24.setBackground(Color.WHITE);
            tr24.setText("F");
            tr24.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr24ActionPerformed

    private void tr23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr23ActionPerformed
        if (tr23.isSelected()) {
            tr23.setBackground(Color.BLACK);
            tr23.setText("T");
            tr23.setForeground(Color.WHITE);
        } else {
            tr23.setBackground(Color.WHITE);
            tr23.setText("F");
            tr23.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr23ActionPerformed

    private void tr22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr22ActionPerformed
        if (tr22.isSelected()) {
            tr22.setBackground(Color.BLACK);
            tr22.setText("T");
            tr22.setForeground(Color.WHITE);
        } else {
            tr22.setBackground(Color.WHITE);
            tr22.setText("F");
            tr22.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr22ActionPerformed

    private void tr21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr21ActionPerformed
        if (tr21.isSelected()) {
            tr21.setBackground(Color.BLACK);
            tr21.setText("T");
            tr21.setForeground(Color.WHITE);
        } else {
            tr21.setBackground(Color.WHITE);
            tr21.setText("F");
            tr21.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr21ActionPerformed

    private void tr20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr20ActionPerformed
        if (tr20.isSelected()) {
            tr20.setBackground(Color.BLACK);
            tr20.setText("T");
            tr20.setForeground(Color.WHITE);
        } else {
            tr20.setBackground(Color.WHITE);
            tr20.setText("F");
            tr20.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr20ActionPerformed

    private void tr19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr19ActionPerformed
        if (tr19.isSelected()) {
            tr19.setBackground(Color.BLACK);
            tr19.setText("T");
            tr19.setForeground(Color.WHITE);
        } else {
            tr19.setBackground(Color.WHITE);
            tr19.setText("F");
            tr19.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr19ActionPerformed

    private void tr18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr18ActionPerformed
        if (tr18.isSelected()) {
            tr18.setBackground(Color.BLACK);
            tr18.setText("T");
            tr18.setForeground(Color.WHITE);
        } else {
            tr18.setBackground(Color.WHITE);
            tr18.setText("F");
            tr18.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr18ActionPerformed

    private void tr17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr17ActionPerformed
        if (tr17.isSelected()) {
            tr17.setBackground(Color.BLACK);
            tr17.setText("T");
            tr17.setForeground(Color.WHITE);
        } else {
            tr17.setBackground(Color.WHITE);
            tr17.setText("F");
            tr17.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr17ActionPerformed

    private void tr16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr16ActionPerformed
        if (tr16.isSelected()) {
            tr16.setBackground(Color.BLACK);
            tr16.setText("T");
            tr16.setForeground(Color.WHITE);
        } else {
            tr16.setBackground(Color.WHITE);
            tr16.setText("F");
            tr16.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr16ActionPerformed

    private void tr15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr15ActionPerformed
        if (tr15.isSelected()) {
            tr15.setBackground(Color.BLACK);
            tr15.setText("T");
            tr15.setForeground(Color.WHITE);
        } else {
            tr15.setBackground(Color.WHITE);
            tr15.setText("F");
            tr15.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr15ActionPerformed

    private void tr14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr14ActionPerformed
        if (tr14.isSelected()) {
            tr14.setBackground(Color.BLACK);
            tr14.setText("T");
            tr14.setForeground(Color.WHITE);
        } else {
            tr14.setBackground(Color.WHITE);
            tr14.setText("F");
            tr14.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr14ActionPerformed

    private void tr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr13ActionPerformed
        if (tr13.isSelected()) {
            tr13.setBackground(Color.BLACK);
            tr13.setText("T");
            tr13.setForeground(Color.WHITE);
        } else {
            tr13.setBackground(Color.WHITE);
            tr13.setText("F");
            tr13.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr13ActionPerformed

    private void tr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr12ActionPerformed
        if (tr12.isSelected()) {
            tr12.setBackground(Color.BLACK);
            tr12.setText("T");
            tr12.setForeground(Color.WHITE);
        } else {
            tr12.setBackground(Color.WHITE);
            tr12.setText("F");
            tr12.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr12ActionPerformed

    private void tr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr11ActionPerformed
        if (tr11.isSelected()) {
            tr11.setBackground(Color.BLACK);
            tr11.setText("T");
            tr11.setForeground(Color.WHITE);
        } else {
            tr11.setBackground(Color.WHITE);
            tr11.setText("F");
            tr11.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr11ActionPerformed

    private void tr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr10ActionPerformed
        if (tr10.isSelected()) {
            tr10.setBackground(Color.BLACK);
            tr10.setText("T");
            tr10.setForeground(Color.WHITE);
        } else {
            tr10.setBackground(Color.WHITE);
            tr10.setText("F");
            tr10.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr10ActionPerformed

    private void tr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr9ActionPerformed
        if (tr9.isSelected()) {
            tr9.setBackground(Color.BLACK);
            tr9.setText("T");
            tr9.setForeground(Color.WHITE);
        } else {
            tr9.setBackground(Color.WHITE);
            tr9.setText("F");
            tr9.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr9ActionPerformed

    private void tr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr8ActionPerformed
        if (tr8.isSelected()) {
            tr8.setBackground(Color.BLACK);
            tr8.setText("T");
            tr8.setForeground(Color.WHITE);
        } else {
            tr8.setBackground(Color.WHITE);
            tr8.setText("F");
            tr8.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr8ActionPerformed

    private void tr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr7ActionPerformed
        if (tr7.isSelected()) {
            tr7.setBackground(Color.BLACK);
            tr7.setText("T");
            tr7.setForeground(Color.WHITE);
        } else {
            tr7.setBackground(Color.WHITE);
            tr7.setText("F");
            tr7.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr7ActionPerformed

    private void tr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr6ActionPerformed
        if (tr6.isSelected()) {
            tr6.setBackground(Color.BLACK);
            tr6.setText("T");
            tr6.setForeground(Color.WHITE);
        } else {
            tr6.setBackground(Color.WHITE);
            tr6.setText("F");
            tr6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr6ActionPerformed

    private void tr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr5ActionPerformed
        if (tr5.isSelected()) {
            tr5.setBackground(Color.BLACK);
            tr5.setText("T");
            tr5.setForeground(Color.WHITE);
        } else {
            tr5.setBackground(Color.WHITE);
            tr5.setText("F");
            tr5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr5ActionPerformed

    private void tr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr4ActionPerformed
        if (tr4.isSelected()) {
            tr4.setBackground(Color.BLACK);
            tr4.setText("T");
            tr4.setForeground(Color.WHITE);
        } else {
            tr4.setBackground(Color.WHITE);
            tr4.setText("F");
            tr4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr4ActionPerformed

    private void tr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr3ActionPerformed
        if (tr3.isSelected()) {
            tr3.setBackground(Color.BLACK);
            tr3.setText("T");
            tr3.setForeground(Color.WHITE);
        } else {
            tr3.setBackground(Color.WHITE);
            tr3.setText("F");
            tr3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr3ActionPerformed

    private void tr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr2ActionPerformed
        if (tr2.isSelected()) {
            tr2.setBackground(Color.BLACK);
            tr2.setText("T");
            tr2.setForeground(Color.WHITE);
        } else {
            tr2.setBackground(Color.WHITE);
            tr2.setText("F");
            tr2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr2ActionPerformed

    private void tr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr1ActionPerformed
        if (tr1.isSelected()) {
            tr1.setBackground(Color.BLACK);
            tr1.setText("T");
            tr1.setForeground(Color.WHITE);
        } else {
            tr1.setBackground(Color.WHITE);
            tr1.setText("F");
            tr1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr1ActionPerformed

    private void tr63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr63ActionPerformed
        if (tr63.isSelected()) {
            tr63.setBackground(Color.BLACK);
            tr63.setText("T");
            tr63.setForeground(Color.WHITE);
        } else {
            tr63.setBackground(Color.WHITE);
            tr63.setText("F");
            tr63.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tr63ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Testing testing = new Testing( biastestY, wtest ,biastestZ,vtest, Huruf, t, p, hidden);
        testing.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tr_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_clearActionPerformed

        tr1.setSelected(false);
        tr1.setBackground(Color.WHITE);
        tr2.setSelected(false);
        tr2.setBackground(Color.WHITE);
        tr3.setSelected(false);
        tr3.setBackground(Color.WHITE);
        tr4.setSelected(false);
        tr4.setBackground(Color.WHITE);
        tr5.setSelected(false);
        tr5.setBackground(Color.WHITE);
        tr6.setSelected(false);
        tr6.setBackground(Color.WHITE);
        tr7.setSelected(false);
        tr7.setBackground(Color.WHITE);
        tr8.setSelected(false);
        tr8.setBackground(Color.WHITE);
        tr9.setSelected(false);
        tr9.setBackground(Color.WHITE);
        tr10.setSelected(false);
        tr10.setBackground(Color.WHITE);
        tr11.setSelected(false);
        tr11.setBackground(Color.WHITE);
        tr12.setSelected(false);
        tr12.setBackground(Color.WHITE);
        tr13.setSelected(false);
        tr13.setBackground(Color.WHITE);
        tr14.setSelected(false);
        tr14.setBackground(Color.WHITE);
        tr15.setSelected(false);
        tr15.setBackground(Color.WHITE);
        tr16.setSelected(false);
        tr16.setBackground(Color.WHITE);
        tr17.setSelected(false);
        tr17.setBackground(Color.WHITE);
        tr18.setSelected(false);
        tr18.setBackground(Color.WHITE);
        tr19.setSelected(false);
        tr19.setBackground(Color.WHITE);
        tr20.setSelected(false);
        tr20.setBackground(Color.WHITE);
        tr21.setSelected(false);
        tr21.setBackground(Color.WHITE);
        tr22.setSelected(false);
        tr22.setBackground(Color.WHITE);
        tr23.setSelected(false);
        tr23.setBackground(Color.WHITE);
        tr24.setSelected(false);
        tr24.setBackground(Color.WHITE);
        tr25.setSelected(false);
        tr25.setBackground(Color.WHITE);
        tr26.setSelected(false);
        tr26.setBackground(Color.WHITE);
        tr27.setSelected(false);
        tr27.setBackground(Color.WHITE);
        tr28.setSelected(false);
        tr28.setBackground(Color.WHITE);
        tr29.setSelected(false);
        tr29.setBackground(Color.WHITE);
        tr30.setSelected(false);
        tr30.setBackground(Color.WHITE);
        tr31.setSelected(false);
        tr31.setBackground(Color.WHITE);
        tr32.setSelected(false);
        tr32.setBackground(Color.WHITE);
        tr33.setSelected(false);
        tr33.setBackground(Color.WHITE);
        tr34.setSelected(false);
        tr34.setBackground(Color.WHITE);
        tr35.setSelected(false);
        tr35.setBackground(Color.WHITE);
        tr36.setSelected(false);
        tr36.setBackground(Color.WHITE);
        tr37.setSelected(false);
        tr37.setBackground(Color.WHITE);
        tr38.setSelected(false);
        tr38.setBackground(Color.WHITE);
        tr39.setSelected(false);
        tr39.setBackground(Color.WHITE);
        tr40.setSelected(false);
        tr40.setBackground(Color.WHITE);
        tr41.setSelected(false);
        tr41.setBackground(Color.WHITE);
        tr42.setSelected(false);
        tr42.setBackground(Color.WHITE);
        tr43.setSelected(false);
        tr43.setBackground(Color.WHITE);
        tr44.setSelected(false);
        tr44.setBackground(Color.WHITE);
        tr45.setSelected(false);
        tr45.setBackground(Color.WHITE);
        tr46.setSelected(false);
        tr46.setBackground(Color.WHITE);
        tr47.setSelected(false);
        tr47.setBackground(Color.WHITE);
        tr48.setSelected(false);
        tr48.setBackground(Color.WHITE);
        tr49.setSelected(false);
        tr49.setBackground(Color.WHITE);
        tr50.setSelected(false);
        tr50.setBackground(Color.WHITE);
        tr51.setSelected(false);
        tr51.setBackground(Color.WHITE);
        tr52.setSelected(false);
        tr52.setBackground(Color.WHITE);
        tr53.setSelected(false);
        tr53.setBackground(Color.WHITE);
        tr54.setSelected(false);
        tr54.setBackground(Color.WHITE);
        tr55.setSelected(false);
        tr55.setBackground(Color.WHITE);
        tr56.setSelected(false);
        tr56.setBackground(Color.WHITE);
        tr57.setSelected(false);
        tr57.setBackground(Color.WHITE);
        tr58.setSelected(false);
        tr58.setBackground(Color.WHITE);
        tr59.setSelected(false);
        tr59.setBackground(Color.WHITE);
        tr60.setSelected(false);
        tr60.setBackground(Color.WHITE);
        tr61.setSelected(false);
        tr61.setBackground(Color.WHITE);
        tr62.setSelected(false);
        tr62.setBackground(Color.WHITE);
        tr63.setSelected(false);
        tr63.setBackground(Color.WHITE);

        t1.setSelected(false);
        t1.setBackground(Color.WHITE);
        t2.setSelected(false);
        t2.setBackground(Color.WHITE);
        t3.setSelected(false);
        t3.setBackground(Color.WHITE);
        t4.setSelected(false);
        t4.setBackground(Color.WHITE);
        t5.setSelected(false);
        t5.setBackground(Color.WHITE);
        t6.setSelected(false);
        t6.setBackground(Color.WHITE);
        t7.setSelected(false);
        t7.setBackground(Color.WHITE);

        tr1.setText("F");
        tr1.setForeground(Color.BLACK);
        tr2.setText("F");
        tr2.setForeground(Color.BLACK);
        tr3.setText("F");
        tr3.setForeground(Color.BLACK);
        tr4.setText("F");
        tr4.setForeground(Color.BLACK);
        tr5.setText("F");
        tr5.setForeground(Color.BLACK);
        tr6.setText("F");
        tr6.setForeground(Color.BLACK);
        tr7.setText("F");
        tr7.setForeground(Color.BLACK);
        tr8.setText("F");
        tr8.setForeground(Color.BLACK);
        tr9.setText("F");
        tr9.setForeground(Color.BLACK);
        tr10.setText("F");
        tr10.setForeground(Color.BLACK);
        tr11.setText("F");
        tr11.setForeground(Color.BLACK);
        tr12.setText("F");
        tr12.setForeground(Color.BLACK);
        tr13.setText("F");
        tr13.setForeground(Color.BLACK);
        tr14.setText("F");
        tr14.setForeground(Color.BLACK);
        tr15.setText("F");
        tr15.setForeground(Color.BLACK);
        tr16.setText("F");
        tr16.setForeground(Color.BLACK);
        tr17.setText("F");
        tr17.setForeground(Color.BLACK);
        tr18.setText("F");
        tr18.setForeground(Color.BLACK);
        tr19.setText("F");
        tr19.setForeground(Color.BLACK);
        tr20.setText("F");
        tr20.setForeground(Color.BLACK);
        tr21.setText("F");
        tr21.setForeground(Color.BLACK);
        tr22.setText("F");
        tr22.setForeground(Color.BLACK);
        tr23.setText("F");
        tr23.setForeground(Color.BLACK);
        tr24.setText("F");
        tr24.setForeground(Color.BLACK);
        tr25.setText("F");
        tr25.setForeground(Color.BLACK);
        tr26.setText("F");
        tr26.setForeground(Color.BLACK);
        tr27.setText("F");
        tr27.setForeground(Color.BLACK);
        tr28.setText("F");
        tr28.setForeground(Color.BLACK);
        tr29.setText("F");
        tr29.setForeground(Color.BLACK);
        tr30.setText("F");
        tr30.setForeground(Color.BLACK);
        tr31.setText("F");
        tr31.setForeground(Color.BLACK);
        tr32.setText("F");
        tr32.setForeground(Color.BLACK);
        tr33.setText("F");
        tr33.setForeground(Color.BLACK);
        tr34.setText("F");
        tr34.setForeground(Color.BLACK);
        tr35.setText("F");
        tr35.setForeground(Color.BLACK);
        tr36.setText("F");
        tr36.setForeground(Color.BLACK);
        tr37.setText("F");
        tr37.setForeground(Color.BLACK);
        tr38.setText("F");
        tr38.setForeground(Color.BLACK);
        tr39.setText("F");
        tr39.setForeground(Color.BLACK);
        tr40.setText("F");
        tr40.setForeground(Color.BLACK);
        tr41.setText("F");
        tr41.setForeground(Color.BLACK);
        tr42.setText("F");
        tr42.setForeground(Color.BLACK);
        tr43.setText("F");
        tr43.setForeground(Color.BLACK);
        tr44.setText("F");
        tr44.setForeground(Color.BLACK);
        tr45.setText("F");
        tr45.setForeground(Color.BLACK);
        tr46.setText("F");
        tr46.setForeground(Color.BLACK);
        tr47.setText("F");
        tr47.setForeground(Color.BLACK);
        tr48.setText("F");
        tr48.setForeground(Color.BLACK);
        tr49.setText("F");
        tr49.setForeground(Color.BLACK);
        tr50.setText("F");
        tr50.setForeground(Color.BLACK);
        tr51.setText("F");
        tr51.setForeground(Color.BLACK);
        tr52.setText("F");
        tr52.setForeground(Color.BLACK);
        tr53.setText("F");
        tr53.setForeground(Color.BLACK);
        tr54.setText("F");
        tr54.setForeground(Color.BLACK);
        tr55.setText("F");
        tr55.setForeground(Color.BLACK);
        tr56.setText("F");
        tr56.setForeground(Color.BLACK);
        tr57.setText("F");
        tr57.setForeground(Color.BLACK);
        tr58.setText("F");
        tr58.setForeground(Color.BLACK);
        tr59.setText("F");
        tr59.setForeground(Color.BLACK);
        tr60.setText("F");
        tr60.setForeground(Color.BLACK);
        tr61.setText("F");
        tr61.setForeground(Color.BLACK);
        tr62.setText("F");
        tr62.setForeground(Color.BLACK);
        tr63.setText("F");
        tr63.setForeground(Color.BLACK);
        
        t1.setText("F");
        t1.setForeground(Color.BLACK);
        t2.setText("F");
        t2.setForeground(Color.BLACK);
        t3.setText("F");
        t3.setForeground(Color.BLACK);
        t4.setText("F");
        t4.setForeground(Color.BLACK);
        t5.setText("F");
        t5.setForeground(Color.BLACK);
        t6.setText("F");
        t6.setForeground(Color.BLACK);
        t7.setText("F");
        t7.setForeground(Color.BLACK);
   
        tr_huruf.setText("");
        
        tr_iterasi.enable(true);
        tr_huruf.enable(true);
        tr_alpha1.enable(true);

        JOptionPane.showMessageDialog(null, "Refresh sukses");
    }//GEN-LAST:event_tr_clearActionPerformed

    private void tr_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_clearMouseClicked

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
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JRadioButton radio_biner;
    private javax.swing.JRadioButton radio_bipolar;
    private javax.swing.JToggleButton t1;
    private javax.swing.JToggleButton t2;
    private javax.swing.JToggleButton t3;
    private javax.swing.JToggleButton t4;
    private javax.swing.JToggleButton t5;
    private javax.swing.JToggleButton t6;
    private javax.swing.JToggleButton t7;
    private javax.swing.JToggleButton tr1;
    private javax.swing.JToggleButton tr10;
    private javax.swing.JToggleButton tr11;
    private javax.swing.JToggleButton tr12;
    private javax.swing.JToggleButton tr13;
    private javax.swing.JToggleButton tr14;
    private javax.swing.JToggleButton tr15;
    private javax.swing.JToggleButton tr16;
    private javax.swing.JToggleButton tr17;
    private javax.swing.JToggleButton tr18;
    private javax.swing.JToggleButton tr19;
    private javax.swing.JToggleButton tr2;
    private javax.swing.JToggleButton tr20;
    private javax.swing.JToggleButton tr21;
    private javax.swing.JToggleButton tr22;
    private javax.swing.JToggleButton tr23;
    private javax.swing.JToggleButton tr24;
    private javax.swing.JToggleButton tr25;
    private javax.swing.JToggleButton tr26;
    private javax.swing.JToggleButton tr27;
    private javax.swing.JToggleButton tr28;
    private javax.swing.JToggleButton tr29;
    private javax.swing.JToggleButton tr3;
    private javax.swing.JToggleButton tr30;
    private javax.swing.JToggleButton tr31;
    private javax.swing.JToggleButton tr32;
    private javax.swing.JToggleButton tr33;
    private javax.swing.JToggleButton tr34;
    private javax.swing.JToggleButton tr35;
    private javax.swing.JToggleButton tr36;
    private javax.swing.JToggleButton tr37;
    private javax.swing.JToggleButton tr38;
    private javax.swing.JToggleButton tr39;
    private javax.swing.JToggleButton tr4;
    private javax.swing.JToggleButton tr40;
    private javax.swing.JToggleButton tr41;
    private javax.swing.JToggleButton tr42;
    private javax.swing.JToggleButton tr43;
    private javax.swing.JToggleButton tr44;
    private javax.swing.JToggleButton tr45;
    private javax.swing.JToggleButton tr46;
    private javax.swing.JToggleButton tr47;
    private javax.swing.JToggleButton tr48;
    private javax.swing.JToggleButton tr49;
    private javax.swing.JToggleButton tr5;
    private javax.swing.JToggleButton tr50;
    private javax.swing.JToggleButton tr51;
    private javax.swing.JToggleButton tr52;
    private javax.swing.JToggleButton tr53;
    private javax.swing.JToggleButton tr54;
    private javax.swing.JToggleButton tr55;
    private javax.swing.JToggleButton tr56;
    private javax.swing.JToggleButton tr57;
    private javax.swing.JToggleButton tr58;
    private javax.swing.JToggleButton tr59;
    private javax.swing.JToggleButton tr6;
    private javax.swing.JToggleButton tr60;
    private javax.swing.JToggleButton tr61;
    private javax.swing.JToggleButton tr62;
    private javax.swing.JToggleButton tr63;
    private javax.swing.JToggleButton tr7;
    private javax.swing.JToggleButton tr8;
    private javax.swing.JToggleButton tr9;
    private javax.swing.JTextField tr_alpha1;
    private javax.swing.JButton tr_clear;
    private javax.swing.JTextField tr_hidden;
    private javax.swing.JTextField tr_huruf;
    private javax.swing.JTextField tr_iterasi;
    private javax.swing.JButton tr_save;
    private javax.swing.JButton tr_training;
    // End of variables declaration//GEN-END:variables
}
