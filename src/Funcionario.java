public class Funcionario extends Pessoa {

    private int funcionarioMatricula;

    private String funcionarioCargo;

    private double funcionarioSalario;

    private String funcionarioDataAdmissao;

    public int getFuncionarioMatricula() {
        return funcionarioMatricula;
    }

    public String getFuncionarioCargo() {
        return funcionarioCargo;
    }

    public double getFuncionarioSalario() {
        return funcionarioSalario;
    }

    public String getFuncionarioDataAdmissao() {
        return funcionarioDataAdmissao;
    }

    public void setFuncionarioMatricula(int funcionarioMatricula) {
        this.funcionarioMatricula = funcionarioMatricula;
    }

    public void setFuncionarioCargo(String funcionarioCargo) {
        this.funcionarioCargo = funcionarioCargo;
    }

    public void setFuncionarioSalario(double funcionarioSalario) {
        this.funcionarioSalario = funcionarioSalario;
    }

    public void setFuncionarioDataAdmissao(String funcionarioDataAdmissao) {
        this.funcionarioDataAdmissao = funcionarioDataAdmissao;
    }

    public Funcionario(String pessoaNome, String pessoaCpf, String pessoaTelefone, String pessoaEmail, String pessoaEndereco, int funcionarioMatricula, String funcionarioCargo, double funcionarioSalario, String funcionarioDataAdmissao) {
        super(pessoaNome, pessoaCpf, pessoaTelefone, pessoaEmail, pessoaEndereco);
        this.funcionarioMatricula = funcionarioMatricula;
        this.funcionarioCargo = funcionarioCargo;
        this.funcionarioSalario = funcionarioSalario;
        this.funcionarioDataAdmissao = funcionarioDataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "funcionarioMatricula=" + funcionarioMatricula +
                ", funcionarioCargo='" + funcionarioCargo + '\'' +
                ", funcionarioSalario=" + funcionarioSalario +
                ", funcionarioDataAdmissao='" + funcionarioDataAdmissao + '\'' +
                '}';
    }
}
