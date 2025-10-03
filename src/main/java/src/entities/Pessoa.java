package src.entities;

import src.entities.enums.TipoSanguineo;
import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private Long id;
    private String nome;
    private List<Contatos> contatos;
    private List<Documentos> documentos;
    private List<Endereco> enderecos;
    private TipoSanguineo tipoSanguineo;
    private Filiacao filiacao;

    public Pessoa(Long id, String nome, TipoSanguineo tipoSanguineo, Filiacao filiacao, Documentos documentos, Endereco enderecos) {
        this.id = id;
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.filiacao = filiacao;
        this.enderecos = new ArrayList<>();
        this.contatos = new ArrayList<>();
        this.documentos = new ArrayList<>();

    }

    public abstract String pegaTipoPessoa();
    public abstract Double pegaBeneficios();

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void adicionarDocumento(Documentos documento) {
        this.documentos.add(documento);
    }
    public void adicionarContato(Contatos contato) {
        this.contatos.add(contato);
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

    public List<Contatos> getContatos() {
        return contatos;
    }

    public List<Documentos> getDocumentos() {
        return documentos;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Tipo: %s", id, nome, pegaTipoPessoa());
    }
}
