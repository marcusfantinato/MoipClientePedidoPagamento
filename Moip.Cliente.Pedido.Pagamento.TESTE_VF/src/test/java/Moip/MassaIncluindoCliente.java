package Moip;


public class MassaIncluindoCliente {
	
	int i = 2; //Quantidade de Casos de Teste
	int j = 17; //Quantidade de Campos
	String informacoes [] = new String [i];
	
	String ClienteInfo[][] = new String[i][j];
	
public MassaIncluindoCliente () {
	
//ownId
ClienteInfo[0][0] = "Cliente0000010";
//fullname
ClienteInfo[0][1] = "José da Silva Neto";
//Email   
ClienteInfo[0][2] = "netojose@hotmail.com";
//"birthDate": "1988-12-30"
ClienteInfo[0][3] = "1970-01-01";
//"taxDocument": {
//"type": "CPF"
ClienteInfo[0][4] = "CPF";
//"number": "22222222222"
ClienteInfo[0][5] = "39912644807";
//"phone": {
//"countryCode"
ClienteInfo[0][6] = "55";
//"areaCode"
ClienteInfo[0][7] = "11";
//"number"
ClienteInfo[0][8] = "966563988";
//"shippingAddress"
//"city"
ClienteInfo[0][9] = "São Paulo";
//"complement": "8",
ClienteInfo[0][10] = "RUBI";
//"district": "Itaim",
ClienteInfo[0][11] = "Centro";
//"street": "Avenida Faria Lima",
ClienteInfo[0][12] = "Av. 25 de Março";
//"streetNumber"
ClienteInfo[0][13] = "111";
//"zipCode"
ClienteInfo[0][14] = "09920451";
//"state"
ClienteInfo[0][15] = "SP";
// "country"
ClienteInfo[0][16] = "BR";

//----------------------------------Caso 2

//ownId
ClienteInfo[1][0] = "Cliente0000011";
//fullname
ClienteInfo[1][1] = "Bruno Faria";
//Email   
ClienteInfo[1][2] = "bfaria@hotmail.com";
//"birthDate": "1988-12-30"
ClienteInfo[1][3] = "1980-01-01";
//"taxDocument": {
//"type": "CPF"
ClienteInfo[1][4] = "CPF";
//"number": "22222222222"
ClienteInfo[1][5] = "39912644801";
//"phone": {
//"countryCode"
ClienteInfo[1][6] = "55";
//"areaCode"
ClienteInfo[1][7] = "11";
//"number"
ClienteInfo[1][8] = "966561234";
//"shippingAddress"
//"city"
ClienteInfo[1][9] = "Osasco";
//"complement": "8",
ClienteInfo[1][10] = "Esquerdo B";
//"district": "Itaim",
ClienteInfo[1][11] = "Centro";
//"street": "Avenida Faria Lima",
ClienteInfo[1][12] = "Av. Autonomista";
//"streetNumber"
ClienteInfo[1][13] = "222";
//"zipCode"
ClienteInfo[1][14] = "09920400";
//"state"
ClienteInfo[1][15] = "SP";
//"country"
ClienteInfo[1][16] = "BR";


for(int y = 0; y < i; y++){
   informacoes [y] = 
		         "{\"ownId\": "     + "\"" + ClienteInfo[y][0] + "\"" + "," 
				+ "\"fullname\": "  + "\"" + ClienteInfo[y][1] + "\"" + "," 
				+ "\"email\":"      + "\"" + ClienteInfo[y][2] + "\"" + ","
				+ "\"birthDate\":"  + "\"" + ClienteInfo[y][3] + "\"" + ","
				+ "\"taxDocument\": {"
				+ "\"type\":"       + "\"" + ClienteInfo[y][4] + "\"" + ","
				+ "\"number\":"     + "\"" + ClienteInfo[y][5] + "\"" + "},"
				+ "\"phone\": {"
				+ "\"countryCode\":"+ "\"" + ClienteInfo[y][6] + "\"" + ","
				+ "\"areaCode\":"   + "\"" + ClienteInfo[y][7] + "\"" + ","
				+ "\"number\":"     + "\"" + ClienteInfo[y][8] + "\"" + "},"
				+ "\"shippingAddress\": {"
				+ "\"city\":"       + "\"" + ClienteInfo[y][9] + "\"" + ","
				+ "\"complement\":" + "\"" + ClienteInfo[y][10] + "\"" + ","
				+ "\"district\":"   + "\"" + ClienteInfo[y][11] + "\"" + ","
				+ "\"street\":"     + "\"" + ClienteInfo[y][12] + "\"" + ","
				+ "\"streetNumber\":"+ "\"" + ClienteInfo[y][13] + "\"" + ","
				+ "\"zipCode\":"    + "\"" + ClienteInfo[y][14] + "\"" + ","
				+ "\"state\":"      + "\"" + ClienteInfo[y][15] + "\"" + ","
				+ "\"country\":"    + "\"" + ClienteInfo[y][16] + "\"" + "}}";
		
	//	System.out.println("Caso de Teste: " +y+ " " + informacoes[y]);	 	 	 
}

	}
}
