package br.com.tabajaradigital.negocio;

/**
 *
 * @author ronaldo
 */
public abstract class Plano{

    private int codigoPlano;
    private String descricaoPlano;    
    private double valorPlano;

    public Plano() {
    }

    public Plano(int codigoPlano, String descricaoPlano, double valorPlano) {
        this.codigoPlano = codigoPlano;
        this.descricaoPlano = descricaoPlano;        
        this.valorPlano = valorPlano;
    }

    public int getCodigoPlano() {
        return codigoPlano;
    }

    public void setCodigoPlano(int codigoPlano) {
        this.codigoPlano = codigoPlano;
    }

    public String getDescricaoPlano() {
        return descricaoPlano;
    }

    public void setDescricaoPlano(String descricaoPlano) {
        this.descricaoPlano = descricaoPlano;
    }

    public double getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }
}
