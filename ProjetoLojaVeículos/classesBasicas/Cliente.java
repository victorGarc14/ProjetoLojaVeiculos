package classesBasicas;

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

    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }
    
    @Override
    public String toString() {
        String nome=getNome();
        if (nome.length()>limite){
            return  "|"+nome.substring(0,limite)+"|"+id.substring(0,limite)+"|"+getCarro()+"|";
        }else return "|"+getNome()+"|"+getId()+"|"+getCarro()+"|";
}
}
