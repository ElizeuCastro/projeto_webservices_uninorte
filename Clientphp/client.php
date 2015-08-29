<html>
<head>
<meta charset="ISO-8859-1">
<title>Consumindo Serviço</title>
</head>
<body>
	<h2>Resposta:</h2>
</body>
</html>
<?php
	//Cliente.php
	
	ini_set("soap.wsdl_cache_enabled", "0");
 
	// A seguir voc� devera informar a URL do webservice.
	$client = new SoapClient("http://10.192.100.59:8080/cadastrarProdutos?wsdl");
 	
 	//Cadastrando um novo produto
	$function = 'newProduto';
	$arguments = array('newProduto'=> array('nome'=>'caneta','valor' =>31));
	$result2 = $client->__soapCall($function, $arguments);
	
	//Listando os produtos		
	$result = $client->__soapcall('getProdutos',array(''));
	 print_r($result);
	
	
	
 
	
 
	
	
?>
