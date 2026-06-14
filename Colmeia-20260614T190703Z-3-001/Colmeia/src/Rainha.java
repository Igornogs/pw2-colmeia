public class Rainha extends Abelha {

    private int ovosPorDia;

    public Rainha(String nome, int idade, int ovosPorDia) {
        super(nome, idade);
        this.ovosPorDia = ovosPorDia;
    }

    public void executarAtividade() {
        System.out.println("Colocando ovos.");
    }

    public double calcularConsumo() {
        return 20 + (ovosPorDia * 0.01);
    }
}