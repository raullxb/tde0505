import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Menu {

    public void inicio() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao;
        do {
            IO.println("Menu");
            IO.println("1 - Adicionar Cliente ");
            IO.println("2 - Editar Cliente ");
            IO.println("3 - Remover Cliente ");
            IO.println("4 - Listar usuarios ");
            IO.println("0 - Sair ");
            opcao = Integer.parseInt(IO.readln("Opção escolhida"));
            switch (opcao) {
                case 1:
                    this.adicionarCliente(clientes);
                    break;
                case 2:
                    this.editarCliente(clientes);
                    break;
                case 3:
                    this.removerCliente(clientes);
                    break;
                case 4:
                    this.listarClientes(clientes);
                    break;
                case 0:
                    break;
                default:
                    break;
            }

        } while (opcao != 0);

    }

    public void adicionarCliente(ArrayList<Cliente> clientes) {
        String nome = IO.readln("Qual o nome do cliente: ");
        String cpf = IO.readln("Qual o CPF do cliente: ");
        String dataFormat = IO.readln("Data de Nascimento(dd/mm/aaaa): ");
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataFormat, dataFormatada);

        Cliente cliente = new Cliente(nome, cpf, dataNasc);
        menuEndereco(cliente);
        clientes.add(cliente);
    }

    public void editarCliente(ArrayList<Cliente> clientes) {
        IO.println("Escolha um Cliente para editar: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("indice" + i + clientes.get(i));
        }

    }

    public void removerCliente(ArrayList<Cliente> clientes) {
        IO.println("Escolha um Cliente para remover: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("indice" + i + clientes.get(i));
        }
        int indiceEscolhindo = Integer.parseInt(IO.readln("Digite o indice: "));
        Cliente cliente = clientes.get(indiceEscolhindo);

        clientes.remove(cliente);
    }

    public void listarClientes(ArrayList<Cliente> clientes) {
        IO.println("Lista de contatos: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

    public void menuEndereco(Cliente cliente) {
        int opcao;
        do {
            IO.println("Menu Endereço");
            IO.println("1 - Adicionar Endereço ");
            IO.println("2 - Editar Endereço ");
            IO.println("3 - Remover Endereço ");
            IO.println("4 - Listar Endereços ");
            IO.println("0 - Voltar ");

            opcao = Integer.parseInt(IO.readln("Digite a opcao: "));

            switch (opcao) {
                case 1:
                    adicionarEndereco(cliente);
                    break;
                case 2:
                    editarEndereco(cliente);
                    break;
                case 3:
                    removerEndereco(cliente);
                    break;
                case 4:
                    listarEnderecos(cliente);
                    break;
                case 0:
                    IO.println("Voltando ao menu principal...");
                    break;
                default:
                    IO.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    public void adicionarEndereco(Cliente cliente) {
        String logradouro = IO.readln("Logradouro: ");
        String bairro = IO.readln("Bairro: ");
        String cidade = IO.readln("Cidade: ");
        String cep = IO.readln("CEP: ");
        String descricao = IO.readln("Descrição: ");

        Endereco novoEndereco = new Endereco(logradouro, bairro, cidade, cep, descricao);

        cliente.getEnderecos().add(novoEndereco);
    }

    public void listarEnderecos(Cliente cliente) {
        ArrayList<Endereco> lista = cliente.getEnderecos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("indice" + i + " " + lista.get(i).toString());
        }
    }

    public void editarEndereco(Cliente cliente) {
        listarEnderecos(cliente);
        int indice = Integer.parseInt(IO.readln("Digite o indice: "));

        String logradouro = IO.readln("Logradouro: ");
        String bairro = IO.readln("Bairro: ");
        String cidade = IO.readln("Cidade: ");
        String cep = IO.readln("CEP: ");
        String descricao = IO.readln("Descrição: ");

        Endereco endereco = new Endereco(logradouro, bairro, cidade, cep, descricao);
        cliente.getEnderecos().set(indice, endereco);
    }

    public void removerEndereco(Cliente cliente) {
        listarEnderecos(cliente);
        int indice = Integer.parseInt(IO.readln("Digite o indice para remover: "));

        cliente.getEnderecos().remove(indice);
    }
}