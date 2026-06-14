public class Operaria extends Abelha {

    private int horasVoo;

    public Operaria(String nome, int idade, int horasVoo) {
        super(nome, idade);
        this.horasVoo = horasVoo;
    }

    public void executarAtividade() {
        System.out.println("Coletando nectar e polen.");
    }

    public double calcularConsumo() {
        return 10 + (horasVoo * 2);
    }
}