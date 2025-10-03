package src.entities.types;

import src.entities.Pessoa;
import src.entities.Documentos;
import src.entities.Contatos;
import src.entities.Endereco;
import src.entities.Filiacao;
import src.entities.enums.TipoSanguineo;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private Double salario;
    private String nome_pessoa;
    private String cargo;
    private List<Contatos> contatos;

    public Professor(Long id, String nome, TipoSanguineo tipoSanguineo,
                   Documentos documento, Filiacao filiacao,
                   Double salario, String cargo, String nome_pessoa, Contatos contato, Endereco endereco) {
        super(id, nome, tipoSanguineo, filiacao, documento, endereco);
        this.salario = salario;
        this.nome_pessoa = nome_pessoa;
        this.cargo = cargo;
        this.contatos = new ArrayList<>();
    }

    @Override
    public String pegaTipoPessoa() {
        return "Professor";
    }

    @Override
    public Double pegaBeneficios(){
        return this.salario;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }
    public Double getSalario() {
        return salario;
    }
    public String getCargo() {
        return cargo;
    }

    public Contatos getContato() {
        return contatos.get(0);
    }
}
