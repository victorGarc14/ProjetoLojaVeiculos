package classesBasicas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Comparator;
import Repositorio.*;


public class TabelaFuncionario extends JFrame{
    public TabelaFuncionario(RepositorioFuncionarioArrayList repositorioFuncionario){
        setTitle("Quadro de Vendedores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Rank");
        modelo.addColumn("Nome");
        modelo.addColumn("Vendas");
        
        ArrayList<Funcionario> funcionarios = repositorioFuncionario.getFuncionarios();
        funcionarios.sort(new ComparadorFuncionarios());
        
        int rank = 1;
        for (Funcionario funcionario : funcionarios){
            modelo.addRow(new Object[]{rank,funcionario.getNome(),funcionario.getTransacoes()});
            rank++;
        }
        
        JTable tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        getContentPane().add(scrollPane);
        
        pack();
        setLocationRelativeTo(null);
    }
}
class ComparadorFuncionarios implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        // Comparação com base no número de vendas
        return Integer.compare(f2.getTransacoes(), f1.getTransacoes());
    }
}