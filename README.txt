README

Reto Automatizaci�n - Shopos

la p�gina automatizar es: https://www.tottus.com.pe/tottus/

Para el ingreso de los datos en la p�gina utilizar los siguientes datos.

user: pruebastestingcalidad@gmail.com
Pass: fPwrOeSu

Secuencia de pasos son los siguintes.

1. Ingresara a la URL : https://www.tottus.com.pe/tottus/
2. La automatizaci�n seleccionar� TU CUENTA
3. Seleccionar� Inicia sesion o registrarte
4. Ingresar� un email, con su respectiva clave y presionara ingresar (Previamente creado para el proceso)
5. Se ubicar� en la opci�n de Supermercados
6. En supermercados seleccionar� Abarrotes
7. En abarrotes seleccionar� un arroz
8. Lo enviar� al carrito y presionar� el bot�n pagar (Rojo)
9. El aplicativo mostrar� una nueva pantalla indicando el valor a pagar, y este presionar� el bot�n pagar (Verde)
10. La ejecuci�n mostrar� una nueva pantalla, la cual indica cuando el usuario recoger� el producto y la automatizaci�n lo seleccionar�
11. Validar� el precio de la compra Vs. el precio total a pagar.
12. Fin de la automatizaci�n.

Muy Importante: en la ruta: \target\site\serenity\index.html de la carpeta principal encontraran la generaci�n del reporte de todo el proceso.

Notas Importantes:

1. El aplicativo NO realiza la compra por medio de tarjetas de cr�dito, ya que hay que utilizar tarjetas reales para dicha validaci�n.
2. El aplicativo compara el precio de compra Vs. el total a pagar. Pero no limpia la cache de la p�gina de las compras anteriores. Siempre guarda
un hist�rico de las compras para el usuario registrado. Este es un Bug de la P�gina.
3. Para la soluci�n del punto 2 se recomienda que cada vez se ejecute el proceso, se limpie (Vaciar) el carrito de compras. El proceso fluir� sin ning�n 
inconveniente. 