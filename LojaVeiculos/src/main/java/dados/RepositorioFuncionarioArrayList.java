package dados;

import negocios.Funcionario;
import java.util.ArrayList;

public class RepositorioFuncionarioArrayList implements IRepositorioFuncionario {
    private ArrayList<Funcionario> funcionarios;

    public RepositorioFuncionarioArrayList() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("\nFuncionario adicionado com sucesso!");
    }

    @Override
    public void removerFuncionario(String id) {
        Funcionario funcionario = buscarFuncionario(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            System.out.println("\nFuncionario removido com sucesso!");
        }
        else {
            System.out.println("\nFuncionario não encontrado.");
        }
    }

    @Override
    public Funcionario buscarFuncionario(String id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionarioAtualizado) {
        Funcionario funcionario = buscarFuncionario(funcionarioAtualizado.getId());
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            funcionarios.add(funcionarioAtualizado);
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
}

