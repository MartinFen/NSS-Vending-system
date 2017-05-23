
import java.text.DecimalFormat;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * N7Vending.java
 *
 * Created on 08-Oct-2013, 15:23:58
 */
/**
 *
 * @author fennell.38261
 */
public class N7Vending extends javax.swing.JFrame {

    public static int WeaponStock1 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int WeaponStock2 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int WeaponStock3 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int WeaponStock4 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int WeaponStock5 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int WeaponStock6 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int EuroStock2 = 10;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int EuroStock1 = 10;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int CentStock50 = 10;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int CentStock20 = 10;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int CentStock10 = 10;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevMoneyStock1 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevMoneyStock2 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevMoneyStock3 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevMoneyStock4 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevMoneyStock5 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevItemstock1 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevItemstock2 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevItemstock3 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevItemstock4 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevItemstock5 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int prevItemstock6 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Itemstock1 = 0;//this is a variable created to be used between classes on the main vending machine form and the restock form.
    public static int Itemstock2 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Itemstock3 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Itemstock4 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Itemstock5 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Itemstock6 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Euro2 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Euro1 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Cent50 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Cent20 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int Cent10 = 0;//this is a variable created to be used between classes on the main vending machine and the restock form.
    public static int purchase = 1;//this is a variable created to be used between classes on the main vending machine and the restock form.

    private int MethodForWeapon1(JTextField stock1)//this is the name of the method used to take in info about weapon1 in the vending machine.
    {
        int NewStock1 = Integer.parseInt(stock1.getText());//this line gets info on the current stock of weapon1 each time the weapon button is pressed.
        NewStock1--;//this line takes the value of 1 from the stock of weapon 1 each time the button is pressed.
        stock1.setText("" + NewStock1);//this line sets the info to NewStock1 after the above code has carried out its operations out.
        return NewStock1;//this line of code returns all info to the method link in the weapon 1 button.
    }

    private int MethodForWeapon2(JTextField stock2) {//this is the name of the method used to take in info about weapon 2 in the vending machine.

        int NewStock2 = Integer.parseInt(stock2.getText());//this line gets info on the current stock of weapon2 each time the weapon button is pressed.
        NewStock2--;//this line takes the value of 1 from the stock of weapon 2 each time the button is pressed.
        stock2.setText("" + NewStock2);//this line sets the info to NewStock2 after the above code has carried out its operations out.
        return NewStock2;//this line of code returns all info to the method link in the weapon 2 button.
    }

    private int MethodForTwoEuro(JTextField Euro2stock) {//this is the name of the method used to take in info about The two euro button in the vending machine.

        int NewCoinStock2 = Integer.parseInt(Euro2stock.getText());//this line gets info on the current stock of the 2 Euro button each time button is pressed.
        NewCoinStock2++;//this line adds the value of 1 from the stock of EuroStock2 each time the button is pressed.
        Euro2stock.setText("" + NewCoinStock2);//this line sets the info to NewcoinStock2 after the above code has carried out its operations out.
        return NewCoinStock2;//this line of code returns all info to the method link in the Euro 2 button.
    }

    /**
     * Creates new form N7Vending
     */
    public N7Vending() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weapon1 = new javax.swing.JButton();
        weapon2 = new javax.swing.JButton();
        weapon3 = new javax.swing.JButton();
        weapon4 = new javax.swing.JButton();
        weapon5 = new javax.swing.JButton();
        weapon6 = new javax.swing.JButton();
        euro2 = new javax.swing.JButton();
        euro1 = new javax.swing.JButton();
        cent50 = new javax.swing.JButton();
        cent20 = new javax.swing.JButton();
        cent10 = new javax.swing.JButton();
        gun1 = new javax.swing.JLabel();
        costlabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        show50 = new javax.swing.JLabel();
        show20 = new javax.swing.JLabel();
        show10 = new javax.swing.JLabel();
        restock = new javax.swing.JButton();
        refund = new javax.swing.JButton();
        buynow = new javax.swing.JButton();
        gun2 = new javax.swing.JLabel();
        gun3 = new javax.swing.JLabel();
        gun4 = new javax.swing.JLabel();
        gun6 = new javax.swing.JLabel();
        gun5 = new javax.swing.JLabel();
        stock1 = new javax.swing.JTextField();
        Totalcost = new javax.swing.JTextField();
        stock2 = new javax.swing.JTextField();
        stock3 = new javax.swing.JTextField();
        stock4 = new javax.swing.JTextField();
        stock5 = new javax.swing.JTextField();
        stock6 = new javax.swing.JTextField();
        Totalentered = new javax.swing.JTextField();
        Qty2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Qty1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Qty3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Qty4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Qty5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Qty6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ChangeDue = new javax.swing.JTextField();
        Euro2stock = new javax.swing.JTextField();
        Euro1stock = new javax.swing.JTextField();
        Cent50stock = new javax.swing.JTextField();
        Cent20stock = new javax.swing.JTextField();
        Cent10stock = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 690));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        weapon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weapon 1.jpg"))); // NOI18N
        weapon1.setToolTipText("Push to choose this weapon ");
        weapon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weapon1ActionPerformed(evt);
            }
        });
        getContentPane().add(weapon1);
        weapon1.setBounds(210, 190, 180, 100);

        weapon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weapon 2.jpg"))); // NOI18N
        weapon2.setToolTipText("Push to choose this weapon ");
        weapon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weapon2ActionPerformed(evt);
            }
        });
        getContentPane().add(weapon2);
        weapon2.setBounds(430, 190, 200, 100);

        weapon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weapon 3.jpg"))); // NOI18N
        weapon3.setToolTipText("Push to choose this weapon ");
        weapon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weapon3ActionPerformed(evt);
            }
        });
        getContentPane().add(weapon3);
        weapon3.setBounds(670, 190, 200, 100);

        weapon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weapon 4.jpg"))); // NOI18N
        weapon4.setToolTipText("Push to choose this weapon ");
        weapon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weapon4ActionPerformed(evt);
            }
        });
        getContentPane().add(weapon4);
        weapon4.setBounds(210, 350, 180, 100);

        weapon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weapon 6.jpg"))); // NOI18N
        weapon5.setToolTipText("Push to choose this weapon ");
        weapon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weapon5ActionPerformed(evt);
            }
        });
        getContentPane().add(weapon5);
        weapon5.setBounds(430, 350, 200, 100);

        weapon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weapons 7.jpg"))); // NOI18N
        weapon6.setToolTipText("Push to choose this weapon ");
        weapon6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weapon6ActionPerformed(evt);
            }
        });
        getContentPane().add(weapon6);
        weapon6.setBounds(670, 350, 200, 100);

        euro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2 euro.jpg"))); // NOI18N
        euro2.setToolTipText("Push to put a 2 euro coin into the machine");
        euro2.setMaximumSize(new java.awt.Dimension(261, 231));
        euro2.setMinimumSize(new java.awt.Dimension(260, 230));
        euro2.setPreferredSize(new java.awt.Dimension(260, 230));
        euro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro2ActionPerformed(evt);
            }
        });
        getContentPane().add(euro2);
        euro2.setBounds(30, 10, 80, 70);

        euro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1 euro coin.jpg"))); // NOI18N
        euro1.setToolTipText("Push to put a 1 euro coin into the machine");
        euro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euro1ActionPerformed(evt);
            }
        });
        getContentPane().add(euro1);
        euro1.setBounds(30, 120, 80, 70);

        cent50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/50 cent coin.jpg"))); // NOI18N
        cent50.setToolTipText("Push to put a 50 cent coin into the machine");
        cent50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cent50ActionPerformed(evt);
            }
        });
        getContentPane().add(cent50);
        cent50.setBounds(30, 230, 80, 80);

        cent20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/20 cent coin.jpg"))); // NOI18N
        cent20.setToolTipText("Push to put a 20 cent coin into the machine");
        cent20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cent20ActionPerformed(evt);
            }
        });
        getContentPane().add(cent20);
        cent20.setBounds(30, 350, 80, 80);

        cent10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10 cent coin.jpg"))); // NOI18N
        cent10.setToolTipText("Push to put a 10 cent coin into the machine");
        cent10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cent10ActionPerformed(evt);
            }
        });
        getContentPane().add(cent10);
        cent10.setBounds(30, 470, 80, 70);

        gun1.setForeground(new java.awt.Color(255, 255, 255));
        gun1.setText("0.00");
        gun1.setToolTipText("Total cost of chosen weapon above");
        getContentPane().add(gun1);
        gun1.setBounds(250, 290, 80, 30);

        costlabel1.setBackground(new java.awt.Color(255, 255, 255));
        costlabel1.setForeground(new java.awt.Color(255, 255, 255));
        costlabel1.setText("Cost:€");
        costlabel1.setToolTipText("Cost lable for individual weapon cost");
        getContentPane().add(costlabel1);
        costlabel1.setBounds(210, 290, 40, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cost:€");
        jLabel3.setToolTipText("Cost lable for individual weapon cost");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 290, 40, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cost:");
        jLabel4.setToolTipText("Cost lable for individual weapon cost");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 290, 30, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cost:€");
        jLabel5.setToolTipText("Cost lable for individual weapon cost");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 450, 40, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cost:€");
        jLabel6.setToolTipText("Cost lable for individual weapon cost");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(430, 450, 40, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cost");
        jLabel7.setToolTipText("Cost lable for individual weapon cost");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 450, 30, 30);

        show2.setBackground(new java.awt.Color(255, 255, 255));
        show2.setForeground(new java.awt.Color(255, 255, 255));
        show2.setText("0");
        show2.setToolTipText("amount of 2 euro coins put into the machine");
        getContentPane().add(show2);
        show2.setBounds(140, 14, 40, 70);

        show1.setForeground(new java.awt.Color(255, 255, 255));
        show1.setText("0");
        show1.setToolTipText("amount of 2 euro coins put into the machine");
        getContentPane().add(show1);
        show1.setBounds(140, 90, 40, 70);

        show50.setForeground(new java.awt.Color(255, 255, 255));
        show50.setText("0");
        show50.setToolTipText("amount of 50 cent coins put into the machine");
        getContentPane().add(show50);
        show50.setBounds(140, 170, 40, 70);

        show20.setForeground(new java.awt.Color(255, 255, 255));
        show20.setText("0");
        show20.setToolTipText("amount of 20 cent coins put into the machine");
        getContentPane().add(show20);
        show20.setBounds(140, 250, 40, 70);

        show10.setForeground(new java.awt.Color(255, 255, 255));
        show10.setText("0");
        show10.setToolTipText("amount of 10 cent coins put into the machine");
        getContentPane().add(show10);
        show10.setBounds(140, 330, 40, 70);

        restock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Re-stock.jpg"))); // NOI18N
        restock.setToolTipText("Restock button");
        restock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restockActionPerformed(evt);
            }
        });
        getContentPane().add(restock);
        restock.setBounds(30, 580, 80, 40);

        refund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refund.jpg"))); // NOI18N
        refund.setToolTipText("Refund/Cancel button");
        refund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundActionPerformed(evt);
            }
        });
        getContentPane().add(refund);
        refund.setBounds(630, 130, 100, 50);

        buynow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purchase.jpg"))); // NOI18N
        buynow.setToolTipText("Purchase button");
        buynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buynowActionPerformed(evt);
            }
        });
        getContentPane().add(buynow);
        buynow.setBounds(520, 130, 100, 50);

        gun2.setForeground(new java.awt.Color(255, 255, 255));
        gun2.setText("0.00");
        gun2.setToolTipText("Total cost of chosen weapon above");
        getContentPane().add(gun2);
        gun2.setBounds(470, 290, 90, 30);

        gun3.setForeground(new java.awt.Color(255, 255, 255));
        gun3.setText("0.00");
        gun3.setToolTipText("Total cost of chosen weapon above");
        getContentPane().add(gun3);
        gun3.setBounds(700, 290, 90, 30);

        gun4.setForeground(new java.awt.Color(255, 255, 255));
        gun4.setText("0.00");
        gun4.setToolTipText("Total cost of chosen weapon above");
        getContentPane().add(gun4);
        gun4.setBounds(250, 450, 80, 30);

        gun6.setForeground(new java.awt.Color(255, 255, 255));
        gun6.setText("0.00");
        gun6.setToolTipText("Total cost of chosen weapon above");
        getContentPane().add(gun6);
        gun6.setBounds(700, 450, 90, 30);

        gun5.setForeground(new java.awt.Color(255, 255, 255));
        gun5.setText("0.00");
        gun5.setToolTipText("Total cost of chosen weapon above");
        getContentPane().add(gun5);
        gun5.setBounds(470, 450, 90, 30);

        stock1.setText("10");
        stock1.setToolTipText("Stock of the weapon to the left");
        stock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock1ActionPerformed(evt);
            }
        });
        getContentPane().add(stock1);
        stock1.setBounds(390, 190, 40, 30);

        Totalcost.setText("0");
        Totalcost.setToolTipText("Total cost of all weapons");
        Totalcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalcostActionPerformed(evt);
            }
        });
        getContentPane().add(Totalcost);
        Totalcost.setBounds(650, 50, 60, 30);

        stock2.setText("10");
        stock2.setToolTipText("Stock of the weapon to the left");
        getContentPane().add(stock2);
        stock2.setBounds(630, 190, 40, 30);

        stock3.setText("10");
        stock3.setToolTipText("Stock of the weapon to the left");
        stock3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock3ActionPerformed(evt);
            }
        });
        getContentPane().add(stock3);
        stock3.setBounds(870, 190, 40, 30);

        stock4.setText("10");
        stock4.setToolTipText("Stock of the weapon to the left");
        getContentPane().add(stock4);
        stock4.setBounds(390, 350, 40, 30);

        stock5.setText("10");
        stock5.setToolTipText("Stock of the weapon to the left");
        getContentPane().add(stock5);
        stock5.setBounds(630, 350, 40, 30);

        stock6.setText("10");
        stock6.setToolTipText("Stock of the weapon to the left");
        getContentPane().add(stock6);
        stock6.setBounds(870, 350, 40, 30);

        Totalentered.setText("0");
        Totalentered.setToolTipText("Coins Entered into the machine");
        Totalentered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalenteredActionPerformed(evt);
            }
        });
        getContentPane().add(Totalentered);
        Totalentered.setBounds(650, 10, 60, 30);

        Qty2.setForeground(new java.awt.Color(255, 255, 255));
        Qty2.setText("0");
        Qty2.setToolTipText("Quantity chosen of weapon above");
        getContentPane().add(Qty2);
        Qty2.setBounds(590, 290, 40, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Qty:");
        jLabel2.setToolTipText("Quantity Lable");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 290, 30, 30);

        Qty1.setForeground(new java.awt.Color(255, 255, 255));
        Qty1.setText("0");
        Qty1.setToolTipText("Quantity chosen of weapon above");
        getContentPane().add(Qty1);
        Qty1.setBounds(360, 290, 30, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qty:");
        jLabel1.setToolTipText("Quantity Lable");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 290, 30, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qty:");
        jLabel8.setToolTipText("Quantity Lable");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(790, 290, 30, 30);

        Qty3.setForeground(new java.awt.Color(255, 255, 255));
        Qty3.setText("0");
        Qty3.setToolTipText("Quantity chosen of weapon above");
        getContentPane().add(Qty3);
        Qty3.setBounds(820, 290, 50, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Qty:");
        jLabel9.setToolTipText("Quantity Lable");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 450, 30, 30);

        Qty4.setForeground(new java.awt.Color(255, 255, 255));
        Qty4.setText("0");
        Qty4.setToolTipText("Quantity chosen of weapon above");
        getContentPane().add(Qty4);
        Qty4.setBounds(360, 450, 30, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Qty:");
        jLabel10.setToolTipText("Quantity Lable");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 450, 30, 30);

        Qty5.setForeground(new java.awt.Color(255, 255, 255));
        Qty5.setText("0");
        Qty5.setToolTipText("Quantity chosen of weapon above");
        getContentPane().add(Qty5);
        Qty5.setBounds(590, 450, 40, 30);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Qty:");
        jLabel12.setToolTipText("Quantity Lable");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(790, 450, 30, 30);

        Qty6.setForeground(new java.awt.Color(255, 255, 255));
        Qty6.setText("0");
        Qty6.setToolTipText("Quantity chosen of weapon above");
        getContentPane().add(Qty6);
        Qty6.setBounds(820, 450, 50, 30);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Cost €:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(530, 50, 110, 30);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Entered €:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 10, 130, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Change Due €:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 90, 120, 30);

        ChangeDue.setText("0");
        ChangeDue.setToolTipText("Change due after refund or purchase buttons hit");
        getContentPane().add(ChangeDue);
        ChangeDue.setBounds(650, 90, 59, 30);

        Euro2stock.setText("10");
        Euro2stock.setToolTipText("Stock of the coin above");
        Euro2stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Euro2stockActionPerformed(evt);
            }
        });
        getContentPane().add(Euro2stock);
        Euro2stock.setBounds(30, 80, 80, 26);

        Euro1stock.setText("10");
        Euro1stock.setToolTipText("Stock of the coin above");
        getContentPane().add(Euro1stock);
        Euro1stock.setBounds(30, 190, 80, 26);

        Cent50stock.setText("10");
        Cent50stock.setToolTipText("Stock of the coin above");
        getContentPane().add(Cent50stock);
        Cent50stock.setBounds(30, 310, 80, 26);

        Cent20stock.setText("10");
        Cent20stock.setToolTipText("Stock of the coin above");
        getContentPane().add(Cent20stock);
        Cent20stock.setBounds(30, 430, 80, 26);

        Cent10stock.setText("10");
        Cent10stock.setToolTipText("Stock of the coin above");
        getContentPane().add(Cent10stock);
        Cent10stock.setBounds(30, 540, 80, 26);

        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/n7 wallpaper.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1080, 650));
        Background.setMinimumSize(new java.awt.Dimension(1080, 650));
        Background.setPreferredSize(new java.awt.Dimension(1080, 650));
        getContentPane().add(Background);
        Background.setBounds(-110, 0, 1080, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cent50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent50ActionPerformed
        //above is the name of 50 cent button in the vending machine and the code below is all the operations performed when the button is pushed.
        DecimalFormat df = new DecimalFormat("0.00");//the decimal format code is used to make sure that there are no more than two zeros after each decimal point.

        CentStock50 = (Integer.parseInt(Cent50stock.getText()));//this variable and line of code is used to get information of how many 50 cent coins are in the vending machine each time the 50 cent button is pushed.
        Cent50 = (Integer.parseInt(show50.getText()));//this line of code is used to get information about how many 50 cent coins have been put into the vending machine by the user.
        double CentTotal50 = (Double.parseDouble(Totalentered.getText()));//this line of code is used to get info about the value of 50 cent to the total amount of change entered by the user each time the button is used.

        if (CentStock50 < 1)//this line of code is the start of an if else statement which states if the stock of 50 cent coins go bellow the value of 1 it will carry out a command.
        {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");//this is the command that will be carried out if the value of 50 cent coins go bellow 1 in the vending machine.
            Cent50stock.setText("0");//this line of code will set the stock of 50 cent coins to 0 so that the value wont go below that value when the button is pushed again before restocking.
        } else//this is the second part of the if else statement which lets all the other code below carry out its operations unless the above statement is met.
        {
            CentStock50 = CentStock50 + 1;//this line of code adds a value of 1 the stock of the 50 cents in the machine.
            CentTotal50 = CentTotal50 + 0.50;//this line of code adds the value of a 50 cent coin to the total amount entered each time the button is pushed.
            Cent50 = Cent50 + 1;//this line adds a value of 1 to the amount of 50 cents the user puts into the machine.
            Cent50stock.setText("" + CentStock50);//this line of code gets text from the variable above CentStock50 and sets the text in the text field Cent50stock.
            show50.setText("" + Cent50);//this line of code gets text from the variable Cent50 and sets it in the label show50.
            Totalentered.setText("" + df.format(CentTotal50));//this line of code adds the amount of 50 cent coins selected to the total amount of change entered and uses the decimal format code to correct the amount of zeros to two after the point.
        }
    }//GEN-LAST:event_cent50ActionPerformed

    private void euro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro2ActionPerformed
//above is the name of the Jbutton 2 euro in the vending machine and the code below is all the operations performed when the button is pushed.
        DecimalFormat df = new DecimalFormat("0.00");//the decimal format code is used to make sure that there are no more than two zeros after each decimal point.

        Euro2 = (Integer.parseInt(show2.getText()));//this line of code is used to get information about how many 2 euro coins have been put into the vending machine by the user.
        double EuroTotal2 = (Double.parseDouble(Totalentered.getText()));//this line of code is used to send the value of 2 euro to the total amount of change entered by the user each time the button is used.

        if (EuroStock2 < 1)//this line of code is the start of an if else statement which states if the stock of 2 euro coins go bellow the value of 1 it will carry out a command.
        {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");//this is the command that will be carried out if the value of 2 euro coins go bellow 1 in the vending machine.
            Euro2stock.setText("0");//this line of code will set the stock of 2 euro coins to 0 so that the value wont go below that value when the button is pushed again before restocking.
        } else//this is the second part of the if else statement which lets all the other code below carry out its operations unless the above statement is met.
        {
            EuroStock2 = MethodForTwoEuro(Euro2stock);//this line of code is used to link the method (MethodForTwoEuro).
            Euro2 = Euro2 + 1;//this line of code adds the value of 1 to the 2 euro Qty each time a 2 euro coin is put into the vending machine.
            EuroTotal2 = EuroTotal2 + 2.00;//this line of code adds the value of a 2 euro coin to the total amount entered each time the button is pressed.
            Euro2stock.setText("" + EuroStock2);//this line of code gets text from the Method above (MethodForTwoEuro) and sets the text in the text field Euro2stock.
            show2.setText("" + Euro2);//this line of code gets text from the variable Euro2 and sets it in the label show2.
            Totalentered.setText("" + df.format(EuroTotal2));//this line of code adds the amount of 2 euro coins selected to the total amount of change entered and uses the decimal format code to correct the amount of zeros to two after the point.
        }
    }//GEN-LAST:event_euro2ActionPerformed

    private void weapon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weapon1ActionPerformed
        //above is the name of Weapon1 button in the vending machine and the code below is all the operations performed when the button is pushed.
        DecimalFormat df = new DecimalFormat("0.00");//the decimal format code is used to make sure that there are no more than two zeros after each decimal point.

        double Weaponcost1 = (Double.parseDouble(gun1.getText()));//this line gets info about the cost of each weapon 1 selected.
        Itemstock1 = (Integer.parseInt(Qty1.getText()));//this line of code gets info on how many of weapon 1 have been selected.
        double WeaponTotalCost1 = (Double.parseDouble(Totalcost.getText()));//this line of code gets info about the cost of all weapon 1 selected.

        if (WeaponStock1 < 1.00)//This if statement states that if stock value of weapon1 falls below 1 it carries out the operation below.
        {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");//this line is the operation carried out if stock of weapon1 falls below 1.
            stock1.setText("0.00");//this line sets the stock to zero when the above operation is carried out.
        } else//this is the else variable for the end of an if else statement which allows all code operations below to be carried out if the if statement above is not met.
        {
            WeaponStock1 = MethodForWeapon1(stock1);//this line links the method (methodforweapon1) from the top of the form.
            WeaponTotalCost1 = WeaponTotalCost1 + 2.20;//this line adds the value of weapon 1 to the totalcost text field.
            Weaponcost1 = Weaponcost1 + 2.20;//this line adds the value of weapon 1 to the gun1 lable.
            Itemstock1 = Itemstock1 + 1;//this line of code adds the quantity of 1 to the qty1 label when the product button is pressed.
            stock1.setText("" + WeaponStock1);//this line sets the info of the value taken in from the variable weaponstock1 and sets it to the stock1 text field.
            Qty1.setText("" + Itemstock1);//this line sets the info of the value taken in from the variable itemstock1 and sets it to the qty1 lable.
            gun1.setText("" + df.format(Weaponcost1));//this line sets the info of the value taken in from the variable weaponcost1 and sets it to the gun1 lable.
            Totalcost.setText("" + df.format(WeaponTotalCost1));//this line sets the info of the value taken in from the variable weapontotalcost1 and sets it to the totalcost text field.
        }

    }//GEN-LAST:event_weapon1ActionPerformed

    private void weapon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weapon2ActionPerformed
        //above is the name of Weapon1 button in the vending machine and the code below is all the operations performed when the button is pushed.

        DecimalFormat df = new DecimalFormat("0.00");//the decimal format code is used to make sure that there are no more than two zeros after each decimal point.

        double Weaponcost2 = (Double.parseDouble(gun2.getText()));//this line gets info about the cost of each weapon 2 selected.
        Itemstock2 = (Integer.parseInt(Qty2.getText()));//this line of code gets info on how many of weapon 2 have been selected.

        double WeaponTotalCost2 = (Double.parseDouble(Totalcost.getText()));//this line of code gets info about the cost of all weapon 2 selected.
        WeaponTotalCost2 = WeaponTotalCost2 + 2.10;//this line adds the value of weapon 1 to the totalcost text field.
        Totalcost.setText("" + df.format(WeaponTotalCost2));//this line sets the info of the value taken in from the variable weapontotalcost2 and sets it to the totalcost text field.

        if (WeaponStock2 < 1.00)//This if statement states that if stock value of weapon1 falls below 1 it carries out the operation below.
        {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");//this line is the operation carried out if stock of weapon2 falls below 1.
            stock2.setText("0.00");//this line sets the stock to zero when the above operation is carried out.
        } else//this is the else variable for the end of an if else statement which allows all code operations below to be carried out if the if statement above is not met.
        {
            WeaponStock2 = MethodForWeapon2(stock2);//this line links the method (methodforweapon2) from the top of the form.
            Weaponcost2 = Weaponcost2 + 2.10;//this line adds the value of weapon 2 to the gun1 lable.
            Itemstock2 = Itemstock2 + 1;//this line of code adds the quantity of 1 to the qty2 label when the product button is pressed.
            stock2.setText("" + WeaponStock2);//this line sets the info of the value taken in from the variable weaponstock2 and sets it to the stock2 text field.
            gun2.setText("" + Weaponcost2);//this line sets the info of the value taken in from the variable weaponcost2 and sets it to the gun2 lable.
            Qty2.setText("" + Itemstock2);//this line sets the info of the value taken in from the variable itemstock2 and sets it to the qty2 lable.


            gun2.setText("" + df.format(Weaponcost2));
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_weapon2ActionPerformed

    private void weapon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weapon3ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");

        WeaponStock3 = (Integer.parseInt(stock3.getText()));
        double Weaponcost3 = (Double.parseDouble(gun3.getText()));
        Itemstock3 = (Integer.parseInt(Qty3.getText()));

        double WeaponTotalCost3 = (Double.parseDouble(Totalcost.getText()));
        WeaponTotalCost3 = WeaponTotalCost3 + 3.30;
        Totalcost.setText("" + df.format(WeaponTotalCost3));

        if (WeaponStock3 < 1.00) {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");
            stock3.setText("0.0");
        } else {
            Weaponcost3 = Weaponcost3 + 3.30;
            WeaponStock3 = WeaponStock3 - 1;
            Itemstock3 = Itemstock3 + 1;
            stock3.setText("" + WeaponStock3);
            gun3.setText("" + Weaponcost3);
            Qty3.setText("" + Itemstock3);


            gun3.setText("" + df.format(Weaponcost3));
        }
    }//GEN-LAST:event_weapon3ActionPerformed

    private void weapon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weapon4ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");

        WeaponStock4 = (Integer.parseInt(stock4.getText()));
        double Weaponcost4 = (Double.parseDouble(gun4.getText()));
        Itemstock4 = (Integer.parseInt(Qty4.getText()));

        double WeaponTotalCost4 = (Double.parseDouble(Totalcost.getText()));
        WeaponTotalCost4 = WeaponTotalCost4 + 3.40;
        Totalcost.setText("" + df.format(WeaponTotalCost4));

        if (WeaponStock4 < 1.00) {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");
            stock4.setText("0.0");
        } else {
            Weaponcost4 = Weaponcost4 + 3.40;
            WeaponStock4 = WeaponStock4 - 1;
            Itemstock4 = Itemstock4 + 1;
            stock4.setText("" + WeaponStock4);
            Qty4.setText("" + Itemstock4);
            gun4.setText("" + df.format(Weaponcost4));
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_weapon4ActionPerformed

    private void weapon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weapon5ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");

        WeaponStock5 = (Integer.parseInt(stock5.getText()));
        double Weaponcost5 = (Double.parseDouble(gun5.getText()));
        Itemstock5 = (Integer.parseInt(Qty5.getText()));

        double WeaponTotalCost5 = (Double.parseDouble(Totalcost.getText()));
        WeaponTotalCost5 = WeaponTotalCost5 + 5.50;
        Totalcost.setText("" + df.format(WeaponTotalCost5));

        if (WeaponStock5 < 1.00) {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");
            stock5.setText("0.0");
        } else {
            Weaponcost5 = Weaponcost5 + 5.50;
            WeaponStock5 = WeaponStock5 - 1;
            Itemstock5 = Itemstock5 + 1;
            stock5.setText("" + WeaponStock5);
            gun5.setText("" + Weaponcost5);
            Qty5.setText("" + Itemstock5);


            gun5.setText("" + df.format(Weaponcost5));
        }
    }//GEN-LAST:event_weapon5ActionPerformed

    private void weapon6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weapon6ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");

        WeaponStock6 = (Integer.parseInt(stock6.getText()));
        double Weaponcost6 = (Double.parseDouble(gun6.getText()));
        Itemstock6 = (Integer.parseInt(Qty6.getText()));

        double WeaponTotalCost6 = (Double.parseDouble(Totalcost.getText()));
        WeaponTotalCost6 = WeaponTotalCost6 + 6.70;
        Totalcost.setText("" + df.format(WeaponTotalCost6));

        if (WeaponStock6 < 1.00) {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");
            stock6.setText("0.0");
        } else {
            Weaponcost6 = Weaponcost6 + 6.70;
            WeaponStock6 = WeaponStock6 - 1;
            Itemstock6 = Itemstock6 + 1;
            stock6.setText("" + WeaponStock6);
            gun6.setText("" + Weaponcost6);
            Qty6.setText("" + Itemstock6);


            gun6.setText("" + df.format(Weaponcost6));
        }
    }//GEN-LAST:event_weapon6ActionPerformed

    private void euro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euro1ActionPerformed
        //above is the name of the 1 euro button in the vending machine and the code below is all the operations performed when the button is pushed.
        DecimalFormat df = new DecimalFormat("0.00");//the decimal format code is used to make sure that there are no more than two zeros after each decimal point.

        EuroStock1 = (Integer.parseInt(Euro1stock.getText()));//this variable and line of code is used to get information of how many 1 euro coins are in the vending machine each time the 1 euro button is pushed.
        double EuroTotal1 = (Double.parseDouble(Totalentered.getText()));//this line of code is used to get information about how many 1 euro coins have been put into the vending machine by the user.
        Euro1 = (Integer.parseInt(show1.getText()));//this line of code is used to send the value of 1 euro to the total amount of change entered by the user each time the button is used.

        if (EuroStock1 < 1)//this line of code is the start of an if else statement which states if the stock of 1 euro coins go bellow the value of 1 it will carry out a command.
        {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");//this is the command that will be carried out if the value of 1 euro coins go bellow 1 in the vending machine.
            Euro1stock.setText("0");//this line of code will set the stock of 1 euro coins to 0 so that the value wont go below that value when the button is pushed again before restocking.
        } else//this is the second part of the if else statement which lets all the other code below carry out its operations unless the above statement is met.
        {
            EuroTotal1 = EuroTotal1 + 1.00;
            EuroStock1 = EuroStock1 + 1;
            Euro1stock.setText("" + EuroStock1);
            Euro1 = Euro1 + 1;
            show1.setText("" + Euro1);
            Totalentered.setText("" + df.format(EuroTotal1));
        }
    }//GEN-LAST:event_euro1ActionPerformed

    private void stock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock3ActionPerformed

    private void cent20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent20ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        CentStock20 = (Integer.parseInt(Cent20stock.getText()));
        double CentTotal20 = (Double.parseDouble(Totalentered.getText()));
        Cent20 = (Integer.parseInt(show20.getText()));

        if (CentStock20 < 1) {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");
            Cent20stock.setText("0");
        } else {
            CentStock20 = CentStock20 + 1;
            CentTotal20 = CentTotal20 + 0.20;
            Cent20 = Cent20 + 1;
            Cent20stock.setText("" + CentStock20);
            Totalentered.setText("" + df.format(CentTotal20));
            show20.setText("" + Cent20);
        }
    }//GEN-LAST:event_cent20ActionPerformed

    private void cent10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent10ActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        CentStock10 = (Integer.parseInt(Cent10stock.getText()));
        Cent10 = (Integer.parseInt(show10.getText()));
        double CentTotal10 = (Double.parseDouble(Totalentered.getText()));

        if (CentStock10 < 1) {
            JOptionPane.showMessageDialog(null, "Out of stock please restock");
            Cent10stock.setText("0");
        } else {
            CentStock10 = CentStock10 + 1;
            Cent10 = Cent10 + 1;
            CentTotal10 = CentTotal10 + 0.10;
            Cent10stock.setText("" + CentStock10);
            Totalentered.setText("" + df.format(CentTotal10));
            show10.setText("" + Cent10);
        }
    }//GEN-LAST:event_cent10ActionPerformed

    private void TotalcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalcostActionPerformed

    private void restockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restockActionPerformed
        setVisible(false);//this line and the one below close the main vending machine
        dispose();

        Login Frame3 = new Login();//this line and the one below open the login form
        Frame3.setVisible(true);
    }//GEN-LAST:event_restockActionPerformed

    private void TotalenteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalenteredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalenteredActionPerformed

    private void buynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buynowActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");//decimal format code

        double Total1 = (Double.parseDouble(Totalentered.getText()));//gets text from total entered
        double Total2 = (Double.parseDouble(Totalcost.getText()));//gets text from total cost
        double Ans2 = Total1 - Total2;//ans2 is the result when total1 is taken from total2

        if (Total1 < Total2)//if total 1 is less than total 2 a message will pop up saying not enough change
        {
            JOptionPane.showMessageDialog(null, "Not enough change");
        } else//the else statement states
        {
            ChangeDue.setText("" + df.format(Ans2));//this is the answer gotten from ans 2 and set in the change due text field
            Qty1.setText("0");//this line and all the other lines below in the else sattement are set to zero so the process cant be repeated again when the button is pressed.
            Qty2.setText("0");
            Qty3.setText("0");
            Qty4.setText("0");
            Qty5.setText("0");
            Qty6.setText("0");
            gun1.setText("0.00");
            gun2.setText("0.00");
            gun3.setText("0.00");
            gun4.setText("0.00");
            gun5.setText("0.00");
            gun6.setText("0.00");
            show2.setText("0");
            show1.setText("0");
            show50.setText("0");
            show20.setText("0");
            show10.setText("0");
            Totalentered.setText("0.00");
            Totalcost.setText("0.00");
        }

        double Ans1 = Double.parseDouble(ChangeDue.getText());
        while (Ans1 > 0.00) {
            if (Ans1 >= 2.00) {
                Ans1 = Ans1 - 2.00;
                EuroStock2--;
                Euro2stock.setText(EuroStock2 + "");
                Euro2 = 0;
            } else if (Ans1 >= 1.00) {
                Ans1 = Ans1 - 1.00;
                EuroStock1--;
                Euro1stock.setText(EuroStock1 + "");
                Euro1 = 0;
            } else if (Ans1 >= .50) {
                Ans1 = Ans1 - 0.50;
                CentStock50--;
                Cent50stock.setText(CentStock50 + "");
                Cent50 = 0;
            } else if (Ans1 >= .20) {
                Ans1 = Ans1 - 0.20;
                CentStock20--;
                Cent20stock.setText(CentStock20 + "");
                Cent20 = 0;
            } else {
                Ans1 = Ans1 - 0.10;
                CentStock10--;
                Cent10stock.setText(CentStock10 + "");
                Cent10 = 0;
            }
            Ans1 = Double.parseDouble(df.format(Ans1));
        }
        purchase = 0;



    }//GEN-LAST:event_buynowActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RestockForm Frame1 = new RestockForm();

        stock1.setText(String.valueOf(Frame1.GunToRestock1));//this line sends the value of the stock of weapon 1 to the weapon 1 stock textfield in the restock form
        WeaponStock1 = Integer.parseInt(stock1.getText());//this line gets the info on how much stock is in the weapon one text field
        stock1.setText(WeaponStock1 + "");

        stock2.setText(String.valueOf(Frame1.GunToRestock2));
        WeaponStock2 = Integer.parseInt(stock2.getText());
        stock2.setText(WeaponStock2 + "");

        stock3.setText(String.valueOf(Frame1.GunToRestock3));
        WeaponStock3 = Integer.parseInt(stock3.getText());
        stock3.setText(WeaponStock3 + "");

        stock4.setText(String.valueOf(Frame1.GunToRestock4));
        WeaponStock4 = Integer.parseInt(stock4.getText());
        stock4.setText(WeaponStock4 + "");

        stock5.setText(String.valueOf(Frame1.GunToRestock5));
        WeaponStock5 = Integer.parseInt(stock5.getText());
        stock5.setText(WeaponStock5 + "");

        stock6.setText(String.valueOf(Frame1.GunToRestock6));
        WeaponStock6 = Integer.parseInt(stock6.getText());
        stock6.setText(WeaponStock6 + "");

        Euro2stock.setText(String.valueOf(Frame1.CoinToRestock1));
        EuroStock2 = Integer.parseInt(Euro2stock.getText());
        Euro2stock.setText(EuroStock2 + "");

        Euro1stock.setText(String.valueOf(Frame1.CoinToRestock2));
        EuroStock1 = Integer.parseInt(Euro1stock.getText());
        Euro1stock.setText(EuroStock1 + "");

        Cent50stock.setText(String.valueOf(Frame1.CoinToRestock3));
        CentStock50 = Integer.parseInt(Cent50stock.getText());
        Cent50stock.setText(CentStock50 + "");

        Cent20stock.setText(String.valueOf(Frame1.CoinToRestock4));
        CentStock20 = Integer.parseInt(Cent20stock.getText());
        Cent20stock.setText(CentStock20 + "");

        Cent10stock.setText(String.valueOf(Frame1.CoinToRestock5));
        CentStock10 = Integer.parseInt(Cent10stock.getText());
        Cent10stock.setText(CentStock10 + "");
    }//GEN-LAST:event_formWindowOpened

    private void stock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock1ActionPerformed

    private void Euro2stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Euro2stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Euro2stockActionPerformed

    private void refundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundActionPerformed

        if (purchase == 0) {
            JOptionPane.showMessageDialog(null, "Nothing to cancel");
        } else {
            DecimalFormat df = new DecimalFormat("0.00");

            double ReturnRequest = (Double.parseDouble(Totalentered.getText()));
            ChangeDue.setText("" + df.format(ReturnRequest));

            if (Euro2 == 0) {
                prevMoneyStock1 = EuroStock2;
            } else {
                prevMoneyStock1 = EuroStock2 - Euro2;
                EuroStock2 = prevMoneyStock1;
                Euro2stock.setText(prevMoneyStock1 + "");
                show2.setText("0");
                Euro2 = 0;
            }

            if (Euro1 == 0) {
                prevMoneyStock2 = EuroStock1;
            } else {
                prevMoneyStock2 = EuroStock1 - Euro1;
                EuroStock1 = prevMoneyStock2;
                Euro1stock.setText(prevMoneyStock2 + "");
                show1.setText("0");
                Euro1 = 0;
            }

            if (Cent50 == 0) {
                prevMoneyStock3 = CentStock50;
            } else {
                prevMoneyStock3 = CentStock50 - Cent50;
                CentStock50 = prevMoneyStock3;
                Cent50stock.setText(prevMoneyStock3 + "");
                show50.setText("0");
                Cent50 = 0;
            }

            if (Cent20 == 0) {
                prevMoneyStock4 = CentStock20;
            } else {
                prevMoneyStock4 = CentStock20 - Cent20;
                CentStock20 = prevMoneyStock4;
                Cent20stock.setText(prevMoneyStock4 + "");
                show20.setText("0");
                Cent20 = 0;
            }

            if (Cent10 == 0) {
                prevMoneyStock5 = CentStock10;
            } else {
                prevMoneyStock5 = CentStock10 - Cent10;
                CentStock10 = prevMoneyStock5;
                Cent10stock.setText(prevMoneyStock5 + "");
                show10.setText("0");
                Cent10 = 0;
            }

            if (Itemstock1 == 0) {
                prevItemstock1 = WeaponStock1;
            } else {
                prevItemstock1 = WeaponStock1 + Itemstock1;
                WeaponStock1 = prevItemstock1;
                stock1.setText(prevItemstock1 + "");
                Qty1.setText("0");
                Itemstock1 = 0;
            }

            if (Itemstock2 == 0) {
                prevItemstock2 = WeaponStock2;
            } else {
                prevItemstock2 = WeaponStock2 + Itemstock2;
                WeaponStock2 = prevItemstock2;
                stock2.setText(prevItemstock2 + "");
                Qty2.setText("0");
                Itemstock2 = 0;
            }

            if (Itemstock3 == 0) {
                prevItemstock3 = WeaponStock3;
            } else {
                prevItemstock3 = WeaponStock3 + Itemstock3;
                WeaponStock3 = prevItemstock3;
                stock3.setText(prevItemstock3 + "");
                Qty3.setText("0");
                Itemstock3 = 0;
            }

            if (Itemstock4 == 0) {
                prevItemstock4 = WeaponStock4;
            } else {
                prevItemstock4 = WeaponStock4 + Itemstock4;
                WeaponStock4 = prevItemstock4;
                stock4.setText(prevItemstock4 + "");
                Qty4.setText("0");
                Itemstock4 = 0;
            }

            if (Itemstock5 == 0) {
                prevItemstock5 = WeaponStock5;
            } else {
                prevItemstock5 = WeaponStock5 + Itemstock5;
                WeaponStock5 = prevItemstock5;
                stock5.setText(prevItemstock5 + "");
                Qty5.setText("0");
                Itemstock5 = 0;
            }

            if (Itemstock6 == 0) {
                prevItemstock6 = WeaponStock6;
            } else {
                prevItemstock6 = WeaponStock6 + Itemstock6;
                WeaponStock6 = prevItemstock6;
                stock6.setText(prevItemstock6 + "");
                Qty6.setText("0");
                Itemstock6 = 0;
            }

            show2.setText("0");
            show1.setText("0");
            show50.setText("0");
            show20.setText("0");
            show10.setText("0");
            gun1.setText("0.00");
            gun2.setText("0.00");
            gun3.setText("0.00");
            gun4.setText("0.00");
            gun5.setText("0.00");
            gun6.setText("0.00");
            Totalentered.setText("0.00");
            Totalcost.setText("0.00");
        }
    }//GEN-LAST:event_refundActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new N7Vending().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField Cent10stock;
    private javax.swing.JTextField Cent20stock;
    private javax.swing.JTextField Cent50stock;
    private javax.swing.JTextField ChangeDue;
    private javax.swing.JTextField Euro1stock;
    private javax.swing.JTextField Euro2stock;
    private javax.swing.JLabel Qty1;
    private javax.swing.JLabel Qty2;
    private javax.swing.JLabel Qty3;
    private javax.swing.JLabel Qty4;
    private javax.swing.JLabel Qty5;
    private javax.swing.JLabel Qty6;
    private javax.swing.JTextField Totalcost;
    private javax.swing.JTextField Totalentered;
    private javax.swing.JButton buynow;
    private javax.swing.JButton cent10;
    private javax.swing.JButton cent20;
    private javax.swing.JButton cent50;
    private javax.swing.JLabel costlabel1;
    private javax.swing.JButton euro1;
    private javax.swing.JButton euro2;
    private javax.swing.JLabel gun1;
    private javax.swing.JLabel gun2;
    private javax.swing.JLabel gun3;
    private javax.swing.JLabel gun4;
    private javax.swing.JLabel gun5;
    private javax.swing.JLabel gun6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton refund;
    private javax.swing.JButton restock;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show10;
    private javax.swing.JLabel show2;
    private javax.swing.JLabel show20;
    private javax.swing.JLabel show50;
    private javax.swing.JTextField stock1;
    private javax.swing.JTextField stock2;
    private javax.swing.JTextField stock3;
    private javax.swing.JTextField stock4;
    private javax.swing.JTextField stock5;
    private javax.swing.JTextField stock6;
    private javax.swing.JButton weapon1;
    private javax.swing.JButton weapon2;
    private javax.swing.JButton weapon3;
    private javax.swing.JButton weapon4;
    private javax.swing.JButton weapon5;
    private javax.swing.JButton weapon6;
    // End of variables declaration//GEN-END:variables
}
