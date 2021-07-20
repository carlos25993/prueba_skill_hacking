$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test_suites.feature");
formatter.feature({
  "name": "Prueba para banistmo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PruebaBanistmo"
    }
  ]
});
formatter.scenario({
  "name": "Escenario 1 para la prueba de Banitsmo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PruebaBanistmo"
    }
  ]
});
formatter.step({
  "name": "Se ejecuta el explorador",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GivenSteps.seejecutaelexplorador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se selecciona la opcion acerca de nosotros",
  "keyword": "And "
});
formatter.match({
  "location": "steps.GivenSteps.Seseleccionalaopcionacercadenosotros()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se selecciona proveedores en la informacion coorporativa",
  "keyword": "And "
});
formatter.match({
  "location": "steps.GivenSteps.Seseleccionaproveedoresenlainformacioncoorporativa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se descarga el documento de Politicas de tratamiento y de proteccion de datos personales de proveedores",
  "keyword": "When "
});
formatter.match({
  "location": "steps.WhenSteps.SedescargaeldocumentodePoliticasdetratamientoydeprotecciondedatospersonalesdeproveedores()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se valida que el documento abierto sea el correcto",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ThenSteps.Sevalidaqueeldocumentoabiertoseaelcorrecto()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: No se abrio el documento correcto\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat tasks.ThenTask.valirdardocumento(ThenTask.java:29)\r\n\tat steps.ThenSteps.Sevalidaqueeldocumentoabiertoseaelcorrecto(ThenSteps.java:13)\r\n\tat ✽.Se valida que el documento abierto sea el correcto(file:///C:/Prueba/src/test/resources/features/test_suites.feature:9)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "name": "Escenario 2 para la prueba de Banitsmo",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Se ejecuta el explorador",
  "keyword": "Given "
});
formatter.step({
  "name": "Se seleciona la opcion negocios",
  "keyword": "And "
});
formatter.step({
  "name": "Yo necesito \"\u003cnecesito\u003e\" para \"\u003cpara\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Aparece la opcion \"\u003copcion\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "necesito",
        "para",
        "opcion"
      ]
    },
    {
      "cells": [
        "Ahorrar o Invertir",
        "Obtener una rentabilidad estable y segura",
        "Cuenta de Ahorros"
      ]
    },
    {
      "cells": [
        "Ahorrar o Invertir",
        "Obtener una mayor rentabilidad a un mayor riesgo",
        "InvesBot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Escenario 2 para la prueba de Banitsmo",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PruebaBanistmo"
    }
  ]
});
formatter.step({
  "name": "Se ejecuta el explorador",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GivenSteps.seejecutaelexplorador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se seleciona la opcion negocios",
  "keyword": "And "
});
formatter.match({
  "location": "steps.GivenSteps.Seselecionalaopcionnegocios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Yo necesito \"Ahorrar o Invertir\" para \"Obtener una rentabilidad estable y segura\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.WhenSteps.yo_necesito_necesito_para_para(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Aparece la opcion \"Cuenta de Ahorros\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ThenSteps.apareceLaOpcion(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Escenario 2 para la prueba de Banitsmo",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PruebaBanistmo"
    }
  ]
});
formatter.step({
  "name": "Se ejecuta el explorador",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GivenSteps.seejecutaelexplorador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se seleciona la opcion negocios",
  "keyword": "And "
});
formatter.match({
  "location": "steps.GivenSteps.Seselecionalaopcionnegocios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Yo necesito \"Ahorrar o Invertir\" para \"Obtener una mayor rentabilidad a un mayor riesgo\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.WhenSteps.yo_necesito_necesito_para_para(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Aparece la opcion \"InvesBot\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ThenSteps.apareceLaOpcion(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});