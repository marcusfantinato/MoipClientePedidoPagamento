package Moip;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class IncluirClienteJaExistente {

	@Test
	public void IncluirClienteJaExistenteteste() {
		System.out.println("SCRIPT INICIADO: IncluirClienteJaExistente");
		MassaIncluindoCliente p1 = new MassaIncluindoCliente();
		Acesso p2 = new Acesso();
		baseURI = p2.AcessoCliente;// "https://sandbox.moip.com.br/v2/customers";

		for (int y = 0; y < p1.i; y++) {
			System.out.println("Caso de Teste: " + y + " " + p1.informacoes[y]);
			// Incluindo um Cliente já existente na base
			Response result = given().contentType("application/json").header("Authorization", "Basic " + p2.CodeHash)
					.when().body(p1.informacoes[y]).post("/").then().assertThat().statusCode(400).extract().response();
			System.out.println("Não foi possível incluir o Caso de Teste: " + y + ". O Status Code de retorno foi: 400"
					+ "Caso Finalizado com Sucesso!");

			String jsonAsString = result.asString();
			System.out.println("Caso de Teste: " + y + ". O retorno da requisição foi: " + jsonAsString);

		}
		System.out.println("SCRIPT FINALIZADO: IncluirClienteJaExistente ");
	}
}