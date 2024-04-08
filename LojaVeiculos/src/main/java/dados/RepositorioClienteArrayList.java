
package dados;

import negocios.Cliente;
import java.util.ArrayList;

public class RepositorioClienteArrayList implements IRepositorioCliente {
    private ArrayList<Cliente> clientes;

    public RepositorioClienteArrayList() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("\nCliente adicionado com sucesso!");
    }

    @Override
    public void removerCliente(String id) {
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("\nCliente removido com sucesso!");
        }
        else {
            System.out.println("\nCliente não encontrado!");
        }
    }

    @Override
    public Cliente buscarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void atualizarCliente(Cliente clienteAtualizado) {
        Cliente cliente = buscarCliente(clienteAtualizado.getId());
        if (cliente != null) {
            clientes.remove(cliente);
            clientes.add(clienteAtualizado);
        }
    }
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }
}
