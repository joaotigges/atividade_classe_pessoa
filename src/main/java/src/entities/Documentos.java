package src.entities;

public class Documentos {
    private String descricao;
    private String numero;

    public Documentos(String descricao, String numero) {
        this.descricao = descricao;
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
