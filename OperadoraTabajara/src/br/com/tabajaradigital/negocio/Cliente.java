package br.com.tabajaradigital.negocio;

/**
 *
 * @author ronaldo
 */
public class Cliente {

    private int codigoCliente;
    private String nomeCliente;
    private int numeroCliente;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String nomeCliente, int numeroCliente) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.numeroCliente = numeroCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
