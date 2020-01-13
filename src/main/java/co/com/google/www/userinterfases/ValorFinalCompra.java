package co.com.google.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ValorFinalCompra {
	
	public static final Target ULTIMA_COMPRA = Target.the("Este selecciona el valor a pagar ").located(By.xpath("//*[@id=\"cart-template\"]/div[5]/div/div[1]/div[3]/span")); 

}
