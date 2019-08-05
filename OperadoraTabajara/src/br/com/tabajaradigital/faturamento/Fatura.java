

package br.com.tabajaradigital.faturamento;

/**
 *
 * @author usr
 */
public interface Fatura<O, C, P> {

    C getCliente();

    O getOperadora();

    P getPlano();

    double getValorFatura();

    void setCliente(C cliente);

    void setOperadora(O operadora);

    void setPlano(P plano);

    void setValorFatura(double valorFatura);

}
