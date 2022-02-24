package br.com.fundatec.locadoraVeiculo.bancodedados;

import br.com.fundatec.locadoraVeiculo.enums.TipoDocumento;
import br.com.fundatec.locadoraVeiculo.enums.TipoPessoa;
import br.com.fundatec.locadoraVeiculo.models.Cliente;
import br.com.fundatec.locadoraVeiculo.models.Endereco;

public class CriacaoBaseDadoCliente {
    public static void inicializarBase() {
        cadastrarClientes();
    }

    private static void cadastrarClientes() {
        ClienteRepository bancoCliente = ClienteRepository.criar();
        bancoCliente.adicionar(new Cliente(TipoPessoa.FISICA, "Fernado", 61991286058L, new Endereco("Rua Barão de Vitória", 97, "Casa", "Casa Grande", "Diadema", "SP", 04302021)));
        bancoCliente.adicionar(new Cliente(TipoPessoa.FISICA, "Jorge", 39607635242L, new Endereco("Avenida Esbertalina Barbosa Damiani", 29, "Casa", "Guriri Norte", "São Mateus", "ES", 29946490)));
        bancoCliente.adicionar(new Cliente(TipoPessoa.FISICA,"Ezilmar",  95173392L, new Endereco("Rua das Laranjeiras", 18674, "casa sem reboco", "JD Carvalho", "Porto Alegre", "RS", 95173392)));
        bancoCliente.adicionar(new Cliente(TipoPessoa.FISICA,"Daniel",  995173392L, new Endereco("Rua dos Andradas", 223, "", "centro histórico", "Porto Alegre", "RS", 95173392)));
        bancoCliente.adicionar(new Cliente(TipoPessoa.FISICA,"Moacir",  95173392L, new Endereco("Rua 20", 1890, "Apto 301", "IPE 2", "Porto Alegre", "RS", 95173392)));
        bancoCliente.adicionar(new Cliente(TipoPessoa.FISICA,"Fundatec", 95173392L, new Endereco("Cristiano fisher", 930, "Apto 402", "Jardim São Pedro", "Porto Alegre", "RS", 95173392)));
    }
}
