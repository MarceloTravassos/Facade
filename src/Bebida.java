public class Bebida extends Produto {
    private int ml;

    public void setMl(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    Bebida(int ml, String descricao, double preco) {
        super(descricao, preco);
        this.ml = ml;
    }

    public void mostrarInfo() {
        System.out.println("BEBIDA");
        System.out.println("Ml: " + ml);
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
    }
}
