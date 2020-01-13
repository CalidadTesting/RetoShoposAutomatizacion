package co.com.google.www.userinterfases;


import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class PresionarBotonPagar {
	
	public static final Target BOTON_PAGAR_ORDEN = Target.the("Este es el ultimo boton de pagar orden ").located(By.xpath("//button[@id=\'atg_store_checkout\']")); 

}
