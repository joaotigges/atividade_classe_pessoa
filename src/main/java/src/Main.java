package src;

import src.entities.*;
import src.entities.types.*;
import src.entities.enums.TipoSanguineo;
import src.entities.Services.ServicoPessoa;

public class Main {
    public static void main(String[] args) {
        ServicoPessoa servico = new ServicoPessoa();

        Documentos doc_1 = new Documentos("RG", "02.843.578-4");
        Documentos doc_2 = new Documentos("CPF", "462.233.298.43");
        Documentos doc_3 = new Documentos("CNPJ", "12.123.312/0001-45");

        Filiacao fili_1 = new Filiacao("Cristiane", "Claudio");
        Filiacao fili_2 = new Filiacao("Raiana", "Robson");
        Filiacao fili_3 = new Filiacao("Clotilde", "Roberto");

        Contatos contato_1 = new Contatos("Cleber Tatu", "Telefone", "(11)97766-2211");

        Endereco end_1 = new Endereco("Rua 1", "221", "09777-121", "Rio Branco", "SP");

        Biologo biologo = new Biologo(1L, "Fernando Pinheiro", TipoSanguineo.B_POSITIVO,
                doc_2, fili_1, 2130.0,
                "Encarregado de Pesquisa científica", "Fernando Pinheiro", contato_1,end_1);

        biologo.adicionarDocumento(new Documentos("CNH", "444.333.22.11"));
        biologo.adicionarContato(new Contatos("Paulinho", "Email", "paulo.figas@gmail.com"));

        servico.addPessoa(biologo);
        servico.mostrarPessoas();

        System.out.println("\n=== PROCESSAMENTO POLIMÓRFICO ===");
    }
}
