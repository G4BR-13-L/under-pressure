package queen.underpressure.underpressure.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Disciplina")
@Table(name = "disciplina")
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String professor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "atividade_id")
    private List<Atividade> atividades = new ArrayList<>();

    @Column(nullable = false, updatable = false)
    private String codigoDisciplina;

    public Disciplina() {

    }

    public Disciplina(String nome, String professor, String codigoDisciplina) {
        setNome(nome);
        setProfessor(professor);
        setCodigoDisciplina(codigoDisciplina);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void addAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }

}
