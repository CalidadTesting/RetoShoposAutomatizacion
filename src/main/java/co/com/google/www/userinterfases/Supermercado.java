package co.com.google.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Supermercado {
	
	public static final Target SELECCIONAR_SUPERMERCADO = Target.the("Este selecciona la opcion supermercado ").located(By.xpath("//p[contains(text(),'Supermercado')]")); 

}
