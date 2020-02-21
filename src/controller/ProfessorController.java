package controller;

import model.Professor;

public class ProfessorController {

	public void testaProfessor() {

		System.out.println("professor criado");

		Professor p1 = new Professor();

		p1.setnome("Enrico");

		p1.setCpf("47312337805");

		p1.setSalario(1675);

		p1.exibe();

	}

}
