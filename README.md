# projeto_webservices_uninorte
Desenvolvimento de projeto com webservices para o módulo de SOA e WebServices - Pós-Uninorte

# Steps

# Server - Java Desktop
Quando trocar a URL do server deve ser compilado novamente o servidor e cliente.

## gerar classes do servidor  
wsgen -cp bin -s src -wsdl br.com.produtos.webservice.CadastrarProdutos

## gerar classes do cliente  
wsimport -s src -d bin -p br.com.produtos.webservice.cliente http://192.168.1.13:8080/cadastrarProdutos?wsdl

# Cliente - Android
Na tela inicial, informar o ip e porta do server(192.168.1.13:8080)

#Cliente - PHP
Modificar somente o ip dentro do arquivo "cliente.php" 


# Execução
* Executar a classe Publicador no servidor
* Executar a classe FormCadastarProdutos no servidor e cadastrar algum item
* Executar o projeto Android
* Executar o arquvio "cliente.php" através do navegador, utilizando um servidor php(apache)


