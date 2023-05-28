package VendingMachine;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VendingMachine.VendingMachine;
import javax.swing.*;

import Products.Bottle;
import Products.HotDrink;
import Products.Product;

public class MainFrame extends JFrame{


    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
   

    public void initialize() {
      
        DefaultListModel<String> l = new DefaultListModel< >();
        l.addElement("first item");
        l.addElement("second item");
        JList<String> b = new JList< >(l);
        
        b.setBounds(100,100,75,75);
        b.setVisible(false);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
      
        // Кнопка "Купить"
        JButton btnPay = new JButton("Купить");
        btnPay.setFont(mainFont);
        btnPay.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    
                    // Действие

            }

        });

       // Кнопка "Список товаров"
        JButton btnLProduct = new JButton("Список товаров");
        btnLProduct.setFont(mainFont);
        btnLProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                b.setVisible(true);
                
                    // Действие

            }

        });
        

        // Окно
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnPay);
        buttonPanel.add(btnLProduct);
        

        // Паанель продуктов
       
        JPanel mainPanel = new JPanel();
      
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        
        mainPanel.add(formPanel, BorderLayout.NORTH);
      
        mainPanel.add(b, BorderLayout.NORTH);
        
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        
        add(mainPanel);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arg)
    {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }

}