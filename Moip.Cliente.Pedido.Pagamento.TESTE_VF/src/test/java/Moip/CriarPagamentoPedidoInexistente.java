package Moip;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.Test;

public class CriarPagamentoPedidoInexistente {

	MassaCriarPagamento p1 = new MassaCriarPagamento();
	Acesso p2 = new Acesso();
	
	@Test
	public void CriarPagamentoPedidoInexistenteteste() {
		System.out.println("SCRIPT INICIADO: CriarPagamentoPedidoInexistente");
		for (int y = 0; y < 1; y++) {
			baseURI = "https://sandbox.moip.com.br/v2/orders/ORD-62KH1DXT98E1/payments";
			 given().contentType("application/json")
					.header("Authorization",
							"Basic "+ p2.CodeHash)
					.when().body(p1.bodypagamento[y]).post("/")
					.then().assertThat().statusCode(404)
					.body("error", containsString("resource not found"));
			System.out.println("Mensagem apresentada: \"resource not found\"."
					+ "ID Consultado: ORD-62KH1DXT98E1");

		}
		System.out.println("SCRIPT FINALIZADO: CriarPagamentoPedidoInexistente ");
	}
}	

