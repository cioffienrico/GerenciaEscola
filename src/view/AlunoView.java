package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Aluno;
import model.Cidade;
import model.Data;
import model.Estado;

public class AlunoView {

	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtCep;
	private JTextField txtTelefone;
	private JTextField txtSenha;
	private JRadioButton rbtMasc;
	private JRadioButton rbtFem;
	private ButtonGroup grpSexo;
	private String[] estados = {"São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo" };
	private String[] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Vitória"};		
	private JButton botao1;
	private JButton botao2;
	private JComboBox JCEstado;
	private JComboBox JCCidade;
	private JPasswordField jpwSenha;
	public void iniciaGui() {
		
	JFrame janela = new JFrame();
	janela.setTitle("Cadastro");
	janela.setSize(660, 540);
	janela.getContentPane().setLayout(null);
	janela.setLocationRelativeTo(null);
	
	botao1 = new JButton();
	botao1.setText("Salvar");
	botao1.setBackground(Color.lightGray);
	botao1.setBounds(150, 425, 100, 50);
	botao1.setBorder(BorderFactory.createRaisedBevelBorder());
	botao1.addActionListener(new CadastroListener());
	
	botao2 = new JButton();
	botao2.setText("Cancelar");
	botao2.setBackground(Color.lightGray);
	botao2.setBounds(400, 425, 100, 50);
	botao2.setBorder(BorderFactory.createRaisedBevelBorder());
	
	JLabel lblInfo = new JLabel();
	lblInfo.setForeground(Color.green);
	lblInfo.setText("Informações de Cadastro: ");
	lblInfo.setBounds(10, 10, 1000, 20);
	
	JLabel lblNome = new JLabel();
	lblNome.setText("Nome: ");
	lblNome.setBounds(10, 50, 40, 20);
	txtNome = new JTextField();
	txtNome.setBounds(70, 50, 300, 20);
	
	JLabel lblMatricula = new JLabel();
	lblMatricula.setText("Matricula : ");
	lblMatricula.setBounds(10, 90, 70, 20);
	txtMatricula = new JTextField();
	txtMatricula.setBounds(90, 90, 200, 20);
	
	JLabel lblDataNasc = new JLabel();
	lblDataNasc.setText("Dt nasc : ");
	lblDataNasc.setBounds(400, 50, 60, 20);
	txtDataNasc = new JTextField();
	try {
		javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
		txtDataNasc = new javax.swing.JFormattedTextField(dt);
	} catch (Exception e) {
	}
	txtDataNasc.setBounds(470, 50, 70, 20);
	
	grpSexo = new ButtonGroup();
	JLabel lblSexo = new JLabel();
	lblSexo.setText("Sexo : ");
	lblSexo.setBounds(275, 130, 70, 20);
	rbtMasc = new JRadioButton();
	rbtMasc.setText("M");
	rbtMasc.setBounds(325, 130, 40, 20);
	rbtFem = new JRadioButton();
	rbtFem.setText("F");
	rbtFem.setBounds(375, 130, 40, 20);
	grpSexo.add(rbtMasc);
	grpSexo.add(rbtFem);
	
	JLabel lblRg = new JLabel();
	lblRg.setText("Rg: ");
	lblRg.setBounds(350, 90, 30, 20);
	txtRg = new JTextField();
	try {
		javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##.###.###");
		txtRg = new javax.swing.JFormattedTextField(dt);
	} catch (Exception e) {
	}
	txtRg.setBounds(400, 90, 70, 20);
	
	JLabel lblCpf = new JLabel();
	lblCpf.setText("Cpf: ");
	lblCpf.setBounds(10, 130, 40, 20);
	txtCpf = new JTextField();
	try {
		javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("###.###.###-##");
		txtCpf = new javax.swing.JFormattedTextField(dt);
	} catch (Exception e) {
	}
	txtCpf.setBounds(70, 130, 95, 20);
	
	JLabel lblEndereco = new JLabel();
	lblEndereco.setForeground(Color.RED);
	lblEndereco.setText("Endereco: ");
	lblEndereco.setBounds(10, 170, 200, 20);
	
	JLabel lblLogradouro = new JLabel();
	lblLogradouro.setText("Logradouro: ");
	lblLogradouro.setBounds(10, 210, 80, 20);
	txtLogradouro = new JTextField();
	txtLogradouro.setBounds(100, 210, 200, 20);
	
	JLabel lblNumero = new JLabel();
	lblNumero.setText("Nmr: ");
	lblNumero.setBounds(320, 210, 40, 20);
	txtNumero = new JTextField();
	txtNumero.setBounds(370, 210, 50, 20);
	
	JLabel lblComplemento = new JLabel();
	lblComplemento.setText("Complemento: ");
	lblComplemento.setBounds(450, 210, 100, 20);
	txtComplemento = new JTextField();
	txtComplemento.setBounds(550, 210, 50, 20);
	
	JLabel lblBairro = new JLabel();
	lblBairro.setText("Bairro: ");
	lblBairro.setBounds(10, 250, 60, 20);
	txtBairro = new JTextField();
	txtBairro.setBounds(70, 250, 100, 20);

	JLabel lblCidade = new JLabel();
	lblCidade.setText("Cidade: ");
	lblCidade.setBounds(450, 250, 100, 20);
	JCCidade = new JComboBox(cidades);
	JCCidade.setSelectedIndex(-1);
	JCCidade.setBounds(500, 250, 100, 20);
	JCCidade.setMaximumRowCount(4);
	
	JLabel lblEstado = new JLabel();
	lblEstado.setText("Estado: ");
	lblEstado.setBounds(250, 250, 100, 20);
	JCEstado = new JComboBox(estados);
	JCEstado.setSelectedIndex(-1);
	JCEstado.setBounds(300, 250, 100, 20);
	JCEstado.setMaximumRowCount(4);
	
	JLabel lblCep = new JLabel();
	lblCep.setText("Cep: ");
	lblCep.setBounds(10, 290, 40, 20);
	txtCep = new JTextField();
	try {
		javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("#####-###");
		txtCep = new javax.swing.JFormattedTextField(dt);
	} catch (Exception e) {
	}
	txtCep.setBounds(70, 290, 100, 20);
	
	JLabel lblLinha = new JLabel();
	lblLinha.setForeground(Color.blue);
	lblLinha.setText("=========================================================================================================");
	lblLinha.setBounds(10, 330, 2000, 20);
	
	JLabel lblTelefone = new JLabel();
	lblTelefone.setText("Telefone: ");
	lblTelefone.setBounds(430, 130, 70, 20);
	txtTelefone = new JTextField();
	try {
		javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("(##) #####-####");
		txtTelefone = new javax.swing.JFormattedTextField(dt);
	} catch (Exception e) {
	}
	txtTelefone.setBounds(500, 130, 100, 20);
	
	JLabel lblSenha = new JLabel();
	lblSenha.setText("Senha: ");
	lblSenha.setBounds(10, 370, 50, 20);
	jpwSenha = new JPasswordField();
	jpwSenha.setBounds(70, 370, 150, 20);
	
	janela.getContentPane().add(lblNome);
	janela.getContentPane().add(txtNome);
	janela.getContentPane().add(lblMatricula);
	janela.getContentPane().add(txtMatricula);
	janela.getContentPane().add(lblDataNasc);
	janela.getContentPane().add(txtDataNasc);
	janela.getContentPane().add(lblSexo);	
	janela.getContentPane().add(rbtMasc);
	janela.getContentPane().add(rbtFem);	
	janela.getContentPane().add(lblRg);
	janela.getContentPane().add(txtRg);
	janela.getContentPane().add(lblCpf);
	janela.getContentPane().add(txtCpf);
	janela.getContentPane().add(lblLogradouro);
	janela.getContentPane().add(txtLogradouro);
	janela.getContentPane().add(lblNumero);
	janela.getContentPane().add(txtNumero);
	janela.getContentPane().add(lblComplemento);	
	janela.getContentPane().add(txtComplemento);	
	janela.getContentPane().add(lblBairro);
	janela.getContentPane().add(txtBairro);
	janela.getContentPane().add(JCCidade);
	janela.getContentPane().add(lblCidade);
	janela.getContentPane().add(JCEstado);
	janela.getContentPane().add(lblEstado);
	janela.getContentPane().add(lblCep);
	janela.getContentPane().add(txtCep);
	janela.getContentPane().add(lblTelefone);
	janela.getContentPane().add(txtTelefone);
	janela.getContentPane().add(lblLinha);	
	janela.getContentPane().add(lblSenha);
	janela.getContentPane().add(jpwSenha);
	janela.getContentPane().add(lblEndereco);											
	janela.getContentPane().add(lblInfo);
	janela.getContentPane().add(botao1);
	janela.getContentPane().add(botao2);
	
	janela.setVisible(true);
	
	}
	
	public void verificaSelecionado() {
	
	String resposta = "";
		if(rbtMasc.isSelected()) {
	resposta += rbtMasc.getText();
	}
	
		if(rbtFem.isSelected()){
	resposta += rbtFem.getText();
	}
		resposta ="";
	}
	
	public class CadastroListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Aluno a1 = new Aluno();
			AlunoController ac = new AlunoController();
			boolean registra = true;

			try {
				a1.setMatricula(txtMatricula.getText());
				a1.setNome(txtNome.getText()); 
				String data = txtDataNasc.getText(); 
				
				String aux1 = a1.getNome().trim(); 
				String aux2 = a1.getMatricula().trim();

				int cont1 = aux1.length();
				int cont2 = aux2.length();
				
				if ((cont1 <= 0) || (cont2 <= 0)) { 
					registra = false;
				}

				String data1[] = data.split("/");

				if (data1.length != 3) { 
					registra = false;
				}

				int dia = Integer.parseInt(data1[0]); 
				int mes = Integer.parseInt(data1[1]);
				int ano = Integer.parseInt(data1[2]);

				if ((mes == 2) && (dia > 29)) { 
					registra = false;
				}
				if ((dia > 31) || (dia < 1) || (mes < 1) || (mes > 12) || (ano > 2020) || (ano < 1800)) { 
					registra = false;
				}
				
				Data data2 = new Data(dia, mes, ano);
				a1.setDataNascimento(data2); 
				if (registra) { 
					ac.inserirAluno(a1.getMatricula(), a1.getNome(), a1.getDataNascimento(), a1.getSexo());

					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
				} else { 
					JOptionPane.showMessageDialog(null, "ERRO!\n Formato de data é dd/MM/yyyy\n Digite apenas letra M ou F");
				}

			} catch (NumberFormatException N) { 
				JOptionPane.showMessageDialog(null, "Dados inválidos");
			} catch (java.lang.ArrayIndexOutOfBoundsException A) {
				JOptionPane.showMessageDialog(null, "A data precisa ser no formato dd/MM/yyyy");
			} catch (java.lang.StringIndexOutOfBoundsException C) {
				JOptionPane.showMessageDialog(null, "Digite o sexo");
			}

			txtMatricula.setText("");
			txtNome.setText("");
			txtDataNasc.setText("");
			txtRg.setText("");
			txtCpf.setText("");
			txtLogradouro.setText("");
			txtNumero.setText("");
			txtComplemento.setText("");
			txtBairro.setText("");
			txtCidade.setText("");
			txtEstado.setText("");
			txtCep.setText("");
			txtTelefone.setText("");
			txtSenha.setText("");
		
		}
	
	}

}