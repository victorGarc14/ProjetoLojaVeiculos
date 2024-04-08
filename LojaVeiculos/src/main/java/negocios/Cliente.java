package negocios;

public class Cliente extends Pessoa {
    private static int nextId = 1;
    private String id;
    private Veiculo carro; 
    private int limite;

    public Cliente(String nome, String cpf ,Veiculo carro) {
        super(nome, cpf);
        this.id = String.format("%03d", nextId++);
        this.carro = carro;
        this.limite = 15;
    }

    // Getters e setters...
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Veiculo getCarro() {
        return carro;
    }
    
    public String getModelo() {
        return carro.getModelo();
    }
    
    public int getAno() {
        return carro.getAno();
    }
    
    public double getValorCompra() {
        return carro.getValorCompra();
    }
    
    public double getValorVenda() {
        return carro.getValorVenda();
    }

    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }
    
}

