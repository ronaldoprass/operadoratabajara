package br.com.tabajaradigital.negocio;

/**
 *
 * @author ronaldo
 */
public class Operadora {

    private int codigoOperadora;
    private String nomeOperadora;

    public Operadora() {
    }

    public Operadora(int codigoOperadora, String nomeOperadora) {
        this.codigoOperadora = codigoOperadora;
        this.nomeOperadora = nomeOperadora;
    }

    public int getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(int codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }
}
