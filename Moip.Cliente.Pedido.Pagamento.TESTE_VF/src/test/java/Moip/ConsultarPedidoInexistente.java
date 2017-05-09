package Moip;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class ConsultarPedidoInexistente {
	
	@Test
	public void ConsultarPedidoInexistenteteste() {
		System.out.println("SCRIPT INICIADO: ConsultarPedidoInexistente");
		Acesso p2 = new Acesso ();
		baseURI = p2.AcessoPedido;//"https://sandbox.moip.com.br/v2/orders";	
	//Consultar um ID que não existe na base
		given().contentType("application/json")
		.header("Authorization",
				"Basic " + p2.CodeHash)
		.when().get("/" + "ORD-N1YLLHIVVD$4")
		.then().assertThat().statusCode(404)
		.body("error", containsString("resource not found"));
		System.out.println("Mensagem apresentada: \"resource not found\"");	
		System.out.println("SCRIPT FINALIZADO: ConsultarPedidoInexistente ");

}
}

