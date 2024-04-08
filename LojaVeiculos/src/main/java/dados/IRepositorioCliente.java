
package dados;

import negocios.Cliente;

public interface IRepositorioCliente {
    void adicionarCliente(Cliente cliente);
    void removerCliente(String id);
    Cliente buscarCliente(String id);
    void atualizarCliente(Cliente cliente);
}
