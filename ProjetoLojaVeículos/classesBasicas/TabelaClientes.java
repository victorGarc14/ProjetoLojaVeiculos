package classesBasicas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Repositorio.*;

public class TabelaClientes extends JFrame{
   public TabelaClientes(RepositorioClienteArrayList repositorioCliente){
       setTitle("Clientes");
       String[] columns = {"Nome","Id","Veículo"};
       DefaultTableModel model= new DefaultTableModel(columns,0);
       for(Cliente cliente:repositorioCliente.getClientes()){
           model.addRow(new Object[]{cliente.getNome(),cliente.getId(),cliente.getCarro()});
       }
       JTable table = new JTable(model);
       JScrollPane scrollPane = new  JScrollPane(table);
       add(scrollPane);
       setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
        
    }
}