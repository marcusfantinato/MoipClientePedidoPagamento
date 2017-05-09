package Moip;


public class Scheadule {

	public static void main(String[] args) {

		IncluindoCliente                exec1 = new IncluindoCliente ();
		IncluirClienteJaExistente       exec2 = new IncluirClienteJaExistente ();
		RealizandoPedido                exec3 = new RealizandoPedido ();
		ConsultarPedidoInexistente      exec4 = new ConsultarPedidoInexistente ();
		CriarPagamento                  exec5 = new CriarPagamento();
		CriarPagamentoPagarNovamente    exec6 = new CriarPagamentoPagarNovamente();
		CriarPagamentoPedidoInexistente exec7 = new CriarPagamentoPedidoInexistente();
		
		exec1.IncluindoClienteteste();
		exec2.IncluirClienteJaExistenteteste();		
		String result [] = exec3.RealizandoPedidoTest();
		exec4.ConsultarPedidoInexistenteteste();
	    exec5.CriarPagamentoteste(result);
		exec6.CriarPagamentoPagarNovamenteteste();
		exec7.CriarPagamentoPedidoInexistenteteste();
		
	}

}
