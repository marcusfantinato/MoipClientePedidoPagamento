package Moip;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class IncluindoCliente {

	@Test
	public void IncluindoClienteteste() {
		System.out.println("SCRIPT INICIADO: IncluindoCliente");
		MassaIncluindoCliente p1 = new MassaIncluindoCliente();
		Acesso p2 = new Acesso();
		baseURI = p2.AcessoCliente;// "https://sandbox.moip.com.br/v2/customers";

		for (int y = 0; y < p1.i; y++) {
			System.out.println("Caso de Teste: " + y + " " + p1.informacoes[y]);
			// Incluindo as informações do Cliente
			// O Código está preparado para verificar campo a campo. 
			// Basta descompentar o código
			String result = given().contentType("application/json").header("Authorization", "Basic " + p2.CodeHash)
					.when().body(p1.informacoes[y]).post("/").then().assertThat().statusCode(201)
					.body("ownId", containsString(p1.ClienteInfo[y][0]))
					/*
					 * .body("fullname", containsString(p1.ClienteInfo[y][1]))
					 * .body("email", containsString(p1.ClienteInfo[y][2]))
					 * .body("birthDate", containsString(p1.ClienteInfo[y][3]))
					 * .body("type", containsString(p1.ClienteInfo[y][4]))
					 * .body("number", containsString(p1.ClienteInfo[y][5]))
					 * .body("countryCode",
					 * containsString(p1.ClienteInfo[y][6])) .body("areaCode",
					 * containsString(p1.ClienteInfo[y][7])) .body("number",
					 * containsString(p1.ClienteInfo[y][8])) .body("city",
					 * containsString(p1.ClienteInfo[y][9])) .body("complement",
					 * containsString(p1.ClienteInfo[y][10])) .body("district",
					 * containsString(p1.ClienteInfo[y][11])) .body("street",
					 * containsString(p1.ClienteInfo[y][12]))
					 * .body("streetNumber",containsString(p1.ClienteInfo[y][13]
					 * )) .body("zipCode",
					 * containsString(p1.ClienteInfo[y][14])) .body("state",
					 * containsString(p1.ClienteInfo[y][15])) .body("country",
					 * containsString(p1.ClienteInfo[y][16]))
					 */
					.extract().path("id");

			// Chamando a API de Consulta para Garantir que o Cliente foi
			// Incluído
			System.out.println("Caso número: " + y + " Incluído com sucesso " + "ID:" + result);
			given().contentType("application/json").header("Authorization", "Basic " + p2.CodeHash).when()
					.get("/" + result).then().assertThat().statusCode(200)
					.body("ownId", containsString(p1.ClienteInfo[y][0]))
					
			/*
			 * .body("fullname", containsString(p1.ClienteInfo[y][1]))
			 * .body("email", containsString(p1.ClienteInfo[y][2]))
			 * .body("birthDate", containsString(p1.ClienteInfo[y][3]))
			 * .body("type", containsString(p1.ClienteInfo[y][4]))
			 * .body("number", containsString(p1.ClienteInfo[y][5]))
			 * .body("countryCode", containsString(p1.ClienteInfo[y][6]))
			 * .body("areaCode", containsString(p1.ClienteInfo[y][7]))
			 * .body("number", containsString(p1.ClienteInfo[y][8]))
			 * .body("city", containsString(p1.ClienteInfo[y][9]))
			 * .body("complement", containsString(p1.ClienteInfo[y][10]))
			 * .body("district", containsString(p1.ClienteInfo[y][11]))
			 * .body("street", containsString(p1.ClienteInfo[y][12]))
			 * .body("streetNumber",containsString(p1.ClienteInfo[y][13]))
			 * .body("zipCode", containsString(p1.ClienteInfo[y][14]))
			 * .body("state", containsString(p1.ClienteInfo[y][15]))
			 * .body("country", containsString(p1.ClienteInfo[y][16]))
			 */;

			System.out.println("Caso número: " + y + " Consultado com sucesso!");

		}
		System.out.println("SCRIPT FINALIZADO: IncluindoCliente ");
	}
}
