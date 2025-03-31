package br.com.BitBytecommerce.Api.models;

import jakarta.persistence.*;

@Entity
@Table(name= "Empresas")
public class Empresas {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="empresa_id")
private int empresaid;

     private String nome;

     private String email;

     private String cnpj;

     private String telefone;


    public int getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(int empresaid) {
        this.empresaid = empresaid;
    }

    public String getNome() {
        return nome;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
