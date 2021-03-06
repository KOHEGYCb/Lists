package lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dmitry
 */
public class GUI extends javax.swing.JFrame {

    private DefaultListModel<String> model1 = null; //поле модели для первого списка
    private DefaultListModel<String> model2 = null; //поле модели для второго списка
    private DefaultListModel<String> model3 = null; //поле модели для третьего списка

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents(); //инициализация графических элементов
        inSerialisation(); //загрузка списков из файла

        list1.setModel(model1); //присвоение к первому списку первой модели
        list2.setModel(model2); //присвоение к второму списку второй модели
        list3.setModel(model3); //присвоение к третьему списку третьей модели

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        checkBox12 = new javax.swing.JCheckBox();
        checkBox23 = new javax.swing.JCheckBox();
        checkBox31 = new javax.swing.JCheckBox();
        btnMove = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        textError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lists");

        list1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        list2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list2);

        list3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(list3);

        checkBox12.setText("1-2");
        checkBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox12MouseClicked(evt);
            }
        });

        checkBox23.setText("2-3");
        checkBox23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox23MouseClicked(evt);
            }
        });

        checkBox31.setText("1-3");
        checkBox31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox31MouseClicked(evt);
            }
        });

        btnMove.setText("Move");
        btnMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMoveMouseClicked(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
        });

        btnChange.setText("Change");
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeMouseClicked(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        textError.setText("for errors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBox12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBox23)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBox31)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMove)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)
                                .addGap(0, 465, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox12)
                    .addComponent(checkBox23)
                    .addComponent(checkBox31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMove)
                    .addComponent(btnRemove)
                    .addComponent(btnChange)
                    .addComponent(btnCreate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBox12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox12MouseClicked
        //выделение первого чекбокса, отмена выделения других
        checkBox12.setSelected(true);
        checkBox23.setSelected(false);
        checkBox31.setSelected(false);
    }//GEN-LAST:event_checkBox12MouseClicked

    private void checkBox23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox23MouseClicked
        //выделение второго чекбокса, отмена выделения других
        checkBox12.setSelected(false);
        checkBox23.setSelected(true);
        checkBox31.setSelected(false);
    }//GEN-LAST:event_checkBox23MouseClicked

    private void checkBox31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox31MouseClicked
        //выделение третьего чекбокса, отмена выделения других
        checkBox12.setSelected(false);
        checkBox23.setSelected(false);
        checkBox31.setSelected(true);
    }//GEN-LAST:event_checkBox31MouseClicked

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        //выделение элемента в первом списке, блокировка чекбокса по которому невозможно перемещение
        checkBox12.setEnabled(true);
        checkBox23.setEnabled(false);
        checkBox31.setEnabled(true);
        if (checkBox23.isSelected()) {
            checkBox23.setSelected(false);
        }
        if (!list2.isSelectionEmpty()) {
            list2.clearSelection();
        }
        if (!list3.isSelectionEmpty()) {
            list3.clearSelection();
        }
    }//GEN-LAST:event_list1MouseClicked

    private void list2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MouseClicked
        //выделение элемента в втором списке, блокировка чекбокса по которому невозможно перемещение
        checkBox12.setEnabled(true);
        checkBox23.setEnabled(true);
        checkBox31.setEnabled(false);
        if (checkBox31.isSelected()) {
            checkBox31.setSelected(false);
        }
        if (!list1.isSelectionEmpty()) {
            list1.clearSelection();
        }
        if (!list3.isSelectionEmpty()) {
            list3.clearSelection();
        }
    }//GEN-LAST:event_list2MouseClicked

    private void list3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list3MouseClicked
        //выделение элемента в третьем списке, блокировка чекбокса по которому невозможно перемещение
        checkBox12.setEnabled(false);
        checkBox23.setEnabled(true);
        checkBox31.setEnabled(true);
        if (checkBox12.isSelected()) {
            checkBox12.setSelected(false);
        }
        if (!list2.isSelectionEmpty()) {
            list2.clearSelection();
        }
        if (!list1.isSelectionEmpty()) {
            list1.clearSelection();
        }
    }//GEN-LAST:event_list3MouseClicked

    private void btnMoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoveMouseClicked

        boolean isError = false; //локальная переменная для проверки на ошибку

        //проверка что чекбокс выбран
        if (!checkBox12.isSelected() && !checkBox23.isSelected() && !checkBox31.isSelected()) {
            textError.setText(Errors.CHECK_BOX_IS_NOT_SELECTED); //вывод ошибки на экран
            isError = true;
        }
        //проверка  что список выбран
        if (list1.isSelectionEmpty() && list2.isSelectionEmpty() && list3.isSelectionEmpty()) {
            textError.setText(Errors.LIST_IS_NOT_SELECTED); //вывод ошибки на экран
            isError = true;
        }
        //если ошибок не обнаружено
        if (!isError) {
            textError.setText(" ");
            //если выбран список первый
            if (!list1.isSelectionEmpty()) {
                //если выбран чекбокс 1-2
                if (checkBox12.isSelected()) {
                    model2.addElement(model1.elementAt(list1.getSelectedIndex())); //добавление модели2 выбранный элемент из списка 1
                }
                //если выбран чекбокс 3-1
                if (checkBox31.isSelected()) {
                    model3.addElement(model1.elementAt(list1.getSelectedIndex())); //добавление модели 3 выбранный элемент из списка 1
                }
                model1.remove(list1.getSelectedIndex()); //удаление из модели 1 выбранного элемента 
            }
            //если выбран список второй
            if (!list2.isSelectionEmpty()) {
                //если выбран чекбокс 1-2
                if (checkBox12.isSelected()) {
                    model1.addElement(model2.elementAt(list2.getSelectedIndex())); //добавление модели1 выбранный элемент из списка 2
                }
                //если выбран чекбокс 2-3
                if (checkBox23.isSelected()) {
                    model3.addElement(model2.elementAt(list2.getSelectedIndex())); //добавление модели3 выбранный элемент из списка 2
                }
                model2.remove(list2.getSelectedIndex()); //удаление из модели 2 выбранного элемента 

            }
            //если выбран список третий
            if (!list3.isSelectionEmpty()) {
                //если выбран чекбокс 2-3
                if (checkBox23.isSelected()) {
                    model2.addElement(model3.elementAt(list3.getSelectedIndex())); //добавление модели 2 выбранный элемент из списка 3
                }
                if (checkBox31.isSelected()) {
                    model1.addElement(model3.elementAt(list3.getSelectedIndex())); //добавление модели 1 выбранный элемент из списка 3
                }
                model3.remove(list3.getSelectedIndex()); //удаление из модели 3 выбранного элемента
            }
            outSerialisation(); //запись в файл измененных моделей
        }
    }//GEN-LAST:event_btnMoveMouseClicked

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        new Create().setVisible(true); //создание окна добавления нового элемента
        this.dispose(); //удаление текущего окна
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
        boolean isError = false;
        //проверка на выбор какого-либо элемента
        if (list1.isSelectionEmpty() && list2.isSelectionEmpty() && list3.isSelectionEmpty()) {
            textError.setText(Errors.LIST_IS_NOT_SELECTED); //вывод ошибки на экрон
            isError = true;
        }
        //если ошибка не обнаружена
        if (!isError) {
            //если выбран список первый
            if (!list1.isSelectionEmpty()) {
                model1.removeElementAt(list1.getSelectedIndex()); //удадение выбранного элемента
            }
            //если выбран список второй
            if (!list2.isSelectionEmpty()) {
                model2.removeElementAt(list2.getSelectedIndex()); //удаление выбранного элемента
            }
            //если выбран список третий
            if (!list3.isSelectionEmpty()) {
                model3.removeElementAt(list3.getSelectedIndex()); //удаление выьранного элемента
            }
            outSerialisation(); //запись в файл измененных моделей
        }
    }//GEN-LAST:event_btnRemoveMouseClicked

    private void btnChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseClicked
        boolean isError = false;
        // проверка на выбор какого-либо элемента
        if (list1.isSelectionEmpty() && list2.isSelectionEmpty() && list3.isSelectionEmpty()) {
            textError.setText(Errors.LIST_IS_NOT_SELECTED); //вывод ошибки на экран
            isError = true;
        }

        //если ошибка не обнаружена
        if (!isError) {
            String str = JOptionPane.showInputDialog(null, "Write new name"); //вывод на экран диалогового окна, из которого принимаем имя для выбранного элемента
            //если выбран список первый
            if (!list1.isSelectionEmpty()) {
                model1.removeElementAt(list1.getSelectedIndex()); //удаление выбранного элемента
                model1.addElement(str); //создание нового элемента
            }
            //если выьран список второй
            if (!list2.isSelectionEmpty()) {
                model2.removeElementAt(list2.getSelectedIndex()); //удаление выбранного элемента 
                model2.addElement(str); //создание нового элемента
            }
            //если выбран список третий
            if (!list3.isSelectionEmpty()) {
                model3.removeElementAt(list3.getSelectedIndex()); //удаление выранного элемента 
                model3.addElement(str); //создание нового элемента
            }
            outSerialisation(); //запись в файл измененных моделей
        }
    }//GEN-LAST:event_btnChangeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox checkBox12;
    private javax.swing.JCheckBox checkBox23;
    private javax.swing.JCheckBox checkBox31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list2;
    private javax.swing.JList<String> list3;
    private javax.swing.JLabel textError;
    // End of variables declaration//GEN-END:variables

    // запись в файл измененных моделей
    private void outSerialisation() {
        //создание объектов выводных потоков 
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            //инициализация выводных потоков
            fos = new FileOutputStream(Files.FILE_MODEL);
            oos = new ObjectOutputStream(fos);

            //запись моделей в файл
            oos.writeObject(model1);
            oos.writeObject(model2);
            oos.writeObject(model3);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //закрывание подключений
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //инициализация моделей из файла
    private void inSerialisation() {
        try {
            //инициализация входного потока
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Files.FILE_MODEL));
            //чтение моделей из файла
            model1 = (DefaultListModel<String>) ois.readObject();
            model2 = (DefaultListModel<String>) ois.readObject();
            model3 = (DefaultListModel<String>) ois.readObject();
            //закрытие потоков
            ois.close();
        } catch (FileNotFoundException ex) {
            //если файл не найден, создание пуслых списков
                model1 = new DefaultListModel<>();
                model2 = new DefaultListModel<>();
                model3 = new DefaultListModel<>();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
}
