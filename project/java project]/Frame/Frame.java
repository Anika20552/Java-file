package Frame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener
{
private JPanel panel;
private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
private JTextField tf1,tf2,tf3,tf4;
private JPasswordField pf;
private JRadioButton jb1, jb2;
private ButtonGroup bg;
private JComboBox cb;
private JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
private Font f1,f2;
private Color c1,c2,c3;
private JButton btnPlus,btnMinus,btnAdd,btnShowPassword;
private boolean isPasswordVisible = false;
private int quantity = 1;
private JTextArea ta;
private JLabel qtyLabel;


public Frame()
{

		super("Garments Management system");
		super.setBounds(400,50,900,700); //width,height 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    c1 = new Color(222,226,255);
		c2=new Color(129,114,254);
		c3=new Color(255,255,255);
		panel = new JPanel();
		panel.setLayout(null);
	    panel.setBackground(c1);
		super.add(panel);
		
		f1 = new Font("Cambria", Font.BOLD, 30);
		f2 = new Font("Cambria", Font.BOLD, 18);
		
		label1 = new JLabel("StitchForge");
		label1.setBounds(250,0,300,50); 
		label1.setFont(f1);
		panel.add(label1);
		
		label2 = new JLabel("Name:");
		label2.setBounds(50,80,120,30); 
		panel.add(label2);
		label2.setFont(f2);
		
		tf1 = new JTextField();
		tf1.setBounds(180,80,220,30);
		panel.add(tf1);
		
		label3 = new JLabel("Product Type:");
		label3.setBounds(50,130,120,30); 
		panel.add(label3);
		label3.setFont(f2);
		
		tf2 = new JTextField();
		tf2.setBounds(180,130,220,30);
		panel.add(tf2);
		
		label4 = new JLabel("Product code:");
		label4.setBounds(50,180,120,30); 
		panel.add(label4);
		label4.setFont(f2);
		
		btnShowPassword = new JButton("Show");
        btnShowPassword.setBounds(410, 180, 80, 30);
		btnShowPassword.setBackground(c2);
		btnShowPassword.setForeground(c3);
        panel.add(btnShowPassword);
        btnShowPassword.addActionListener(this);
		
		pf = new JPasswordField();
		pf.setBounds(180,180,220,30); 
		pf.setEchoChar('$');
		panel.add(pf);
		
		label5 = new JLabel("Gender :");
		label5.setBounds(50,230,120,30); 
		label5.setBackground(c1);
		panel.add(label5);
		label5.setFont(f2);
		
		jb1 = new JRadioButton("Male");
		jb1.setBounds(180,230,80,30); 
		jb1.setBackground(c1);
		panel.add(jb1);
		
		jb2 = new JRadioButton("Female");
		jb2.setBounds(270,230,80,30); 
		jb2.setBackground(c1);
		panel.add(jb2);
		
		bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		
		label6 = new JLabel("Product Size :");
		label6.setBounds(50,280,120,30); 
		panel.add(label6);
		label6.setFont(f2);
		
		String items[] = new String[] 
		{"","S", "M", "L","XL","XXL"};
		cb = new JComboBox(items);
		cb.setBounds(180,280,120,30); 
		cb.setBackground(c2);
		cb.setForeground(c3);
		panel.add(cb);
		
		label7 = new JLabel("Fabric Material:");
		label7.setBounds(50,330,140,30); 
		panel.add(label7);
		label7.setFont(f2);
		
		cb1 = new JCheckBox("Cotton");
		cb1.setBounds(180,330,120,30); 
		cb1.setBackground(c1);
		panel.add(cb1);
		
		cb2 = new JCheckBox("Demin");
		cb2.setBounds(180,360,120,30);
		cb2.setBackground(c1);
		panel.add(cb2);
		
		cb3 = new JCheckBox("Wool");
		cb3.setBounds(180,390,120,30); 
		cb3.setBackground(c1);
		panel.add(cb3);
		
		cb4 = new JCheckBox("Polyester");
		cb4.setBounds(180,420,120,30); 
		cb4.setBackground(c1);
		panel.add(cb4);
		
		cb5 = new JCheckBox("Silk");
		cb5.setBounds(320,330,120,30);
		cb5.setBackground(c1);
		panel.add(cb5);
		
		cb6 = new JCheckBox("Linen");
		cb6.setBounds(320,360,120,30); 
		cb6.setBackground(c1);
		panel.add(cb6);
		
		cb7 = new JCheckBox("Jersy");
		cb7.setBounds(320,390,120,30); 
		cb7.setBackground(c1);
		panel.add(cb7);
		
		cb8 = new JCheckBox("Satin");
		cb8.setBounds(320,420,120,30); 
		cb8.setBackground(c1);
		panel.add(cb8);
		
		
		label8 = new JLabel("Quantity:");
		label8.setBounds(50,470,140,30); 
		panel.add(label8);
		label8.setFont(f2);
		
		btnMinus = new JButton("-");
        btnMinus.setBounds(180,470,50, 30);
		btnMinus.setBackground(c2);
		btnMinus.setForeground(c3);
        panel.add(btnMinus);
		
		
		qtyLabel = new JLabel("1", SwingConstants.CENTER);
        qtyLabel.setBounds(235, 470, 50, 30);
        qtyLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.add(qtyLabel);
		
		btnPlus = new JButton("+");
        btnPlus.setBounds(290, 470, 50, 30);
		btnPlus.setBackground(c2);
		btnPlus.setForeground(c3);
        panel.add(btnPlus);
		
		btnAdd = new JButton("Add");
        btnAdd.setBounds(350, 470, 80, 30);
        panel.add(btnAdd);
		btnAdd.setBackground(c2);
		btnAdd.setForeground(c3);
		
		btnMinus.addActionListener(this);
        btnPlus.addActionListener(this);
        btnAdd.addActionListener(this);
		
		label9 = new JLabel("Color:");
        label9.setBounds(50, 570, 120, 30);
        panel.add(label9);
		label9.setFont(f2);


        tf3 = new JTextField();
        tf3.setBounds(180, 570, 220, 30);
        panel.add(tf3);
		
        label10 = new JLabel("Price:");
        label10.setBounds(50, 610, 120, 30);
        panel.add(label10);
	    label10.setFont(f2);
		
		
        tf4= new JTextField();
        tf4.setBounds(180, 610, 220, 30);
        panel.add(tf4);

		
		
		
		
		
		
		
       
       
}
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btnMinus && quantity > 1) {
        quantity--;
    }

    if (e.getSource() == btnPlus) {
        quantity++;
    }

    if (e.getSource() == btnAdd) {
        JOptionPane.showMessageDialog(this,
                "Selected Quantity: " + quantity);
    }
	 qtyLabel.setText(String.valueOf(quantity));
	 
	 
	 
	 if (e.getSource() == btnShowPassword) {

    if (isPasswordVisible) {
        pf.setEchoChar('$');    
        btnShowPassword.setText("Show");
        isPasswordVisible = false;

    } else {
        pf.setEchoChar((char) 0);
        btnShowPassword.setText("Hide");
        isPasswordVisible = true;

	}
}


}
}
