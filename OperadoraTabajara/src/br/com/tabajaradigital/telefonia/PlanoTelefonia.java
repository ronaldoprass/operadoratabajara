
package br.com.tabajaradigital.telefonia;
import br.com.tabajaradigital.negocio.Plano;

/**
 *
 * @author ronaldo
 */
public abstract class PlanoTelefonia extends Plano
 {

    private double franquiaMinuto;

    public PlanoTelefonia(int codigoPlano, String descricaoPlano, double valorPlano, double franquiaMinuto) {
        super(codigoPlano, descricaoPlano, valorPlano);
        this.franquiaMinuto = franquiaMinuto;
    }

    public double getFranquiaMinuto() {
        return franquiaMinuto;
    }

    public void setFranquiaMinuto(double franquiaMinuto) {
        this.franquiaMinuto = franquiaMinuto;
    }


}
