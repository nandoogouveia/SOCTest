$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("busca_blog.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Busca no Blog",
  "description": "Como um usuário\nEu quero acessar o blog\nPara realizar busca por categoria",
  "id": "busca-no-blog",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Buscablog"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Deve realizar um teste de pesquisa",
  "description": "",
  "id": "busca-no-blog;deve-realizar-um-teste-de-pesquisa",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou acessando o blog",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "informo a procura \"Destaque\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "seleciono pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "visualizo a categoria pesquisada",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscaSteps.queEstouAcessandoOBlog()"
});
formatter.result({
  "duration": 9675035300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Destaque",
      "offset": 19
    }
  ],
  "location": "BuscaSteps.informoAProcura(String)"
});
formatter.result({
  "duration": 624409200,
  "status": "passed"
});
formatter.match({
  "location": "BuscaSteps.selecionoPesquisar()"
});
formatter.result({
  "duration": 4337527400,
  "status": "passed"
});
formatter.match({
  "location": "BuscaSteps.visualizoACategoriaPesquisada()"
});
formatter.result({
  "duration": 5103011500,
  "status": "passed"
});
formatter.uri("busca_credenciado.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Buscar credenciado",
  "description": "Como usuário\nEu quero acessar o site\nPara que eu possa exibir um perfil credenciado",
  "id": "buscar-credenciado",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Buscacredenciado"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Deve realizar uma busca em credenciados",
  "description": "",
  "id": "buscar-credenciado;deve-realizar-uma-busca-em-credenciados",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que eu estou acessando o site em Soluções",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "acesso SOCNET",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "acesso Buscar credenciados",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "selecionar filtros de Busca \"Ponta da Praia, Santos - SP, Brasil\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "exibir o perfil do credenciado",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscaCredenciadoSteps.queEuEstouAcessandoOSiteEmSoluções()"
});
formatter.result({
  "duration": 9710242800,
  "status": "passed"
});
formatter.match({
  "location": "BuscaCredenciadoSteps.acessoSOCNET()"
});
formatter.result({
  "duration": 4075755800,
  "status": "passed"
});
formatter.match({
  "location": "BuscaCredenciadoSteps.acessoBuscarCredenciados()"
});
formatter.result({
  "duration": 710227900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ponta da Praia, Santos - SP, Brasil",
      "offset": 29
    }
  ],
  "location": "BuscaCredenciadoSteps.selecionarFiltrosDeBusca(String)"
});
formatter.result({
  "duration": 26050394800,
  "status": "passed"
});
formatter.match({
  "location": "BuscaCredenciadoSteps.exibirOPerfilDoCredenciado()"
});
formatter.result({
  "duration": 9648600900,
  "status": "passed"
});
});