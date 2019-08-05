package br.com.tabajaradigital.telefonia;
import br.com.tabajaradigital.cobranca.Cobranca;

/**
 *
 * @author ronaldo
 */
public class PlanoPosPago extends PlanoTelefonia  implements Cobranca{

    private double minutoAdicional;
 

    public PlanoPosPago(int codigoPlano, String descricaoPlano, double valorPlano, double franquiaMinuto, double minutoAdicional) {
        super(codigoPlano, descricaoPlano, valorPlano, franquiaMinuto);
        this.minutoAdicional = minutoAdicional;
    }

    public double getMinutoAdicional() {
        return minutoAdicional;
    }

    public void setMinutoAdicional(double minutoAdicional) {
        this.minutoAdicional = minutoAdicional;
    }

    @Override
    public double calculaCobranca(double servicoUtilizado) {

        double valorCobranca = 0.0;
        if (servicoUtilizado <= getFranquiaMinuto()) {

            valorCobranca = getValorPlano();

        } else {

            valorCobranca = getValorPlano() + calculaAdicional(servicoUtilizado);
        }
        return valorCobranca;
    }

    @Override
    public double calculaAdicional(double servicoUtilizado) {

        double valorExcedido = 0.0;
        if (servicoUtilizado > getFranquiaMinuto()) {

            valorExcedido = getMinutoAdicional() * (servicoUtilizado - getFranquiaMinuto());
        }
        return valorExcedido;
    }
}
