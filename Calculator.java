import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Cal extends JFrame{
	JButton[] btns = new JButton[18];
	String[] btnName = {"7","8","9"," x ","4","5","6"," / ","1","2","3"," + ","0","."," - "," = ","C","Del"};
	
	static JTextField text;
	static JTextField text2;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	int operator;
	String input = "";
	double num = 0;
	double num2 = 0;
	boolean eq = false;
	
	Cal(){
		setSize(300,400);
		setTitle("Calculator");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		
		//  Add  panel
		panel = new JPanel(new GridLayout(4,4));
		panel2 = new JPanel(new GridLayout(2,1));
		panel3 = new JPanel(new FlowLayout());
		
		//  Add Text Field
		text2 = new JTextField(10);
		text2.setFont(new Font("",1,15));
		text2.setHorizontalAlignment(JTextField.RIGHT);
		text2.setEditable(false);
		panel2.add(text2);
		
		text = new JTextField(10);
		text.setFont(new Font("",1,30));
		text.setHorizontalAlignment(JTextField.RIGHT);
		text.setEditable(false);
		panel2.add(text);
		
		//  Add Buttuns
		for(int i=0;i<btnName.length;i++){
			if(i>=16){
				btns[i] = new JButton(btnName[i]);
				btns[i].setFont(new Font("",1,18));
				panel3.add(btns[i]);
			}else{
				btns[i] = new JButton(btnName[i]);
				btns[i].setFont(new Font("",1,18));
				panel.add(btns[i]);
			}
		}
		
		//  All ation lesteners
		btns[0].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[0]);
				text.setText(text.getText()+btnName[0]);
				input += btnName[0];
			}
		});
		
		btns[1].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[1]);
				text.setText(text.getText()+btnName[1]);
				input += btnName[1];
			}
		});
		btns[2].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[2]);
				text.setText(text.getText()+btnName[2]);
				input += btnName[2];
			}
		});
		btns[4].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[4]);
				text.setText(text.getText()+btnName[4]);
				input += btnName[4];
			}
		});
		btns[5].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[5]);
				text.setText(text.getText()+btnName[5]);
				input += btnName[5];
			}
		});
		btns[6].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[6]);
				text.setText(text.getText()+btnName[6]);
				input += btnName[6];
			}
		});
		btns[8].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[8]);
				text.setText(text.getText()+btnName[8]);
				input += btnName[8];
			}
		});
		btns[9].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[9]);
				text.setText(text.getText()+btnName[9]);
				input += btnName[9];
			}
		});
		btns[10].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[10]);
				text.setText(text.getText()+btnName[10]);
				input += btnName[10];
			}
		});
		btns[12].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[12]);
				text.setText(text.getText()+btnName[12]);
				input += btnName[12];
			}
		});
		btns[13].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//  Clear text 1
				if(eq == true){	
					text.setText("");
					text2.setText("");
					eq = false;
				}
				
				//  Set text 
				text2.setText(text2.getText()+btnName[13]);
				text.setText(text.getText()+btnName[13]);
				input += btnName[13];
			}
		});
		
		//  Operators
		btns[3].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text2.setText(text2.getText()+btnName[3]);
				text.setText(text.getText()+btnName[3]);
				try{
					num += Double.valueOf(input);
				}catch(Exception ex){
					num = num2;
					text2.setText("Ans "+btnName[3]);
					text.setText(num+""+btnName[3]);
					if(eq == true){	
						eq = false;
					}
				}
				input = "";
				operator = 3;
			}
		});
		btns[7].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text2.setText(text2.getText()+btnName[7]);
				text.setText(text.getText()+btnName[7]);
				try{
					num += Double.valueOf(input);
				}catch(Exception ex){
					num = num2;
					text2.setText("Ans "+btnName[7]);
					text.setText(num+""+btnName[7]);
					if(eq == true){	
						eq = false;
					}
				}
				input = "";
				operator = 7;
			}
		});
		btns[11].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text2.setText(text2.getText()+btnName[11]);
				text.setText(text.getText()+btnName[11]);
				try{
					num += Double.valueOf(input);
				}catch(Exception ex){
					num = num2;
					text2.setText("Ans "+btnName[11]);
					text.setText(num+""+btnName[11]);
					if(eq == true){	
						eq = false;
					}
				}
				input = "";
				operator = 11;
			}
		});
		btns[14].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text2.setText(text2.getText()+btnName[14]);
				text.setText(text.getText()+btnName[14]);
				try{
					num += Double.valueOf(input);
				}catch(Exception ex){
					num = num2;
					text2.setText("Ans "+btnName[14]);
					text.setText(num+""+btnName[14]);
					if(eq == true){	
						eq = false;
					}
				}
				input = "";
				operator = 14;
			}
		});
		btns[15].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if(operator == 3){
						num *= Double.valueOf(input);
					}else if(operator == 7){
						num /= Double.valueOf(input);
					}else if(operator == 11){
						num += Double.valueOf(input);
					}else if(operator == 14){
						num -= Double.valueOf(input);
					}
				}catch(Exception ex){
					text2.setText(num+"");
				}
				text2.setText(text.getText()+btnName[15]+num);
				text.setText("");
				num2 = num;
				num = 0 ;
				input = "";
				eq = true;
			}
		});
		
		//  Other Operators
		btns[16].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num2 = 0;
				num = 0;
				input = "";
				text.setText("");
				text2.setText("");
			}
		});
		btns[17].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(input.length() != 0){
					//if(){}
					input = input.substring(0, input.length()-1);
					text.setText(text.getText().substring(0, text.getText().length()-1));
					text2.setText(text2.getText().substring(0, text2.getText().length()-1));
				}
			}
		});
		
		add("North",panel2);
		add("Center",panel);
		add("South",panel3);
		
		setVisible(true);
		
	}
}   

class Calculator{
	public static void main(String args[]){
		new Cal();
	}
}
