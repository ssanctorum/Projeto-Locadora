public class Cliente extends Pessoa{

    private String clienteCNH;

    private String clienteValidadeCNH;

    private String clienteDataCadastro;

    public String getClienteCNH() {
        return clienteCNH;
    }

    public String getClienteValidadeCNH() {
        return clienteValidadeCNH;
    }

    public String getClienteDataCadastro() {
        return clienteDataCadastro;
    }

    public void setClienteCNH(String clienteCNH) {
        this.clienteCNH = clienteCNH;
    }

    public void setClienteValidadeCNH(String clienteValidadeCNH) {
        this.clienteValidadeCNH = clienteValidadeCNH;
    }

    public void setClienteDataCadastro(String clienteDataCadastro) {
        this.clienteDataCadastro = clienteDataCadastro;
    }

    public Cliente(String pessoaNome, String pessoaCpf, String pessoaTelefone, String pessoaEmail, String pessoaEndereco, String clienteCNH, String clienteValidadeCNH, String clienteDataCadastro) {
        super(pessoaNome, pessoaCpf, pessoaTelefone, pessoaEmail, pessoaEndereco);
        this.clienteCNH = clienteCNH;
        this.clienteValidadeCNH = clienteValidadeCNH;
        this.clienteDataCadastro = clienteDataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteCNH='" + clienteCNH + '\'' +
                ", clienteValidadeCNH='" + clienteValidadeCNH + '\'' +
                ", clienteDataCadastro='" + clienteDataCadastro + '\'' +
                '}';
    }
}
