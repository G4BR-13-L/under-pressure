package queen.underpressure.underpressure.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name="Atividade")
@Table(name="atividade")
public class Atividade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataEntrega;
    private int valor;
    @Column(nullable = false, updatable = false)
    private String codigoAtividade;

    public Atividade() {

    }

    public Atividade(
            String titulo,
            String descricao,
            LocalDateTime dataEntrega,
            int valor,
            String codigoAtividade
    ) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.valor = valor;
        this.codigoAtividade = codigoAtividade;

    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descrição the descrição to set
     */
    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return LocalDateTime return the dataEntrega
     */
    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return int return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return String return the codigoAtividade
     */
    public String getCodigoAtividade() {
        return codigoAtividade;
    }

    /**
     * @param codigoAtividade the codigoAtividade to set
     */
    public void setCodigoAtividade(String codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

}
