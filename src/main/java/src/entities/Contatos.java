package src.entities;

public class Contatos {
    private String nome;
    private String descricao;
    private String contato;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Contatos(String nome, String descricao, String contato) {
        this.nome = nome;
        this.descricao = descricao;
        this.contato = contato;
    }
}
