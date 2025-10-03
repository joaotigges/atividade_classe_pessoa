package src.entities.Services;

import src.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoa {
    private List<Pessoa> pessoas;

    public ServicoPessoa() {
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void mostrarPessoas(){
        System.out.println("=== LISTA DE PESSOAS ===");System.out.println("=== LISTA DE PESSOAS ===");
        for (Pessoa person : pessoas) {
            System.out.println(person); // Chama toString() polimórfico
            System.out.println("Função: " + person.pegaTipoPessoa()); // Método abstrato
            System.out.println("Benefícios: R$ " + person.pegaBeneficios()); // Método abstrato
            System.out.println("------------------------");
        }
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
