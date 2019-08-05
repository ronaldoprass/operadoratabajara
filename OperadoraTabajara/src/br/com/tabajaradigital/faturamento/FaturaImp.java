package br.com.tabajaradigital.faturamento;

/**
 *
 * @author Ronaldo
 */
public class FaturaImp<Operadora, Cliente, Plano> implements Fatura<Operadora, Cliente, Plano> {

    private Cliente cliente;
    private Operadora operadora;
    private Plano plano;
    private double valorFatura;
    
    public FaturaImp(){
    }

    public FaturaImp(Cliente cliente, Operadora operadora, Plano plano, double valorFatura) {
        this.cliente = cliente;
        this.operadora = operadora;
        this.plano = plano;
        this.valorFatura = valorFatura;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public Plano getPlano() {
        return plano;
    }

    public double getValorFatura() {
        return valorFatura;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public void setValorFatura(double valorFatura) {
        this.valorFatura = valorFatura;
    }
}
