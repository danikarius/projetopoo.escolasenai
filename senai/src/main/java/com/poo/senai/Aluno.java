package com.poo.senai;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluno extends Pessoa {

    @Override
    public String toString() {
        return getNome();
    }



    private Turma turma;
    private LocalDateTime matriculadoEm;
    
    
    public Aluno(){
    }
    
    
    public Aluno(int id, String cpf, String nome, String telefone, String email, Endereco endereco, String matricula, Turma turma) {
        super(id, cpf, nome, telefone, email, endereco, matricula);
        this.turma = turma;
        this.matriculadoEm = LocalDateTime.now();
    }

    public LocalDateTime getMatriculadoEm() {
        return matriculadoEm;
    }


    public void setMatriculadoEm(LocalDateTime matriculadoEm) {
        this.matriculadoEm = matriculadoEm;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String dataMatricula() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String customFormattedDate = today.format(customFormatter);
        return customFormattedDate;
    }

    public void exibirDadosAluno() {
        System.out.println("\nID do aluno: " + this.getEndereco().getId());
        System.out.println("Turma : " + this.getTurma().getNumero());
        System.out.println("\nAluno: " + this.getNome());
        System.out.println("CPF : " + this.getCpf());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Data da matrícula: " + this.dataMatricula());
        System.out.println("Telefone : " + this.getTelefone());
        System.out.println("EMAIL: " + this.getEmail() + "\n");
        System.out.println("Rua: " + this.getEndereco().getLogradouro());
        System.out.println("Número: " + this.getEndereco().getNumero());
        System.out.println("Complemento: " + this.getEndereco().getComplemento());
        System.out.println("Bairro: " + this.getEndereco().getBairro());
        System.out.println("Cidade: " + this.getEndereco().getCidade());
        
    }
}