package Moip;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class RealizandoPedido {
	MassaRealizandoPedido p1 = new MassaRealizandoPedido();
	Acesso p2 = new Acesso ();
	String result [] = new String [p1.i];	
	@Test
	public String [] RealizandoPedidoTest() {
		System.out.println("SCRIPT INICIADO: RealizandoPedido");
		baseURI = p2.AcessoPedido;//"https://sandbox.moip.com.br/v2/orders";
		//MassaRealizandoPedido p1 = new MassaRealizandoPedido();
		//String result [] = new String [p1.i];	
		for(int y = 0; y < p1.i; y++){
			System.out.println("Caso de Teste: " +y+ " " + p1.bodypedidos[y]);
			//Realizando a matemática para Validar o Total do Pedido
			int totalint = Integer.parseInt(p1.PedidoInfo[y][2]) + (Integer.parseInt(p1.PedidoInfo[y][6])*Integer.parseInt(p1.PedidoInfo[y][4]));			
					
		//Incluindo as informações do Cliente
		//O Código está preparado para verificar campo a campo. Basta descompentar o código	
 result [y] = given().contentType("application/json")
				.header("Authorization",
						"Basic " + p2.CodeHash)
				.when().body(p1.bodypedidos[y]).post("/")
				.then().assertThat().statusCode(201)
				.body("ownId",       containsString(p1.PedidoInfo[y][0]))
				.body("amount.total", equalTo(totalint))
	/*			.body("fullname",    containsString(p1.PedidoInfo[y][1]))
				.body("email",       containsString(p1.PedidoInfo[y][2]))
				.body("birthDate",   containsString(p1.PedidoInfo[y][3]))
				.body("type",        containsString(p1.PedidoInfo[y][4]))
				.body("number",      containsString(p1.PedidoInfo[y][5]))
				.body("countryCode", containsString(p1.PedidoInfo[y][6]))
				.body("areaCode",    containsString(p1.PedidoInfo[y][7]))
				.body("number",      containsString(p1.PedidoInfo[y][8]))
				.body("city",        containsString(p1.PedidoInfo[y][9]))
				.body("complement",  containsString(p1.PedidoInfo[y][10]))
				.body("district",    containsString(p1.PedidoInfo[y][11]))
				.body("street",      containsString(p1.PedidoInfo[y][12]))
				.body("streetNumber",containsString(p1.PedidoInfo[y][13]))
				.body("zipCode",     containsString(p1.PedidoInfo[y][14]))
				.body("state",       containsString(p1.PedidoInfo[y][15]))
				.body("country",     containsString(p1.PedidoInfo[y][16]))*/
				.extract().path("id");

		// Chamando a API de Consulta para Garantir que o Cliente foi Incluído
		 System.out.println("Caso número: " +y+ " Incluído com sucesso "		 
		 		+ "ID:" + result[y]);
		 System.out.println("Caso número: " +y+ " Total Validado com sucesso!: " + totalint);
				given().contentType("application/json")
				.header("Authorization",
						"Basic " + p2.CodeHash)
				.when().get("/" + result[y]).then().assertThat().statusCode(200)
				.body("ownId",       containsString(p1.PedidoInfo[y][0]))
				.body("amount.total", equalTo(totalint))
			/*	.body("fullname",    containsString(p1.PedidoInfo[y][1]))
				.body("email",       containsString(p1.PedidoInfo[y][2]))
				.body("birthDate",   containsString(p1.PedidoInfo[y][3]))
				.body("type",        containsString(p1.PedidoInfo[y][4]))
				.body("number",      containsString(p1.PedidoInfo[y][5]))
				.body("countryCode", containsString(p1.PedidoInfo[y][6]))
				.body("areaCode",    containsString(p1.PedidoInfo[y][7]))
				.body("number",      containsString(p1.PedidoInfo[y][8]))
				.body("city",        containsString(p1.PedidoInfo[y][9]))
				.body("complement",  containsString(p1.PedidoInfo[y][10]))
				.body("district",    containsString(p1.PedidoInfo[y][11]))
				.body("street",      containsString(p1.PedidoInfo[y][12]))
				.body("streetNumber",containsString(p1.PedidoInfo[y][13]))
				.body("zipCode",     containsString(p1.PedidoInfo[y][14]))
				.body("state",       containsString(p1.PedidoInfo[y][15]))
				.body("country",     containsString(p1.PedidoInfo[y][16]))*/;
		 
		 System.out.println("Caso número: " +y+ " Consultado com sucesso!");
		 System.out.println("Caso número: " +y+ " Total Verificado com Sucesso na API de Consulta!: " + totalint);		
		
		}
		System.out.println("SCRIPT FINALIZADO: RealizandoPedido ");
		return result;
}
}
	


