package co.com.google.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValorTotalPagar {
	
	public static final Target VERIFICAR_VALOR_APAGAR = Target.the("Este toma el total del valor a pagar ").located(By.xpath("//span[@class='price lg']")); 

}
