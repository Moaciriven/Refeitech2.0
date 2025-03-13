package dev.zeim.Refeitech2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro")
public class AlunosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int RA;

    public AlunosModel(String nome, int RA){
        this.nome = nome;
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int rA) {
        RA = rA;
    }
    
}
