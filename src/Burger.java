public class Burger extends Produto {
    private int gramas;

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public int getGramas() {
        return gramas;
    }

    Burger(int gramas, String descricao, double preco) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    public void mostrarInfo() {
        System.out.println("HAMBURGUER");
        System.out.println("Gramas: " + gramas);
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
    }
}
