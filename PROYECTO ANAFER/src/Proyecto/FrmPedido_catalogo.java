
package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmPedido_catalogo extends javax.swing.JFrame {


    public FrmPedido_catalogo() {
        initComponents();
        this.setLocationRelativeTo(null);
               getContentPane().setBackground(new java.awt.Color(255,255,255));
        cargar();
        cargarCodigoPedido();
        cargarCodigoPedido2();
        cargarNombrePedido();
        cargarCodigoMaterial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnNombrePedido = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnCodigoPedido = new javax.swing.JButton();
        btnTodo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnVistaMaterial = new javax.swing.JButton();
        btnVistaPedido = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cboMaterial = new javax.swing.JComboBox<>();
        cboPedido = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MANUALIDADES ANAFER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Atras.png"))); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("CONSULTAR");

        jLabel4.setText("POR NOMBRE DE PEDIDO");

        btnNombrePedido.setText("CONSULTAR");
        btnNombrePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombrePedidoActionPerformed(evt);
            }
        });

        jLabel5.setText("POR CODIGO DE PEDIDO");

        btnCodigoPedido.setText("CONSULTAR");
        btnCodigoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNombrePedido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCodigoPedido, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNombrePedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCodigoPedido)
                .addGap(30, 30, 30))
        );

        btnTodo.setText("Cargar Todo");
        btnTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVistaMaterial.setText("VISTA MATERIAL");
        btnVistaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaMaterialActionPerformed(evt);
            }
        });

        btnVistaPedido.setText("VISTA PEDIDO");
        btnVistaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVistaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVistaMaterial)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnVistaMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVistaPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("MATERIALES NECESARIOS PARA EL PEDIDO");

        jLabel1.setText("CODIGO DE PEDIDO");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("CODIGO DE MATERIAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnGuardar))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda.png"))); // NOI18N
        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SETTNG1.png"))); // NOI18N
        jMenu3.setText("Configuracion");

        jMenuItem2.setText("Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/candado.png"))); // NOI18N
        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sal.png"))); // NOI18N
        jMenuItem13.setText("Salir");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Catalogo Materiales");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Almacenes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Stock");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Pedidos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Materiales Para Pedido");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(138, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRegresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnTodo)))
                        .addGap(0, 337, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void cargarCodigoPedido()
    {
            String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct cod_ped from pedido";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
                      while(miResultSet.next()){
                cboPedido.addItem(miResultSet.getString("cod_ped"));
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error encontrado : "+e.getMessage());   
        }
    }
      private void cargarCodigoMaterial()
    {
           String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct cod_cat from catalogo";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
                      while(miResultSet.next()){
                cboMaterial.addItem(miResultSet.getString("cod_cat"));
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error encontrado : "+e.getMessage());   
        }
    }
        private void cargarCodigoPedido2()
    {
     String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct cod_ped from pedido";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
                      while(miResultSet.next()){
                jComboBox2.addItem(miResultSet.getString("cod_ped"));
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error encontrado : "+e.getMessage());   
        }
    }
        private void cargarNombrePedido()
    {
           String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct nom_ped from pedido";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
                      while(miResultSet.next()){
                jComboBox1.addItem(miResultSet.getString("nom_ped"));
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error encontrado : "+e.getMessage());   
        }
    }
     private void cargar()
    {
           String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct pedido_catalogo.cod_ped AS CODIGO_PEDIDO,nom_ped AS NOMBRE_PEDIDO,pedido_catalogo.cod_cat AS CODIGO_MATERIAL,nom_cat AS NOMBRE_MATERIAL from pedido_catalogo  join pedido  on(pedido_catalogo.COD_PED=pedido.cod_ped) join catalogo on(pedido_catalogo.cod_cat=catalogo.cod_cat)";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
            Vector miListaDeCampos=new Vector();
            int numeroDeCampos;
            ResultSetMetaData miMetaData;
            miMetaData=miResultSet.getMetaData();
            numeroDeCampos=miMetaData.getColumnCount();
            
            for(int i=0;i<miMetaData.getColumnCount();i++){
               miListaDeCampos.add(miMetaData.getColumnName(i+1));
            }
            DefaultTableModel miDefaultTableModel=new DefaultTableModel(miListaDeCampos,0);
            int cont=0;
            while(miResultSet.next())
            {
                cont++;
                Object[] miRenglon=new Object[numeroDeCampos];
                for(int i=0;i<numeroDeCampos;i++)
                {
                miRenglon[i]=miResultSet.getObject(i+1);    
                }
                miDefaultTableModel.addRow(miRenglon);
            }
            tblTabla.setModel(miDefaultTableModel);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error encontrado : "+e.getMessage());
   
        }
    }
     
     private void guardar()
    {
         String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="INSERT INTO pedido_catalogo VALUES ('"+cboPedido.getSelectedItem()+"','"+cboMaterial.getSelectedItem()+"')";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog(null, "Error encontrado : "+e.getMessage()); 
        }
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    this.dispose();
    FrmGestionMaterial f=new FrmGestionMaterial();
    f.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      guardar();
      cargar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNombrePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombrePedidoActionPerformed
         String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct pedido_catalogo.cod_ped AS CODIGO_PEDIDO,nom_ped AS NOMBRE_PEDIDO,pedido_catalogo.cod_cat AS CODIGO_MATERIAL,nom_cat AS NOMBRE_MATERIAL from pedido_catalogo  join pedido  on(pedido_catalogo.COD_PED=pedido.cod_ped) join catalogo on(pedido_catalogo.cod_cat=catalogo.cod_cat) where nom_ped='"+jComboBox1.getSelectedItem()+"'";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                )
        {
            Vector miListaDeCampos=new Vector();
            int numeroDeCampos;
            ResultSetMetaData miMetaData;
            miMetaData=miResultSet.getMetaData();
            numeroDeCampos=miMetaData.getColumnCount();
            
            for(int i=0;i<miMetaData.getColumnCount();i++){
               miListaDeCampos.add(miMetaData.getColumnName(i+1));
            }
            DefaultTableModel miDefaultTableModel=new DefaultTableModel(miListaDeCampos,0);
            int cont=0;
            while(miResultSet.next())
            {
                cont++;
                Object[] miRenglon=new Object[numeroDeCampos];
                for(int i=0;i<numeroDeCampos;i++)
                {
                miRenglon[i]=miResultSet.getObject(i+1);    
                }
                miDefaultTableModel.addRow(miRenglon);
            }
            tblTabla.setModel(miDefaultTableModel);
        }
        catch(SQLException e)
        {
             JOptionPane.showMessageDialog(null, "Error encontrado : "+e.getMessage()); 
        }
    }//GEN-LAST:event_btnNombrePedidoActionPerformed

    private void btnCodigoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoPedidoActionPerformed
            String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
        int puerto=1521;
        String cadenaConexion;
        cadenaConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
        String sentenciaSQL="select distinct pedido_catalogo.cod_ped AS CODIGO_PEDIDO,nom_ped AS NOMBRE_PEDIDO,pedido_catalogo.cod_cat AS CODIGO_MATERIAL,nom_cat AS NOMBRE_MATERIAL from pedido_catalogo  join pedido  on(pedido_catalogo.COD_PED=pedido.cod_ped) join catalogo on(pedido_catalogo.cod_cat=catalogo.cod_cat) where pedido.cod_ped='"+jComboBox2.getSelectedItem()+"'";
        
        try(
               Connection miConexion=DriverManager.getConnection(cadenaConexion,usuario,password);
                Statement miSentencia=miConexion.createStatement();
                ResultSet miResultSet=miSentencia.executeQuery(sentenciaSQL);
                ) 
        {
            Vector miListaDeCampos=new Vector();
            int numeroDeCampos;
            ResultSetMetaData miMetaData;
            miMetaData=miResultSet.getMetaData();
            numeroDeCampos=miMetaData.getColumnCount();
            
            for(int i=0;i<miMetaData.getColumnCount();i++){
               miListaDeCampos.add(miMetaData.getColumnName(i+1));
            }
            DefaultTableModel miDefaultTableModel=new DefaultTableModel(miListaDeCampos,0);
            int cont=0;
            while(miResultSet.next())
            {
                cont++;
                Object[] miRenglon=new Object[numeroDeCampos];
                for(int i=0;i<numeroDeCampos;i++)
                {
                miRenglon[i]=miResultSet.getObject(i+1);    
                }
                miDefaultTableModel.addRow(miRenglon);
            }
            tblTabla.setModel(miDefaultTableModel);
        }
        catch(SQLException e)
        {
              JOptionPane.showMessageDialog(null, "Error encontrado : "+e.getMessage()); 
        }
    }//GEN-LAST:event_btnCodigoPedidoActionPerformed

    private void btnTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodoActionPerformed
      cargar();
    }//GEN-LAST:event_btnTodoActionPerformed

    private void btnVistaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaMaterialActionPerformed
       FrmVistaMaterial v=new FrmVistaMaterial();
       v.setVisible(true);
    }//GEN-LAST:event_btnVistaMaterialActionPerformed

    private void btnVistaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaPedidoActionPerformed
       FrmVistaPedido s=new FrmVistaPedido();
       s.setVisible(true);
       
    }//GEN-LAST:event_btnVistaPedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmAyuda ayuda=new FrmAyuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        FrmConfiguracion i=new FrmConfiguracion();
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        FrmLoggin formularioLoggin=new FrmLoggin();
        formularioLoggin.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        int resp=JOptionPane.showConfirmDialog(null,"¿Esta Seguro?");
        if(resp==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmLibretaClientes f=new FrmLibretaClientes();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmVistaMaterial v=new FrmVistaMaterial();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FrmVistaAlmacen a=new FrmVistaAlmacen();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FrmVistaStock z=new FrmVistaStock();
        z.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FrmVistaPedido x=new FrmVistaPedido();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FrmVistaPedidoCatalogo h =new  FrmVistaPedidoCatalogo();
        h.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPedido_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPedido_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPedido_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPedido_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPedido_catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodigoPedido;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNombrePedido;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTodo;
    private javax.swing.JButton btnVistaMaterial;
    private javax.swing.JButton btnVistaPedido;
    private javax.swing.JComboBox<String> cboMaterial;
    private javax.swing.JComboBox<String> cboPedido;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables
}
