package model;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import javafx.scene.chart.PieChart.Data;

public class Funcionario {

	
	public String nome;
	public String cpf;
	public String rg;
	public double salario;
	public Data dataNasc;
	public int telefone;
	public String endereco;
	
	//declaração de variaveis
	private JFrame janela;
	private JTabbedPane painelComAbas;
	private JPanel painelDaJanela;
	private JPanel professor;
	private JPanel faxineira;
	private JPanel secretaria;
	

	public Funcionario() {
		
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Data getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void exibe() {	
		System.out.println("Cpf do funcionario: " + cpf);
		System.out.println("Nome do funcionario: " + nome);
		System.out.println("Salario do funcionario: " + salario);
	}	

	public void iniciaFunc() {
		janela = new JFrame("Funcionarios");
		painelDaJanela = (JPanel) janela.getContentPane();
		painelComAbas = new JTabbedPane();
		professor = new JPanel();
		faxineira = new JPanel();
		secretaria = new JPanel();
	
		//configurar e adicionar abas
		painelComAbas.addTab("prof", professor);
		painelComAbas.addTab("fax", faxineira);
		painelComAbas.addTab("sec", secretaria);
		painelComAbas.setBounds(14, 21, 342, 200);
		
		//insere texto 
		professor.add(new JLabel("PROFESSORES"));
		faxineira.add(new JLabel("FAXINEIRAS"));
		secretaria.add(new JLabel("SECRETARIAS"));
		
		//configuração do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);
		
		//configuração da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);
	
	}



		
	}
	
	
