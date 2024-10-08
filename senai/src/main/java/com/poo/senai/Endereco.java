package com.poo.senai;

public class Endereco {
    
    private int id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;;
    private String cep;

    public Endereco(){
        }

    public Endereco(int id, String logradouro, String numero, String complemento, String bairro, String cidade,String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
         }
    
    
    public int getId() {
        return id;
     }
    
    public void setId(int id) {
        this.id = id;
     }

    public String getLogradouro() {
        return logradouro;
     }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
     }

    public String getNumero() {
        return numero;
     }

    public void setNumero(String numero) {
        this.numero = numero;
     }

    public String getComplemento() {
        return complemento;
     }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
     }

    public String getBairro() {
        return bairro;
     }

    public void setBairro(String bairro) {
        this.bairro = bairro;
     }

    public String getCidade() {
        return cidade;
     }

    public void setCidade(String cidade) {
        this.cidade = cidade;
     }

    public String getCep() {
        return cep;
     }

    public void setCep(String cep) {
        this.cep = cep;
     }

    public void imprimeEndereco(){
        System.out.println(this.logradouro);
        System.out.println(this.numero);
        System.out.println(this.complemento);
        System.out.println(this.bairro);
        System.out.println(this.cidade);
        System.out.println(this.cep);
    }

    public void exibirDadosProfessor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDadosProfessor'");
    }

    public void adicionarDisciplina(Disciplina guitarra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarDisciplina'");
    }
}