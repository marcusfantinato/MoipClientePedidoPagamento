package Moip;

public class MassaRealizandoPedido {
	
	
	int i = 2; //Quantidade de Casos de Teste
	int j = 24; //Quantidade de Campos
	String bodypedidos [] = new String [i];	
	String PedidoInfo[][] = new String[i][j];
	//MassaIncluindoCliente infoclient = new MassaIncluindoCliente ();
	
public MassaRealizandoPedido () {
//Pedido	
//"ownId": "seu_identificador_proprio"
PedidoInfo[0][0] = "Pedido0000001";	
//"currency": "BRL"
PedidoInfo[0][1] = "BRL";
//"subtotals"
//"shipping": 1000
PedidoInfo[0][2] = "1234";
//"items"
//"product": "Descriçăo do pedido",
PedidoInfo[0][3] = "Computador PC";
//"quantity": 1
PedidoInfo[0][4] = "5";
//"detail": "Mais info...",
PedidoInfo[0][5] = "Preto, 5kg, Dimesőes XPTO";
//"price": 1000	
PedidoInfo[0][6] = "158786";	
//ownId
PedidoInfo[0][7] = "mvsantosxxx";
//fullname
PedidoInfo[0][8] = "José Simăo";
//Email   
PedidoInfo[0][9] = "netojose@hotmail.com";
//"birthDate": "1988-12-30"
PedidoInfo[0][10] = "1970-01-01";
//"taxDocument": {
//"type": "CPF"
PedidoInfo[0][11] = "CPF";
//"number": "22222222222"
PedidoInfo[0][12] = "39912644807";
//"phone": {
//"countryCode"
PedidoInfo[0][13] = "55";
//"areaCode"
PedidoInfo[0][14] = "11";
//"number"
PedidoInfo[0][15] = "966563988";
//"shippingAddress"
//"city"
PedidoInfo[0][16] = "Săo Paulo";
//"complement": "8",
PedidoInfo[0][17] = "RUBI";
//"district": "Itaim",
PedidoInfo[0][18] = "Centro";
//"street": "Avenida Faria Lima",
PedidoInfo[0][19] = "Av. 25 de Março";
//"streetNumber"
PedidoInfo[0][20] = "111";
//"zipCode"
PedidoInfo[0][21] = "09920451";
//"state"
PedidoInfo[0][22] = "SP";
// "country"
PedidoInfo[0][23] = "BR";

//----------------------------------Caso 2
//Pedido	
//"ownId": "seu_identificador_proprio"
PedidoInfo[1][0] = "Pedido0000002";	
//"currency": "BRL"
PedidoInfo[1][1] = "BRL";
//"subtotals"
//"shipping": 1000
PedidoInfo[1][2] = "1234";
//"items"
//"product": "Descriçăo do pedido",
PedidoInfo[1][3] = "Computador Desk";
//"quantity": 1
PedidoInfo[1][4] = "3";
//"detail": "Mais info...",
PedidoInfo[1][5] = "Preto, 5kg, Dimesőes XPTO";
//"price": 1000	
PedidoInfo[1][6] = "158786";	
//ownId
PedidoInfo[1][7] = "mvsantos910";
//fullname
PedidoInfo[1][8] = "Marcus Fantinato";
//Email   
PedidoInfo[1][9] = "marcusfanti@hotmail.com";
//"birthDate": "1988-12-30"
PedidoInfo[1][10] = "1970-01-01";
//"taxDocument": {
//"type": "CPF"
PedidoInfo[1][11] = "CPF";
//"number": "22222222222"
PedidoInfo[1][12] = "39912644807";
//"phone": {
//"countryCode"
PedidoInfo[1][13] = "55";
//"areaCode"
PedidoInfo[1][14] = "11";
//"number"
PedidoInfo[1][15] = "966563988";
//"shippingAddress"
//"city"
PedidoInfo[1][16] = "Săo Paulo";
//"complement": "8",
PedidoInfo[1][17] = "RUBI";
//"district": "Itaim",
PedidoInfo[1][18] = "Centro";
//"street": "Avenida Faria Lima",
PedidoInfo[1][19] = "Av. 25 de Março";
//"streetNumber"
PedidoInfo[1][20] = "111";
//"zipCode"
PedidoInfo[1][21] = "09920451";
//"state"
PedidoInfo[1][22] = "SP";
//"country"
PedidoInfo[1][23] = "BR";



for(int y = 0; y < i; y++){
   bodypedidos [y] = 
             "{\"ownId\": "     + "\"" + PedidoInfo[y][0] + "\"" + ","
			+ "\"amount\": {"
			+ "\"currency\": "  + "\"" + PedidoInfo[y][1] + "\"" + ","
			+ "\"subtotals\": {"
			+ "\"shipping\": "  + "\"" + PedidoInfo[y][2] + "\"" + "}}," 
			+ "\"items\": [{"
			+ "\"product\": "   + "\"" + PedidoInfo[y][3] + "\"" + ","
			+ "\"quantity\": "  + "\"" + PedidoInfo[y][4] + "\"" + ","
			+ "\"detail\": "    + "\"" + PedidoInfo[y][5] + "\"" + ","
			+ "\"price\": "     + "\"" + PedidoInfo[y][6] + "\"" + "}],"
            + "\"customer\": {"
	        + "\"ownId\": "     + "\"" + PedidoInfo[y][7] + "\"" + "," 
			+ "\"fullname\": "  + "\"" + PedidoInfo[y][8] + "\"" + "," 
			+ "\"email\":"      + "\"" + PedidoInfo[y][9] + "\"" + ","
			+ "\"birthDate\":"  + "\"" + PedidoInfo[y][10] + "\"" + ","
			+ "\"taxDocument\": {"
			+ "\"type\":"       + "\"" + PedidoInfo[y][11] + "\"" + ","
			+ "\"number\":"     + "\"" + PedidoInfo[y][12] + "\"" + "},"
			+ "\"phone\": {"
			+ "\"countryCode\":"+ "\"" + PedidoInfo[y][13] + "\"" + ","
			+ "\"areaCode\":"   + "\"" + PedidoInfo[y][14] + "\"" + ","
			+ "\"number\":"     + "\"" + PedidoInfo[y][15] + "\"" + "},"
			+ "\"shippingAddress\": {"
			+ "\"city\":"       + "\"" + PedidoInfo[y][16] + "\"" + ","
			+ "\"complement\":" + "\"" + PedidoInfo[y][17] + "\"" + ","
			+ "\"district\":"   + "\"" + PedidoInfo[y][18] + "\"" + ","
			+ "\"street\":"     + "\"" + PedidoInfo[y][19] + "\"" + ","
			+ "\"streetNumber\":"+ "\"" + PedidoInfo[y][20] + "\"" + ","
			+ "\"zipCode\":"    + "\"" + PedidoInfo[y][21] + "\"" + ","
			+ "\"state\":"      + "\"" + PedidoInfo[y][22] + "\"" + ","
			+ "\"country\":"    + "\"" + PedidoInfo[y][23] + "\"" + "}}}";
		
		//System.out.println("Caso de Teste: " +y+ " " + bodypedidos[y]);	 	 	 
}

	}
}


