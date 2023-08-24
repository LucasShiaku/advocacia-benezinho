package br.com.fiap.domain.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ESTADO", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NOME_ESTADO", name = "UK_NOME_ESTADO"),
        @UniqueConstraint(columnNames = "SIGLA_ESTADO", name = "UK_SIGLA_ESTADO")
})
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
    @SequenceGenerator(name = "SQ_ESTADO", sequenceName = "SQ_ESTADO")
    @Column(name = "ID_ESTADO")
    private Long id;

    @Column(name = "NOME_ESTADO", unique = true, nullable = false)
    private String nome;

    @Column(name = "SIGLA_ESTADO", unique = true, nullable = false)
    private String sigla;


    public Estado() {
    }

    public Estado(Long id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }


    public Long getId() {
        return id;
    }

    public Estado setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Estado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public Estado setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
