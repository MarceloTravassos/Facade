public class Combo {
    private Burger burger;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public  Combo() {

    }

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                burger = new Burger(150, "Burger número 1", 20.00);
                sobremesa = new Sobremesa("Pequena", "Sobremesa número 1", 5.00);
                bebida = new Bebida(400, "Bebida número 1", 3.50);
                break;
            case 2:
                burger = new Burger(300, "Burger número 2", 45.00);
                sobremesa = new Sobremesa("Grande", "Sobremesa número 2", 12.00);
                bebida = new Bebida(800, "Bebida número 2", 7.50);
                break;
            default:
                System.out.println("Número de combo inválido!");
                break;
        }
    }

    public void ExibirCombo() {
        burger.mostrarInfo();
        sobremesa.mostrarInfo();
        bebida.mostrarInfo();
    }
}
