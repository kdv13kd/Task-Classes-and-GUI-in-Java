package MenuStrJava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyPanel extends JPanel {
	JTextField textfield1 = new JTextField(25);
	JTextField textfield2 = new JTextField(25);	
	JTextField textfield3 = new JTextField(25);
	JTextField textfield4 = new JTextField(25);	
	JTextField eqlAnsw = new JTextField(10);
	NewStr s1 = new NewStr("t-e-34�s t12.43te1.2st444tes00t");
	NewStr s2 = new NewStr();
	JLabel str1 = new JLabel("  ������ �1:    "+ s1.NewStrOut());
	JLabel str2 = new JLabel("  ������ �2:    "+ s2.NewStrOut());
	
	
	MyPanel(){
		ActionListener listener = new MyListener();
		JButton butChng1 = new JButton("�������� ������ �1");
		JButton butChng2 = new JButton("�������� ������ �2");
		JButton butDel1 = new JButton("������� ������ �1");
		JButton butDel2 = new JButton("������� ������ �2");
		JButton eql = new JButton("�������� ������");
		JButton getNumb1 = new JButton("������� ����� �� ������ �1");
		JButton getNumb2 = new JButton("������� ����� �� ������ �2");

		butChng1.addActionListener(listener);
		butChng2.addActionListener(listener);
		butDel1.addActionListener(listener);
		butDel2.addActionListener(listener);
		eql.addActionListener(listener);
		getNumb1.addActionListener(listener);
		getNumb2.addActionListener(listener);
		
		JLabel empt;
		JLabel chng1 = new JLabel("  ������ �1: ");
		JLabel chng2 = new JLabel("  ������ �2: ");

    //===========grid table=================================================================	
	    setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);  
	    setLayout(new GridBagLayout()); 
	    GridBagConstraints constraints = new GridBagConstraints(); 
	//=======0 lvl===========         
	    constraints.fill = GridBagConstraints.HORIZONTAL; 
	    constraints.ipady = 20;   // ������ ������� 
	    constraints.weightx   = 1.0; 
	    //constraints.weighty   = 1.0; 
	    constraints.gridwidth = 2;    // ������ ������ � ��� ������
	    constraints.gridx     = 0;    // ������� ������ �� �����������
	    constraints.gridy     = 0;    // ������ ������ �� ���������
	    add(str1, constraints); 
	    constraints.gridx = 2;      
	    add(str2, constraints); 
	//=======1 lvl===========	    
	    constraints.weightx   = 0.0; 
	    constraints.ipady = 0;   
	    constraints.gridwidth = 1;    
	    constraints.gridx = 0;      
	    constraints.gridy = 1;     
	    add(chng1, constraints); 

	    constraints.gridx = 1;      
	    add(textfield1, constraints); 

	    constraints.gridx = 2;     
	    add(butChng1, constraints); 

	    constraints.gridx = 3;   
	    add(butDel1, constraints);    	    
	//=======2 lvl===========	    
	    empt = new JLabel(" "); 
	    constraints.gridx = 0;      
	    constraints.gridy = 2;      
	    add(empt, constraints); 
	//=======3 lvl===========
	    constraints.gridx = 0;     
	    constraints.gridy = 3;      
	    add(chng2, constraints); 
	     
	    constraints.gridx = 1;    
	    add(textfield2, constraints); 
	   
	    constraints.gridx = 2;   
	    add(butChng2, constraints); 
	    
	    constraints.gridx = 3;   
	    add(butDel2, constraints); 
	//=======4 lvl===========  
	    empt = new JLabel(" "); 
	    constraints.gridx = 0;      
	    constraints.gridy = 4;      
	    add(empt, constraints);
	//=======5 lvl===========	    
	    constraints.gridx = 2;     
	    constraints.gridy = 5;      
	    add(eql, constraints); 
	   
	    constraints.gridx = 1;      
	    add(eqlAnsw, constraints); 
    //=======6 lvl===========
	    empt = new JLabel(" "); 
	    constraints.gridx = 0;      
	    constraints.gridy = 6;      
	    add(empt, constraints); 
    //=======7 lvl===========
	    constraints.gridx = 2;     
	    constraints.gridy = 7;      
	    add(getNumb1, constraints); 
	   
	    constraints.gridx = 1;      
	    add(textfield3, constraints);     
	//=======8 lvl===========
	    empt = new JLabel(" "); 
	    constraints.gridx = 0;      
	    constraints.gridy = 8;      
	    add(empt, constraints); 
    //=======9 lvl===========  
	    constraints.gridy = 9;      
	    constraints.gridx = 2;     
	    add(getNumb2, constraints); 
	   
	    constraints.gridx = 1;      
	    add(textfield4, constraints); 
	//=====��������==
	    empt = new JLabel(" "); 
	    constraints.ipady     = 0;    // ���������� �������������� ������ ������ 
	    constraints.weighty   = 1.0;  // ���������� ������ // ���������� ������ � ����� ����
	    constraints.anchor    = GridBagConstraints.PAGE_END; 
	    constraints.insets    = new Insets(7, 0, 0, 0);  // ������� ������ �� Y 
	    constraints.gridwidth = 2;    // ������ ������ � 2 ������ 
	    constraints.gridx     = 1;    // ������ ������ ������� �� �����������
	    constraints.gridy     = 10;    // ������ ������ �� ���������
	    add(empt, constraints);  
   //================================================================================		
	}

	public class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			String str;
			if (event.getActionCommand().equals("�������� ������ �1")) {
				str = textfield1.getText();
				s1.NewStrIn(str);
				str1.setText("  ������ �1:    "+ s1.NewStrOut());
			}
			if (event.getActionCommand().equals("�������� ������ �2")) {
				str = textfield2.getText();
				s2.NewStrIn(str);
				str2.setText("  ������ �2:    "+ s2.NewStrOut());
			}
			if (event.getActionCommand().equals("������� ������ �1")) {
				s1.DelNewStr();
				str1.setText("  ������ �1:    "+ s1.NewStrOut());
				textfield1.setText(s1.NewStrOut());
			}
			if (event.getActionCommand().equals("������� ������ �2")) {
				s2.DelNewStr();
				str2.setText("  ������ �2:    "+ s2.NewStrOut());
				textfield2.setText(s2.NewStrOut());
			}
			if (event.getActionCommand().equals("�������� ������")) {
				eqlAnsw.setText(s1.EqNewStr(s2.nstr));
			}
			if (event.getActionCommand().equals("������� ����� �� ������ �1")) {
				//System.out.println(s1.NewStrOut());
				textfield3.setText(s1.GetNumbNewStr());
				//System.out.println(s1.NewStrOut());
			}
			if (event.getActionCommand().equals("������� ����� �� ������ �2")) {
				textfield4.setText(s2.GetNumbNewStr());
			}
			repaint();
		}
	}
}