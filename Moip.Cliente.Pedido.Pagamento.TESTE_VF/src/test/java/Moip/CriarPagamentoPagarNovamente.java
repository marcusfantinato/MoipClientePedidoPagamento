package Moip;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class CriarPagamentoPagarNovamente {

	MassaCriarPagamento p1 = new MassaCriarPagamento();
	Acesso p2 = new Acesso ();
	@Test
	public void CriarPagamentoPagarNovamenteteste() {
		System.out.println("SCRIPT INICIADO: CriarPagamento");
		for (int y = 0; y < p1.i; y++) {
			System.out.println("Caso de Teste: " + y + " " + p1.bodypagamento[y]);
			baseURI = "https://sandbox.moip.com.br/v2/orders/PAY-9CFSKRLCKDPL/payments";
			// Criando o Pagamento
			Response result = given().contentType("application/json")
					.header("Authorization",
							"Basic " + p2.CodeHash)
					.when().body(p1.bodypagamento[y]).post("/").then().assertThat().statusCode(404).extract()
					.response();
			System.out
					.println("Não foi possível incluir o Caso de Teste: " + y + ". O Status Code de retorno foi: 400"
						   + "Caso de teste Finalizado com Sucesso");
			String jsonAsString = result.asString();
			System.out.println("Caso de Teste: " + y + ". O retorno da requisição foi: " + jsonAsString);

		}
		System.out.println("SCRIPT FINALIZADO: CriarPagamentoPedidoInexistente ");
	}
}
	