package platformer;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Ismail, Faris, Nadeem
//Date: 21/3/2021
public class Main_Menu implements ActionListener {
	JTextArea h,w,x;
	JButton btn;
	JCheckBox checkbox1;
	int width, height;

	public Main_Menu() {
		JFrame frame = new JFrame("Main_Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(460, 500);
		frame.setLocation(430, 100);
		JPanel panel = new JPanel();
		panel.setLayout(null); 
		frame.add(panel);
		h = new JTextArea("1080");
		h.setBounds(160, 150, 50, 30);
		h.setEditable(true);
		h.setBackground(Color.LIGHT_GRAY);
		x = new JTextArea("x");
		x.setBounds(215, 160, 6, 15);
		x.setEditable(false);
		x.setBackground(Color.LIGHT_GRAY);
		w = new JTextArea("1920");
		w.setBounds(227, 150, 50, 30);
		w.setEditable(true);
		w.setBackground(Color.LIGHT_GRAY);
		checkbox1 = new JCheckBox("Fullscreen");    
		checkbox1.setBounds(180,200, 100,50);
		btn = new JButton("OK");
		btn.setBounds(175,250,100,30);
		btn.addActionListener(this);
		panel.add(checkbox1);
		panel.add(h);
		panel.add(x);
		panel.add(w);
		panel.add(btn);
		frame.setVisible(true);
	}
	public void actionPerformed (ActionEvent e) {	
		width = Integer.parseInt(w.getText());
		height = Integer.parseInt(h.getText());
		new Main(new Levels().testBench(),20,20,width,height);
	}

	public static void main(String[] args) {
		new Main_Menu();

	}

}
