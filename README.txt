README

Reto Automatización - Shopos

la página automatizar es: https://www.tottus.com.pe/tottus/

Para el ingreso de los datos en la página utilizar los siguientes datos.

user: pruebastestingcalidad@gmail.com
Pass: fPwrOeSu

Secuencia de pasos son los siguintes.

1. Ingresara a la URL : https://www.tottus.com.pe/tottus/
2. La automatización seleccionará TU CUENTA
3. Seleccionará Inicia sesion o registrarte
4. Ingresará un email, con su respectiva clave y presionara ingresar (Previamente creado para el proceso)
5. Se ubicará en la opción de Supermercados
6. En supermercados seleccionará Abarrotes
7. En abarrotes seleccionará un arroz
8. Lo enviará al carrito y presionará el botón pagar (Rojo)
9. El aplicativo mostrará una nueva pantalla indicando el valor a pagar, y este presionará el botón pagar (Verde)
10. La ejecución mostrará una nueva pantalla, la cual indica cuando el usuario recogerá el producto y la automatización lo seleccionará
11. Validará el precio de la compra Vs. el precio total a pagar.
12. Fin de la automatización.

Muy Importante: en la ruta: \target\site\serenity\index.html de la carpeta principal encontraran la generación del reporte de todo el proceso.

Notas Importantes:

1. El aplicativo NO realiza la compra por medio de tarjetas de crédito, ya que hay que utilizar tarjetas reales para dicha validación.
2. El aplicativo compara el precio de compra Vs. el total a pagar. Pero no limpia la cache de la página de las compras anteriores. Siempre guarda
un histórico de las compras para el usuario registrado. Este es un Bug de la Página.
3. Para la solución del punto 2 se recomienda que cada vez se ejecute el proceso, se limpie (Vaciar) el carrito de compras. El proceso fluirá sin ningún 
inconveniente. 