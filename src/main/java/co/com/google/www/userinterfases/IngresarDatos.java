package co.com.google.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatos {
	
	public static final Target CORREO = Target.the("En este campo se ingresa el correo ").located(By.xpath("//input[@id=\"atg_store_registerLoginEmailAddress\"]")); 
	public static final Target PASSWORD = Target.the("En este campo se ingresa el password ").located(By.xpath("//input[@id=\'atg_store_registerLoginPassword']")); 
	public static final Target BOTON_INGRESAR = Target.the("Este es el boton de Ingresar ").located(By.xpath("//input[@id=\'atg_store_loginButton']")); 
}
