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
   
        DefaultListModel<Product> l = new DefaultListModel<Product>();
        
        
       l.addElement(new Product(1,"Cola","Drinks",50));
       l.addElement(new Product(2, "Чипсы", "Snaks", 35));
       l.addElement(new Product(3, "Coffee", "HotDrinks", 40));
       l.addElement(new Product(4, "Tea", "HotDrinks", 20));
        
        JList<Product> b = new JList<Product>(l);
        
        b.setBounds(100,100,75,75);
        b.setVisible(true);
        
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

       // Кнопка "$ money"
        JButton btnLProduct = new JButton("$ money");
        btnLProduct.setFont(mainFont);
        btnLProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                
                    // Действие

            }

        });
        

        // Окно
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnPay);
        buttonPanel.add(btnLProduct);
        

        // Панель продуктов
       
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
