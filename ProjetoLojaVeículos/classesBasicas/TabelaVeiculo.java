package classesBasicas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Repositorio.*;

public class TabelaVeiculo extends JFrame{
   public TabelaVeiculo(RepositorioVeiculoArrayList repositorioVeiculo){
       setTitle("Estoque");
       String[] columns = {"Modelo","Ano","Valor"};
       DefaultTableModel model= new DefaultTableModel(columns,0);
       for(Veiculo veiculo : repositorioVeiculo.getVeiculos()){
           model.addRow(new Object[]{veiculo.getModelo(),veiculo.getAno(),veiculo.getValorVenda()});
       }
       JTable table = new JTable(model);
       JScrollPane scrollPane = new  JScrollPane(table);
       add(scrollPane);
       setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
        
    }
}