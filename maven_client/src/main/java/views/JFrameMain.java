/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.Product;
import servicios.ClientServices;

/**
 * @author juanruiz
 * @author mafemartinez
 * @author angiecarolinagomezacosta
 */
public class JFrameMain extends javax.swing.JFrame {

    ArrayList<Product> productList = new ArrayList<>();
    ClientServices clientService = new ClientServices();
    Thread thread = new Thread();

    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        initComponents();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                while (true) {
                    
                    try {
                        Thread.sleep(4000);

                        Product product = new Product();
                        
                        Boolean flag = false;
                        
                        productList = clientService.listAllProducts();
                        for (Product objProduct : productList) {
                            if (objProduct.getStatus().equals("En subasta")) {
                                flag = true;
                                break;
                            }
                        }

                        if (flag) {
                            product = clientService.getAuctionProduct();

                            if (product != null) {
                                jTFCodP.setText(String.valueOf(product.getCod()));
                                jTFNombreP.setText(product.getName());
                                jTFEstadoP.setText(product.getStatus());
                                jTFValor.setText("$ " + String.valueOf(product.getValue()));

                            } else {
                                JOptionPane.showMessageDialog(null, "No hay un producto que esté siendo subastado.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay un producto que esté siendo subastado.");
                        }

                        System.out.println("Actualizado.");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread = new Thread(runnable);
        thread.start();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanelMain = new javax.swing.JPanel();
        Inicio = new javax.swing.JTabbedPane();
        Productos = new javax.swing.JPanel();
        jPanelListarP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnListarP = new javax.swing.JButton();
        jPanelRegistrarP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNombrePr = new javax.swing.JTextField();
        jTFCodPr = new javax.swing.JTextField();
        jTFValorInicialP = new javax.swing.JTextField();
        btnConsultarP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFEstadoP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Subastas = new javax.swing.JPanel();
        jPanelListarS = new javax.swing.JPanel();
        btnOfrecer = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFValorPuja = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanelCrearS = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCodP = new javax.swing.JTextField();
        btnSubastar = new javax.swing.JButton();
        btnCerrarS = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTFNombreP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFEstadoPr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        CerrarSesión = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Inicio.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N

        jPanelListarP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Estado", "Valor Inicial"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane1.setViewportView(jScrollPane2);

        btnListarP.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnListarP.setText("Listar");
        btnListarP.setActionCommand("");

        btnListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListarPLayout = new javax.swing.GroupLayout(jPanelListarP);
        jPanelListarP.setLayout(jPanelListarPLayout);
        jPanelListarPLayout.setHorizontalGroup(
            jPanelListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarPLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListarPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        jPanelListarPLayout.setVerticalGroup(
            jPanelListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarPLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRegistrarP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 14))); // NOI18N

        jLabel1.setText("Nombre:");

        jLabel2.setText("Código:");

        jLabel3.setText("Valor Inicial:");

        jTFNombrePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombrePrActionPerformed(evt);
            }
        });



        btnConsultarP.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnConsultarP.setText("Consultar");
        btnConsultarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPActionPerformed(evt);
            }
        });

        jLabel7.setText("Por favor, ingrese el nombre del producto que desea consultar.");

        jLabel8.setText("Estado:");

        jLabel9.setText("A continuación los datos del producto:");

        javax.swing.GroupLayout jPanelRegistrarPLayout = new javax.swing.GroupLayout(jPanelRegistrarP);
        jPanelRegistrarP.setLayout(jPanelRegistrarPLayout);
        jPanelRegistrarPLayout.setHorizontalGroup(
            jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addGroup(jPanelRegistrarPLayout.createSequentialGroup()
                        .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombrePr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFValorInicialP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRegistrarPLayout.createSequentialGroup()
                                .addComponent(jTFCodPr, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(btnConsultarP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelRegistrarPLayout.setVerticalGroup(
            jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarPLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombrePr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFCodPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jTFEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistrarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTFValorInicialP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos);
        Productos.setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelListarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelListarP, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanelRegistrarP.getAccessibleContext().setAccessibleParent(jPanelRegistrarP);

        Inicio.addTab("Productos", Productos);

        jPanelListarS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "¿Desea realizar una puja?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 14))); // NOI18N

        btnOfrecer.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnOfrecer.setText("Ofrecer");
        btnOfrecer.setActionCommand("");
        
        btnOfrecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfrecerPActionPerformed(evt);
            }
        });

        jLabel13.setText("Digite los siguientes datos:");

        jLabel14.setText("Valor de la puja:");

        jLabel15.setText("Nota: ¡Atención! El valor de la oferta diligenciado debe ser mayor al valor de la oferta ya realizada.");

        javax.swing.GroupLayout jPanelListarSLayout = new javax.swing.GroupLayout(jPanelListarS);
        jPanelListarS.setLayout(jPanelListarSLayout);
        jPanelListarSLayout.setHorizontalGroup(
            jPanelListarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarSLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelListarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanelListarSLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTFValorPuja, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOfrecer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelListarSLayout.setVerticalGroup(
            jPanelListarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListarSLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addGap(23, 23, 23)
                .addGroup(jPanelListarSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTFValorPuja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOfrecer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanelCrearS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Subasta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 14))); // NOI18N

        jLabel4.setText("Datos del producto actualmente ofertado:");

        jLabel5.setText("Código:");

        btnSubastar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnSubastar.setText("Ver");

        btnSubastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubastarPActionPerformed(evt);
            }
        });

        btnCerrarS.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCerrarS.setText("Cerrar Subasta");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Estado:");

        jLabel12.setText("Valor actual:");

        javax.swing.GroupLayout jPanelCrearSLayout = new javax.swing.GroupLayout(jPanelCrearS);
        jPanelCrearS.setLayout(jPanelCrearSLayout);
        jPanelCrearSLayout.setHorizontalGroup(
            jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearSLayout.createSequentialGroup()
                .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearSLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnSubastar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarS))
                    .addGroup(jPanelCrearSLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCrearSLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFEstadoPr, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCrearSLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFCodP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCrearSLayout.setVerticalGroup(
            jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearSLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCodP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTFNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFEstadoPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelCrearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubastar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout SubastasLayout = new javax.swing.GroupLayout(Subastas);
        Subastas.setLayout(SubastasLayout);
        SubastasLayout.setHorizontalGroup(
            SubastasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubastasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(SubastasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelListarS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCrearS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        SubastasLayout.setVerticalGroup(
            SubastasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubastasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelCrearS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelListarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Inicio.addTab("Subastas", Subastas);

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel6.setText("¡Hasta Pronto!");

        javax.swing.GroupLayout CerrarSesiónLayout = new javax.swing.GroupLayout(CerrarSesión);
        CerrarSesión.setLayout(CerrarSesiónLayout);
        CerrarSesiónLayout.setHorizontalGroup(
            CerrarSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CerrarSesiónLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(261, 261, 261))
        );
        CerrarSesiónLayout.setVerticalGroup(
            CerrarSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CerrarSesiónLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel6)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        Inicio.addTab("Cerrar Sesión", CerrarSesión);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio)
        );

        Inicio.getAccessibleContext().setAccessibleName("Inicio");

        getContentPane().add(jPanelMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombrePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombrePrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombrePrActionPerformed


    private void btnListarPActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnListarPActionPerformed
        productList = clientService.listAllProducts();
        Object[] data = new Object[productList.size()];

        for(int i = 0; i < productList.size(); i++){
            data[i] = productList.get(i);
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                data
            },
            new String [] {
                "Código", "Nombre", "Estado", "Valor Inicial"
            }
        ));

    }//GEN-LAST:event_btnListarPActionPerformed

    private void btnConsultarPActionPerformed(java.awt.event.ActionEvent evt){
        if(!jTFNombreP.getText().isEmpty()){
            Product product = clientService.findProduct(jTFNombreP.getText());

            if(product != null){
                jTFCodPr.setText(product.getCod().toString());
                jTFEstadoPr.setText(product.getStatus());
                jTFValorInicialP.setText(String.valueOf(product.getValue()));
            }else{
                JOptionPane.showMessageDialog(this, "El producto ingresado no existe");
            }

        }else{
            JOptionPane.showMessageDialog(this, "Rellene el campo de nombre");
        }

    }

    private void btnSubastarPActionPerformed(java.awt.event.ActionEvent evt){

        productList = clientService.listAllProducts();
        boolean flag = false;

        for(Product objProduct : productList){
            if(objProduct.getStatus().equals("En Subasta")){
                flag = true;
                break;
            }
        }

        if(flag){
            Product auctionProduct = clientService.getAuctionProduct();
            if(auctionProduct != null){
                jTFNombreP.setText(auctionProduct.getName());
                jTFCodP.setText(auctionProduct.getCod().toString());
                jTFValor.setText(String.valueOf(auctionProduct.getValue()));
                jTFEstadoP.setText(auctionProduct.getStatus());
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún producto en subasta actualmente");
        }
        
    }

    private void btnOfrecerPActionPerformed(java.awt.event.ActionEvent evt){
        boolean flag = false;

        if(!jTFValorPuja.getText().isEmpty()){
            int value = 0;
            try {
                value = Integer.parseInt(jTFValorPuja.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "El valor debe ser un número");
            }
            
            for(Product objProduct : productList){
                if(objProduct.getStatus().equals("En Subasta")){
                    flag = true;
                    break;
                }
            }

            if(flag){
                
                Product product = clientService.getAuctionProduct();

                if(product.getValue() < value){
                    Product newProduct = clientService.sendOffer(value, product);
                    if(newProduct != null){
                        JOptionPane.showMessageDialog(this, "La Puja ha sido aceptada");
                        jTFCodP.setText(String.valueOf(newProduct.getCod()));
                        jTFNombreP.setText(newProduct.getName());
                        jTFEstadoP.setText(newProduct.getStatus());
                        jTFValor.setText("$ " + String.valueOf(newProduct.getValue()));
                        jTFValorPuja.setText("");
                    }else{
                        JOptionPane.showMessageDialog(this, "No se encontró el producto");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "La puja lanzada debe ser mayor a la actual");
                }
            }else{
                JOptionPane.showMessageDialog(this, "No hay ningún producto en subasta actualmente");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese una puja primero");
        }


    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CerrarSesión;
    private javax.swing.JTabbedPane Inicio;
    private javax.swing.JPanel Productos;
    private javax.swing.JPanel Subastas;
    private javax.swing.JButton btnCerrarS;
    private javax.swing.JButton btnConsultarP;
    private javax.swing.JButton btnListarP;
    private javax.swing.JButton btnOfrecer;
    private javax.swing.JButton btnSubastar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCrearS;
    private javax.swing.JPanel jPanelListarP;
    private javax.swing.JPanel jPanelListarS;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelRegistrarP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCodP;
    private javax.swing.JTextField jTFCodPr;
    private javax.swing.JTextField jTFEstadoP;
    private javax.swing.JTextField jTFEstadoPr;
    private javax.swing.JTextField jTFNombreP;
    private javax.swing.JTextField jTFNombrePr;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JTextField jTFValorInicialP;
    private javax.swing.JTextField jTFValorPuja;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
