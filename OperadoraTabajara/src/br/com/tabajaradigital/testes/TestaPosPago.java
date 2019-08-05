package br.com.tabajaradigital.testes;

import br.com.tabajaradigital.faturamento.Fatura;
import br.com.tabajaradigital.faturamento.FaturaImp;
import br.com.tabajaradigital.negocio.Cliente;
import br.com.tabajaradigital.negocio.Operadora;
import br.com.tabajaradigital.telefonia.PlanoPosPago;




/**
 *
 * @author ronaldo
 */
public class TestaPosPago {

    public static void main(String[]args){


        //Defino o valor Gasto para ser calculado
        double gasto = 36.0;
        //Declaro os Objetos que compoem a fatura
        Cliente cliente = new Cliente(171, "Ronaldo Prass", 96865902);
        Operadora operadora = new Operadora(31, "Tabajara Digital");
        PlanoPosPago plano = new PlanoPosPago(35, "Tabajara 35", 35.0, 35, 0.97);
        //Executo o calculo para obter o valor que sera faturado
        double servicoUtilizado = plano.calculaCobranca(gasto);
        //Crio um Objeto fatura(Fatura sera interface, a implementaçao sera FaturaImp) passando os dados para compor a Fatura
        Fatura fatura = new FaturaImp(cliente, operadora,plano,servicoUtilizado);
        //Obtenho os elementos da fatura para exibiçao
        Cliente c = (Cliente) fatura.getCliente();
        Operadora o = (Operadora) fatura.getOperadora();
        PlanoPosPago p = (PlanoPosPago) fatura.getPlano();

        
        System.out.println("Codigo Cliente: " + c.getCodigoCliente());
        System.out.println("Nome Cliente: " + c.getNomeCliente());
        System.out.println("Numero Cliente :" + c.getNumeroCliente());
        System.out.println("Codigo Operadora: " + o.getCodigoOperadora());
        System.out.println("Nome Operadora: " + o.getNomeOperadora());
        System.out.println("Codigo Plano: " + p.getCodigoPlano());
        System.out.println("Descricao Plano: " + p.getDescricaoPlano());
        System.out.println("Franquia Minuto: " + p.getFranquiaMinuto());
        System.out.println("Valor Plano: " + p.getValorPlano());
        System.out.println("Valor Minuto Adicional: " + p.getMinutoAdicional());
        System.out.println("Valor Gasto: " + gasto);
        System.out.println("Total Fatura: " + fatura.getValorFatura());
      
        
       
    }

}
