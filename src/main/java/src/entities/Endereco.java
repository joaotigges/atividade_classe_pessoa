package src.entities;

import java.util.Objects;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;


    public Endereco(String rua, String numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(getRua(), endereco.getRua()) && Objects.equals(getNumero(), endereco.getNumero()) && Objects.equals(getCep(), endereco.getCep()) && Objects.equals(getCidade(), endereco.getCidade()) && Objects.equals(getEstado(), endereco.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRua(), getNumero(), getCep(), getCidade(), getEstado());
    }
}
