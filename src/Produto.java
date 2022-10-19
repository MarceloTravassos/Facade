public class Produto extends Combo {

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private String descricao;

    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Produto() {

    }

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
}
