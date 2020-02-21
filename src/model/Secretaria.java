package model;

public class Secretaria extends Funcionario{

	private String Nome;
	private String Cpf;
	private double salario;

	public Secretaria(String nome, String cpf, double salario) {

		Nome = nome;
		Cpf = cpf;
		this.salario = salario;
	}

	public Secretaria() {
		
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
