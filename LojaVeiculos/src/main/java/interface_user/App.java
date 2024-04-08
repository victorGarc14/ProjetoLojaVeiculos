
package interface_user;

import dados.RepositorioVeiculoArrayList;
import dados.RepositorioFuncionarioArrayList;
import dados.RepositorioClienteArrayList;
import negocios.Loja;
import negocios.FachadaLoja;
import negocios.Createmenu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        RepositorioVeiculoArrayList repositorioVeiculo = new RepositorioVeiculoArrayList();

        RepositorioClienteArrayList repositorioCliente = new RepositorioClienteArrayList();
        
        RepositorioFuncionarioArrayList repositorioFuncionario = new RepositorioFuncionarioArrayList();

        FachadaLoja fachadaLoja = new FachadaLoja(repositorioVeiculo,new Loja());
        
        Scanner scanner = new Scanner(System.in);
       
        // Criando o menu principal
        Createmenu.menuSistema(scanner, repositorioCliente, repositorioVeiculo, repositorioFuncionario, fachadaLoja);
    }
}