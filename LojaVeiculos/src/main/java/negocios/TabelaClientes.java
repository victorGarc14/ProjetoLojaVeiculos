package negocios;

import dados.RepositorioClienteArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabelaClientes extends JFrame{
   public TabelaClientes(RepositorioClienteArrayList repositorioCliente){
       setTitle("Clientes");
       String[] columns = {"Nome","Id","Veículo", "Ano", "Valor de compra", "Valor de venda"};
       DefaultTableModel model= new DefaultTableModel(columns,0);
       for (Cliente cliente : repositorioCliente.getClientes()) {
            if (cliente.getCarro() != null) {
                model.addRow(new Object[]{cliente.getNome(), cliente.getId(), cliente.getModelo(), cliente.getAno(), cliente.getValorCompra(), cliente.getValorVenda()});
            } else {
                model.addRow(new Object[]{cliente.getNome(), cliente.getId(), "Não possui"});
            }
        }
       JTable table = new JTable(model);
       JScrollPane scrollPane = new  JScrollPane(table);
       add(scrollPane);
       setSize(400,300);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setLocationRelativeTo(null);
        
    }
}