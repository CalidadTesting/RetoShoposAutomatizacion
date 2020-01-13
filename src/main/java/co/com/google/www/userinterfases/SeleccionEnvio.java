package co.com.google.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class SeleccionEnvio {
	
	public static final Target BOTON_ENVIO = Target.the("Este es el puntico para el envio ").located(By.xpath("//input[@id=\'1dd2af_index0\']"));

}
