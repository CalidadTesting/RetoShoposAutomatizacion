package co.com.google.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionCarne {
	
	
	public static final Target CARNE = Target.the("Este selecciona una carne ").located(By.xpath("//input[@id=\'atg_behavior_addItemToCart_40275956\']")); 

	
}
