package br.com.rogerio.adapter;

/**
 *
 * @author roger
 */
public class NotaFiscal {

    private String dados = "";

    public NotaFiscal() {
    }

    public NotaFiscal(String dados) {
        this.dados = dados;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
