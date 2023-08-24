package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TIPO_DE_ACAO", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NOME_TIPO_ACAO", name = "UK_NOME_TIPO_ACAO")
})
public class TipoDeAcao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TIPO_ACAO")
    @SequenceGenerator(name = "SQ_TIPO_ACAO", sequenceName = "SQ_TIPO_ACAO")
    @Column(name = "ID_TIPO_ACAO")
    private Long id;

    @Column(name = "NOME_TIPO_ACAO", unique = true, nullable = false)
    private String nome;

    public TipoDeAcao() {
    }

    public TipoDeAcao(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public TipoDeAcao setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeAcao setNome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {
        return "TipoDeAcao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
