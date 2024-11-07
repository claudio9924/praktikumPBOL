import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tugas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
        //Inisiasi card layout
        CardLayout card = new CardLayout();

        //Inisiasi panel utama
        JPanel main = new JPanel(); //untuk menggabung gabungan1 dan gabungan2

        //Inisiasi panel gabungan
        JPanel gabungan2 = new JPanel(); //untuk menggabung panel1, panel2, dan panel3
        JPanel gabungan1 = new JPanel(); //untuk menggabung panela, panelb, dan panelc
        
        //Panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        JLabel labelsignup = new JLabel("SIGN UP");
        labelsignup.setFont(new Font("Arial", Font.BOLD, 24));
        labelsignup.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelsignup.setForeground(Color.BLUE);

        panel1.add(labelsignup);
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 10, 0, 10));
        
        //Panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        JLabel labelfullname = new JLabel("Full Name");
        JLabel labelemail = new JLabel("Email");
        JLabel labelkosong1 = new JLabel(" ");
        JLabel labelkosong2 = new JLabel(" ");
        JLabel labelkosong3 = new JLabel(" ");
        JLabel labelpassword = new JLabel("Password");
        JTextField box1 = new JTextField();
        box1.setMaximumSize(new Dimension(20000, 20));
        box1.setMinimumSize(new Dimension(0, 20));
        JTextField box2 = new JTextField();
        box2.setMaximumSize(new Dimension(20000, 20));
        box2.setMinimumSize(new Dimension(0, 20));
        JTextField box3 = new JTextField();
        box3.setMaximumSize(new Dimension(20000, 20));
        box3.setMinimumSize(new Dimension(0, 20));
        JButton buttonsignup = new JButton("Sign Up");
        buttonsignup.setBackground(Color.BLUE);
        buttonsignup.setForeground(Color.WHITE);
        labelfullname.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelkosong1.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelkosong2.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelkosong3.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelpassword.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelemail.setAlignmentX(Component.LEFT_ALIGNMENT);
        box1.setAlignmentX(Component.LEFT_ALIGNMENT);
        box2.setAlignmentX(Component.LEFT_ALIGNMENT);
        box3.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonsignup.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        panel2.add(labelfullname);
        panel2.add(box1);
        panel2.add(labelkosong1);
        panel2.add(labelemail);
        panel2.add(box2);
        panel2.add(labelkosong2);
        panel2.add(labelpassword);
        panel2.add(box3);
        panel2.add(labelkosong3);
        panel2.add(buttonsignup);
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        //Panel 3
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelketerangan = new JLabel("I've an account");
        JButton buttonlogin = new JButton("Login");
        buttonlogin.setBackground(Color.BLUE);
        buttonlogin.setForeground(Color.WHITE);
        buttonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(main, "LoginPanel");
            }
        });
        
        panel3.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        panel3.add(labelketerangan);
        panel3.add(buttonlogin);
        
        //Panel gabungan1
        gabungan1.setLayout(new BorderLayout());
        gabungan1.add(panel1, BorderLayout.NORTH);
        gabungan1.add(panel2, BorderLayout.CENTER);
        gabungan1.add(panel3, BorderLayout.SOUTH);
        
        //Panel a
        JPanel panela = new JPanel();
        panela.setLayout(new BoxLayout(panela, BoxLayout.Y_AXIS));
        JLabel labellogin = new JLabel("LOGIN");
        labellogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        labellogin.setFont(new Font("Arial", Font.BOLD, 24));
        labellogin.setForeground(Color.BLUE);
        
        panela.add(labellogin);
        panela.setBorder(BorderFactory.createEmptyBorder(20, 10, 0, 10));

        //Panel B
        JPanel panelb = new JPanel();
        panelb.setLayout(new BoxLayout(panelb, BoxLayout.Y_AXIS));
        JButton buttonlogin2 = new JButton("Login");
        buttonlogin2.setBackground(Color.BLUE);
        buttonlogin2.setForeground(Color.WHITE);
        JLabel labelemail2 = new JLabel("Email");
        JLabel labelkosong12 = new JLabel(" ");
        JLabel labelkosong22 = new JLabel(" ");
        JLabel labelpassword2 = new JLabel("Password");
        JTextField box12 = new JTextField();
        box12.setMaximumSize(new Dimension(20000, 20));
        box12.setMinimumSize(new Dimension(0, 20));
        JTextField box22 = new JTextField();
        box22.setMaximumSize(new Dimension(20000, 20));
        box22.setMinimumSize(new Dimension(0, 20));
        labelkosong12.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelkosong22.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelpassword2.setAlignmentX(Component.LEFT_ALIGNMENT);
        labelemail2.setAlignmentX(Component.LEFT_ALIGNMENT);
        box12.setAlignmentX(Component.LEFT_ALIGNMENT);
        box22.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonlogin2.setAlignmentX(Component.LEFT_ALIGNMENT);

        panelb.add(labelemail2);
        panelb.add(box12);
        panelb.add(labelkosong12);
        panelb.add(labelpassword2);
        panelb.add(box22);
        panelb.add(labelkosong22);
        panelb.add(buttonlogin2);
        panelb.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        
        //Panel C
        JPanel panelc = new JPanel();
        panelc.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelketerangan2 = new JLabel("I don't have an account");
        JButton buttonsignup2 = new JButton("Sign Up");
        buttonsignup2.setBackground(Color.BLUE);
        buttonsignup2.setForeground(Color.WHITE);
        buttonsignup2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(main, "SignUpPanel");
            }
        });
        
        panelc.add(labelketerangan2);
        panelc.add(buttonsignup2);

        //Panel gabungan2
        gabungan2.setLayout(new BoxLayout(gabungan2, BoxLayout.Y_AXIS));
        panela.setAlignmentX(Component.TOP_ALIGNMENT);
        panelb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelc.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        gabungan2.add(panela);
        gabungan2.add(panelb);
        gabungan2.add(panelc);
        // JPanel gabungan2center = new JPanel();
        // gabungan2center.setLayout(new BoxLayout(gabungan2center, BoxLayout.X_AXIS));
        // panelb.setAlignmentY(Component.CENTER_ALIGNMENT);
        // gabungan2center.add(panelb);

        gabungan2.setLayout(new BorderLayout());
        gabungan2.add(panela, BorderLayout.NORTH);
        gabungan2.add(panelb, BorderLayout.CENTER);
        gabungan2.add(panelc, BorderLayout.SOUTH);


        main.setLayout(card);
        main.add(gabungan1, "SignUpPanel");
        main.add(gabungan2, "LoginPanel");
        frame.add(main);
        card.show(main,"SignUpPanel");

        frame.setVisible(true);
        // frame.setResizable(false);
    }
}