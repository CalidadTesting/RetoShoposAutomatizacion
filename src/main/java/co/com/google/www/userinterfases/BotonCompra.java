package co.com.google.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonCompra {
	
	public static final Target BOTON_PAGAR = Target.the("Este selecciona el boton de pagar ").located(By.xpath("//span[@class='btn-payred']")); 

}
