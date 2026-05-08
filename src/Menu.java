import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Menu {

    public void inicio() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao;
        do {
            IO.println("Menu");
            IO.println("Digite opcao desejada: ");
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataFormat, formatter);



        Cliente cliente = new Cliente(nome, cpf, dataNasc);
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
    public void listarClientes(ArrayList<Cliente> clientes){
        IO.println("Lista de contatos: ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }
}
