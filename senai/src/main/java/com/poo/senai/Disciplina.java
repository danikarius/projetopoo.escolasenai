package com.poo.senai;

import java.util.Scanner;

public class Disciplina {
    Scanner sc1 = new Scanner(System.in);

        private int id;
        private String nome;

        public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.id = id;
        }



        public int getId() {
        return id;
         }
        public void setId(int id) {
        this.id = id;
         }
        public String getNome() {
        return nome;
         }
        public void setNome(String nome) {
        this.nome = nome;
         }
        }