package co.com.google.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesion {

	public static final Target INICIA_SESION = Target.the("Este inicia sesion ").located(By.xpath("//*[@id=\"header-col-rigth2\"]/ul/li[8]/ul/li/a")); 
}
