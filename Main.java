package SharnaAkther.com;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 500);
		frame.setTitle("Calculator");
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JLabel lvl1 = new JLabel();
		lvl1.setText("Number1 : ");
		lvl1.setBounds(30, 30, 100, 30);
		frame.add(lvl1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(120, 30, 200, 30);
		frame.add(tf1);
		
		JLabel lvl2 = new JLabel();
		lvl2.setText("Number2 : ");
		lvl2.setBounds(30, 70, 100, 30);
		frame.add(lvl2);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(120, 70, 200, 30);
		frame.add(tf2);
		
		JLabel result = new JLabel();
		result.setText("Result : ");
		result.setBounds(30, 250, 300, 30);
		frame.add(result);
		
        JTextArea history = new JTextArea();
		history.setEditable(false);
		
		JScrollPane sp = new JScrollPane(history);
		sp.setBounds(30, 320, 370, 100);
		sp.setBorder(BorderFactory.createTitledBorder("History"));
		frame.add(sp);
		 
		JButton Sumbtn = new JButton();
		Sumbtn.setText("SUM");
		Sumbtn.setBackground(Color.PINK);
		Sumbtn.setBounds(30, 130, 100, 40);
		frame.add(Sumbtn);
		
		JButton Subtractbtn = new JButton();
		Subtractbtn.setText("SUBTRACT");
		Subtractbtn.setBackground(Color.YELLOW);
		Subtractbtn.setBounds(140, 130, 100, 40);
		frame.add(Subtractbtn);
		
		JButton Multiplybtn = new JButton();
		Multiplybtn.setText("MULTIPLY");
		Multiplybtn.setBackground(Color.MAGENTA);
		Multiplybtn.setBounds(30, 190, 100, 40);
		frame.add(Multiplybtn);
		
		JButton Dividebtn = new JButton();
		Dividebtn.setText("DIVIDE");
		Dividebtn.setBackground(Color.green);
		Dividebtn.setBounds(140, 190, 100, 40);
		frame.add(Dividebtn);
		
		JButton Clearallbtn = new JButton();
		Clearallbtn.setText("CLEAR All");
		Clearallbtn.setBackground(Color.RED);
		Clearallbtn.setBounds(30, 280, 100, 40);
		frame.add(Clearallbtn);
		
		JButton Clearlinebtn = new JButton("Clear Line");
		Clearlinebtn.setBackground(Color.ORANGE);
		Clearlinebtn.setBounds(140, 280, 150, 40);
		frame.add(Clearlinebtn);
				
		Sumbtn.addActionListener(e->{
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			double sum = num1 +num2;
			result.setText("Result : "+sum);
			history.append(num1+" + "+num2+" = "+sum+ "\n");
			
		});
		
		Subtractbtn.addActionListener(e->{
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			double sub = num1 - num2;
			result.setText("Result : "+sub);
			history.append(num1+" - "+num2+" = "+sub+ "\n");
			
		});
		
		Multiplybtn.addActionListener(e->{
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			double mul = num1 * num2;
			result.setText("Result : "+mul);
			history.append(num1+" * "+num2+" = "+mul+ "\n");
			
		});
		
		Dividebtn.addActionListener(e->{
			double num1 = Double.parseDouble(tf1.getText());
			double num2 = Double.parseDouble(tf2.getText());
			if(num2 !=0)
			{
			    double div = num1 / num2;
			    result.setText("Result : "+div);
			    history.append(num1+" / "+num2+" = "+div+ "\n");
			}
			else
			{
				result.setText("Cannot Divide by Zero!");
				history.append(num1+" / "+num2+" = "+"Cannot Divide by Zero!");
			}
			
		});
		
		tf1.addActionListener(e->{
			
			tf2.requestFocus();
		});
		
		Clearallbtn.addActionListener(e->{
			tf1.setText("");
			tf2.setText("");
			result.setText("Result : ");
			history.setText("");
		});
		
		Clearlinebtn.addActionListener(e ->{
			String text = history.getText();
			if(!text.isEmpty())
			{
				String[] lines = text.split("\n");
			    StringBuilder updatedtext = new StringBuilder();
			    for(int i = 0 ; i < lines.length - 1 ; i++)
			    {
			    	updatedtext.append(lines[i]).append("\n");
			    	
			    }
				history.setText(updatedtext.toString());
			}
			
		});
		
		
		
		
		
		frame.setVisible(true);
	}
}
