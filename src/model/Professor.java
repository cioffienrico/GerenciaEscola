package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Professor extends Funcionario{

	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela; 
	private String[] colunas = new String [] {"Materias"};
	private String [] [] dados = new String [] [] {};
	
	private JLabel lbIncluirMat;
	
	private JTextField jtfIncluirMat;
	
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;
	
	public void iniciaProfessor() {
	
	//criar as instancias 
	janela = new JFrame("Materias");
	lbIncluirMat = new JLabel("Informe a Materia: ");	
	jtfIncluirMat = new JTextField();	
	botaoIncluir = new JButton("Incluir");
	botaoExcluir = new JButton("Excluir");
	
	painelDaJanela = (JPanel) janela.getContentPane();
	
	//criar a tabela, ao inves de passar os atributos direto
	
//iremos colocar em um modelo de dados
	DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
	tabela = new JTable(modelo);
	
	tabela.setEnabled(true);
	
	//instanciando e inserindo a tabela no scroll
	painelDeScroll = new JScrollPane(tabela);
	painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	
	//configurações e posição e tamanho dos componentes
	painelDeScroll.setBounds(10, 100, 360, 95);
	tabela.setBounds(10, 30, 300, 95);
	botaoIncluir.setBounds(75, 200, 100, 50);
	botaoExcluir.setBounds(195, 200, 100, 50);
	lbIncluirMat.setBounds(15, 20, 110, 25);
	jtfIncluirMat.setBounds(130, 20, 250, 25);
	
	
	//adiciona ações no botão
	botaoIncluir.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			adicionaLinha();

		}

	
	});
		
	botaoExcluir.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			excluirLinha();
			
		}

		
	});
	
	
	
	//configurações do painel da janela
	painelDaJanela.setLayout(null);
	painelDaJanela.add(lbIncluirMat);
	painelDaJanela.add(jtfIncluirMat);
	painelDaJanela.add(painelDeScroll);
	painelDaJanela.add(botaoIncluir);
	painelDaJanela.add(botaoExcluir);
		
	
	
	//configurações da janela
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setLocationRelativeTo(null);
	janela.setSize(400, 300);
	janela.setVisible(true);
	
	}

	public void adicionaLinha() {
		if(jtfIncluirMat.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Campo Materia Obrigatório");
		}else{
			//obter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			//Adicionar nova linha com os dados
			modelo.addRow(new String[] {jtfIncluirMat.getText()});
			jtfIncluirMat.setText("");
			JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso");
		
		}	
		
	}	
	
	
	
	private void excluirLinha() {
		if(tabela.getSelectedRow() == -1) {
		JOptionPane.showMessageDialog(null, "Selecione um linha");
		}else if (tabela.getSelectedRowCount() > 1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas uma linha");	
		}else {
		//obter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Excluido com sucesso");
			
		}
	
	}
	
	





}
