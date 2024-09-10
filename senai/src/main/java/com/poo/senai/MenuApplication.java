package com.poo.senai;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);

		Turma turma1 = new Turma(14, "1");

        Endereco DaniEnd = new Endereco(14, "Rua Olavo Bilac", "888", "Vila", "Castelanea", "Petrópolis", "25768677" );
        Aluno daniAluno = new Aluno(1, "1241255", "Daniella", "1241245", "danibcarius@hotmail.com", DaniEnd, "1455", turma1);

        Endereco FerEnd = new Endereco(14, "Prof. Angelica Lopes Castro", "888", "Apto2", "Valpariso", "Petrópolis", "2564848" );
        Aluno fernandaAluno = new Aluno(2, "12412355", "Fernanda", "1241245", "fernunes@gmail.com", FerEnd, "1455", turma1);

        turma1.adicionarAluno(daniAluno);
        turma1.adicionarAluno(fernandaAluno);

        Endereco mariaEnd = new Endereco(14, "Rua silva jardim", "234", "Quadra 2", "Centro", "Petrópolis", "12412344" );
        Professor mariaProfessor = new Professor(14, "17655567654", "Maria", "88657465", "mariaprof@gmail.com", mariaEnd, "14559999");
        Endereco pauloEnd = new Endereco(13, "Rua silva jardim", "234", "Quadra 2", "Centro", "Petrópolis", "12412344" );
        Professor pauloProfessor = new Professor(13, "12412587895", "Paulo", "1241245", "pauloprof@gmail.com", pauloEnd, "1666655");

        turma1.adicionarProfessor(mariaProfessor);
        turma1.adicionarProfessor(pauloProfessor);

        Disciplina violao = new Disciplina("Violão", "VIO888");
        Disciplina guitarra = new Disciplina("Guitarra", "GUI888");
        Disciplina teclado = new Disciplina("Teclado", "TEC888");
        Disciplina violino = new Disciplina("Violino", "VLIN888");



        alunoDisciplina daniViolão= new alunoDisciplina(daniAluno, violao , 10, 10, 7, 10);
        alunoDisciplina daniGuitarra = new alunoDisciplina(daniAluno, guitarra, 10, 10, 9.5, 8);
        alunoDisciplina daniTeclado = new alunoDisciplina(daniAluno, teclado, 9.5, 9, 8.5, 8);
        alunoDisciplina daniViolino = new alunoDisciplina(daniAluno, violino, 9.5, 9.5, 8, 8);

        daniAluno.exibirDadosAluno();
        daniViolão.exibirNotas();
        daniGuitarra.exibirNotas();
        daniViolino.exibirNotas();
        daniTeclado.exibirNotas();
		
        mariaProfessor.adicionarDisciplina(guitarra);
        mariaProfessor.adicionarDisciplina(violao);

        
        mariaProfessor.exibirDadosProfessor();
        turma1.exibirDadosTurma();
    }
}
