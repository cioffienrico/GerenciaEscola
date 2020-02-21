package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Data;

public class AlunoController {
	
	public void inserirAluno(String matricula, String nome, Data data, char sexo) {
		
		Aluno a1 = new Aluno();
		Data d1 = new Data();
		a1.setMatricula(matricula);
		a1.setNome(nome);
		a1.setDataNascimento(data);
		a1.setSexo(sexo);
			
		try {
			File arquivo = new File("aluno.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo,true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			gravador.print(a1.getMatricula());
			gravador.print(";");
			gravador.print(a1.getNome());
			gravador.print(";");
			gravador.print(a1.getDataNascimento());
			gravador.print(";");
			gravador.print(a1.getSexo());
			gravador.print("\n");
			
			gravador.close();
			arquivoOutput.close();
			
			System.out.println("Gravação efetuada com sucesso!");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listarTodos() {
		try {
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			
			String texto = leitor.readLine();
			
			while (texto != null) {
				String dados[] = texto.split(";");
				
				System.out.println("Matricula do aluno: " + dados[0]);
				System.out.println("Nome do aluno.....: " + dados[1]);
				System.out.println("Data Nasc do aluno: " + dados[2]);
				System.out.println("Sexo do aluno.....: " + dados[3] + "\n");
				texto = leitor.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listarAniversariante(int mes) {
		try {
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			
			String texto = leitor.readLine();
			
			String teste = JOptionPane.showInputDialog("Teste");
			
			while (texto != null) {
				String dados[] = texto.split(";");
				String data[] = dados[2].split("/");
				
				if (Integer.parseInt(data[1]) == mes) {
					System.out.println("Matricula do aluno: " + dados[0]);
					System.out.println("Nome do aluno.....: " + dados[1]);
					System.out.println("Data Nasc do aluno: " + dados[2]);
					System.out.println("Sexo do aluno.....: " + dados[3] + "\n");
				}
				
				texto = leitor.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
