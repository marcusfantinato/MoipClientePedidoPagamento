package Moip;

public class MassaCriarPagamento {
	
	
	int i = 2; //Quantidade de Casos de Teste
	int j = 13; //Quantidade de Campos
	String bodypagamento[] = new String [i];
	String PagamentoInfo[][] = new String[i][j];
	//RealizandoPedido id = new RealizandoPedido();
	Acesso p2 = new Acesso();
	
public MassaCriarPagamento () {

//"installmentCount": 1
PagamentoInfo[0][0] = "1";
//"statementDescriptor": "minhaLoja.com"
PagamentoInfo[0][1] = "minhaLoja.com";	
//"method": "CREDIT_CARD"	
PagamentoInfo[0][2] = "CREDIT_CARD";	
//"creditCard"
//"hash"
PagamentoInfo[0][3] = p2.CartaoHash;//"HhL0kbhfid+jwgj5l6Kt9EPdetDxQN8s7uKUHDYxDC/XoULjzik44rSda3EcWuOcL17Eb8JjWc1JI7gsuwg9P0rJv1mJQx+d3Dv1puQYz1iRjEWWhnB1bw0gTvnnC/05KbWN5M8oTiugmhVK02Rt2gpbcTtpS7VWyacfgesBJFavYYMljYg8p2YGHXkXrMuQiOCeemKLk420d0OTMBba27jDVVJ663HZDrObnjFXJH/4B5irkj+HO5genV+V4PYoLcOESG4nrI3oFAsMGsLLcdJo0NNvkEmJpn0e9GzureKKFYisYU+BEd9EMr/odS0VMvOYRV65HbPTspIkjl2+3Q==";
//"store": true	
PagamentoInfo[0][4] = "true";		
//fullname
PagamentoInfo[0][5] = "José da Silva Neto";
//"birthdate": "1988-12-30"
PagamentoInfo[0][6] = "1988-12-30";
//"taxDocument": {
//"type": "CPF"
PagamentoInfo[0][7] = "CPF";
//"number": "22222222222"
PagamentoInfo[0][8] = "33333333333";
//"phone": {
//"countryCode"
PagamentoInfo[0][9] = "55";
//"areaCode"
PagamentoInfo[0][10] = "11";
//"number"
PagamentoInfo[0][11] = "66778899";

//---------CASO 2
//Pagamento

//"installmentCount": 1
PagamentoInfo[1][0] = "1";
//"statementDescriptor": "minhaLoja.com"
PagamentoInfo[1][1] = "minhaLoja.com";	
//"method": "CREDIT_CARD"	
PagamentoInfo[1][2] = "CREDIT_CARD";	
//"creditCard"
//"hash"
PagamentoInfo[1][3] = p2.CartaoHash;//"HhL0kbhfid+jwgj5l6Kt9EPdetDxQN8s7uKUHDYxDC/XoULjzik44rSda3EcWuOcL17Eb8JjWc1JI7gsuwg9P0rJv1mJQx+d3Dv1puQYz1iRjEWWhnB1bw0gTvnnC/05KbWN5M8oTiugmhVK02Rt2gpbcTtpS7VWyacfgesBJFavYYMljYg8p2YGHXkXrMuQiOCeemKLk420d0OTMBba27jDVVJ663HZDrObnjFXJH/4B5irkj+HO5genV+V4PYoLcOESG4nrI3oFAsMGsLLcdJo0NNvkEmJpn0e9GzureKKFYisYU+BEd9EMr/odS0VMvOYRV65HbPTspIkjl2+3Q==";
//"store": true	
PagamentoInfo[1][4] = "true";		
//fullname
PagamentoInfo[1][5] = "José da Silva Neto";
//"birtdate": "1988-12-30"
PagamentoInfo[1][6] = "1988-12-30";
//"taxDocument": {
//"type": "CPF"
PagamentoInfo[1][7] = "CPF";
//"number": "22222222222"
PagamentoInfo[1][8] = "33333333333";
//"phone": {
//"countryCode"
PagamentoInfo[1][9] = "55";
//"areaCode"
PagamentoInfo[1][10] = "11";
//"number"
PagamentoInfo[1][11] = "66778899";


for(int y = 0; y < i; y++){
	bodypagamento [y] = 
            // "{\"ownId\": "     + "\"" + PedidoInfo[y][0] + "\"" + ","
            		 "{\"installmentCount\": "     + PagamentoInfo[y][0] + ","
    				+ "\"statementDescriptor\": "  + "\"" + PagamentoInfo[y][1] + "\"" + ","
    				+ "\"fundingInstrument\": {"
    				+ "\"method\": "  + "\""       + PagamentoInfo[y][2] + "\"" + ","
    				+ "\"creditCard\": {"
    				+ "\"hash\": "  + "\""         + PagamentoInfo[y][3] + "\"" + ","
    				+ "\"store\": "                + PagamentoInfo[y][4] + ","	  
    				+ "\"holder\": {"
                    + "\"fullname\": "  + "\""     + PagamentoInfo[y][5] + "\"" + "," 
    				+ "\"birthdate\": "  + "\""     + PagamentoInfo[y][6] + "\"" + ","
    				+ "\"taxDocument\": {"
    				+ "\"type\":"       + "\""     + PagamentoInfo[y][7] + "\"" + ","
    				+ "\"number\":"     + "\""     + PagamentoInfo[y][8] + "\"" + "},"
    				+ "\"phone\": {"
    				+ "\"countryCode\":"+ "\""     + PagamentoInfo[y][9] + "\"" + ","
    				+ "\"areaCode\":"   + "\""     + PagamentoInfo[y][10] + "\"" + ","
    				+ "\"number\":"     + "\""     + PagamentoInfo[y][11] + "\"" + "}}}}}";
		
		//System.out.println("Caso de Teste: " +y+ " " + bodypagamento[y]);	 	 	 
}

	}
}


