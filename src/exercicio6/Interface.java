package exercicio6;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class Interface extends JFrame{
	JLabel lblh = new JLabel("Altura");
	JLabel lblb = new JLabel("Base menor");
	JLabel lblB = new JLabel("Base maior");
	JLabel lblarea = new JLabel("Area");
	
	JTextField txth = new JTextField();
	JTextField txtb = new JTextField();
	JTextField txtB = new JTextField();
	JTextField txtarea = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	double h, b, B;
	
	public Interface(){
		Calculo calc = new Calculo();
		
		Container paine = this.getContentPane();
		
		paine.add(lblh); // label
		lblh.setBounds(20,20,245,40);
		
		paine.add(txth);// caixa
		txth.setBounds(120,30,140,20);
		
		paine.add(lblb);// label
		lblb.setBounds(20,100,245,40);
		
		paine.add(txtb);// caixa
		txtb.setBounds(120,110,140,20);
		
		paine.add(lblB);// label
		lblB.setBounds(20,140,245,40);
		
		paine.add(txtB);// caixa
		txtB.setBounds(120,150,140,20);
		
		
		paine.add(lblarea);// label
		lblarea.setBounds(20,180,245,40);
		
		paine.add(txtarea);// caixa
		txtarea.setBounds(120,190,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 h = Double.parseDouble(txth.getText());
				 b = Double.parseDouble(txtb.getText());
				 B = Double.parseDouble(txtB.getText());
				 txtarea.setText("" + calc.area(h, b, B));
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtarea.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]){
		
		Interface inte = new Interface();
	}
}
