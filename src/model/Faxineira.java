package model;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Faxineira extends Funcionario{

	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtNoturno;
	private JRadioButton rbtDiurno;
	private ButtonGroup grpRadio;
	
	public void IniciaFaxineira() {
	
	janela = new JFrame("Exemplo de radio button");
	lblEscolha = new JLabel();
	rbtNoturno = new JRadioButton();
	rbtDiurno = new JRadioButton();
	
	grpRadio = new ButtonGroup();
	
	lblEscolha.setText("Selecione o período: ");
	lblEscolha.setBounds(82, 18, 230, 18);

	rbtNoturno.setText("Solteiro");
	rbtNoturno.setBounds(80, 50, 100, 24);
	
	rbtDiurno.setText("Casado");
	rbtDiurno.setBounds(80, 75, 100, 24);
	
	grpRadio.add(rbtNoturno);
	grpRadio.add(rbtDiurno);
	
	}
	
	public void verificaSelecionado() {
		//verificar qual radio button foi selecionado
		String resposta = "";
		
		if(rbtNoturno.isSelected()) {
		resposta += rbtNoturno.getText();
		}
		if(rbtDiurno.isSelected()) {
		resposta += rbtDiurno.getText();
		}
		
		
		if(!resposta.equals("")) {
			//troca a cor da fonte para vermelho
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);
		}
		resposta = "";
	
	
	
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(340, 273);
	janela.setVisible(true);
	
	
}
}