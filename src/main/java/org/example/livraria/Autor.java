package org.example.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public Autor() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder();
        sb.append("Monstrando detalhes do autor\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("CPF: ").append(cpf).append("\n");
        return sb.toString();
    }
}
