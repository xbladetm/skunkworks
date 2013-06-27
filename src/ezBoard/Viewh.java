package ezBoard;

import ezCommon.IData;
import ezCommon.Task;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Andrei
 */
public class Viewh extends javax.swing.JFrame implements IBoardObserver {

    /**
     * Creates new form View
     */
    public Viewh() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        toDoCol = new javax.swing.JPanel();
        inProgressCol = new javax.swing.JPanel();
        doneCol = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE));
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        toDoCol.setBackground(new java.awt.Color(204, 0, 0));
        toDoCol.setLayout(new javax.swing.BoxLayout(toDoCol, javax.swing.BoxLayout.PAGE_AXIS));

        inProgressCol.setBackground(new java.awt.Color(255, 255, 51));
        inProgressCol.setLayout(new javax.swing.BoxLayout(inProgressCol, javax.swing.BoxLayout.PAGE_AXIS));

        doneCol.setBackground(new java.awt.Color(51, 204, 0));
        doneCol.setLayout(new javax.swing.BoxLayout(doneCol, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(toDoCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inProgressCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inProgressCol, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addComponent(toDoCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        toDoCol.getAccessibleContext().setAccessibleName("toDoColumn");
        inProgressCol.getAccessibleContext().setAccessibleName("inProgressColumn");
        doneCol.getAccessibleContext().setAccessibleName("doneCol");

        jProgressBar1.setBackground(new java.awt.Color(51, 51, 51));
        jProgressBar1.setForeground(new java.awt.Color(0, 102, 102));
        jProgressBar1.setValue(65);
        jProgressBar1.setName("");
        jProgressBar1.setRequestFocusEnabled(false);
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE));
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>
    // Variables declaration - do not modify
    private javax.swing.JPanel doneCol;
    private javax.swing.JPanel inProgressCol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel toDoCol;
    // End of variables declaration
    ArrayList<IData> toDo;
    ArrayList<IData> inProgress;
    ArrayList<IData> done;
    Controller c;

    @Override
    public void updateBoard() {
        setUpTasks();
    }

    public void setUpTasks() {
        System.out.println("VIEW: updating");
        c.updateLists();
        toDoCol.removeAll();
        inProgressCol.removeAll();
        doneCol.removeAll();
        if (toDo != null) {
            for (IData t : toDo) {
                Task tsk = new Task();
                tsk.create(t.getString());
                javax.swing.JPanel entry = new javax.swing.JPanel();
                entry.setLayout(new javax.swing.BoxLayout(entry, javax.swing.BoxLayout.PAGE_AXIS));
                entry.setBackground(new java.awt.Color(153, 0, 0));
                entry.setMaximumSize(new Dimension(super.getWidth(), 51));
                entry.setForeground(new java.awt.Color(255, 255, 255));
                Label l = new java.awt.Label(tsk.getDescription());
                l.setFont(new Font("Verdana", Font.BOLD, 14));
                entry.add(l);
                entry.add(new java.awt.Label("Priority: " + tsk.getPriority()));
                entry.setBorder(new EmptyBorder(5, 5, 5, 5));
                toDoCol.add(entry);
                toDoCol.add(Box.createVerticalStrut(10));
            }

            toDoCol.revalidate();
            toDoCol.repaint();
        }

        if (inProgress != null) {
            for (IData t : inProgress) {
                Task tsk = new Task();
                tsk.create(t.getString());
                javax.swing.JPanel entry = new javax.swing.JPanel();
                entry.setLayout(new javax.swing.BoxLayout(entry, javax.swing.BoxLayout.PAGE_AXIS));
                entry.setBackground(new java.awt.Color(153, 153, 0));
                entry.setMaximumSize(new Dimension(super.getWidth(), 51));
                entry.setForeground(new java.awt.Color(255, 255, 255));
                Label l = new java.awt.Label(tsk.getDescription());
                l.setFont(new Font("Verdana", Font.BOLD, 14));
                entry.add(l);
                entry.add(new java.awt.Label("Assigned to: " + tsk.getUserID()));
                inProgressCol.revalidate();
                inProgressCol.add(entry);
                inProgressCol.add(Box.createVerticalStrut(10));
            }
            inProgressCol.revalidate();
            inProgressCol.repaint();
        }

        if (done != null) {
            for (IData t : done) {
                Task tsk = new Task();
                tsk.create(t.getString());
                javax.swing.JPanel entry = new javax.swing.JPanel();
                entry.setLayout(new javax.swing.BoxLayout(entry, javax.swing.BoxLayout.PAGE_AXIS));
                entry.setBackground(new java.awt.Color(0, 153, 0));
                entry.setMaximumSize(new Dimension(super.getWidth(), 51));
                entry.setForeground(new java.awt.Color(255, 255, 255));
                Label l = new java.awt.Label(tsk.getDescription());
                l.setFont(new Font("Verdana", Font.BOLD, 14));
                entry.add(l);
                entry.add(new java.awt.Label("Finished on: " + tsk.getDoneDate()));
                doneCol.add(entry);
                doneCol.add(Box.createVerticalStrut(10));
            }

            doneCol.revalidate();
            doneCol.repaint();
            double complete = ((double) done.size() / (toDo.size() + inProgress.size() + done.size())) * 100;

            jProgressBar1.setValue((int) complete);
        }

    }

    public void addController(Controller c) {
        this.c = c;

    }
}
