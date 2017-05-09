package Moip;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.Test;

public class CriarPagamento {

	@Test
	public void CriarPagamentoteste(String [] idpedido) {
		MassaCriarPagamento p1 = new MassaCriarPagamento();
		Acesso p2 = new Acesso ();
		
		System.out.println("SCRIPT INICIADO: CriarPagamento ");
		for (int y = 0; y < p1.i; y++) {
			System.out.println("Caso de Teste: " + y + " " + p1.bodypagamento[y]);
			baseURI = "https://sandbox.moip.com.br/v2/orders/" + idpedido[y] + "/payments";
			System.out.println(baseURI);
			// Criando o Pagamento
			String result = given().contentType("application/json")
					.header("Authorization",
							"Basic "+p2.CodeHash)
					.when().body(p1.bodypagamento[y]).post("/")
					.then().assertThat().statusCode(201).extract()
					.path("id");
			System.out.println("Caso número: " + y + " Incluído com sucesso " + "ID:" + result);

			// Chamando a API de Consulta para Garantir que o Pagamento foi
			given().contentType("application/json")
					.header("Authorization",
							"Basic " + p2.CodeHash)
					.when().get("https://sandbox.moip.com.br/v2/payments/" + result).then().assertThat().statusCode(200)
					.body("id", containsString(result));

			System.out.println("Caso número: " + y + " Consultado com sucesso!");

		}
		System.out.println("SCRIPT FINALIZADO: CriarPagamento ");
	}
}
	

