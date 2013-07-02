package ezClient.userMVC;

import ezClient.IClientObserver;

/**
 *
 * @author Andrei
 */
public class UserView extends javax.swing.JFrame implements IClientObserver {

    /**
     * Creates new form TestView
     */
    public UserView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableList = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        taskDescription = new javax.swing.JTextField();
        taskScrumUnits = new javax.swing.JTextField();
        assignTaskBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        taskPriority = new javax.swing.JTextField();
        taskDateAdded = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        myTaskList = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        myTaskDescription = new javax.swing.JTextField();
        completeTaskBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        availableList.setBackground(new java.awt.Color(102, 102, 102));
        availableList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        availableList.setForeground(new java.awt.Color(255, 255, 255));
        availableList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        availableList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        availableList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        availableList.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        availableList.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(availableList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        taskDescription.setEditable(false);
        taskDescription.setBackground(new java.awt.Color(51, 51, 51));
        taskDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taskDescription.setForeground(new java.awt.Color(204, 204, 204));
        taskDescription.setText("Description goes here");
        taskDescription.setBorder(null);

        taskScrumUnits.setEditable(false);
        taskScrumUnits.setBackground(new java.awt.Color(51, 51, 51));
        taskScrumUnits.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taskScrumUnits.setForeground(new java.awt.Color(255, 255, 255));
        taskScrumUnits.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taskScrumUnits.setText("25");
        taskScrumUnits.setBorder(null);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JSlider(), org.jdesktop.beansbinding.ELProperty.create("${value}"), taskScrumUnits, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

		/*
        taskScrumUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskScrumUnitsActionPerformed(evt);
            }
        });
		*/

        assignTaskBtn.setBackground(new java.awt.Color(0, 51, 204));
        assignTaskBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        assignTaskBtn.setText("Assign Task");
		
		/*
        assignTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTaskBtnActionPerformed(evt);
            }
        });
		*/

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Priority");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Date Added");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Scrum Units");

        taskPriority.setEditable(false);
        taskPriority.setBackground(new java.awt.Color(51, 51, 51));
        taskPriority.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taskPriority.setForeground(new java.awt.Color(255, 255, 255));
        taskPriority.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taskPriority.setText("jTextField1");
        taskPriority.setBorder(null);

        taskDateAdded.setEditable(false);
        taskDateAdded.setBackground(new java.awt.Color(0, 153, 0));
        taskDateAdded.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taskDateAdded.setForeground(new java.awt.Color(255, 255, 255));
        taskDateAdded.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taskDateAdded.setText("jTextField3");
        taskDateAdded.setBorder(null);
		/*
        taskDateAdded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDateAddedActionPerformed(evt);
            }
        });
		*/

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(taskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(taskDateAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskScrumUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(assignTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(taskPriority, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(taskDateAdded)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(taskScrumUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(assignTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jTabbedPane1.addTab("                      Available Tasks                                   ", jPanel1);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        myTaskList.setBackground(new java.awt.Color(102, 102, 102));
        myTaskList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        myTaskList.setForeground(new java.awt.Color(255, 255, 255));
        myTaskList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane2.setViewportView(myTaskList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        myTaskDescription.setEditable(false);
        myTaskDescription.setBackground(new java.awt.Color(51, 51, 51));
        myTaskDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myTaskDescription.setForeground(new java.awt.Color(204, 204, 204));
        myTaskDescription.setText("Description goes here");
        myTaskDescription.setBorder(null);

        completeTaskBtn.setBackground(new java.awt.Color(0, 153, 0));
        completeTaskBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        completeTaskBtn.setText("Mark as Done");
		
		/*
        completeTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeTaskBtnActionPerformed(evt);
            }
        });
		*/

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(completeTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(myTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE)));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(myTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(completeTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jTabbedPane1.addTab("                                  My Tasks                         ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        jTabbedPane1.getAccessibleContext().setAccessibleName("Tasks");

        bindingGroup.bind();

        pack();
    }

	/*
    private void completeTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
	*/

	/*
    private void assignTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
	*/
	
	/*
    private void taskScrumUnitsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
	*/
	
	/*
    private void taskDateAddedActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
	*/
	
    // Variables declaration - do not modify
    private javax.swing.JButton assignTaskBtn;
    private javax.swing.JList availableList;
    private javax.swing.JButton completeTaskBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField myTaskDescription;
    private javax.swing.JList myTaskList;
    private javax.swing.JTextField taskDateAdded;
    private javax.swing.JTextField taskDescription;
    private javax.swing.JTextField taskPriority;
    private javax.swing.JTextField taskScrumUnits;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration

    public void addController(UserController controller) {

		taskScrumUnits.addActionListener(controller.assignTaskBtnActionPerformed());
		taskDateAdded.addActionListener(controller.taskDateAddedActionPerformed());
		taskScrumUnits.addActionListener(controller.taskScrumUnitsActionPerformed());
		completeTaskBtn.addActionListener(controller.completeTaskBtnActionPerformed());
        
		
	
    }

    @Override
    public void updateClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	void run() {
		this.setVisible(true);
	}
}
