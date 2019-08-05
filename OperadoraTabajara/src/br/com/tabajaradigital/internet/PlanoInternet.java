package br.com.tabajaradigital.internet;

import br.com.tabajaradigital.negocio.Plano;
import br.com.tabajaradigital.cobranca.Cobranca;

/**
 *
 * @author ronaldo
 */
public class PlanoInternet extends Plano implements Cobranca {

    private int velocidade;
    private int franquiaDado;
    private double dadoAdicional;

    public PlanoInternet(int codigoPlano, String descricaoPlano, double valorPlano, int velocidade, int franquiaDado, double dadoAdicional) {
        super(codigoPlano, descricaoPlano, valorPlano);
        this.velocidade = velocidade;
        this.franquiaDado = franquiaDado;
        this.dadoAdicional = dadoAdicional;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getFranquiaDado() {
        return franquiaDado;
    }

    public void setFranquiaDado(int franquiaDado) {
        this.franquiaDado = franquiaDado;
    }

    public double getDadoAdicional() {
        return dadoAdicional;
    }

    public void setDadoAdicional(double dadoAdicional) {
        this.dadoAdicional = dadoAdicional;
    }

    public double calculaCobranca(double servicoUtilizado) {
        double valorCobranca = 0.0;
        if (servicoUtilizado <= franquiaDado) {

            valorCobranca = getValorPlano();
        } else {

            valorCobranca = getValorPlano() + calculaAdicional(servicoUtilizado);
        }
        return valorCobranca;
    }

    public double calculaAdicional(double servicoExcedido) {

        double valorAdicional = 0.0;
        if (servicoExcedido > getFranquiaDado()) {

            valorAdicional = dadoAdicional * (servicoExcedido - getFranquiaDado());
        }
        return valorAdicional;
    }
}
