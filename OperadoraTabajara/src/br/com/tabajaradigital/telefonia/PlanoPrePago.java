package br.com.tabajaradigital.telefonia;

/**
 *
 * @author ronaldo
 */
public class PlanoPrePago extends PlanoTelefonia {

    public double bonus;

    public PlanoPrePago(int codigoPlano, String descricaoPlano, double valorPlano, double franquiaMinuto) {
        super(codigoPlano, descricaoPlano, valorPlano, franquiaMinuto);
        bonus = calculaPromocao();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculaPromocao() {
        double valorPromocao = 2 * getFranquiaMinuto();
        return valorPromocao;
    }

    public double creditos() {

        return getFranquiaMinuto() + calculaPromocao();
    }
}
