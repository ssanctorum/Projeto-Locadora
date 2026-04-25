public class Veiculo {

    //dados private veículos
    private String veiculoPlaca;

    private String veiculoModelo;

    private String veiculoMarca;

    private int veiculoAno;

    private String veiculoCor;

    private double veiculoValorDiaria;

    private boolean veiculoDisponivel;

    //getters veículos
    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public String getVeiculoModelo() {
        return veiculoModelo;
    }

    public String getVeiculoMarca() {
        return veiculoMarca;
    }

    public int getVeiculoAno() {
        return veiculoAno;
    }

    public String getVeiculoCor() {
        return veiculoCor;
    }

    public double getVeiculoValorDiaria() {
        return veiculoValorDiaria;
    }

    public boolean isVeiculoDisponivel() {
        return veiculoDisponivel;
    }

    //setters veículos
    public void setVeiculoPlaca(String veiculoPlaca) {
        this.veiculoPlaca = veiculoPlaca;
    }

    public void setVeiculoModelo(String veiculoModelo) {
        this.veiculoModelo = veiculoModelo;
    }

    public void setVeiculoMarca(String veiculoMarca) {
        this.veiculoMarca = veiculoMarca;
    }

    public void setVeiculoAno(int veiculoAno) {
        this.veiculoAno = veiculoAno;
    }

    public void setVeiculoCor(String veiculoCor) {
        this.veiculoCor = veiculoCor;
    }

    public void setVeiculoValorDiaria(double veiculoValorDiaria) {
        this.veiculoValorDiaria = veiculoValorDiaria;
    }

    public void setVeiculoDisponivel(boolean veiculoDisponivel) {
        this.veiculoDisponivel = veiculoDisponivel;
    }

    //construtor
    public Veiculo(boolean veiculoDisponivel, double veiculoValorDiaria, String veiculoCor, int veiculoAno, String veiculoMarca, String veiculoModelo, String veiculoPlaca) {
        this.veiculoDisponivel = veiculoDisponivel;
        this.veiculoValorDiaria = veiculoValorDiaria;
        this.veiculoCor = veiculoCor;
        this.veiculoAno = veiculoAno;
        this.veiculoMarca = veiculoMarca;
        this.veiculoModelo = veiculoModelo;
        this.veiculoPlaca = veiculoPlaca;
    }

    //toString
    @Override
    public String toString() {
        return "Veiculo{" +
                "veiculoPlaca='" + veiculoPlaca + '\'' +
                ", veiculoModelo='" + veiculoModelo + '\'' +
                ", veiculoMarca='" + veiculoMarca + '\'' +
                ", veiculoAno=" + veiculoAno +
                ", veiculoCor='" + veiculoCor + '\'' +
                ", veiculoValorDiaria=" + veiculoValorDiaria +
                ", veiculoDisponivel=" + veiculoDisponivel +
                '}';
    }
}
