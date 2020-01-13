package co.com.google.www.userinterfases;


import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class UltimoValor {
	
	public static final Target VALOR_APAGAR = Target.the("Este toma el ultimo valor a pagar ").located(By.xpath("//div[@class=\'valor-cmr\']//span[contains(text(),'S/ 14.99')]")); 

}
