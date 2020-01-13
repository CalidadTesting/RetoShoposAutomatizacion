#Author: correa.edison@gmail.com
#languaje:es
Feature: Prueba de automatizacion con Screenplay practica RetoShopos
	yo deseo realizar parcticas de automatizacion desde la pagina https://www.tottus.com.pe/tottus/
	
  Scenario: Validar el precio de salida por la compra de un producto  
	Given que ingreso al sitio web y compro un producto
	And selecciono el boton de tu cuenta
	And ingreso los datos
	When selecciono supermercado
	And presiono abarrotes
	And selecciono carne agregar
	Then selecciono boton pagar
	And verifico precio
	And presiono boton pagar
	And seleciono envio
	And valido precio detalle pago
	
	
	
	