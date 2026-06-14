public class Zangao extends Abelha {

    private int voosAcasalamento;

    public Zangao(String nome, int idade, int voosAcasalamento) {
        super(nome, idade);
        this.voosAcasalamento = voosAcasalamento;
    }

    public void executarAtividade() {
        System.out.println("Realizando voo de acasalamento.");
    }

    public double calcularConsumo() {
        return 15 + (voosAcasalamento * 3);
    }
}